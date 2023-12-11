package kafka.example.kafkaproject.controller;

import kafka.example.kafkaproject.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/Kafka")
public class KafkaController {

  @Autowired
  Producer producer;

  @PostMapping
  public void sendMessage(@RequestParam("msg") String msg){
    producer.publishToTopic(msg);
  }

}
