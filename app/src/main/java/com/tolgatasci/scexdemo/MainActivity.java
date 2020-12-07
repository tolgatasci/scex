package com.tolgatasci.scexdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.tolgatasci.scex.SCex;
import com.tolgatasci.scex.model.response.ResponseDoc;
import com.tolgatasci.scex.network.CallbackApi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        SCex yt = new SCex(getApplicationContext(),"");
        yt.FileGet("https://api-v2.soundcloud.com/media/soundcloud:tracks:186613464/6b49f818-be4d-459d-8cfa-5371768459ba/stream/progressive", (CallbackApi.ResData<ResponseDoc>) response -> Log.e("work",response.getUrl() + ""));
    }
}