package my.toru.kbviperusage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import my.toru.kbviperusage.model.response.InstagramModel
import my.toru.kbviperusage.mvp.MainView

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)

    }

    override fun onUpdate(result: List<InstagramModel>) {}
}