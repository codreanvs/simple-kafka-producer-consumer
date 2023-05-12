package com.codreanvs.kafka;

import com.codreanvs.kafka.consumer.SimpleMessageConsumer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaConsumerServiceTest {

    @Autowired
    private SimpleMessageConsumer simpleMessageConsumer;

    @Test
    public void shouldLoadContext() {
        Assertions.assertThat(simpleMessageConsumer).isNotNull();
    }

}
