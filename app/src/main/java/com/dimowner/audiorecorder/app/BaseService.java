package com.dimowner.audiorecorder.app;

import android.app.PendingIntent;
import android.app.Service;
import android.os.Build;

public abstract class BaseService extends Service {


    public static boolean S() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.S;//31
    }

    //public final int flagUC = PendingIntent.FLAG_UPDATE_CURRENT
    public static int flagUC = S() ? PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT : PendingIntent.FLAG_UPDATE_CURRENT;

    //public static final int flagCC = PendingIntent.FLAG_CANCEL_CURRENT
    public static int flagCC = S() ? PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_CANCEL_CURRENT : PendingIntent.FLAG_CANCEL_CURRENT;



}
