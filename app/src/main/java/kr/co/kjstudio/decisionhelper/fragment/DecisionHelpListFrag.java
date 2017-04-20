package kr.co.kjstudio.decisionhelper.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import kr.co.kjstudio.decisionhelper.R;

/**
 * Created by KJStudio on 2017. 4. 18..
 */

public class DecisionHelpListFrag extends BaseFragment {


    ListView decisionListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutResId = R.layout.frag_decision_help;
        v = super.onCreateView(inflater, container, savedInstanceState);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bindViews();
        setupEvent();
        setValues();
    }

    @Override
    void setupEvent() {
        super.setupEvent();
    }

    @Override
    void setValues() {
        super.setValues();
    }

    @Override
    void bindViews() {
        super.bindViews();
        decisionListView = (ListView) v.findViewById(R.id.decisionListView);
    }
}
