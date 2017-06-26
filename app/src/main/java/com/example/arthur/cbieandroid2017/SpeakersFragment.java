package com.example.arthur.cbieandroid2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Arthur on 26/06/2017.
 */

public class SpeakersFragment extends Fragment {

    String[] speakers = {"Patricia", "Carla", "Arthur", "Isabel", "Pastel", "Café", "Ventilador","Churros","Coca-cola",
    "Agua", "Britney Spears", "Madonna", "Beyoncé", "Grimes", "St Vincent", "Cher", "Little Mix"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View speakersView = inflater.inflate(R.layout.fragment_speakers, container, false);

        ListView lv = (ListView) speakersView.findViewById(R.id.lv_speakers);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getActivity(),android.R.layout.simple_list_item_1, speakers);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(getActivity(), SingleSpeakerActivity.class);
                myIntent.putExtra("speaker", speakers[position]);
                startActivity(myIntent);

            }
        });

        return speakersView;
    }
}
