package com.example.bergerak1.modul.listTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.bergerak1.R;
import com.example.bergerak1.base.BaseFragment;
import com.example.bergerak1.modul.addTask.AddTaskActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ListTaskFragment extends BaseFragment<ListTaskActivity, ListTaskContract.Presenter> implements ListTaskContract.View {

    Button btnAddTask;


    public ListTaskFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_list_task, container, false);
        mPresenter = new ListTaskPresenter(this);
        mPresenter.start();

        btnAddTask = fragmentView.findViewById(R.id.createTaskBtn);
        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtnAddTask();
            }
        });

        setTitle("My Task List");

        return fragmentView;
    }

    public void setBtnAddTask(){
        mPresenter.performAddTask();
    }

    @Override
    public void setPresenter(ListTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToAddTask() {
            Intent intent = new Intent(activity, AddTaskActivity.class);
            startActivity(intent);
            activity.finish();
    }


}
