package com.xianggu.mvpzswlearn;

/**
 * @Description: 在presenter的具体实现过程中，业务操作交给Model  视图操作交给View 自身作为一个桥梁
 * @Author: xianggu
 * @CreateDate: 2019/3/2 2:29 PM
 */
public class DownloadPresenter implements IDownloadPresenter {

    private IDownloadView mIDownloadView;
    private IDownloadModel mIDownloadModel;

    public DownloadPresenter(IDownloadView mIDownloadView){
        this.mIDownloadView = mIDownloadView;
        this.mIDownloadModel = new DownloadModel(this);
    }

    @Override
    public void download(String url) {
        mIDownloadView.showProgressBar(true);           //开始下载
        mIDownloadModel.downLoad(url);
    }

    @Override
    public void downloadSuccess(String result) {
        mIDownloadView.showProgressBar(false);          //下载完成不显示
        mIDownloadView.setView(result);                 //显示下载完成的View结果
    }

    @Override
    public void downloadProgress(int progress) {
        mIDownloadView.setProcessProgress(progress);    //显示下载进度
    }

    @Override
    public void downloadFail() {
        mIDownloadView.showProgressBar(false);          //下载失败不显示
        mIDownloadView.showFailToast();                 //显示下载失败内容
    }
}
