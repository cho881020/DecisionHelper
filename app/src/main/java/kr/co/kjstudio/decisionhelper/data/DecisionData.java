package kr.co.kjstudio.decisionhelper.data;

import java.io.Serializable;

/**
 * Created by KJStudio on 2017. 4. 20..
 */

public class DecisionData implements Serializable {


    public String title;
    public int PKey;
    public String content;

    public UserData writerData;

}
