package my.liewjuntung.kotlindaggerapp.mvp

import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel

/**
 * Created by toruchoi on 24/10/2017.
 */
interface MainView {
    fun onUpdate(result:List<InstagramItemModel>)
}