package com.lolo.demalapronta.activity;

import android.os.Bundle;

import com.lolo.demalapronta.R;

import java.util.Locale;

/**
 * Created by Leonardo on 1/14/2017.
 */

public class LuggageActivity extends BaseActivity implements ActivityBehavior{
    @Override
    public void init() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luggage);
        setupToolbar(R.string.app_name);
    }
}