package com.improve10x.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class DunzoDailyActivity extends AppCompatActivity {
       public DunzoDailyItem[] dunzoDailyItems;
       public  DunzoItemAdapter adapter;
       GridView dunzoItemsGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunzo_daily);
        initViews();
        createDaliyItemsData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        dunzoItemsGv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new DunzoItemAdapter(this, android.R.layout.simple_list_item_1,dunzoDailyItems);
    }

    private void initViews() {
        dunzoItemsGv = findViewById(R.id.dunzoitems_gv);
        dunzoItemsGv.setNumColumns(4);
    }

    private void createDaliyItemsData() {
        dunzoDailyItems = new DunzoDailyItem[14];

        dunzoDailyItems[0] = new DunzoDailyItem();
        dunzoDailyItems[0].discount = "up to 30% OFF";
        dunzoDailyItems[0].imageUrl = "sample";
        dunzoDailyItems[0].productName = "Breakfast & Dairy";

        dunzoDailyItems[1] = new DunzoDailyItem();
        dunzoDailyItems[1].discount = "up to 30% OFF";
        dunzoDailyItems[1].imageUrl = "sample";
        dunzoDailyItems[1].productName = "Vegetables & Herbs";

        dunzoDailyItems[2] = new DunzoDailyItem();
        dunzoDailyItems[2].discount = "up to 30% OFF";
        dunzoDailyItems[2].imageUrl = "sample";
        dunzoDailyItems[2].productName = "Fresh Fruits";

        dunzoDailyItems[3] = new DunzoDailyItem();
        dunzoDailyItems[3].discount = "up to 30% OFF";
        dunzoDailyItems[3].imageUrl = "sample";
        dunzoDailyItems[3].productName = "Provisions";

        dunzoDailyItems[4] = new DunzoDailyItem();
        dunzoDailyItems[4].discount = "up to 30% OFF";
        dunzoDailyItems[4].imageUrl = "sample";
        dunzoDailyItems[4].productName = "Snacks & Bevarages";

        dunzoDailyItems[5] = new DunzoDailyItem();
        dunzoDailyItems[5].discount = "up to 30% OFF";
        dunzoDailyItems[5].imageUrl = "sample";
        dunzoDailyItems[5].productName = "Chocolates & deserts";

        dunzoDailyItems[6] = new DunzoDailyItem();
        dunzoDailyItems[6].discount = "up to 30% OFF";
        dunzoDailyItems[6].imageUrl = "sample";
        dunzoDailyItems[6].productName = "Instant Foods";

        dunzoDailyItems[7] = new DunzoDailyItem();
        dunzoDailyItems[7].discount = "up to 30% OFF";
        dunzoDailyItems[7].imageUrl = "sample";
        dunzoDailyItems[7].productName = "Baby and Self Care";

        dunzoDailyItems[8] = new DunzoDailyItem();
        dunzoDailyItems[8].discount = "up to 30% OFF";
        dunzoDailyItems[8].imageUrl = "sample";
        dunzoDailyItems[8].productName = "Home Care";

        dunzoDailyItems[9] = new DunzoDailyItem();
        dunzoDailyItems[9].discount = "up to 30% OFF";
        dunzoDailyItems[9].imageUrl = "sample";
        dunzoDailyItems[9].productName = "Meat";

        dunzoDailyItems[10] = new DunzoDailyItem();
        dunzoDailyItems[10].discount = "up to 30% OFF";
        dunzoDailyItems[10].imageUrl = "sample";
        dunzoDailyItems[10].productName = "Pet Care";

        dunzoDailyItems[11] = new DunzoDailyItem();
        dunzoDailyItems[11].discount = "up to 30% OFF";
        dunzoDailyItems[11].imageUrl = "sample";
        dunzoDailyItems[11].productName = "paan Corner";

        dunzoDailyItems[12] = new DunzoDailyItem();
        dunzoDailyItems[12].discount = "up to 30% OFF";
        dunzoDailyItems[12].imageUrl = "sample";
        dunzoDailyItems[12].productName = "Apples";

        dunzoDailyItems[13] = new DunzoDailyItem();
        dunzoDailyItems[13].discount = "up to 30% OFF";
        dunzoDailyItems[13].imageUrl = "sample";
        dunzoDailyItems[13].productName = "KurKure";
    }
}