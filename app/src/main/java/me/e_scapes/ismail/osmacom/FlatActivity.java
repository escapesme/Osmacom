package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import me.e_scapes.ismail.osmacom.libs.MyActivity;

public class FlatActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);

        updatecmText(R.id.cm_txt);
        updateNavigation(mOnNavigationItemSelectedListener, R.id.sheets);



        recyclers.clear();
        data.clear();


      //  update_items();



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
