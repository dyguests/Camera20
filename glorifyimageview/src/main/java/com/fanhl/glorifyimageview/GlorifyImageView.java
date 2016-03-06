package com.fanhl.glorifyimageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * 专门用来显示美化图片的视图.
 * <p>
 * Created by fanhl on 16/3/6.
 */
public class GlorifyImageView extends ImageView {
    public GlorifyImageView(Context context) {
        super(context);
    }

    public GlorifyImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GlorifyImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GlorifyImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
