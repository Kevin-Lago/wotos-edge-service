package com.wotos.wotosedgeservice.service;

import com.wotos.wotosedgeservice.util.feign.WotosPlayerFeignClient;
import com.wotos.wotosedgeservice.util.feign.WotosStatisticsFeignClient;
import com.wotos.wotosedgeservice.util.model.WotPlayer;
import com.wotos.wotosedgeservice.util.model.WotVehicle;
import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;
import com.wotos.wotosedgeservice.viewmodel.FullPlayerDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

    public Map<Integer, FullPlayerDetails> getFullPlayerDetailsByAccountIds(
            Integer[] accountIds
    ) {
        return null;
    }

    public List<WotPlayer> getPlayersByNickname(
            String[] nicknames, String language, Integer limit, String searchType
    ) {
        return wotosPlayerFeignClient.getPlayersByNickname(nicknames, language, limit, searchType);
    }

    public Map<Integer, WotVehicle> getVehicles(
            String[] fields, String language, Integer limit, String[] nations,
            Integer pageNumber, Integer[] vehicleIds, Integer[] vehicleTiers,
            String[] vehicleTypes
    ) {
        return null;
    }

}
