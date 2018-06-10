package me.e_scapes.ismail.osmacom;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    void makecall(String number) {


        String uri = "tel:" + number.trim();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(uri));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(intent);
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
}
