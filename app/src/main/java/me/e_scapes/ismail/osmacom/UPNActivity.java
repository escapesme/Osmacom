package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class UPNActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upn);

        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.upn);


        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));




        data.put("thickness", new String[]{"4",
                "5",
                "4",
                "5",
                "5",
                "5",
                "5",
                "6",
                "5.5",
                "6",
                "6",
                "6",
                "7",
                "7",
                "7.5",
                "8",
                "8.5",
                "9",
                "9.5",
                "10",
                "10",
                "15",
                "10",
                "10",
                "10"});
        data.put("width", new String[]{"15",
                "33",
                "17.5",
                "20",
                "35",
                "25",
                "38",
                "30",
                "42",
                "40",
                "45",
                "50",
                "55",
                "60",
                "65",
                "70",
                "75",
                "80",
                "85",
                "80",
                "100",
                "105",
                "90",
                "95",
                "100"});
        data.put("height", new String[]{"30",
                "30",
                "35",
                "40",
                "40",
                "50",
                "50",
                "60",
                "65",
                "70",
                "80",
                "100",
                "120",
                "140",
                "160",
                "180",
                "200",
                "220",
                "240",
                "250",
                "250",
                "250",
                "260",
                "280",
                "300"});
        data.put("weight", new String[]{"1.74",
                "4.27",
                "2.16",
                "2.87",
                "4.87",
                "3.86",
                "5.59",
                "5.07",
                "7.09",
                "6.77",
                "8.64",
                "10.6",
                "13.4",
                "16",
                "18.8",
                "22",
                "25.3",
                "29.4",
                "33.2",
                "32.5",
                "42.2",
                "52",
                "37.9",
                "41.8",
                "46.2"});
        data.put("section", new String[]{"2.21",
                "5.44",
                "2.75",
                "3.66",
                "6.21",
                "4.92",
                "7.12",
                "6.46",
                "9.03",
                "8.62",
                "11",
                "13.5",
                "17",
                "20.4",
                "24",
                "28",
                "32.2",
                "37.4",
                "42.3",
                "41.4",
                "53.8",
                "66.3",
                "48.3",
                "53.3",
                "58.8"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.upn:
                    return true;

                case R.id.uap:
                    startActivity( new Intent(UPNActivity.this, UAPActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
