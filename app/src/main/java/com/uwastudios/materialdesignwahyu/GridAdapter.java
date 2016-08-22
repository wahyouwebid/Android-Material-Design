package com.uwastudios.materialdesignwahyu;

/**
 * Created by Ujang Wahyu on 19/08/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class GridAdapter  extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ujang Wahyu");
        nama.setThumbnail(R.drawable.flat);
        mItems.add(nama);
 
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);

        }
    }
}