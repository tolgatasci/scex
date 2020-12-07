package com.tolgatasci.scexdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.tolgatasci.scex.YTex;
import com.tolgatasci.scex.model.response.Playlist;
import com.tolgatasci.scex.model.response.ResponseMp3;
import com.tolgatasci.scex.model.response.SearchResponse;
import com.tolgatasci.scex.model.response.TrackItem;
import com.tolgatasci.scex.model.response.query.ResponseQuery;
import com.tolgatasci.scex.network.CallbackApi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import java.util.List;

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

        YTex yt = new YTex(getApplicationContext(),"");
        yt.getFile("https://api-v2.soundcloud.com/media/soundcloud:tracks:186613464/6b49f818-be4d-459d-8cfa-5371768459ba/stream/progressive", (CallbackApi.ResData<ResponseMp3>) response -> Log.e("work",response.getUrl() + ""));
    }
}