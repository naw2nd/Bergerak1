package com.example.bergerak1.modul.addTask;

import com.example.bergerak1.base.BasePresenter;
import com.example.bergerak1.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface AddTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
