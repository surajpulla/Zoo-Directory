package com.example.suraj.zoodirectory;

import  android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends ArrayAdapter<String> {
    Integer[] imgid;
    String[] animals;
    public CustomAdapter(Context context, String[] animals,Integer [] imgid) {
        super(context, R.layout.custom_row,animals);
        this.imgid=imgid;
        this.animals=animals;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//layout of rows
        LayoutInflater zooinflater =LayoutInflater.from((getContext()));
        View customView=zooinflater.inflate(R.layout.custom_row, parent, false);

        //String singleanimalitem= getItem(position);
        TextView zootext= (TextView) customView.findViewById(R.id.zooText);
        ImageView zooImage=(ImageView) customView.findViewById(R.id.zooImage);
        //zootext.setText(singleanimalitem);
        zootext.setText(animals[position]);
        //zooImage.setImageResource(R.mipmap.elephant);    changed
        zooImage.setImageResource(imgid[position]);


        return customView;

    }
}
