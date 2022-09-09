package com.wotos.wotosedgeservice.service;

import com.wotos.wotosedgeservice.util.feign.WotosPlayerFeignClient;
import com.wotos.wotosedgeservice.util.feign.WotosStatisticsFeignClient;
import com.wotos.wotosedgeservice.util.model.Player;
import com.wotos.wotosedgeservice.util.model.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.VehicleStatisticsSnapshot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Map;

@Service
public class WotosService {

    WotosStatisticsFeignClient wotosStatisticsFeignClient;
    WotosPlayerFeignClient wotosPlayerFeignClient;

    public WotosService(WotosStatisticsFeignClient wotosStatisticsFeignClient, WotosPlayerFeignClient wotosPlayerFeignClient) {
        this.wotosStatisticsFeignClient = wotosStatisticsFeignClient;
        this.wotosPlayerFeignClient = wotosPlayerFeignClient;
    }

    public ResponseEntity<Player> getPlayerByNickname(String nickname) {
        return wotosPlayerFeignClient.getPlayerByNickname(nickname);
    }

    public ResponseEntity<List<Player>> getPlayersByNickname(String nickname) {
        return wotosPlayerFeignClient.getPlayersByNickname(nickname);
    }

    public ResponseEntity<Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>>> getPlayerStatisticsSnapshotsByAccountIds(List<Integer> accountIds) {
        ResponseEntity<Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>>> test = wotosStatisticsFeignClient.getPlayerStatistics(accountIds);
        return test;
    }

    public ResponseEntity<Map<Integer, Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>>>> getPlayerVehicleStatisticsSnapshotsByAccountIdAndVehicleIds(List<Integer> accountIds, List<Integer> vehicleIds) {
        return wotosStatisticsFeignClient.getPlayerVehicleStatistics(accountIds, vehicleIds);
    }

}
