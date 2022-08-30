package com.wotos.wotosedgeservice.util.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "wotos-player-service", path = "/player")
public class PlayerClient {
}
