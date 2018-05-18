package edu.uic.cs478.gmasca2.project2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;


import java.util.List;

/**
 * Created by Glenn on 02-Mar-18.
 */

public class AddNewSongDialog extends DialogFragment {

    public String m_SongName;
    public String m_SongArtist;
    public String m_SongWiki;
    public String m_ArtistWiki;
    public String m_SongVideo;

    public SongListAdapter adapter = MainListActivity.adapter;

    public List<SongItem> songList = MainListActivity.songList;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View mView = inflater.inflate(R.layout.add_song_layout,null);

        final EditText addSongName = mView.findViewById(R.id.add_song_title);

        final EditText addSongArtist = mView.findViewById(R.id.add_song_artist);

        final EditText addSongWiki = mView.findViewById(R.id.add_song_wiki);

        final EditText addArtistWiki = mView.findViewById(R.id.add_artist_wiki);

        final EditText addSongVideo = mView.findViewById(R.id.add_song_video);

        builder.setView(mView).setPositiveButton("ADD", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                m_SongName = addSongName.getText().toString();
                m_SongArtist = addSongArtist.getText().toString();
                m_SongWiki = addSongWiki.getText().toString();
                m_ArtistWiki = addArtistWiki.getText().toString();
                m_SongVideo = addSongVideo.getText().toString();

                songList.add(new SongItem(m_SongName, m_SongArtist, m_SongWiki, m_ArtistWiki, m_SongVideo));
                adapter.notifyDataSetChanged();

            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AddNewSongDialog.this.getDialog().cancel();
            }
        });


        return builder.create();
    }
}
