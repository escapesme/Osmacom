package me.e_scapes.ismail.osmacom.libs;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

import me.e_scapes.ismail.osmacom.MainActivity;
import me.e_scapes.ismail.osmacom.PriceActivity;
import me.e_scapes.ismail.osmacom.R;
import me.e_scapes.ismail.osmacom.TableActivity;

public class MyActivity extends AppCompatActivity {
    protected HashMap<String, RecyclerView> recyclers = new HashMap<>();
    protected HashMap<String, String[]> data = new HashMap<>();
    protected String name = "";
    protected String pricetitle = "";


    protected void update_items() {
        for (String a : recyclers.keySet()) {
            recyclers.get(a).setHasFixedSize(true);
            recyclers.get(a).setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recyclers.get(a).setAdapter(new MyAdapter(data.get(a)));
            recyclers.get(a).setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    return true;
                }
            });


        }
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    public void gotohome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    public void gotoprice(View view) {
        Intent i = new Intent(this, PriceActivity.class);
        i.putExtra("name", name);

        pricetitle = getPriceTitle();
        i.putExtra("pricetitle", pricetitle);


        for (String a : recyclers.keySet()) {
            View v = recyclers.get(a).getChildAt(0);
            TextView t = v.findViewById(R.id.txt);
            i.putExtra(a, t.getText().toString());
        }
        startActivity(i);
    }


    String getValue(String v) {
        if (recyclers.containsKey(v)) {
            View wev = recyclers.get(v).getChildAt(0);
            TextView wet = wev.findViewById(R.id.txt);
            return wet.getText().toString();
        }
        return "";
    }

    String getPriceTitle() {
        String r = name;
        String width = "", height = "", weight = "";

        if (recyclers.containsKey("width")) {
            width = getValue("width");
        } else {
            width = getValue("height");
        }


        switch (name) {

            case "HEA":
            case "HEB":
            case "HEM":
                r += "  " + getValue("heb");

                break;
            case "IPE":

                String ipes =getValue("ipes");
                if (!ipes.equals("")) {
                    r += "  " + ipes +" Standard ";
                } else {
                    r += "  " + getValue("iper") + " R reinforced";
                }

                break;

            case "UAP":

                String uaps =getValue("uaps");
                if (!uaps.equals("")) {
                    r += "  " + uaps +" Standard ";
                } else {
                    r += "  " + getValue("uapl") + " Light";
                }

                break;



            case "UPN":
            case "IPN":
                r += "  " + getValue("height");
                break;


            case "T-Profile":
            case "Angles":
                r += "  " + width;
                r += " x " + getValue("height");
                r += " x " + getValue("thickness");


                break;


            default:

                r += "  " + getValue("weight");
                break;


        }


        return r;


    }

    public void gototable(View view) {
        Intent i = new Intent(this, TableActivity.class);
        i.putExtra("name", name);
        for (String a : recyclers.keySet()) {

            View v = recyclers.get(a).getChildAt(0);
            TextView t = v.findViewById(R.id.txt);
            i.putExtra(a, t.getText().toString());
        }
        startActivity(i);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for (String a : recyclers.keySet()) {
            recyclers.get(a).onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }


    protected void updatecmText(int id) {

        TextView cm = findViewById(id);
        cm.setText(Html.fromHtml(getString(R.string.cm)));


        cm.setPadding(0, 10, 0, 0);

    }

    protected void updateNavigation(@Nullable BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener, int act) {


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(act);


    }


}
