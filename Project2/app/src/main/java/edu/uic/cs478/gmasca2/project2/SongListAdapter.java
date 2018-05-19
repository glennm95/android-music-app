package edu.uic.cs478.gmasca2.project2;

import android.content.Context;
import android.util.Log;
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

    static class ViewHolder{
        TextView songName;
        TextView songArtist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.song_item,viewGroup,false);
            viewHolder = new ViewHolder();

            viewHolder.songName = convertView.findViewById(R.id.song_title);
            viewHolder.songArtist = convertView.findViewById(R.id.song_artist);

            convertView.setTag(viewHolder);
        }

        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.songName.setText(songList.get(position).getSongName());
        viewHolder.songArtist.setText(songList.get(position).getSongArtist());

        return convertView;
    }
}
