package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import me.e_scapes.ismail.osmacom.libs.items_list_adapte;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list_data = findViewById(R.id.home_list);

        List<String> titles = new ArrayList<>();
        List<Integer> images = new ArrayList<>();
        List<Intent> intents = new ArrayList<>();


        titles.add("Angles");
        intents.add(new Intent(this, AngleseActivity.class));
        images.add(R.drawable.angles);
        titles.add("HEA/HEB/HEM HEC");
        intents.add(new Intent(this, HEAActivity.class));
        images.add(R.drawable.hea);

        titles.add("IPE/IPN");
        intents.add(new Intent(this, IPEActivity.class));
        images.add(R.drawable.ipe_ipn);

        titles.add("UPN/UAP");
        intents.add(new Intent(this, UPNActivity.class));
        images.add(R.drawable.upn_uap);

        titles.add("T-Profile");
        intents.add(new Intent(this, TpeofileActivity.class));
        images.add(R.drawable.t_profile);
        titles.add("Bars");
        intents.add(new Intent(this, BarsActivity.class));
        images.add(R.drawable.bars);

        titles.add("Sheets/Flats");
        intents.add(new Intent(this, SheetsActivity.class));
        images.add(R.drawable.sheets_flat);


        list_data.setAdapter(new items_list_adapte(this,  titles, images, intents));

    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    public void gotoabout(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }
}
