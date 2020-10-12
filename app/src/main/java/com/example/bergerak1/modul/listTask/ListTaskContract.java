package com.example.bergerak1.modul.listTask;

import com.example.bergerak1.base.BasePresenter;
import com.example.bergerak1.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ListTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToAddTask();
    }

    interface Presenter extends BasePresenter {
        void performAddTask();
    }
}
