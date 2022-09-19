package com.wotos.wotosedgeservice.viewmodel;

import com.wotos.wotosedgeservice.util.model.PlayerDetails;
import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;

import java.util.List;
import java.util.Map;

public class FullPlayerDetails {

    PlayerDetails playerDetails;
    List<PlayerStatisticsSnapshot> playerStatisticsSnapshots;
    Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>> vehicleStatisticsSnapshots;

}
