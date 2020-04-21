package com.example.sknsavedpreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ActivityB extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypreferences);
    }
}
