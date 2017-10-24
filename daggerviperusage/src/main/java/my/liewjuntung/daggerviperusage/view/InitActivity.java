package my.liewjuntung.daggerviperusage.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

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

    private ActivityInitBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Inject this activity */
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_init);

        presenter.onCreate();

        binding.initRecyclerview.setAdapter(new InitViewAdapter(new ArrayList<>()));

        RequestModel model = new RequestModel();
        model.id = "toru_0239";
        model.maxId = "0";
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
        binding.initRecyclerview.setAdapter(new InitViewAdapter(result));
        binding.initRecyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}