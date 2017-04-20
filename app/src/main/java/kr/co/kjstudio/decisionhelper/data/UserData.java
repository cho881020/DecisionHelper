package kr.co.kjstudio.decisionhelper.data;

import java.io.Serializable;

/**
 * Created by KJStudio on 2017. 2. 27..
 */

public class UserData implements Serializable {

    public int Pkey = -1;
    public String provider;
    public String uid;
    public String name;
    public int current_point = -1;
    public String os;
    public String device_token;
    public String validate_key;
    public String nickName;

}
