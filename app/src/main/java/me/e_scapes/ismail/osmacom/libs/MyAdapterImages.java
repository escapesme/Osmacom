package me.e_scapes.ismail.osmacom.libs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.e_scapes.ismail.osmacom.R;


public class MyAdapterImages extends RecyclerView.Adapter<MyAdapterImages.ViewHolder> {
    private int[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mTextView;


        public ViewHolder(View v) {
            super(v);

            mTextView = v.findViewById(R.id.image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterImages(int[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterImages.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {





        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_img_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.mTextView.setImageResource(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}