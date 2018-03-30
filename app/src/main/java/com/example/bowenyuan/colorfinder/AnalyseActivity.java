package com.example.bowenyuan.colorfinder;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class AnalyseActivity extends AppCompatActivity {

   private static ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);
        File file = new File(MainActivity.getPath());
        photo = findViewById(R.id.selectPhoto);
        photo.setImageURI(Uri.fromFile(file));
    }

}
