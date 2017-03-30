package com.chat.mica.chatappv8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       Intent i  = new Intent(LoginActivity.this,MainChatListviewActivity.class);
       startActivity(i);



    }
}
