package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class IPEActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipe);

        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.ipe);

        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));

        recyclers.put("thickness_top", (RecyclerView) findViewById(R.id.my_recycler_thickness_top));
        recyclers.put("iper", (RecyclerView) findViewById(R.id.my_recycler_iper));

        recyclers.put("ipes", (RecyclerView) findViewById(R.id.my_recycler_ipes));


        data.put("thickness_top", new String[]{"5.2",
                "5.7",
                "6.3",
                "6.9",
                "7.4",
                "8",
                "8.5",
                "9.2",
                "9.8",
                "10.2",
                "10.7",
                "11.5",
                "12.7",
                "13.5",
                "14.6",
                "16",
                "17.2",
                "19",
                "7.8",
                "8.5",
                "9.5",
                "10.5",
                "11.8",
                "12.3",
                "13.1",
                "13.7",
                "14.5",
                "16",
                "17",
                "18.6",
                "20",
                "22.2",
                "23",
                "24"});
        data.put("ipes", new String[]{"80",
                "100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "270",
                "300",
                "330",
                "360",
                "400",
                "450",
                "500",
                "550",
                "600","",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""});
        data.put("iper", new String[]{"",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\n","140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "270",
                "300",
                "330",
                "360",
                "400",
                "450",
                "500",
                "550",
                "600",
                "600"});



        data.put("thickness", new String[]{"3.8",
                "4.1",
                "4.4",
                "4.7",
                "5",
                "5.3",
                "5.6",
                "5.9",
                "6.2",
                "6.6",
                "7.1",
                "7.5",
                "8",
                "8.6",
                "9.4",
                "10.2",
                "11.1",
                "12",
                "5.3",
                "5.6",
                "6.4",
                "6.6",
                "6.7",
                "7.5",
                "7.7",
                "8.5",
                "9.2",
                "9.9",
                "10.6",
                "11.3",
                "12.6",
                "14",
                "14",
                "15"});
        data.put("width", new String[]{"46",
                "55",
                "64",
                "73",
                "82",
                "91",
                "100",
                "110",
                "120",
                "135",
                "150",
                "160",
                "170",
                "180",
                "190",
                "200",
                "210",
                "220",
                "72",
                "81",
                "89",
                "98",
                "108",
                "118",
                "133",
                "147",
                "158",
                "168",
                "178",
                "188",
                "198",
                "210",
                "218",
                "220"});
        data.put("height", new String[]{"80",
                "100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "270",
                "300",
                "330",
                "360",
                "400",
                "450",
                "500",
                "550",
                "600",
                "142",
                "162",
                "183",
                "204",
                "225",
                "245",
                "276",
                "306",
                "336",
                "366",
                "407",
                "458",
                "508",
                "560",
                "608",
                "610"});
        data.put("weight", new String[]{"6",
                "8.1",
                "10.4",
                "12.9",
                "15.8",
                "18.8",
                "22.4",
                "26.2",
                "30.7",
                "36.1",
                "42.2",
                "49.1",
                "57.1",
                "66.3",
                "77.6",
                "90.7",
                "106",
                "122",
                "14.4",
                "17.7",
                "22",
                "26.6",
                "31.6",
                "37.3",
                "43.9",
                "51.7",
                "60.3",
                "70.3",
                "81.5",
                "95.2",
                "111",
                "134",
                "144",
                "153"});
        data.put("section", new String[]{"7.64",
                "10.3",
                "13.2",
                "16.4",
                "20.1",
                "23.9",
                "28.5",
                "33.4",
                "39.1",
                "45.9",
                "53.8",
                "62.6",
                "72.7",
                "84.5",
                "98.8",
                "116",
                "134",
                "156",
                "18.3",
                "22.6",
                "28",
                "33.9",
                "40.2",
                "47.5",
                "55.9",
                "65.9",
                "76.8",
                "89.6",
                "104",
                "121",
                "142",
                "170",
                "184",
                "195"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.ipn:
                    startActivity( new Intent(IPEActivity.this,  IPNActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;

                case R.id.ipe:

                    return true;
            }
            return false;
        }
    };

}
