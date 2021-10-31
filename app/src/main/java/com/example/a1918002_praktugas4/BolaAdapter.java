package com.example.a1918002_praktugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BolaAdapter extends RecyclerView.Adapter<BolaAdapter.BolaViewHolder>{
    private ArrayList<Bola> dataList;
    public BolaAdapter(ArrayList<Bola> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public BolaAdapter.BolaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_bola, parent, false);
        return new BolaViewHolder(view);
    }
    public void onBindViewHolder(BolaViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtKlub.setText(dataList.get(position).getKlub());
        holder.txtAsal.setText(dataList.get(position).getAsal());
        holder.txtJulukan.setText(dataList.get(position).getJulukan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BolaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKlub, txtAsal, txtJulukan;
        private ImageView Foto;
        public BolaViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtKlub = (TextView)itemView.findViewById(R.id.txt_klub);
            txtAsal = (TextView) itemView.findViewById(R.id.txt_asal);
            txtJulukan = (TextView) itemView.findViewById(R.id.txt_julukan);
        }
    }
}

