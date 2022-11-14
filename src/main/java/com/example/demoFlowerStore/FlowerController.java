package com.example.demoFlowerStore;


import flower.store.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static flower.store.FlowerColor.*;

@RequestMapping
@RestController
public class FlowerController {

    @GetMapping("/store")
    public List<Flower> returnObjects(){
        List<Flower> objects = Arrays.asList(
                new Flower(10.0, RED, 40.0, FlowerType.TULIP),
                new Flower(10.0, WHITE, 20.0, FlowerType.CHAMOMILE),
                new Flower(5.0, YELLOW, 50.0, FlowerType.ROSE)
        );
        return objects;
    }
}
