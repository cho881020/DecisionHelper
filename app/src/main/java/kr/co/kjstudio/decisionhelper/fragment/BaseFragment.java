package kr.co.kjstudio.decisionhelper.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2017-03-07.
 */

public class BaseFragment extends Fragment {

    Context mContext = null;
    View v;

    public int layoutResId = 0;


    // 이 프래그먼트를 상속받는 모든 프래그먼트는 폰트를 자동으로 설정해준다.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(layoutResId, container, false);


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = getActivity();
    }

    void bindViews() {

    }

    void setupEvent() {

    }

    void setValues() {

    }
}
