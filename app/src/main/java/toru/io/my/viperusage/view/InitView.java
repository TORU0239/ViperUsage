package toru.io.my.viperusage.view;

import java.util.List;

import toru.io.my.bviper.view.MvpView;
import toru.io.my.viperusage.model.InstagramItemModel;

/**
 * Created by toruchoi on 06/10/2017.
 */

public interface InitView extends MvpView{
    void onUpdate(List<InstagramItemModel> result);
}