package edu.neu.ranchen.dreamble;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by FredChen on 10/11/16.
 */
public class DreambleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}

