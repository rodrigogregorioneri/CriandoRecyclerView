package net.paulacr.recyclerviewexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.paulacr.recyclerviewexample.R;
import net.paulacr.recyclerviewexample.model.Humor;

import java.util.List;

/**
 * Created by Paula on 19/07/2015.
 */
public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.ViewHolder>
{

    private List<Humor> humors;

    public MeuAdapter(List<Humor> humor) {
        this.humors = humor;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView texto;
        public ImageView imagem;

        public ViewHolder(View view) {
            super(view);
            view.setClickable(true);
            texto = (TextView) view.findViewById(R.id.texto);
            imagem = (ImageView) view.findViewById(R.id.icon);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            System.out.println("recyclerview position clicked now: " + getAdapterPosition());
        }
    }

    @Override
    public MeuAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_layout, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MeuAdapter.ViewHolder viewHolder, final int position) {
        Humor humor = humors.get(position);

        viewHolder.texto.setText(humor.getTitle());
        viewHolder.imagem.setImageResource(humor.getIcon());
    }

    @Override
    public int getItemCount() {
        return humors.size();
    }
}
