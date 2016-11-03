package com.intelematics.interview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.intelematics.interview.R;
import com.intelematics.interview.models.Song;
import com.squareup.picasso.Picasso;

/**
 * Created by Hurman on 03/11/2016.
 */
public class SongsListAdapter extends RecyclerView.Adapter<SongsListAdapter.ViewHolder> {

    private Song mSong;
    private int mLayout;
    public Context mContext;


    public SongsListAdapter(Context context, Song song, int layout){
        this.mContext = context;
        this.mSong = song;
        this.mLayout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(mLayout, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tvPrice.setText(mSong.getResults().get(position).getTrackPrice().toString());
        holder.tvTitle.setText(mSong.getResults().get(position).getTrackName());
        holder.tvArtist.setText(mSong.getResults().get(position).getArtistName());

        Picasso.with(mContext).load(mSong.getResults().get(position).getArtworkUrl60());
    }

    @Override
    public int getItemCount() {
        return mSong.getResults() != null ? mSong.getResults().size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvPrice, tvTitle, tvArtist;
        public ImageView imgAlbumCover;

        public ViewHolder(View view) {
            super(view);

            imgAlbumCover = (ImageView) view.findViewById(R.id.album_cover);
            tvPrice = (TextView) view.findViewById(R.id.song_price);
            tvTitle = (TextView) view.findViewById(R.id.song_title);
            tvArtist = (TextView) view.findViewById(R.id.song_artist);

        }

    }


}
