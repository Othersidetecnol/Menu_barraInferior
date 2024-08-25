package com.example.menu_barrainferior.ui.home.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.menu_barrainferior.R;
import com.example.menu_barrainferior.ui.home.Domain.TrendsDomain;
import java.util.ArrayList;

// Classe TrendsAdapter que estende RecyclerView.Adapter
public class TrendsAdapter extends RecyclerView.Adapter<TrendsAdapter.Viewholder> {
    ArrayList<TrendsDomain> Itens; // Lista de itens do tipo TrendsDomain
    Context context; // Contexto da aplicação

    // Construtor da classe TrendsAdapter
    public TrendsAdapter(ArrayList<TrendsDomain> itens) {
        Itens = itens;
    }

    // Método chamado para criar novas views (invocado pelo layout manager)
    @NonNull
    @Override
    public TrendsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Infla o layout para cada item da lista
        View inflator = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trend_list, parent, false);
        context = parent.getContext();
        return new Viewholder(inflator);
    }

    // Método chamado para substituir o conteúdo de uma view (invocado pelo layout manager)
    @Override
    public void onBindViewHolder(@NonNull TrendsAdapter.Viewholder holder, int position) {
        // Define o texto dos TextViews com base nos dados do item atual
        holder.titleTxt.setText(Itens.get(position).getTitle());
        holder.subtitleTxt.setText(Itens.get(position).getSubtitle());

        // Obtém o ID do recurso drawable com base no nome do arquivo de imagem
        int drawableResourceId = holder.itemView.getResources().getIdentifier(Itens.get(position).getPicPath(), "drawable", holder.itemView.getContext().getPackageName());
        // Usa a biblioteca Glide para carregar a imagem no ImageView com cantos arredondados
        Glide.with(context)
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30,30,0,0))
                //.transform(new GranularRounderCorners(30, 30, 0, 0))
                .into(holder.pic);
    }

    // Método que retorna o tamanho da lista de itens (invocado pelo layout manager)
    @Override
    public int getItemCount() {
        return Itens.size();
    }

    // Classe interna Viewholder que representa cada item da lista
    public class Viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt, subtitleTxt; // TextViews para título e subtítulo
        ImageView pic; // ImageView para a imagem

        // Construtor da classe Viewholder
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            // Inicializa os componentes da view
            titleTxt = itemView.findViewById(R.id.titleTxt);
            subtitleTxt = itemView.findViewById(R.id.subtitleTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
