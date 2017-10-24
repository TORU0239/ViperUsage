package my.toru.kbviperusage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_init.*
import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramItemModel
import my.toru.kbviperusage.mvp.MainPresenterImp
import my.toru.kbviperusage.mvp.MainView
import my.toru.kbviperusage.ui.MainInstaAdapter

class MainActivity : AppCompatActivity(), MainView {

    private val presenter:MainPresenterImp = MainPresenterImp(MainActivity@this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
        presenter.onCreate()

        initTrigger()
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
        val currentAdapter = init_recyclerview.adapter as MainInstaAdapter
        currentAdapter.list = result
        currentAdapter.notifyDataSetChanged()
    }

    private fun initTrigger(){
        init_recyclerview.adapter = MainInstaAdapter(ArrayList())
        init_recyclerview.layoutManager = LinearLayoutManager(MainActivity@this)
        presenter.updateStart(RequestModel("toru_0239", "0"))
    }
}