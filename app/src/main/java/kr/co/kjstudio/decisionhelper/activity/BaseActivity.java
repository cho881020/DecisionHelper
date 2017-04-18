package kr.co.kjstudio.decisionhelper.activity;

/**
 * Created by KJStudio on 2017. 4. 17..
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import kr.co.kjstudio.decisionhelper.R;

/**
 * Created by KJStudio on 2017. 2. 27..
 */

public class BaseActivity extends AppCompatActivity {


    public TextView mTitleTextView;
    public LinearLayout titleLayout;
    public ImageButton toggleBtn;
    public ImageView titleImg;
    public ImageButton backBtn;
    public ImageButton addBtn;

    Context mContext = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

    }

    void bindViews() {

    }

    void setupEvents() {

    }

    void setValues() {

    }


    public void setCustomActionbar() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayHomeAsUpEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        mActionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.custom_action_bar, null);
//        FontChanger.setGlobalFont(FontChanger.setTypeFace(BaseActivity.this), BaseActivity.this, mTitleTextView);

        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);

        Toolbar parent = (Toolbar) mCustomView.getParent();
        parent.setContentInsetsAbsolute(0, 0);
        getSupportActionBar().setElevation(0);



        mTitleTextView = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.titleTxt);
        titleLayout = (LinearLayout) getSupportActionBar().getCustomView().findViewById(R.id.titleLayout);
        toggleBtn = (ImageButton) getSupportActionBar().getCustomView().findViewById(R.id.toggleBtn);
        titleImg = (ImageView) getSupportActionBar().getCustomView().findViewById(R.id.titleImg);
        backBtn = (ImageButton) getSupportActionBar().getCustomView().findViewById(R.id.backBtn);
        addBtn = (ImageButton) getSupportActionBar().getCustomView().findViewById(R.id.addBtn);



//        mTitleTextView.setTypeface(Typeface.createFromAsset(getAssets(),"NotoSansKR-DemiLight-Hestia.otf"));
//        Typeface khandBold = Typeface.createFromAsset(BaseActivity.this.getAssets(), "NotoSansKR-DemiLight-Hestia.otf");

//        mTitleTextView.setTypeface(khandBold);
    }

}
