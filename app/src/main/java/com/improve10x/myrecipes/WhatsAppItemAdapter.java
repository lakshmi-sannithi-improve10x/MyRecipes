package com.improve10x.myrecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class WhatsAppItemAdapter extends BaseAdapter {
     public WhatsappItems[] items;


public  WhatsAppItemAdapter(WhatsappItems[] whatsappItems){
 items = whatsappItems;
}


    @Override
    public int getCount() {
    return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        WhatsappItems item = (WhatsappItems) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.whatsapp_item,parent,false);
        TextView contactTxt = view.findViewById(R.id.contact_txt);
        contactTxt.setText(item.contactName);
         ImageView imageLv = view.findViewById(R.id.image_iv);
        Picasso.get().load(item.imageUrl).into(imageLv);
        TextView descriptionTxt = view.findViewById(R.id.description_txt);
        descriptionTxt.setText(item.description);
        TextView timeTxt = view.findViewById(R.id.time_txt);
        timeTxt.setText(item.timeAndDay);
        TextView numberTxt = view.findViewById(R.id.number_txt);
        numberTxt.setText(item.numbers);
        return view;
    }
}
