package com.example.lenovo.androidbasic;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

    public static final String VariableBag="pref";
    public static PreferenceManager preferenceManager;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;



    public static PreferenceManager getInstance() {
        return preferenceManager;
    }

    public PreferenceManager(Context context) {
        preferenceManager = this;
        mSharedPreferences = context.getSharedPreferences(VariableBag, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }


    public void clearPreferences() {
        mEditor.clear();
        mEditor.commit();
    }

    public void removePref(Context context, String keyToRemove) {
        mSharedPreferences = context.getSharedPreferences(VariableBag, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
        mEditor.remove(keyToRemove);
        mEditor.commit();
    }


    public String getRegisteredUserId() {
        String strUserId = mSharedPreferences.getString(VariableBag, "0");
        return strUserId;
    }

    public void setRegisteredUserId(String strUserId) {
        mEditor.putString(VariableBag, strUserId).commit();
    }

    public void setLoginSession(String Number) {
        mEditor.putBoolean("Number", true);
        mEditor.commit();
    }

    public boolean getLoginSession() {
        boolean login = mSharedPreferences.getBoolean("name", false);
        return login;
    }

    public void setRegisterSession(String email)
    {
        mEditor.putBoolean("email", true);
        mEditor.commit();
    }

    public boolean getRegisterSession()
    {
        boolean register = mSharedPreferences.getBoolean("email", false);
        return register;
    }

    public void  setKeyValueString(String key, String value) {
       mEditor.putString(key, value).commit();
    }

    public String getKeyValueString(String key) {
        String getValue = mSharedPreferences.getString(key, "email");
        return getValue;
    }

    public int getKeyValueInt(String key) {
        int getValue = mSharedPreferences.getInt(key, 0);
        return getValue;
    }

    public boolean getKeyValueBoolean(String key) {
        boolean getValue = mSharedPreferences.getBoolean(key, false);
        return getValue;
    }

    public void  setKeyValueStringRegister(String key, String value)
    {
        mEditor.putString(key, value).commit();
    }

    public String getKeyValueStringRegister(String key) {
        String getValue1 = mSharedPreferences.getString(key, "email");
        return getValue1;
    }

}

