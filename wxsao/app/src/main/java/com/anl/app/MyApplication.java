package com.anl.app;

import android.app.Application;

import com.yxhty.accessibilityutil.BaseAccessibilityService;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		BaseAccessibilityService.getInstance().init(getApplicationContext());
	}
}
