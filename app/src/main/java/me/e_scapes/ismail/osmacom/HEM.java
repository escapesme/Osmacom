package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class HEM extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hem);
        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.hem);


        recyclers.clear();
        data.clear();
        name = "HEM";

        recyclers.put("heb", (RecyclerView) findViewById(R.id.my_recycler_heb));

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));

        recyclers.put("thickness_top", (RecyclerView) findViewById(R.id.my_recycler_thickness_top));

        data.put("thickness_top", new String[]{"20",
                "21",
                "22",
                "23",
                "24",
                "25",
                "26",
                "32",
                "32.5",
                "33",
                "29",
                "39",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40",
                "40" });


        data.put("heb", new String[]{"100 M",
                "120 M",
                "140 M",
                "160 M",
                "180 M",
                "200 M",
                "220 M",
                "240 M",
                "260 M",
                "280 M",
                "300 C",
                "300 M",
                "320 M",
                "340 M",
                "360 M",
                "400 M",
                "450 M",
                "500 M",
                "550 M",
                "600 M",
                "650 M",
                "700 M",
                "800 M",
                "900 M",
                "1000 M"});




        data.put("thickness", new String[]{"12",
                "12.5",
                "13",
                "14",
                "14.5",
                "15",
                "15.5",
                "18",
                "18",
                "18.5",
                "16",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21",
                "21"});
        data.put("width", new String[]{"106",
                "126",
                "146",
                "166",
                "186",
                "206",
                "226",
                "248",
                "268",
                "288",
                "305",
                "310",
                "309",
                "309",
                "308",
                "307",
                "307",
                "306",
                "306",
                "305",
                "305",
                "304",
                "303",
                "302",
                "302"});
        data.put("height", new String[]{"120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "270",
                "290",
                "310",
                "320",
                "340",
                "359",
                "377",
                "395",
                "432",
                "478",
                "524",
                "572",
                "620",
                "668",
                "716",
                "814",
                "910",
                "1008"});
        data.put("weight", new String[]{"41.8",
                "52.1",
                "63.2",
                "76.2",
                "88.9",
                "103",
                "117",
                "157",
                "172",
                "189",
                "177",
                "238",
                "245",
                "248",
                "250",
                "256",
                "263",
                "270",
                "278",
                "285",
                "293",
                "301",
                "317",
                "333",
                "349"});
        data.put("section", new String[]{"53.2",
                "66.4",
                "80.6",
                "97.1",
                "113",
                "131",
                "149",
                "200",
                "220",
                "240",
                "225",
                "303",
                "312",
                "316",
                "319",
                "326",
                "335",
                "344",
                "354",
                "364",
                "374",
                "383",
                "404",
                "424",
                "444"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.hea:
                    startActivity(new Intent(HEM.this, HEAActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
                case R.id.heb:
                    startActivity( new Intent(HEM.this, HEBActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
                case R.id.hem:
                    return true;
            }
            return false;
        }
    };

}
