package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.util.model.statistics.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.statistics.VehicleStatisticsSnapshot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "wotos-statistics-service")
@RequestMapping("/api/stats")
public interface WotosStatisticsFeignClient {

    @GetMapping("/stats/vehicles")
    ResponseEntity<Map<Integer, Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>>>> getPlayerVehicleStatisticsSnapshots(
            @RequestParam(value = "accountIds") Integer[] accountIds,
            @RequestParam(value = "vehicleIds") Integer[] vehicleIds,
            @RequestParam(value = "gameModes") String[] gameModes
    );

    @PostMapping("/stats/vehicles")
    ResponseEntity<HttpStatus> createPlayerVehicleStatisticsSnapshots(
            @RequestParam(value = "accountIds") Integer[] accountIds,
            @RequestParam(value = "vehicleIds", required = false) Integer[] vehicleIds
    );

    @GetMapping("/stats/players")
    ResponseEntity<Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>>> getPlayerStatisticsSnapshots(
            @RequestParam(value = "accountIds") Integer[] accountIds,
            @RequestParam(value = "gameModes") String[] gameModes
    );

    @PostMapping("/stats/players")
    ResponseEntity<HttpStatus> createPlayerStatisticsSnapshots(
            @RequestParam(value = "accountIds") Integer[] accountIds
    );

    @GetMapping("/stats/recentWn8")
    ResponseEntity<Map<Integer, Map<String, Float>>> getPlayerRecentWn8(
            @RequestParam(value = "accountIds") Integer[] accountIds,
            @RequestParam(value = "gameModes") String[] gameModes,
            @RequestParam(value = "timestamp") Long timestamp
    );

}
