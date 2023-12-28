package com.example.musicplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AbuAirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //for this to work we must add to our manifest a receiver and intent-filter----within the receiver
        if(intent.getAction() != null && intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED))
        {
            boolean isAirplaneOn = intent.getBooleanExtra("state", false);


            //shortcut way for if and else
            String msg = isAirplaneOn ? "Airplane Mode is ON" : "Airplane mode is OFF";

            Toast.makeText(context," "+msg,Toast.LENGTH_SHORT).show();
        }

    }
}
