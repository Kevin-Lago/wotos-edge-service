package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.service.WotosService;
import com.wotos.wotosedgeservice.util.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.List;

@FeignClient(name = "wotos-player-service", path = "/api/player")
public interface WotosPlayerFeignClient {

    @GetMapping
    ResponseEntity<Player> getPlayerByNickname(
            @RequestParam("nickname") String nickname
    );

    @GetMapping("/players")
    ResponseEntity<List<Player>> getPlayersByNickname(
            @RequestParam("nickname") String nickname
    );

//    @GetMapping("/achievements")
//    List<PlayerAchievementsSnapshot> getPlayerAchievementsByAccountId(
//            @PathParam("accountId") Integer accountId
//    );

}
