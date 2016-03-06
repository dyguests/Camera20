package com.fanhl.camera20.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fanhl.camera20.R;

/**
 * Created by fanhl on 16/3/6.
 */
public class HistoryBarFragment extends Fragment {
    public static final String TAG = HistoryBarFragment.class.getSimpleName();

    public static HistoryBarFragment newInstance() {
        return new HistoryBarFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_bar, container, false);
        return view;
    }
}
