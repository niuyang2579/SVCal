package com.niuyang.svcal;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_cal;
    private TextView txv_res;
    private int passCount=0;
    private int result=0;
    private List<String> list = new ArrayList<String>();
    private Spinner sp_svtype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("行李传送带车");
        list.add("行李牵引车");
        list.add("客梯车");
        list.add("飞机牵引车");
        list.add("电源车");
        list.add("气源车");
        list.add("清水车");
        list.add("污水车");
        list.add("升降平台车");
        list.add("空调车");
        list.add("除冰车");
        list.add("残疾人登高车");
        list.add("机场专用摆渡车");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        btn_cal=(Button)findViewById(R.id.cal);
        txv_res=(TextView)findViewById(R.id.result);
        sp_svtype=(Spinner)findViewById(R.id.svtype);
        sp_svtype.setAdapter(adapter);

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item=sp_svtype.getSelectedItem().toString();
                switch(item){
                    case "行李传送带车":{txv_res.setText("结果："+item);break;}
                    case "行李牵引车":{txv_res.setText("结果："+item);break;}
                    case "客梯车":{txv_res.setText("结果："+item);break;}
                    case "飞机牵引车":{txv_res.setText("结果："+item);break;}
                    case "电源车":{txv_res.setText("结果："+item);break;}
                    case "气源车":{txv_res.setText("结果："+item);break;}
                    case "清水车":{txv_res.setText("结果："+item);break;}
                    case "污水车":{txv_res.setText("结果："+item);break;}
                    case "升降平台车":{txv_res.setText("结果："+item);break;}
                    case "空调车":{txv_res.setText("结果："+item);break;}
                    case "除冰车":{txv_res.setText("结果："+item);break;}
                    case "残疾人登高车":{txv_res.setText("结果："+item);break;}
                    case "机场专用摆渡车":{txv_res.setText("结果："+item);break;}
                }
            }
        });
    }
    private int Calculator(int n){
        return (6*n);
    }
}
