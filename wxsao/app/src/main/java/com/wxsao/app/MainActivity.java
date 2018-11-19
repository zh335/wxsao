package com.wxsao.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hs.saoyisao.WxSaoHelper;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.btnLaunchWxSYS)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnAutoLaunchWxSYS)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLaunchWxSYS:
                try {
                    WxSaoHelper.directTo(this);
                } catch (Exception e) {
                    Toast.makeText(this, ("" + e), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnAutoLaunchWxSYS:
                try {
                    WxSaoHelper.autoDirectTo(this);
                } catch (Exception e) {
                    Toast.makeText(this, ("" + e), Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
