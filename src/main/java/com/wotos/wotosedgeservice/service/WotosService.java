package com.wotos.wotosedgeservice.service;

import com.wotos.wotosedgeservice.util.feign.WotosPlayerFeignClient;
import com.wotos.wotosedgeservice.util.feign.WotosStatisticsFeignClient;
import com.wotos.wotosedgeservice.util.feign.WotosVehicleFeignClient;
import com.wotos.wotosedgeservice.util.model.WotPlayer;
import com.wotos.wotosedgeservice.util.model.WotVehicle;
import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;
import com.wotos.wotosedgeservice.viewmodel.FullPlayerDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WotosService {

    WotosStatisticsFeignClient wotosStatisticsFeignClient;
    WotosPlayerFeignClient wotosPlayerFeignClient;
    WotosVehicleFeignClient wotosVehicleFeignClient;

    public WotosService(WotosStatisticsFeignClient wotosStatisticsFeignClient, WotosPlayerFeignClient wotosPlayerFeignClient) {
        this.wotosStatisticsFeignClient = wotosStatisticsFeignClient;
        this.wotosPlayerFeignClient = wotosPlayerFeignClient;
    }

    public Map<Integer, FullPlayerDetails> getFullPlayerDetailsByAccountIds(
            Integer[] accountIds
    ) {
        Map<Integer, FullPlayerDetails> fullPlayerDetailsMap = new HashMap<>();
//        Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>> playerStatisticsSnapshotsMap = wotosStatisticsFeignClient.getPlayerStatisticsSnapshots(accountIds).getBody();
//        Map<Integer, Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>>> playerVehicleStatisticsSnapshotsMap = wotosStatisticsFeignClient.getPlayerVehicleStatisticsSnapshots(accountIds, null).getBody();

        for (Integer accountId : accountIds) {
            FullPlayerDetails fullPlayerDetails = new FullPlayerDetails();

//            fullPlayerDetails.setPlayerDetails(wotosPlayerFeignClient.g);
//            fullPlayerDetails.setPlayerStatisticsSnapshots(playerStatisticsSnapshotsMap.get(accountId));
//            fullPlayerDetails.setVehicleStatisticsSnapshots(playerVehicleStatisticsSnapshotsMap.get(accountId));

            fullPlayerDetailsMap.put(accountId, fullPlayerDetails);
        }

        return fullPlayerDetailsMap;
    }

    public List<WotPlayer> getPlayersByNickname(
            String[] nicknames, String language, Integer limit, String searchType
    ) {
        return wotosPlayerFeignClient.getPlayersByNickname(nicknames, language, limit, searchType).getBody();
    }

    public Map<Integer, WotVehicle> getVehicles(
            String[] fields, String language, Integer limit, String[] nations,
            Integer pageNumber, Integer[] vehicleIds, Integer[] vehicleTiers,
            String[] vehicleTypes
    ) {
        return wotosVehicleFeignClient.getVehicles(fields, language, limit, nations, pageNumber, vehicleIds, vehicleTiers, vehicleTypes);
    }

}
