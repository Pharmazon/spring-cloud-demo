package com.flamexander.cloud.dto.consumer;

import com.flamexander.cloud.dto.common.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String showIndex(Model model) {
        ResponseEntity restExchange = restTemplate.exchange("http://localhost:7766/", HttpMethod.GET, null, List.class);
        List<CatDTO> dtos = (List<CatDTO>)restExchange.getBody();
        model.addAttribute("cats", dtos);
        return "index";
    }
}
