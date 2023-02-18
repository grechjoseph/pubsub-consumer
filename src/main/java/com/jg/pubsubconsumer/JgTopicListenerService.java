package com.jg.pubsubconsumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@EnableBinding(JgTopicSource.class)
public class JgTopicListenerService {

    @StreamListener(JgTopicSource.INPUT)
    public void handleEvent(final String event) {
        log.info("Received ::: {}", event);
    }

}
