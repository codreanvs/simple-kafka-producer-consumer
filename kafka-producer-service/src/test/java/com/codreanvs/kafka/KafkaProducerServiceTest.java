package com.codreanvs.kafka;

import com.codreanvs.kafka.web.rest.controllers.SimpleMessageController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaProducerServiceTest {

	@Autowired
	private SimpleMessageController simpleMessageController;

	@Test
	public void shouldLoadContext() {
		Assertions.assertThat(simpleMessageController).isNotNull();
	}

}
