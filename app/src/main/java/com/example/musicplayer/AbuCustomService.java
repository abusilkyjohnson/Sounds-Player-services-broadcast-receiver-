package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;//used to play audio and media files
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import java.security.Provider;

public class AbuCustomService extends Service {

    private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {//execution of services start
                                                                        //By calling this method
        //PLAys the default alarm
        player = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);

        player.setLooping(true);

        player.start();

        return START_STICKY;//start stick return an int letting it know the service neeeds to start
                //START_NOT_STICKY  it indicates that the service should not be restarted by the system
                //after it has been terminated.This service will remain stopped unless explicitly started again by the application or the component.
                //This return type is suitable for services that perform specific tasks and don't need to be running continuously.
                //For example, a service that plays a sound effect when a notification is received might use this option.
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        // onBind method is a part of the service class and is used specifically in the context of bound services.
        //A bound service is a type of service that allows other components, usually activities to bind to it


        return null;//this indicate service doesnt support any service we have our custom
    }
}
