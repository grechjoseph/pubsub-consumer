package com.jg.pubsubconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface JgTopicSource {

    String INPUT = "pub-sub-jg-topic-channel-input";

    @Input(INPUT)
    SubscribableChannel input();

}
