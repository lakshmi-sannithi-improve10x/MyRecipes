package com.improve10x.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class WhatsAppActivity extends AppCompatActivity {
    public WhatsappItems[] whatsappItems;
    public WhatsAppItemAdapter adapter;
    ListView whatsAppItemLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        initViews();
        createWhatsappData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        whatsAppItemLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new WhatsAppItemAdapter(whatsappItems);
    }

    private void initViews() {
        whatsAppItemLv= findViewById(R.id.whatsappitems_lv);
    }

    private void createWhatsappData() {
        whatsappItems = new WhatsappItems[6];
        WhatsappItems item1 = new WhatsappItems();
        item1.contactName = "Whitmans Chat";
        item1.imageUrl = "https://images.freeimages.com/fic/images/icons/1773/free/256/person.png";
        item1.description = "Ned:Yeah, I think I know wha...";
        item1.timeAndDay = "11.45 AM";
        item1.numbers = "3";
        whatsappItems[0] = item1;

        WhatsappItems item2 = new WhatsappItems();
        item2.contactName = "Stewart Family";
        item2.imageUrl = "https://icons.veryicon.com/png/Business/Flat%20Finance/person.png";
        item2.description = "Steve: Great, thanks";
        item2.timeAndDay = "11:39 AM";
        item2.numbers = "1";
        whatsappItems[1] = item2;

        WhatsappItems item3 = new WhatsappItems();
        item3.contactName = "Alice Whitman";
        item3.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item3.description = "image";
        item3.timeAndDay = "YESTERDAY";
        item3.numbers = "";
        whatsappItems[2] = item3;

        WhatsappItems item4 = new WhatsappItems();
        item4.contactName = "Jack Whitman";
        item4.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item4.description ="0.07";
        item4.timeAndDay = "FRIDAY";
        item4.numbers = "";
        whatsappItems[3] = item4;

        WhatsappItems item5 = new WhatsappItems();
        item5.contactName = "Lunch Group";
        item5.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item5.description = "";
        item5.timeAndDay = "FRIDAY";
        item5.numbers = "";
        whatsappItems[4] = item5;

        WhatsappItems item6 = new WhatsappItems();
        item6.contactName = "Jane Pearson";
        item6.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item6.description = "";
        item6.timeAndDay = "FRIDAY";
        item6.numbers = "";
        whatsappItems[5] = item6;
    }
}