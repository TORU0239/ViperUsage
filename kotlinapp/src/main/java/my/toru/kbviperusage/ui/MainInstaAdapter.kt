package my.toru.kbviperusage.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.adapter_init.view.*
import my.toru.kbviperusage.R
import my.toru.kbviperusage.glide.GlideApp
import my.toru.kbviperusage.model.response.InstagramItemModel

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainInstaAdapter(var list:List<InstagramItemModel>) : RecyclerView.Adapter<InstaViewHolder>() {
    override fun onBindViewHolder(holder: InstaViewHolder?, position: Int) {
        holder?.bindData(list.get(position))
    }

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): InstaViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_init, parent, false)
        return InstaViewHolder(view)
    }
}

class InstaViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    fun bindData(data:InstagramItemModel){
        GlideApp.with(itemView)
                .load(data.images.stdResolution.url)
                .fitCenter()
                .circleCrop()
                .override(Target.SIZE_ORIGINAL)
                .into(itemView.img_caption)
    }
}