package my.liewjuntung.kotlindaggerapp.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.adapter_init.view.*
import my.liewjuntung.kotlindaggerapp.R
import my.liewjuntung.kotlindaggerapp.glide.GlideApp
import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainInstaAdapter : RecyclerView.Adapter<InstaViewHolder>() {

    var instaList: List<InstagramItemModel>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: InstaViewHolder?, position: Int) {
        holder?.bindData(instaList?.get(position))
    }

    override fun getItemCount(): Int {
        if (instaList == null){
            return 0
        }
        return instaList!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): InstaViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_init, parent, false)
        return InstaViewHolder(view)
    }
}

class InstaViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    fun bindData(data: InstagramItemModel?) {
        GlideApp.with(itemView)
                .load(data?.images?.stdResolution?.url)
                .fitCenter()
                .circleCrop()
                .override(Target.SIZE_ORIGINAL)
                .into(itemView.img_caption)
    }
}