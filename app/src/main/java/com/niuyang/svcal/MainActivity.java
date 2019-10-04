package com.niuyang.svcal;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btn_cal;
    private EditText et_passcount;
    private int passCount=0;
    private int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cal=(Button)findViewById(R.id.cal);
        et_passcount=(EditText)findViewById(R.id.pass_count);

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_passcount.getText().toString().equals("")) {
                    new AlertDialog.Builder(MainActivity.this).setTitle("警告").setMessage("不能为空，请重新输入！").setPositiveButton("确定",null).show();
                    return;
                }
                passCount=Integer.parseInt(et_passcount.getText().toString());
                result=Calculator(passCount);

                Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
                intent.putExtra("result",result+"");
                startActivityForResult(intent,1);
            }
        });
    }
    private int Calculator(int n){
        return (6*n);
    }
}
