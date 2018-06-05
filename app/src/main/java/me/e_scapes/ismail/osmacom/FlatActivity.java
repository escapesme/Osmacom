package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.MotionEvent;

import java.util.HashMap;

import me.e_scapes.ismail.osmacom.libs.MyActivity;
import me.e_scapes.ismail.osmacom.libs.MyAdapter;
import me.e_scapes.ismail.osmacom.libs.MyAdapterImages;

public class FlatActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);

        updateNavigation(mOnNavigationItemSelectedListener, R.id.flats);



        recyclers.clear();
        data.clear();


        int[] idata ={R.drawable.flats_ruler_01,R.drawable.flats_ruler_02,R.drawable.flats_ruler_03,R.drawable.flats_ruler_04};
        recycler = findViewById(R.id.my_recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recycler.setAdapter(new MyAdapterImages(idata) );


    }
    RecyclerView recycler;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

         recycler.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.sheets:
                    startActivity( new Intent(FlatActivity.this,  SheetsActivity.class));
                    overridePendingTransition(R.anim.close, R.anim.open);
                    return true;

                case R.id.flats:

                    return true;
            }
            return false;
        }
    };

}
