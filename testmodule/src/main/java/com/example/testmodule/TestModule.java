package com.example.testmodule;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class TestModule {
    public static void logEvent(Context context){
        Log.d("TAG", "logEvent");
        Toast.makeText(context, "logEvent", Toast.LENGTH_SHORT).show();
    }
}
