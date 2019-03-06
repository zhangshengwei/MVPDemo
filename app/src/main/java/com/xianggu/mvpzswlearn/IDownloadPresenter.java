package com.xianggu.mvpzswlearn;

/**
 * @Description: presenter作为内容提供器，连接Model 和 View
 * @Author: xianggu
 * @CreateDate: 2019/3/2 2:19 PM
 */
public interface IDownloadPresenter {

    /**
     * 下载
     * @param url
     */
    void download(String url);

    /**
     * 下载成功
     * @param result
     */
    void downloadSuccess(String result);

    /**
     * 当前下载进度
     * @param progress
     */
    void downloadProgress(int progress);

    /**
     * 下载失败
     */
    void downloadFail();
}
