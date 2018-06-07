package com.example.cuntada.app;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.cuntada.app.Model.Model;
import com.example.cuntada.app.Model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentListViewModel extends ViewModel {
    LiveData<List<Student>> data;

    public LiveData<List<Student>> getData(){
        data = Model.instance.getAllStudents();
        return data;
    }


}
