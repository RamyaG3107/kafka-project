package kafka.example.kafkaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
  public static final String topic = "test-topic";

  @Autowired
  KafkaTemplate<String, String> kafkaTemplate;

  public void publishToTopic(String message){
    System.out.println("Publish to topic"+topic);
    this.kafkaTemplate.send(topic,message);
  }

}
