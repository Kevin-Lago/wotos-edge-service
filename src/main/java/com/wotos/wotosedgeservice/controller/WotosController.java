package com.wotos.wotosedgeservice.controller;

import com.wotos.wotosedgeservice.service.WotosService;
import com.wotos.wotosedgeservice.util.model.Player;
import com.wotos.wotosedgeservice.util.model.PlayerStatisticsSnapshot;
import com.wotos.wotosedgeservice.util.model.VehicleStatisticsSnapshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WotosController {

    @Autowired
    WotosService wotosService;

    @GetMapping("/player")
    public ResponseEntity<Player> getPlayer(
            @RequestParam("nickname") String nickname
    ) {
        return wotosService.getPlayerByNickname(nickname);
    }

    @GetMapping("/player/list")
    public ResponseEntity<List<Player>> getPlayersByNickname(
            @RequestParam("nickname") String nickname
    ) {
        return wotosService.getPlayersByNickname(nickname);
    }

    @GetMapping("/stats/players")
    public ResponseEntity<Map<Integer, Map<String, List<PlayerStatisticsSnapshot>>>> getPlayerStatisticsSnapshotsByAccountIds(
            @RequestParam("accountIds") List<Integer> accountIds
    ) {
        return wotosService.getPlayerStatisticsSnapshotsByAccountIds(accountIds);
    }

    @GetMapping("/stats/vehicles")
    public ResponseEntity<Map<Integer, Map<Integer, Map<String, List<VehicleStatisticsSnapshot>>>>> getPlayerVehicleStatisticsSnapshotsByAccountIdsAndVehicleIds(
            @RequestParam("accountIds") List<Integer> accountIds,
            @RequestParam("vehiclesIds") List<Integer> vehicleIds
    ) {
        return wotosService.getPlayerVehicleStatisticsSnapshotsByAccountIdAndVehicleIds(accountIds, vehicleIds);
    }

}
