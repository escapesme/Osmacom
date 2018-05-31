package me.e_scapes.ismail.osmacom.libs;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

import me.e_scapes.ismail.osmacom.MainActivity;
import me.e_scapes.ismail.osmacom.PriceActivity;
import me.e_scapes.ismail.osmacom.R;
import me.e_scapes.ismail.osmacom.TableActivity;

public class MyActivity extends AppCompatActivity {
    protected HashMap<String, RecyclerView> recyclers = new HashMap<>();
    protected  HashMap<String, String[]> data = new HashMap<>();
    protected  String name = "";

   protected void update_items() {
        for (String a : recyclers.keySet()) {
            recyclers.get(a).setHasFixedSize(true);
            recyclers.get(a).setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recyclers.get(a).setAdapter(new MyAdapter(data.get(a)));
        }
    }

    public void gotohome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    public void gotoprice(View view) {
        Intent i = new Intent(this, PriceActivity.class);
        i.putExtra("name", name);
        for (String a : recyclers.keySet()) {
            View v = recyclers.get(a).getChildAt(0);
            TextView t = v.findViewById(R.id.txt);
            i.putExtra(a, t.getText().toString());
        }
        startActivity(i);
    }


    public void gototable(View view) {
        Intent i = new Intent(this, TableActivity.class);
        i.putExtra("name", name);
        for (String a : recyclers.keySet()) {

            View v = recyclers.get(a).getChildAt(0);
            TextView t = v.findViewById(R.id.txt);
            i.putExtra(a, t.getText().toString());
        }
        startActivity(i);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for (String a : recyclers.keySet()) {
            recyclers.get(a).onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }


   protected  void updatecmText(int id ){

        TextView cm = findViewById(id);
        cm.setText(Html.fromHtml(getString(R.string.cm)));

//R.id.cm_txt

       cm.setPadding(0,10,0,0);

    }
    protected  void updateNavigation(@Nullable BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener ,int act  ){


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(act);


    }





}
