package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.util.model.PlayerDetails;
import com.wotos.wotosedgeservice.util.model.WotPlayer;
import com.wotos.wotosedgeservice.validation.constraints.Language;
import com.wotos.wotosedgeservice.validation.constraints.PlayerSearch;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Map;

@FeignClient(name = "wotos-player-service")
@RequestMapping("/api/players")
public interface WotosPlayerFeignClient {

    @GetMapping("/haveUpdated")
    ResponseEntity<Map<Integer, Boolean>> havePlayersBeenUpdated(
            @RequestParam("accountIds") Integer[] accountIds
    );

    @GetMapping
    Map<Integer, PlayerDetails> getPlayersMapByAccountIds(
            @RequestParam(value = "accountIds") Integer[] accountIds
    );

    @PostMapping
    Map<Integer, PlayerDetails> createPlayersByAccountIds(
            @RequestParam(value = "accountIds") Integer[] accountIds
    );

    @PutMapping
    Map<Integer, PlayerDetails> updatePlayersByAccountIds(
            @RequestParam(value = "accountIds") Integer[] accountIds
    );

    @GetMapping("/list")
    @PlayerSearch
    ResponseEntity<List<WotPlayer>> getPlayersByNickname(
            @RequestParam(value = "nicknames") String[] nicknames,
            @RequestParam(value = "language", required = false, defaultValue = "en") @Language String language,
            @RequestParam(value = "limit", required = false) @Max(100) Integer limit,
            @RequestParam(value = "searchType") String searchType
    );

//    @GetMapping("/achievements")
//    List<PlayerAchievementsSnapshot> getPlayerAchievementsByAccountId(
//            @PathParam("accountId") Integer accountId
//    );

}
