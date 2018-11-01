package com.example.user.myandroid;


import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<listitem> {
    ArrayList<listitem> arrayList=new ArrayList<>();

    private final Activity context;
    public ListAdapter(Activity context) {
        super(context, R.layout.mylist);
        this.context=context;
    }

    @Override
    public int getCount(){
        return arrayList.size();
    }
    @Override
    public long getItemId(int position){
        return 0;
    }

    public void add(Bitmap image,String t1,String t2,String t3)
    {
        listitem listItem=new listitem(image,t1,t2,t3);
        arrayList.add(listItem);
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = context.getLayoutInflater().inflate(R.layout.mylist, parent, false);

            holder = new ViewHolder();
            holder.icon = (ImageView) convertView.findViewById(R.id.list_image);
            holder.text = (TextView) convertView.findViewById(R.id.tv1);
            holder.timestamp = (TextView) convertView.findViewById(R.id.release);
            holder.byname = (TextView) convertView.findViewById(R.id.tv2);
            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder) convertView.getTag();
            holder.icon.setImageBitmap(arrayList.get(position).getImage());
            holder.text.setText(arrayList.get(position).getTitle());
            holder.byname.setText(arrayList.get(position).getByname());
            holder.timestamp.setText(arrayList.get(position).getRelease());
        }
        return convertView;
    }

/*((TextView)convertView.findViewById(android.R.id.text1))
.setText(getItem(position));
*/



    static class ViewHolder{
        TextView text;
        TextView timestamp;
        ImageView icon;
        TextView byname;
        int position;
    }


}

