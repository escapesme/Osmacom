package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class HEBActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heb);
        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.heb);


        recyclers.clear();
        data.clear();
        recyclers.put("heb", (RecyclerView) findViewById(R.id.my_recycler_heb));

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));

        recyclers.put("thickness_top", (RecyclerView) findViewById(R.id.my_recycler_thickness_top));

        data.put("thickness_top", new String[]{"10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "17.5",
                "18",
                "19",
                "20.5",
                "21.5",
                "22.5",
                "24",
                "26",
                "28",
                "29",
                "30",
                "31",
                "32",
                "33",
                "35",
                "36" });


        data.put("heb", new String[]{"100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "260",
                "280",
                "300",
                "320",
                "340",
                "360",
                "400",
                "450",
                "500",
                "550",
                "600",
                "650",
                "700",
                "800",
                "900",
                "1000"});




        data.put("thickness", new String[]{"6",
                "6.5",
                "7",
                "8",
                "8.5",
                "9",
                "9.5",
                "10",
                "10",
                "10.5",
                "11",
                "11.5",
                "12",
                "12.5",
                "13.5",
                "14",
                "14.5",
                "15",
                "15.5",
                "16",
                "17",
                "17.5",
                "18.5",
                "19"});
        data.put("width", new String[]{"100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "260",
                "280",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300",
                "300"});
        data.put("height", new String[]{"100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "260",
                "280",
                "300",
                "320",
                "340",
                "360",
                "400",
                "450",
                "500",
                "550",
                "600",
                "650",
                "700",
                "800",
                "900",
                "1000"});
        data.put("weight", new String[]{"20.4",
                "26.7",
                "33.7",
                "42.6",
                "51.2",
                "61.3",
                "71.5",
                "83.2",
                "93",
                "103",
                "117",
                "127",
                "134",
                "142",
                "155",
                "171",
                "187",
                "199",
                "212",
                "225",
                "241",
                "262",
                "291",
                "314"});
        data.put("section", new String[]{"26",
                "34",
                "43",
                "54.3",
                "65.3",
                "78.1",
                "91",
                "106",
                "118",
                "131",
                "149",
                "161",
                "171",
                "181",
                "198",
                "218",
                "239",
                "254",
                "270",
                "286",
                "306",
                "334",
                "371",
                "400"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.hea:
                    startActivity(new Intent(HEBActivity.this, HEAActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
                case R.id.heb:
                    return true;
                case R.id.hem:
                    startActivity( new Intent(HEBActivity.this, HEM.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
