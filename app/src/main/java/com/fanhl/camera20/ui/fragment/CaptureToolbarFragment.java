package com.fanhl.camera20.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fanhl.camera20.R;
import com.fanhl.camera20.ui.base.BaseFragment;

/**
 * Created by fanhl on 16/3/6.
 */
public class CaptureToolbarFragment extends BaseFragment {
    public static final String TAG = CaptureToolbarFragment.class.getSimpleName();

    public static CaptureToolbarFragment newInstance() {
        return new CaptureToolbarFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_capture_toolbar, container, false);
        return view;
    }
}
