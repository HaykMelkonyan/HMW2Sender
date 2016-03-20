package com.example.user.hmw2multipledatasender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button shareButton=(Button)findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> sendingTexts = new ArrayList<>();
                sendingTexts.add("Text1 from Sender");
                sendingTexts.add("Text2 from Sender");
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND_MULTIPLE);
                intent.putStringArrayListExtra(Intent.EXTRA_STREAM, sendingTexts);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Share text "));
            }
        });



    }
}
