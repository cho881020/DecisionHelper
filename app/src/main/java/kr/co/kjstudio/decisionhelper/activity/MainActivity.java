package kr.co.kjstudio.decisionhelper.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import kr.co.kjstudio.decisionhelper.R;


public class MainActivity extends BaseActivity {

    private Toolbar myawesometoolbar;
    private ViewPager myViewPager;
    private com.ogaclejapan.smarttablayout.SmartTabLayout viewpagertab;
    private LinearLayout drawLayout;
    private DrawerLayout dlactivitymaindrawer;
    private LinearLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setCustomActionbar();
        setupEvents();
        setValues();
    }



    @Override
    public void setupEvents() {
        super.setupEvents();



        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrCloseSideMenu();
            }
        });
    }

    void setCurrentPage(int index) {

        myViewPager.setCurrentItem(index);

    }

    void openOrCloseSideMenu() {
//왼쪽 사이드바 열고 닫는 함수
        if (dlactivitymaindrawer.isDrawerOpen(drawLayout)) {
            dlactivitymaindrawer.closeDrawer(drawLayout);
        } else {
            dlactivitymaindrawer.openDrawer(drawLayout);
        }
    }

    @Override
    public void setValues() {
        super.setValues();


        toggleBtn.setVisibility(View.VISIBLE);

//        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
//                getSupportFragmentManager(), FragmentPagerItems.with(this)
//                .add(R.string.product_list, ProductListFrag.class)
//                .add(R.string.my_orders, MyOrderListFrag.class)
//                .add(R.string.setting, SettingsFrag.class)
//                .create());
//        myViewPager.setAdapter(adapter);
        myViewPager.setOffscreenPageLimit(3);

        viewpagertab.setViewPager(myViewPager);
    }

    @Override
    public void setCustomActionbar() {
//위에 있는 툴바? -> 커스텀액션바 설정

        setSupportActionBar(myawesometoolbar);
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayHomeAsUpEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        mActionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.custom_action_bar, null);

        toggleBtn = (ImageButton) mCustomView.findViewById(R.id.toggleBtn);
        backBtn = (ImageButton) mCustomView.findViewById(R.id.backBtn);


        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);

        Toolbar parent = (Toolbar) mCustomView.getParent();
        parent.setContentInsetsAbsolute(0, 0);

//        FontChanger.setGlobalFont(FontChanger.setTypeFace(mContext), mContext, getWindow().getDecorView());
    }

    @Override
    public void bindViews() {
        super.bindViews();

        this.activitymain = (LinearLayout) findViewById(R.id.activity_main);
        this.dlactivitymaindrawer = (DrawerLayout) findViewById(R.id.dl_activity_main_drawer);
        this.drawLayout = (LinearLayout) findViewById(R.id.drawLayout);
        this.myViewPager = (ViewPager) findViewById(R.id.myViewPager);
        this.viewpagertab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        this.myawesometoolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
    }


}
