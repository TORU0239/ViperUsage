package my.liewjuntung.daggerviperusage.view;

import java.util.List;

import my.liewjuntung.daggerviperusage.model.InstagramItemModel;
import toru.io.my.bviper.view.BViperView;

/**
 * Created by toruchoi on 06/10/2017.
 */

public interface InitView extends BViperView {
    void onUpdate(List<InstagramItemModel> result);
}