package com.tutor.update;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainAcitivity extends Activity {
    

	private UpdateManager mUpdateManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //?????????·Ú??????????
        mUpdateManager = new UpdateManager(this);
        mUpdateManager.checkUpdateInfo();


    }     
}