package com.flamexander.cloud.secured.feign;

import com.flamexander.cloud.common.CloudPacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredFeignController {
    private StatisticFeignClient statisticFeignClient;

    @Autowired
    public void setStatisticFeignClient(StatisticFeignClient statisticFeignClient) {
        this.statisticFeignClient = statisticFeignClient;
    }

    @GetMapping("check")
    public CloudPacket checkTest() {
        return statisticFeignClient.findOnePacketPlease();
    }
}
