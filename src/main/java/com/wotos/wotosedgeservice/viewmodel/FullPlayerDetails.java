package com.wotos.wotosedgeservice.viewmodel;

import com.wotos.wotosedgeservice.util.model.PlayerDetails;
import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;

import java.util.List;
import java.util.Map;

public class FullPlayerDetails {

    PlayerDetails playerDetails;
    Map<String, List<PlayerStatisticsSnapshot>> playerStatisticsSnapshots;
    Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>> vehicleStatisticsSnapshots;

    public PlayerDetails getPlayerDetails() {
        return playerDetails;
    }

    public void setPlayerDetails(PlayerDetails playerDetails) {
        this.playerDetails = playerDetails;
    }

    public Map<String, List<PlayerStatisticsSnapshot>> getPlayerStatisticsSnapshots() {
        return playerStatisticsSnapshots;
    }

    public void setPlayerStatisticsSnapshots(Map<String, List<PlayerStatisticsSnapshot>> playerStatisticsSnapshots) {
        this.playerStatisticsSnapshots = playerStatisticsSnapshots;
    }

    public Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>> getVehicleStatisticsSnapshots() {
        return vehicleStatisticsSnapshots;
    }

    public void setVehicleStatisticsSnapshots(Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>> vehicleStatisticsSnapshots) {
        this.vehicleStatisticsSnapshots = vehicleStatisticsSnapshots;
    }
}
