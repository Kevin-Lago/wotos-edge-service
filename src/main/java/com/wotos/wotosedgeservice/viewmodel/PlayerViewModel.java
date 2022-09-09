package com.wotos.wotosedgeservice.viewmodel;

import com.wotos.wotosedgeservice.util.model.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.VehicleStatisticsSnapshot;

import java.util.List;

public class PlayerViewModel {

    private String nickname;
    private Integer accountId;
    private List<PlayerStatisticsSnapshot> playerStatisticsSnapshots;
    private List<VehicleStatisticsSnapshot> vehicleStatisticsSnapshots;

}
