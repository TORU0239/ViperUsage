package my.liewjuntung.daggerviperusage.view.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.request.target.Target;

import java.util.List;

import my.liewjuntung.daggerviperusage.R;
import my.liewjuntung.daggerviperusage.databinding.AdapterInitBinding;
import my.liewjuntung.daggerviperusage.model.InstagramItemModel;
import my.liewjuntung.daggerviperusage.network.GlideApp;


/**
 * Created by toruchoi on 08/10/2017.
 */

public class InitViewAdapter extends RecyclerView.Adapter<InitViewAdapter.InitViewHolder> {
    private static final String TAG = InitViewAdapter.class.getSimpleName();

    private List<InstagramItemModel> modelList;

    public void setModelList(List<InstagramItemModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public InitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        AdapterInitBinding binding = DataBindingUtil
                                        .inflate(LayoutInflater.from(parent.getContext()),
                                                R.layout.adapter_init, parent, false);

        return new InitViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(InitViewHolder holder, int position) {
        holder.bindView(modelList.get(position));
    }

    @Override
    public int getItemCount() {
        if (modelList == null){
            return 0;
        }
        return modelList.size();
    }

    static class InitViewHolder extends RecyclerView.ViewHolder{
        private AdapterInitBinding binding;

        public InitViewHolder(AdapterInitBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        protected void bindView(InstagramItemModel model){
            binding.setInstagramData(model);
            binding.executePendingBindings();
            GlideApp.with(binding.getRoot())
                    .load(model.getImages().getStandardResolution().getUrl())
                    .fitCenter()
                    .circleCrop()
                    .override(Target.SIZE_ORIGINAL)
                    .into(binding.imgCaption);
        }
    }
}