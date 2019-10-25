package com.example.iophone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static com.example.iophone.Spesifikasi.EXTRA_BATTERY;
import static com.example.iophone.Spesifikasi.EXTRA_CHIPSET;
import static com.example.iophone.Spesifikasi.EXTRA_DETAIL;
import static com.example.iophone.Spesifikasi.EXTRA_DISPLAY;
import static com.example.iophone.Spesifikasi.EXTRA_FITUR;
import static com.example.iophone.Spesifikasi.EXTRA_IMAGES;
import static com.example.iophone.Spesifikasi.EXTRA_NAME;
import static com.example.iophone.Spesifikasi.EXTRA_RAM;
import static com.example.iophone.Spesifikasi.EXTRA_SIZE;


public class CardViewPhone extends RecyclerView.Adapter<CardViewPhone.CardViewViewHolder> {
    private ArrayList<Phone> listPhone;
    private Context mContext;


    CardViewPhone(Context context, ArrayList<Phone> list) {
        this.mContext = context;
        this.listPhone = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_phone, viewGroup, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
            Phone phone = listPhone.get(position);

        Glide.with(holder.itemView.getContext())
                .load(phone.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(phone.getName());
        holder.tvDetail.setText(phone.getDetail());
        holder.tvDisplay.setText(phone.getDisplay());
        holder.tvSize.setText(phone.getSize());
        holder.tvChipset.setText(phone.getChipset());
        holder.tvRAM.setText(phone.getRAM());
        holder.tvFitur.setText(phone.getRAM());
        holder.tvBattery.setText(phone.getBattery());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Phone clickedDataItem = listPhone.get(holder.getAdapterPosition());
                Toast.makeText(holder.itemView.getContext(), clickedDataItem.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, Phone.class);
                intent.putExtra(EXTRA_NAME, clickedDataItem.getName());
                intent.putExtra(EXTRA_DETAIL, clickedDataItem.getDetail());
                intent.putExtra(EXTRA_DISPLAY, clickedDataItem.getDisplay());
                intent.putExtra(EXTRA_SIZE, clickedDataItem.getSize());
                intent.putExtra(EXTRA_CHIPSET, clickedDataItem.getChipset());
                intent.putExtra(EXTRA_RAM, clickedDataItem.getRAM());
                intent.putExtra(EXTRA_FITUR, clickedDataItem.getFitur());
                intent.putExtra(EXTRA_BATTERY, clickedDataItem.getBattery());
                intent.putExtra(EXTRA_IMAGES, clickedDataItem.getPhoto());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPhone.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvDisplay, tvSize, tvChipset, tvRAM, tvFitur, tvBattery;
        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvDisplay = itemView.findViewById(R.id.tv_item_display);
            tvSize = itemView.findViewById(R.id.tv_item_size);
            tvChipset = itemView.findViewById(R.id.tv_item_chipset);
            tvRAM = itemView.findViewById(R.id.tv_item_ram);
            tvFitur = itemView.findViewById(R.id.tv_item_fitur);
            tvBattery = itemView.findViewById(R.id.tv_item_battery);
        }
    }
}