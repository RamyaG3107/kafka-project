package kafka.example.kafkaproject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  @KafkaListener(topics="test-topic", groupId = "mygroup")
    public void consumeFromTopic(String message){
      System.out.println("Consumed message" +message);
    }
  }

