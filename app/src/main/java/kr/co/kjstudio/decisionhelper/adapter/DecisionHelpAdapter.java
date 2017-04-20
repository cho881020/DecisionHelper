package kr.co.kjstudio.decisionhelper.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import kr.co.kjstudio.decisionhelper.R;
import kr.co.kjstudio.decisionhelper.data.DecisionData;

/**
 * Created by KJStudio on 2017. 4. 20..
 */

public class DecisionHelpAdapter extends ArrayAdapter<DecisionData> {


    Context mContext;
    ArrayList<DecisionData> mList;

    LayoutInflater inf;

    private SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy. MM. dd");


    public DecisionHelpAdapter(Context context, ArrayList<DecisionData> list) {
        super(context, R.layout.my_decision_list_item, list);

        mContext = context;
        mList = list;
        // 인플레이터는 한번만 초기화 하도록 이곳에서 설정.
        inf = LayoutInflater.from(context);
        Log.d("CHO", "mListSize = " + mList.size());
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        DecisionData rowData = mList.get(position);
        // 뷰를 재활용하고자 한다.
        // 재활용 할 뷰가 없을 경우에만 화면을 새로 그려준다.
        if (row == null) {
            // 인플레이터를 이용해 새로이 그려줌.
            row = inf.inflate(R.layout.my_decision_list_item, null);
        }

        LinearLayout titleLayout = (LinearLayout) row.findViewById(R.id.titleLayout);
        TextView titleTxt = (TextView) row.findViewById(R.id.titleTxt);


        return row;

    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
