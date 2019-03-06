package com.xianggu.mvpzswlearn;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.android.baseLib.BaseActivity;

public class MainActivity extends BaseActivity implements IDownloadView{
    private Context mContext;
    private ImageView imageView;
    private ProgressDialog progressDialog;

    private DownloadPresenter mDownloadPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        init();
    }

    private void init() {
        mDownloadPresenter = new DownloadPresenter(this);
        imageView = findViewById(R.id.image);
        findViewById(R.id.downloadBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDownloadPresenter.download(Constant.DOWNLOADURL);
            }
        });

        findViewById(R.id.downloadBtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDownloadPresenter.download("aaaaaaaaaaaaaa");          //错误地址
            }
        });


        progressDialog = new ProgressDialog(mContext);
        progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancle",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                progressDialog.dismiss();
            }
        });

        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setTitle("测试下载文件");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

    }

    @Override
    public void showProgressBar(boolean show) {
        if (show){
            progressDialog.show();
        }else{
            progressDialog.dismiss();
        }
    }

    @Override
    public void setProcessProgress(int progress) {
        progressDialog.setProgress(progress);
    }

    @Override
    public void setView(String result) {
        imageView.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public void showFailToast() {
        imageView.setImageResource(R.mipmap.ic_launcher_round);
    }
}
