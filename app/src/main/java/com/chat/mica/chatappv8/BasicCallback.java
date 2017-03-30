package com.chat.mica.chatappv8;

/**
 * Created by Mica on 3/29/2017.
 */

import com.pubnub.api.*;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;

public class BasicCallback extends SubscribeCallback {
    @Override
    public void status(PubNub pubnub, PNStatus status) {

    }

    @Override
    public void message(PubNub pubnub, PNMessageResult message) {

    }

    @Override
    public void presence(PubNub pubnub, PNPresenceEventResult presence) {

    }
}
