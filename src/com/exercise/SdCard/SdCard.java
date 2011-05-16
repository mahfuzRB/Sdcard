package com.exercise.SdCard;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class SdCard extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
     // Create a sub Folder in SD card.
        String newFolder = "/RBAnalysis";
        String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
        File myNewFolder = new File(extStorageDirectory + newFolder);
        myNewFolder.mkdir();
        
        
    }
}