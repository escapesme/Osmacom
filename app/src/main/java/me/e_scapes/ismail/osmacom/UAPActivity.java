package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class UAPActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uap);

        updatecmText(R.id.cm_txt);
        updatecmText(R.id.cm_txt2);



        updateNavigation(mOnNavigationItemSelectedListener, R.id.uap);


        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));
        recyclers.put("thickness_top", (RecyclerView) findViewById(R.id.my_recycler_thickness_top));
        recyclers.put("uapl", (RecyclerView) findViewById(R.id.my_recycler_uapl));
        recyclers.put("uaps", (RecyclerView) findViewById(R.id.my_recycler_uaps));



        data.put("uapl", new String[]{"",
                "",
                "",
                "",
                "",
                "",
                "\n","130",
                "175",
                "200",
                "250",
                "270",
                "270",
                "320",
                "320"});
        data.put("uaps", new String[]{"80",
                "100",
                "130",
                "150",
                "175",
                "200",
                "220",
                "250",
                "270",
                "300","",
                "",
                "",
                "",
                "",
                "",
                "\n"});

        data.put("thickness_top", new String[]{"8",
                "8.5",
                "9.5",
                "10.3",
                "10.8",
                "11.5",
                "12.5",
                "13.5",
                "14.5",
                "16",
                "6.3",
                "7.1",
                "7",
                "8",
                "9.5",
                "9.5",
                "11",
                "11"});






        data.put("thickness", new String[]{"5",
                "5.5",
                "6",
                "7",
                "7.5",
                "8",
                "8",
                "9",
                "9",
                "9.5",
                "4.5",
                "4.7",
                "5",
                "6.5",
                "5.6",
                "7.6",
                "7",
                "9.5"});
        data.put("width", new String[]{"45",
                "50",
                "55",
                "65",
                "70",
                "75",
                "80",
                "85",
                "95",
                "100",
                "30",
                "55",
                "65",
                "50",
                "75",
                "77",
                "85",
                "87.5"});
        data.put("height", new String[]{"80",
                "100",
                "130",
                "150",
                "175",
                "200",
                "220",
                "250",
                "270",
                "300",
                "130",
                "175",
                "200",
                "250",
                "270",
                "270",
                "320",
                "320"});
        data.put("weight", new String[]{"8.38",
                "10.5",
                "13.7",
                "17.9",
                "21.2",
                "25.1",
                "28.5",
                "34.4",
                "39.4",
                "46",
                "7.25",
                "12.2",
                "14.6",
                "18.4",
                "22.5",
                "26.8",
                "31.5",
                "37.7"});
        data.put("section", new String[]{"10.7",
                "13.4",
                "17.5",
                "22.9",
                "27",
                "32",
                "36.3",
                "43.8",
                "50.1",
                "58.6",
                "9.24",
                "15.6",
                "18.6",
                "23.5",
                "28.7",
                "34.1",
                "40.1",
                "48.1"});
        update_items();



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.upn:
                    startActivity( new Intent(UAPActivity.this,  UPNActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;

                case R.id.uap:

                    return true;
            }
            return false;
        }
    };

}
