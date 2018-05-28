package me.e_scapes.ismail.osmacom.libs;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.e_scapes.ismail.osmacom.R;


public class items_list_adapte extends ArrayAdapter<String> {

    Context context;
    List<String> objects;
    List<Integer> images = new ArrayList<>();
    List<Intent> intents = new ArrayList<>();

    public items_list_adapte(Context context
            , List< String> objects
            , List<Integer> images
            , List<Intent> intents
    ) {
        super(context, 0, objects);
        this.objects = new ArrayList<>();
        this.images = images;
        this.intents = intents;
        this.objects.addAll(objects);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.my_list_item, null);

        TextView t = view.findViewById(R.id.txt);
        ImageView image = view.findViewById(R.id.image);

        final Intent i = intents.get(position);
        final int img = images.get(position);

        final String title = objects.get(position);

        try {
            t.setText(title);
            image.setImageDrawable(this.context.getDrawable(img));
            t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(i);

                }
            });
        } catch (ClassCastException ee) {

        }


        return view;
    }


}
