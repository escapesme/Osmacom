package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class AngleseActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anglese);

        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener,R.id.equal);



        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));




        data.put("thickness", new String[]{"2",
                "2.5",
                "3",
                "2.5",
                "3",
                "4",
                "2.5",
                "2.7",
                "3",
                "4",
                "5",
                "2.5",
                "3",
                "3.2",
                "3.5",
                "4",
                "5",
                "3.3",
                "3",
                "4",
                "5",
                "6",
                "3",
                "4",
                "4.5",
                "5",
                "6",
                "3",
                "4",
                "4.5",
                "5",
                "6",
                "7",
                "8"});

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
        data.put("weight", new String[]{"0.6",
                "0.74",
                "0.88",
                "0.94",
                "1.12",
                "1.45",
                "1.13",
                "1.23",
                "1.36",
                "1.78",
                "2.18",
                "1.35",
                "1.6",
                "1.7",
                "1.85",
                "2.1",
                "2.57",
                "1.89",
                "1.84",
                "2.42",
                "2.97",
                "3.52",
                "2.09",
                "2.74",
                "3.06",
                "3.38",
                "4",
                "2.33",
                "3.06",
                "3.41",
                "3.77",
                "4.47",
                "5.15",
                "5.82"});
        data.put("section", new String[]{"0.76",
                "0.95",
                "1.12",
                "1.2",
                "1.42",
                "1.85",
                "1.44",
                "1.56",
                "1.74",
                "2.27",
                "2.78",
                "1.71",
                "2.04",
                "2.16",
                "2.35",
                "2.67",
                "3.28",
                "2.4",
                "2.35",
                "3.08",
                "3.79",
                "4.48",
                "2.66",
                "3.49",
                "3.9",
                "4.3",
                "5.09",
                "2.96",
                "3.89",
                "4.35",
                "4.8",
                "5.69",
                "6.56",
                "7.41"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.equal:

                    return true;

                case R.id.unequal:
                    startActivity( new Intent(AngleseActivity.this,  AnglesuActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
