package com.example.trabalhopelegrin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TeamFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Member> memberList;

    public TeamFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        memberList = new ArrayList<>();
        memberList.add(new Member("Gabriel", "248812-1", R.drawable.gabriel));
        memberList.add(new Member("Mello", "246387-1", R.drawable.mello));
        memberList.add(new Member("Juliano", "249752-1", R.drawable.juliano));

        MemberAdapter adapter = new MemberAdapter(getContext(), memberList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}