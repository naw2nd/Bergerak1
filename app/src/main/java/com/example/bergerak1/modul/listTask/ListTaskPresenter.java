package com.example.bergerak1.modul.listTask;

/**
 * Created by fahrul on 13/03/19.
 */

public class ListTaskPresenter implements ListTaskContract.Presenter{
    private final ListTaskContract.View view;

    public ListTaskPresenter(ListTaskContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performAddTask(){
        //proses login
        //if login success call redirect to profile
        view.redirectToAddTask();
    }

}
