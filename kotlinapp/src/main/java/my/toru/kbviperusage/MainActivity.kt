package my.toru.kbviperusage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_init.*
import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramModel
import my.toru.kbviperusage.mvp.MainPresenterImp
import my.toru.kbviperusage.mvp.MainView

class MainActivity : AppCompatActivity(), MainView {

    private val presenter:MainPresenterImp = MainPresenterImp()

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

    override fun onUpdate(result: List<InstagramModel>) {}

    private fun initTrigger(){
        presenter.updateStart(RequestModel("toru_0239", "0"))
    }
}