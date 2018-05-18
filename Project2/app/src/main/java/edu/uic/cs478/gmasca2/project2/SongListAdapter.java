package edu.uic.cs478.gmasca2.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Glenn on 27-Feb-18.
 */

class SongListAdapter extends BaseAdapter {

    private Context context;
    private List<SongItem> songList;

    SongListAdapter(Context context, List<SongItem> songList) {
        this.context = context;
        this.songList = songList;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int i) {
        return songList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater myInflater = LayoutInflater.from(context);

        View customView = myInflater.inflate(R.layout.song_item,viewGroup,false);
        TextView songName = customView.findViewById(R.id.song_title);
        TextView songArtist = customView.findViewById(R.id.song_artist);

        songName.setText(songList.get(i).getSongName());
        songArtist.setText(songList.get(i).getSongArtist());

        return customView;

    }
}
