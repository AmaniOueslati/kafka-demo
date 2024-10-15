package kafka.rest;


import kafka.payload.Student;
import kafka.producer.KafkaProducer;
import kafka.producer.kafkaJsonProducer;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

private final KafkaProducer kafkaProducer;
private final kafkaJsonProducer kafkaJsonProducer;


    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
kafkaProducer.sendMessage(message);
return ResponseEntity.ok("Message queud successfully ");
}

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student message){
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message queud successfully As JSON ");
    }
}
