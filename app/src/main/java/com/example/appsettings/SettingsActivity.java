package com.example.appsettings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.SwitchPreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    //key là key của SwitchPreference bên file xml
    public static final String KEY_PREF_EXAMPLE_SWITCH = "swp_setting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fragment được hiển thị dưới dạng nội dung chính:
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}