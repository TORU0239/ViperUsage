package my.liewjuntung.kotlindaggerapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_init.*
import my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel
import my.liewjuntung.kotlindaggerapp.mvp.MainPresenter
import my.liewjuntung.kotlindaggerapp.mvp.MainView
import my.liewjuntung.kotlindaggerapp.ui.MainInstaAdapter
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity(), MainView {
    //my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
    //private val presenter: MainPresenterImp = MainPresenterImp(MainActivity@this)
    @Inject lateinit var presenter: MainPresenter<RequestModel>
    @Inject lateinit var mainAdapter: MainInstaAdapter
    @Inject lateinit var mainLayoutManager: LinearLayoutManager
    @Inject @field:Named("kevin") lateinit var requestModel: RequestModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
        initTrigger()
        presenter.onCreate()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun onUpdate(result: List<InstagramItemModel>) {
        mainAdapter.instaList = result
    }

    private fun initTrigger(){
        init_recyclerview.adapter = mainAdapter
        init_recyclerview.layoutManager= mainLayoutManager
        presenter.updateStart(requestModel)
    }
}