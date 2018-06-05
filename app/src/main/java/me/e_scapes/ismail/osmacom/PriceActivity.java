package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PriceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

    }

    public void gotohome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
