package com.improve10x.myrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DunzoItemAdapter extends ArrayAdapter<DunzoDailyItem> {
    public DunzoItemAdapter(@NonNull Context context, int resource, @NonNull DunzoDailyItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
          DunzoDailyItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.dunzo_item,parent,false);
        TextView discountTxt = view.findViewById(R.id.discount_txt);
        discountTxt.setText(item.discount);
        ImageView imageIv = view.findViewById(R.id.image_iv);

        TextView productNameTxt = view.findViewById(R.id.productname_txt);
        productNameTxt.setText(item.productName);
        return  view;
    }
}
