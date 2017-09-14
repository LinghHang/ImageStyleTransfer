package com.lvqingyang.imagestyletransfer.base;

import org.lasque.tusdk.core.TuSdkApplication;

import cn.bmob.push.BmobPush;

/**
 * Created by ASUS on 2017/6/8.
 */

public class MyApplication extends TuSdkApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化SDK
        this.setEnableLog(true);
        this.initPreLoader(this.getApplicationContext(), "c2732abd7195dd3b-01-sfv0r1");
        Bmob.initialize(this, "bf3fef2683cecf005c55a4f6ce32c643");
        // 使用推送服务时的初始化操作
        BmobInstallation.getCurrentInstallation().save();
        // 启动推送服务
        BmobPush.startWork(this);
    }

}
