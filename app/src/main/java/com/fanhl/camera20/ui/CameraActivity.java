package com.fanhl.camera20.ui;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fanhl.camera20.R;
import com.fanhl.camera20.ui.fragment.CaptureToolbarFragment;

/**
 * 拍照
 */
public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        initFragments();
    }


    private void initFragments() {
        Fragment captureToolbarFragment = getFragmentManager().findFragmentByTag(CaptureToolbarFragment.TAG);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (captureToolbarFragment == null) {
            captureToolbarFragment = CaptureToolbarFragment.newInstance();
            transaction.replace(R.id.capture_toolbar_container, captureToolbarFragment, CaptureToolbarFragment.TAG);
        }

        transaction.commit();
    }
}
