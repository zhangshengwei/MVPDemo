package com.xianggu.mvpzswlearn;

/**
 * @Description: 接口定义需要的视图逻辑
 * @Author: xianggu
 * @CreateDate: 2019/3/2 2:16 PM
 */
public interface IDownloadView {

    /**
     * 显示进度条
     * @param show
     */
    void showProgressBar(boolean show);

    /**
     * 设置进度条
     * @param progress
     */
    void setProcessProgress(int progress);

    /**
     * 根据数据设置view
     * @param result
     */
    void setView(String result);

    /**
     * 请求失败是显示的View
     */
    void showFailToast();
}
