package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class AnglesuActivity extends MyActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anglesu);

        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener,  R.id.unequal);



        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));




        data.put("thickness", new String[]{"3",
                "3.5",
                "3",
                "4",
                "4",
                "4",
                "5",
                "4",
                "5",
                "5",
                "6",
                "7",
                "5",
                "6",
                "7",
                "8",
                "6",
                "6",
                "7",
                "7",
                "8",
                "8",
                "10",
                "6",
                "8",
                "9",
                "10",
                "8",
                "10",
                "12",
                "10",
                "11",
                "12",
                "13"});
        data.put("width", new String[]{"20",
                "20",
                "20",
                "20",
                "25",
                "30",
                "30",
                "30",
                "30",
                "40",
                "40",
                "40",
                "50",
                "50",
                "50",
                "50",
                "40",
                "50",
                "50",
                "60",
                "60",
                "70",
                "70",
                "50",
                "50",
                "80",
                "80",
                "80",
                "80",
                "80",
                "90",
                "90",
                "90",
                "90"});
        data.put("height", new String[]{"30",
                "35",
                "40",
                "40",
                "40",
                "45",
                "45",
                "50",
                "50",
                "60",
                "60",
                "60",
                "65",
                "70",
                "70",
                "70",
                "80",
                "80",
                "80",
                "80",
                "80",
                "90",
                "90",
                "100",
                "100",
                "100",
                "100",
                "120",
                "120",
                "120",
                "150",
                "150",
                "150",
                "150"});
        data.put("weight", new String[]{"1.11",
                "1.43",
                "1.35",
                "1.77",
                "1.93",
                "2.24",
                "2.76",
                "2.41",
                "2.96",
                "3.76",
                "4.46",
                "5.14",
                "4.35",
                "5.4",
                "6.24",
                "7.06",
                "5.41",
                "5.88",
                "6.8",
                "7.36",
                "8.34",
                "9.6",
                "11.8",
                "6.85",
                "8.99",
                "12.2",
                "13.4",
                "12.2",
                "15",
                "17.8",
                "18.2",
                "19.9",
                "21.6",
                "23.3"});
        data.put("section", new String[]{"1.42",
                "1.82",
                "1.72",
                "2.25",
                "2.46",
                "2.86",
                "3.52",
                "3.07",
                "3.78",
                "4.79",
                "5.68",
                "6.55",
                "5.54",
                "6.88",
                "7.95",
                "9",
                "6.89",
                "7.49",
                "2.35",
                "9.38",
                "10.6",
                "12.2",
                "15.1",
                "8.73",
                "11.5",
                "15.5",
                "17.1",
                "15.5",
                "19.1",
                "22.7",
                "23.2",
                "25.3",
                "27.5",
                "29.7"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.equal:
                    startActivity( new Intent(AnglesuActivity.this, AngleseActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;

                case R.id.unequal:

                    return true;
            }
            return false;
        }
    };

}
