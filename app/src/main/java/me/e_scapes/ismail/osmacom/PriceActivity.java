package me.e_scapes.ismail.osmacom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PriceActivity extends AppCompatActivity {
    EditText wlength, clength, cprice;
    TextView cresults, wresults, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);


        wlength = findViewById(R.id.wlength);
        clength = findViewById(R.id.clength);
        cprice = findViewById(R.id.cprice);


        wresults = findViewById(R.id.wresults);
        cresults = findViewById(R.id.cresults);
        title = findViewById(R.id.title);

        if (getIntent().hasExtra("pricetitle")) {
            title.setText(getIntent().getStringExtra("pricetitle"));
        }

        if (getIntent().hasExtra("weight")) {
            weight = Double.parseDouble(getIntent().getStringExtra("weight"));

        }
        wlength.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                wcalc();

            }
        });


        clength.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                ccalc();

            }
        });


        cprice.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                ccalc();

            }
        });

    }

    Double weight = 0d;

    public void gotohome(View view) {
        finish();
    }


    void ccalc() {
        try {
            if (weight != 0
                    && !clength.getText().toString().equals("")
                    && !cprice.getText().toString().equals("")

                    ) {

                Double a = Double.parseDouble(clength.getText().toString()) * Double.parseDouble(cprice.getText().toString()) * weight;
                cresults.setText("$ " + a);


            }
        } catch (NullPointerException e) {


        } catch (NumberFormatException e) {


        }

    }

    void wcalc() {
        try {
            if (weight != 0 && !wlength.getText().toString().equals("")) {

                if (weight != 0) {
                    Double a = Double.parseDouble(wlength.getText().toString()) * weight;

                    wresults.setText(a + " kg");
                }
            }
        } catch (NullPointerException e) {


        } catch (NumberFormatException e) {


        }


    }
}