package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class HEAActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hea);
        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener,  R.id.hea);


        recyclers.clear();
        data.clear();
        recyclers.put("heb", (RecyclerView) findViewById(R.id.my_recycler_heb));

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));

        recyclers.put("thickness_top", (RecyclerView) findViewById(R.id.my_recycler_thickness_top));

        data.put("thickness_top", new String[]{"8",
                "8",
                "8.5",
                "9",
                "9.5",
                "10",
                "11",
                "12",
                "12.5",
                "13",
                "14",
                "15.5",
                "16.5",
                "17.5",
                "19",
                "21",
                "23",
                "24",
                "25",
                "26",
                "27",
                "28",
                "30",
                "31" });


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




        data.put("thickness", new String[]{"5",
                "5",
                "5.5",
                "6",
                "6",
                "6.5",
                "7",
                "7.5",
                "7.5",
                "8",
                "8.5",
                "9",
                "9.5",
                "10",
                "11",
                "11.5",
                "12",
                "12.5",
                "13",
                "13.5",
                "14.5",
                "15",
                "16",
                "16.5"});
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
        data.put("height", new String[]{"96",
                "114",
                "133",
                "152",
                "171",
                "190",
                "210",
                "230",
                "250",
                "270",
                "290",
                "310",
                "330",
                "350",
                "390",
                "440",
                "490",
                "540",
                "590",
                "640",
                "690",
                "790",
                "890",
                "990"});
        data.put("weight", new String[]{"16.7",
                "19.9",
                "24.7",
                "30.4",
                "35.5",
                "42.3",
                "50.5",
                "60.3",
                "68.2",
                "76.4",
                "88.3",
                "97.6",
                "105",
                "112",
                "125",
                "140",
                "155",
                "166",
                "178",
                "190",
                "204",
                "224",
                "252",
                "272"});
        data.put("section", new String[]{"21.2",
                "25.3",
                "31.4",
                "38.8",
                "45.3",
                "53.8",
                "64.3",
                "76.8",
                "86.8",
                "97.3",
                "113",
                "124",
                "133",
                "143",
                "159",
                "178",
                "198",
                "212",
                "226",
                "242",
                "260",
                "286",
                "321",
                "347"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.hea:

                    return true;
                case R.id.heb:
                    startActivity(new Intent(HEAActivity.this, HEBActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
                case R.id.hem:
                    startActivity( new Intent(HEAActivity.this, HEM.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
