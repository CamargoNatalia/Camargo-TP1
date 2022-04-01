package com.example.camargo_tp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class RecibirLlamada extends BroadcastReceiver {
private boolean usbConectado;

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        System.out.println(action);
        boolean conectarUsb;
        if (conectarUsb = intent.getBooleanExtra("connected", true)) {

            String number = "911";
            Uri call = Uri.parse("telefono: " + number);
            Intent i = new Intent(Intent.ACTION_CALL, call);

            Toast.makeText(context, "Usted ha recibido una Llamada", Toast.LENGTH_LONG).show();
        }
    }

    }

