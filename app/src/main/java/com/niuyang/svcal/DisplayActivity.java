package com.niuyang.svcal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayActivity extends AppCompatActivity {

    private String result;
    private TextView tv_result;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tv_result=(TextView)findViewById(R.id.result);
        btn_back=(Button) findViewById(R.id.back);

        Intent intent=getIntent();
        result=intent.getStringExtra("result");
        tv_result.setText(result);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
