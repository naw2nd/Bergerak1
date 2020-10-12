package com.example.bergerak1.modul.listTask;

import android.view.View;

import com.example.bergerak1.base.BaseFragmentHolderActivity;


public class ListTaskActivity extends BaseFragmentHolderActivity {
    ListTaskFragment listTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        listTaskFragment = new ListTaskFragment();
        setCurrentFragment(listTaskFragment, false);

    }



}
