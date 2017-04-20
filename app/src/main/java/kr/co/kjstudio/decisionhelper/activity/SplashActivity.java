package kr.co.kjstudio.decisionhelper.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kr.co.kjstudio.decisionhelper.R;
import kr.co.kjstudio.decisionhelper.activity.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getKeyHash();

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("Log", "3sec");
                startMainActivity();
            }
        }, 1500);

    }


    void getKeyHash() {

        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "kr.co.kjstudio.decisionhelper",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }

    }

    void startMainActivity() {

        Intent mIntent = new Intent(mContext, MainActivity.class);
        startActivity(mIntent);
        finish();

    }
}
