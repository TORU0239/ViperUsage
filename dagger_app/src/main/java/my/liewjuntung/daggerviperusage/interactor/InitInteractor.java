package my.liewjuntung.daggerviperusage.interactor;


import java.util.List;

import my.liewjuntung.daggerviperusage.model.InstagramItemModel;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import toru.io.my.bviper.interactor.AltBViperInteractor;

/**
 * Created by toruchoi on 06/10/2017.
 */

public interface InitInteractor extends AltBViperInteractor<List<InstagramItemModel>, RequestModel> {}