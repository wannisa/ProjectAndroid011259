package com.example.aoyler.pawarisaclinicapp;

import android.os.AsyncTask;

import java.io.IOException;


import android.os.AsyncTask;

import java.io.IOException;


import android.os.AsyncTask;
import android.view.View;

import com.google.api.client.googleapis.extensions.android.gms.auth.GooglePlayServicesAvailabilityIOException;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;

import java.io.IOException;


public abstract class  AddEvent_CalendarAsyncTask extends AsyncTask<Void, Void, Boolean> {

    final AddEvent_MainActivity activity;
    final com.google.api.services.calendar.Calendar client;


    AddEvent_CalendarAsyncTask(AddEvent_MainActivity activity) {
        this.activity = activity;
        client = activity.client;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        activity.numAsyncTasks++;
    }
    @Override
    protected final Boolean doInBackground(Void... ignored) {
        try {
            doInBackground();
            return true;
        }
        catch (IOException e) {
            AddEvent_Utils.logAndShow(activity, AddEvent_MainActivity.TAG, e);
        }
        return false;
    }
    abstract protected void doInBackground() throws IOException;
}
