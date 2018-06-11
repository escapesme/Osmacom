package me.e_scapes.ismail.osmacom;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void openosmacom(View view) {
        openurl("https://www.osmacom.com.eg/");
    }

    public void openescpes(View view) {
        openurl("http://e-scapes.me/");
    }


    void openurl(String u) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(u));
        startActivity(browserIntent);

    }


    void checkCallPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) this,
                    Manifest.permission.CALL_PHONE)) {
                /**
                 *
                 */
                new AlertDialog.Builder(this)
                        .setTitle("Permission Required")
                        .setMessage("This permission was denied earlier by you. This permission is required to call from app .So, in order to use this feature please allow this permission by clicking ok.")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                ActivityCompat.requestPermissions( AboutActivity.this,
                                        new String[]{Manifest.permission.CALL_PHONE},
                                        2);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

            } else {
                ActivityCompat.requestPermissions((Activity) AboutActivity.this,
                        new String[]{Manifest.permission.CALL_PHONE}, 2);
            }
        } else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + phone_no));
           startActivity(callIntent);
        }
    }

    String phone_no="";

    void makecall(String phone_number) {

        if (phone_number != null && !phone_number.equals("")) {

            phone_no = phone_number;

            if (Build.VERSION.SDK_INT >= 23) {
                checkCallPermission();
            } else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phone_no));

             startActivity(callIntent);
            }
        }

    }


    public void openaddress_1(View view) {
        openurl("https://www.google.com/maps/place/Osmacom+For+Steel+Concrete+Industries/@30.2207387,30.7627533,11z/data=!4m8!1m2!2m1!1sosmacom!3m4!1s0x145846d5ec155d2f:0x81927f706886e3d0!8m2!3d30.0347847!4d31.2158493");
    }

    public void openaddress_2(View view) {
        openurl("https://www.google.com/maps/place/Osmacom+For+Steel+Concrete+Industries+factory/@30.406249,30.4498479,11z/data=!4m8!1m2!2m1!1sosmacom!3m4!1s0x1458965000000001:0x6df58738d4aa84b3!8m2!3d30.406249!4d30.5899236?shorturl=1");

    }

    public void makeCall_1(View view) {
        //
        makecall("+201000005366");

    }

    public void makeCall_2(View view) {
        makecall("+20237487471");
        //+202 3748 7471
    }

    public void makeCall_3(View view) {
        makecall("+20237613128");
        //+202 3761 3128
    }
    public void gotohome(View view) {
        finish();
    }

    public void openemail(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "info@osmacom.com.eg" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry from Osmacom App");
        intent.putExtra(Intent.EXTRA_TEXT, "");
        startActivity(Intent.createChooser(intent, ""));
    }
}
