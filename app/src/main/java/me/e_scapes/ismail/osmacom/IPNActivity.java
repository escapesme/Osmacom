package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class IPNActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipn);
        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.ipn);


        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));




        data.put("thickness", new String[]{"3.9",
                "4.5",
                "5.1",
                "6",
                "10",
                "5.7",
                "10",
                "6.3",
                "6.9",
                "7.5",
                "8.1",
                "8.7",
                "9.4",
                "10.1",
                "10.8",
                "11.5",
                "12.2",
                "13",
                "13.7",
                "14.4",
                "15.3",
                "16.2",
                "17.1",
                "18",
                "19",
                "21.6"});
        data.put("width", new String[]{"42",
                "50",
                "58",
                "71",
                "75",
                "66",
                "84",
                "74",
                "82",
                "90",
                "98",
                "106",
                "113",
                "119",
                "125",
                "131",
                "137",
                "143",
                "149",
                "155",
                "163",
                "170",
                "178",
                "185",
                "200",
                "215"});
        data.put("height", new String[]{"80",
                "100",
                "120",
                "120",
                "120",
                "140",
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
                "380",
                "400",
                "425",
                "450",
                "475",
                "500",
                "550",
                "600"});
        data.put("weight", new String[]{"5.94",
                "8.34",
                "11.1",
                "14.4",
                "18.2",
                "14.3",
                "22.3",
                "17.9",
                "21.9",
                "26.2",
                "31.1",
                "36.2",
                "41.9",
                "47.9",
                "54.2",
                "61",
                "68",
                "76.1",
                "84",
                "92.4",
                "104",
                "115",
                "128",
                "141",
                "166",
                "199"});
        data.put("section", new String[]{"7.57",
                "10.6",
                "14.2",
                "18.4",
                "23.2",
                "18.2",
                "28.3",
                "22.8",
                "27.9",
                "33.4",
                "39.5",
                "46.1",
                "53.3",
                "61",
                "69",
                "77.7",
                "86.7",
                "97",
                "107",
                "118",
                "132",
                "147",
                "163",
                "179",
                "212",
                "254"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.ipn:
                       return true;

                case R.id.ipe:
                    startActivity( new Intent(IPNActivity.this, IPEActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
