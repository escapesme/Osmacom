package me.e_scapes.ismail.osmacom;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import me.e_scapes.ismail.osmacom.libs.MyActivity;


public class TpeofileActivity extends MyActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpeofile);

        updatecmText(R.id.cm_txt);



        recyclers.clear();
        data.clear();

        recyclers.put("section", (RecyclerView) findViewById(R.id.my_recycler_section));
        recyclers.put("weight", (RecyclerView) findViewById(R.id.my_recycler_weight));
        recyclers.put("height", (RecyclerView) findViewById(R.id.my_recycler_height));
        recyclers.put("width", (RecyclerView) findViewById(R.id.my_recycler_width));
        recyclers.put("thickness", (RecyclerView) findViewById(R.id.my_recycler_thickness));

        data.put("thickness", new String[]{"3",
                "3",
                "3.5",
                "4",
                "4",
                "4.5",
                "4.5",
                "5",
                "5",
                "5.5",
                "6",
                "5.5",
                "7",
                "6",
                "8",
                "7",
                "9",
                "8.5",
                "9",
                "11",
                "10",
                "12",
                "13"});
        data.put("width", new String[]{"20",
                "25",
                "25",
                "30",
                "30",
                "35",
                "35",
                "40",
                "40",
                "45",
                "50",
                "60",
                "60",
                "70",
                "70",
                "80",
                "80",
                "100",
                "100",
                "100",
                "120",
                "120",
                "120"});
        data.put("height", new String[]{"20",
                "25",
                "25",
                "30",
                "35",
                "35",
                "40",
                "40",
                "45",
                "45",
                "50",
                "30",
                "60",
                "35",
                "70",
                "40",
                "80",
                "50",
                "80",
                "100",
                "60",
                "80",
                "120"});
        data.put("weight", new String[]{"0.88",
                "1.11",
                "1.29",
                "1.77",
                "1.95",
                "2.33",
                "2.5",
                "2.96",
                "3.15",
                "3.67",
                "4.44",
                "3.64",
                "6.23",
                "4.66",
                "8.32",
                "6.21",
                "10.7",
                "9.42",
                "12",
                "16.4",
                "13.4",
                "16.2",
                "23.2"});
        data.put("section", new String[]{"1.12",
                "1.41",
                "1.64",
                "2.26",
                "2.48",
                "2.97",
                "3.18",
                "3.77",
                "4.01",
                "4.67",
                "5.66",
                "4.64",
                "7.94",
                "5.94",
                "10.6",
                "7.91",
                "13.6",
                "12",
                "15.4",
                "20.9",
                "17",
                "20.7",
                "29.6"});
        update_items();

    }







}

