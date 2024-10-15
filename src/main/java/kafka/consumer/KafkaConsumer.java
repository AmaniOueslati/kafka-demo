package kafka.consumer;

import kafka.payload.Student;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service // to mark it as spring component
@Slf4j
@ToString
public class KafkaConsumer {

// a consumer is listeneing on the topic 
//@KafkaListener(topics = "AmaniTopic" , groupId="myGroup")
//public void consumeMsg(String msg){
 //   log.info(String.format("Consuming the message from AmaniTopic :: %s" , msg));

//}

    @KafkaListener(topics = "AmaniTopic" , groupId="myGroup")
    public void consumeJsonMsg(Student student){
        log.info(String.format("Consuming the message from AmaniTopic :: %s" , student.toString()));

    }
}
