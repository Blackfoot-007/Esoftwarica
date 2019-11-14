package com.shresthagaurav.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shresthagaurav.esoftwarica.R;
import com.shresthagaurav.esoftwarica.adapter.StudentListApt;
import com.shresthagaurav.esoftwarica.model.DataSet;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    public RecyclerView recyclerView;
    View view;
    List<DataSet> studentList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.RcView);
        DataSet sd= new DataSet("Sita", "dhalko", "12", "female");

        studentList=sd.getSlist();


        if(studentList.isEmpty()){
    studentList.add(sd);

    studentList.add( new DataSet("Ram", "dhalko", "12", "male"));


    sd.setSlist(studentList);

       }


        StudentListApt studentListApt = new StudentListApt(getActivity(), studentList);
        recyclerView.setAdapter(studentListApt);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }



}