package com.example.iophone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class Spesifikasi extends AppCompatActivity {

    public static final String EXTRA_NAME = "Name";
    public static final String EXTRA_DETAIL = "Detail";
    public static final String EXTRA_DISPLAY = "Display";
    public static final String EXTRA_SIZE = "Size";
    public static final String EXTRA_CHIPSET = "Chipset";
    public static final String EXTRA_RAM = "RAM";
    public static final String EXTRA_FITUR = "Fitur";
    public static final String EXTRA_BATTERY = "Battery";
    public static final String EXTRA_IMAGES = "Images";

    ImageView imgPhoto;
    TextView name, detail, display, size, chipset, ram, fitur, battery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi);

        imgPhoto = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);
        display = findViewById(R.id.tv_item_display);
        size = findViewById(R.id.tv_item_size);
        chipset = findViewById(R.id.tv_item_chipset);
        ram = findViewById(R.id.tv_item_ram);
        fitur = findViewById(R.id.tv_item_fitur);
        battery = findViewById(R.id.tv_item_battery);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra(EXTRA_NAME)) {

            String extName = getIntent().getStringExtra(EXTRA_NAME);
            String extDetail = getIntent().getStringExtra(EXTRA_DETAIL);
            String extDisplay = getIntent().getStringExtra(EXTRA_DISPLAY);
            String extSize = getIntent().getStringExtra(EXTRA_SIZE);
            String extChipset = getIntent().getStringExtra(EXTRA_CHIPSET);
            String extRAM = getIntent().getStringExtra(EXTRA_RAM);
            String extFitur = getIntent().getStringExtra(EXTRA_FITUR);
            String extBattery = getIntent().getStringExtra(EXTRA_BATTERY);
            String extImage = getIntent().getStringExtra(EXTRA_IMAGES);

            name.setText(extName);
            detail.setText(extDetail);
            display.setText(extDisplay);
            size.setText(extSize);
            chipset.setText(extChipset);
            ram.setText(extRAM);
            fitur.setText(extFitur);
            battery.setText(extBattery);

            Glide.with(this)
                    .load(extImage)
                    .apply(new RequestOptions())
                    .into(imgPhoto);

            Spesifikasi.this.setTitle(extName);
        } else {
            Toast.makeText(this, "No API Data", Toast.LENGTH_SHORT).show();
        }
    }
}