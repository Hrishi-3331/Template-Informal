package com.hrishi3331studio.template_informal.UserAuth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hrishi3331studio.template_informal.R;

public class Authentication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
    }

    public void SignUp(View view){
        Intent intent = new Intent(Authentication.this, SignUp.class);
        startActivity(intent);
    }
}
