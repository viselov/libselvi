package com.selvi.app;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.selvi.libselvi.callback.NewsCallback;
import com.selvi.libselvi.callback.NewsCallbackImpl;
import com.selvi.libselvi.model.AllNewsItem;
import com.selvi.libselvi.model.NewsItem;
import com.selvi.libselvi.retrofit.ApiInterface;

import java.util.List;

public class MainActivity extends AppCompatActivity  implements NewsCallback {
    public ApiInterface apiService;
    private AdapterMainActivity adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;
    private NewsItem temp2;
    private NewsCallbackImpl newsCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsCallback = new NewsCallbackImpl(this, this);
        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();

        newsCallback.executeGetNewsAll("","",1,10,"news");
    }

    private void generateDataList(AllNewsItem listNewsAll) {
        List<NewsItem> temp = listNewsAll.getList().getNews();
        if (temp.size() > 0) {

            temp2 = temp.get(0);
            temp.remove(0);
        }

        recyclerView = findViewById(R.id.rvNews);
        adapter = new AdapterMainActivity(this,temp);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onNewsSuccess(AllNewsItem listData) {
        progressDoalog.dismiss();
        generateDataList(listData);
    }

    @Override
    public void onNewsFailure(String message) {

    }
}

