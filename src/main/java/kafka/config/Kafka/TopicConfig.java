package kafka.config.Kafka;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

@Bean //we want to create new topic in our apache message kafka broker
    public NewTopic AmaniTopic(){
    return TopicBuilder
            .name("AmaniTopic")
            //we can specify how much partition in the topic and replicat etc but in this case  we leave the config to kafka
           //.partitions(5)
           // .replicas()
            .build();
}
}
