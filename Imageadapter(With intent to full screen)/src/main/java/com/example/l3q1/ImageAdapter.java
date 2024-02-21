package com.example.l3q1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

    Context context;
    String[] imgname;
    int[] imgid;


    LayoutInflater inflater;

    public ImageAdapter(Context context, String[] imgname, int[] imgid) {
        this.context = context;
        this.imgname = imgname;
        this.imgid = imgid;
    }

    @Override
    public int getCount() {
        return imgname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater==null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView = inflater.inflate(R.layout.grid_item,null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textViewname);

        imageView.setImageResource(imgid[position]);
        textView.setText(imgname[position]);
        return convertView;
    }
}