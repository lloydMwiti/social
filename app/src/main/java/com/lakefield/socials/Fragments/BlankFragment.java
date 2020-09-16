package com.lakefield.socials.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lakefield.socials.R;
import com.lakefield.socials.Row;
import com.lakefield.socials.StagarredRVAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    //Recyclerview
    RecyclerView stagerredrv;
    StagarredRVAdapter adapter;
    StaggeredGridLayoutManager manager;
    View v;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_blank, container, false);
        stagerredrv=v.findViewById(R.id.rec);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        stagerredrv.setLayoutManager(manager);

        List<Row> list=new ArrayList<>();
        list.add(new Row(R.drawable.img1));
        list.add(new Row(R.drawable.img11));
        list.add(new Row(R.drawable.img12));
        list.add(new Row(R.drawable.img13));
        list.add(new Row(R.drawable.img4));
        list.add(new Row(R.drawable.img15));
        list.add(new Row(R.drawable.img16));
        list.add(new Row(R.drawable.img17));
        list.add(new Row(R.drawable.img18));
        list.add(new Row(R.drawable.img19));
        list.add(new Row(R.drawable.img2));
        list.add(new Row(R.drawable.img3));
        list.add(new Row(R.drawable.img4));
        list.add(new Row(R.drawable.img5));
        list.add(new Row(R.drawable.img6));
        list.add(new Row(R.drawable.img7));
        list.add(new Row(R.drawable.img8));
        list.add(new Row(R.drawable.img9));
        list.add(new Row(R.drawable.img10));
        list.add(new Row(R.drawable.img20));

        adapter=new StagarredRVAdapter(getContext(),list);
        stagerredrv.setAdapter(adapter);
        return v;

    }
}