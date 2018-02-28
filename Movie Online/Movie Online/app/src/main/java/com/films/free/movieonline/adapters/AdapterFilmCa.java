package com.films.free.movieonline.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.films.free.movieonline.R;
import com.films.free.movieonline.objects.FilmObject;

import java.util.ArrayList;

/**
 * Created by loanx on 2/12/2018.
 */

public class AdapterFilmCa extends RecyclerView.Adapter<AdapterFilmCa.ItemFilm> {
    private Context context;
    private ArrayList<FilmObject> ls;

    @Override
    public ItemFilm onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ItemFilm holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemFilm extends RecyclerView.ViewHolder {
        ImageView iv_thuml;
        TextView tv_name;

        public ItemFilm(View itemView) {
            super(itemView);
            iv_thuml = (ImageView) itemView.findViewById(R.id.iv_thuml);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name_film);
        }
    }
}
