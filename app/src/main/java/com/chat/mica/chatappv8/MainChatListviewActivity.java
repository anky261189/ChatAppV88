package com.chat.mica.chatappv8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.presence.PNHereNowResult;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;

import java.util.Arrays;

public class MainChatListviewActivity extends AppCompatActivity {


    private String channel  = "MainChat";


    PubNub mPubNub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat_listview);
        initPubNub();
    }

    private void initPubNub() {

        PNConfiguration  confg=new PNConfiguration();
        confg.setUuid("abc");
        confg.setPublishKey("pub-c-14c7960e-8349-44cd-9dc1-4081c6d396fd");
        confg.setSubscribeKey("sub-c-c780e394-1460-11e7-bb8a-0619f8945a4f");
        mPubNub = new PubNub(confg);


        subscribeWithPresence();
    }

    public void subscribeWithPresence(){

       /* mPubNub .subscribe()
                .channels(Arrays.asList("MainChat")) // subscribe to channels
                .execute();*/

        mPubNub.addListener(new SubscribeCallback() {
            @Override
            public void status(PubNub pubnub, PNStatus status) {

            }

            @Override
            public void message(PubNub pubnub, PNMessageResult message) {

            }

            @Override
            public void presence(PubNub pubnub, PNPresenceEventResult presence) {
                System.out.println(presence);
                Toast.makeText(MainChatListviewActivity.this, ""+presence, Toast.LENGTH_SHORT).show();
            }
        });

        mPubNub .subscribe().channels(Arrays.asList("MainChat")).withPresence().execute();


    }

}
