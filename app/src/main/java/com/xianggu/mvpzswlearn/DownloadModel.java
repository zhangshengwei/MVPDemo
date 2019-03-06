package com.xianggu.mvpzswlearn;

import android.util.Log;

/**
 * @Description:  Model实现具体业务逻辑代码  包括 网络请求，数据持久化  增删改查 等等任务
 * @Author: xianggu
 * @CreateDate: 2019/3/2 2:23 PM
 */
public class DownloadModel implements IDownloadModel {

    private IDownloadPresenter mIDownloadPresenter;

    public DownloadModel(IDownloadPresenter mIDownloadPresenter){
        this.mIDownloadPresenter = mIDownloadPresenter;
    }

    @Override
    public void downLoad(String url) {
        Log.i("<<---->>", "网络请求: 开始下载");
    }



}
