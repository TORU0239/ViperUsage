package my.liewjuntung.daggerviperusage.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import my.liewjuntung.daggerviperusage.R;
import my.liewjuntung.daggerviperusage.databinding.ActivityInitBinding;
import my.liewjuntung.daggerviperusage.model.InstagramItemModel;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import my.liewjuntung.daggerviperusage.presenter.InitPresenter;
import my.liewjuntung.daggerviperusage.view.ui.InitViewAdapter;


public class InitActivity extends AppCompatActivity implements InitView {
    private static final String TAG = InitActivity.class.getSimpleName();
    @Inject
    public InitPresenter<RequestModel> presenter;
    // not really necessary to inject so many, just to demonstrate that it can be done like this.
    // Just for lulz
    @Inject
    public InitViewAdapter adapter;
    @Inject
    public LinearLayoutManager layoutManager;
    @Inject @Named("kevin")
    public RequestModel model;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Inject this activity, the inject fields are initialized in this point */
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        // put AndroidInjection.inject(this); here if you want to inject ActivityInitBinding too.
        ActivityInitBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_init);
        presenter.onCreate();

        binding.initRecyclerview.setAdapter(adapter);
        binding.initRecyclerview.setLayoutManager(layoutManager);

        presenter.onUpdateStart(model);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        presenter = null;
        super.onDestroy();
    }

    @Override
    public void onUpdate(List<InstagramItemModel> result) {
        Log.w(TAG, "onUpdate, list size : " + result.size());
        adapter.setModelList(result);
    }
}