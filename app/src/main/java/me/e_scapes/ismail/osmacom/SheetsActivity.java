package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class SheetsActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheets);


     //   updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.sheets);



        recyclers.clear();
        data.clear();

        recyclers.put("thicknessk", (RecyclerView) findViewById(R.id.my_recycler_thicknessk));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));




        data.put("thickness", new String[]{"0.2",
                "0.3",
                "0.4",
                "0.5",
                "0.6",
                "0.7",
                "0.8",
                "0.9",
                "1",
                "1.2",
                "1.5",
                "2",
                "2.5",
                "3",
                "3.5",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "18",
                "20",
                "22",
                "24",
                "25",
                "28",
                "30",
                "32",
                "35",
                "40",
                "45",
                "50",
                "60"});
        data.put("thicknessk", new String[]{"1.57",
                "2.35",
                "3.14",
                "3.92",
                "4.71",
                "5.49",
                "6.28",
                "7.06",
                "7.85",
                "9.42",
                "11.8",
                "15.7",
                "19.6",
                "23.5",
                "27.5",
                "31.4",
                "39.2",
                "47.1",
                "54.9",
                "62.8",
                "70.6",
                "78.5",
                "86.3",
                "94.2",
                "102",
                "110",
                "118",
                "126",
                "141",
                "157",
                "173",
                "188",
                "196",
                "220",
                "235",
                "251",
                "275",
                "314",
                "353",
                "392",
                "471"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.sheets:
                    return true;

                case R.id.flats:
                    startActivity( new Intent(SheetsActivity.this, FlatActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;
            }
            return false;
        }
    };

}
