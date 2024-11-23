package me.relex.camerafilter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.image_filter).setOnClickListener(this);
        findViewById(R.id.video_record).setOnClickListener(this);
    }

    @Override public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.image_filter) {
            startActivity(new Intent(this, ImageFilterActivity.class));
        } else if (id == R.id.video_record) {
            startActivity(new Intent(this, VideoRecordActivity.class));
        }
    }
}
