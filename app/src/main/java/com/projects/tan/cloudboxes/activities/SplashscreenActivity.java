package com.projects.tan.cloudboxes.activities;

import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.projects.tan.cloudboxes.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by oudong on 09/02/2017.
 */

public class SplashscreenActivity extends AppCompatActivity {

    @BindView(R.id.mTextViewAppName)
    TextView mTextViewAppName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ButterKnife.bind(this);

        Animation animation = new TranslateAnimation(0, 0, 0, getScreenHeight() / 4);
        mTextViewAppName.setAnimation(animation);
    }

    private int getScreenHeight() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        return size.y;
    }
}
