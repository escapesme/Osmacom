package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gotomain(null);
        return super.onTouchEvent(event);
    }


    public void gotomain(View view) {
        startActivity(new Intent(this, MainActivity.class));

    }
}
