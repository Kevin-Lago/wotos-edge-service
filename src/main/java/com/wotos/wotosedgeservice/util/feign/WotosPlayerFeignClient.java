package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.util.model.WotPlayer;
import com.wotos.wotosedgeservice.validation.constraints.Language;
import com.wotos.wotosedgeservice.validation.constraints.PlayerSearch;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import java.util.List;

@FeignClient(name = "wotos-player-service", path = "/api/players")
public interface WotosPlayerFeignClient {

    @GetMapping
    ResponseEntity<WotPlayer> getPlayerByNickname(
            @RequestParam("nickname") String nickname
    );

    @GetMapping("/list")
    @PlayerSearch
    public List<WotPlayer> getPlayersByNickname(
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
