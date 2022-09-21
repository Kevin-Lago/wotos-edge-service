package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "wotos-statistics-service", path = "/api/stats")
public interface WotosStatisticsFeignClient {

    @GetMapping("/vehicles")
    ResponseEntity<Map<Integer, Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>>>> getPlayerVehicleStatistics(
            @RequestParam(value = "accountIds") Integer[] accountIds,
            @RequestParam(value = "tankIds", required = false) Integer[] vehicleIds
    );

    @GetMapping("/players")
    ResponseEntity<Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>>> getPlayerStatistics(
            @RequestParam(value = "accountIds") Integer[] accountIds
    );

}
