package com.wotos.wotosedgeservice.util.feign;

import com.wotos.wotosedgeservice.util.model.WotVehicle;
import com.wotos.wotosedgeservice.validation.constraints.Language;
import com.wotos.wotosedgeservice.validation.constraints.VehicleType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "wotos-player-service")
@RequestMapping("/api/vehicles")
public interface WotosVehicleFeignClient {

    @GetMapping
    Map<Integer, WotVehicle> getVehicles(
            @RequestParam(value = "fields", required = false) String[] fields,
            @RequestParam(value = "language", required = false, defaultValue = "en") @Language String language,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "nations", required = false) String[] nations,
            @RequestParam(value = "page", required = false) Integer pageNumber,
            @RequestParam(value = "vehicleIds", required = false) Integer[] vehicleIds,
            @RequestParam(value = "vehicleTiers", required = false) Integer[] vehicleTiers,
            @RequestParam(value = "types", required = false) @VehicleType String[] vehicleTypes
    );

}
