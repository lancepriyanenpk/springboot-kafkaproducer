package com.example.springboot_kafkaproducer.controller;

import com.example.springboot_kafkaproducer.producer.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public void sendMessage(@RequestParam String topic, @RequestParam String message) {
        producerService.sendMessage(topic, message);
    }
}
