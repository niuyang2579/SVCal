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

    private EditText et_south;
    private EditText et_north;
    private EditText et_sch_time;
    private EditText et_advance_time;
    private EditText et_adjust_time;
    private EditText et_maintain_number;
    private EditText et_maintain_co;

    private EditText et_a_rate;
    private EditText et_b_rate;
    private EditText et_c_rate;
    private EditText et_d_rate;
    private EditText et_e_rate;
    private EditText et_f_rate;

    private EditText et_a_qty;
    private EditText et_b_qty;
    private EditText et_c_qty;
    private EditText et_d_qty;
    private EditText et_e_qty;
    private EditText et_f_qty;

    private EditText et_a_ptime;
    private EditText et_b_ptime;
    private EditText et_c_ptime;
    private EditText et_d_ptime;
    private EditText et_e_ptime;
    private EditText et_f_ptime;

    private List<String> list = new ArrayList<String>();
    private float result[][] = new float[13][2];

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
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        sp_svtype=(Spinner)findViewById(R.id.svtype);
//        sp_svtype.setAdapter(adapter);
//
//        btn_cal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String item=sp_svtype.getSelectedItem().toString();
//                switch(item){
//                    case "行李传送带车":{txv_res.setText("结果："+item);break;}
//                    case "行李牵引车":{txv_res.setText("结果："+item);break;}
//                    case "客梯车":{txv_res.setText("结果："+item);break;}
//                    case "飞机牵引车":{txv_res.setText("结果："+item);break;}
//                    case "电源车":{txv_res.setText("结果："+item);break;}
//                    case "气源车":{txv_res.setText("结果："+item);break;}
//                    case "清水车":{txv_res.setText("结果："+item);break;}
//                    case "污水车":{txv_res.setText("结果："+item);break;}
//                    case "升降平台车":{txv_res.setText("结果："+item);break;}
//                    case "空调车":{txv_res.setText("结果："+item);break;}
//                    case "除冰车":{txv_res.setText("结果："+item);break;}
//                    case "残疾人登高车":{txv_res.setText("结果："+item);break;}
//                    case "机场专用摆渡车":{txv_res.setText("结果："+item);break;}
//                }
//            }
//        });
        et_south = (EditText)findViewById(R.id.south);
        et_north = (EditText)findViewById(R.id.north);
        et_sch_time = (EditText)findViewById(R.id.sch_time);
        et_advance_time = (EditText)findViewById(R.id.advance_time);
        et_adjust_time = (EditText)findViewById(R.id.adjust_time);
        et_maintain_number = (EditText)findViewById(R.id.maintain_number);
        et_maintain_co = (EditText)findViewById(R.id.maintain_co);

        et_a_rate = (EditText)findViewById(R.id.a_rate);
        et_b_rate = (EditText)findViewById(R.id.b_rate);
        et_c_rate = (EditText)findViewById(R.id.c_rate);
        et_d_rate = (EditText)findViewById(R.id.d_rate);
        et_e_rate = (EditText)findViewById(R.id.e_rate);
        et_f_rate = (EditText)findViewById(R.id.f_rate);

        et_a_qty = (EditText)findViewById(R.id.a_qty);
        et_b_qty = (EditText)findViewById(R.id.b_qty);
        et_c_qty = (EditText)findViewById(R.id.c_qty);
        et_d_qty = (EditText)findViewById(R.id.d_qty);
        et_e_qty = (EditText)findViewById(R.id.e_qty);
        et_f_qty = (EditText)findViewById(R.id.f_qty);

        et_a_ptime = (EditText)findViewById(R.id.a_ptime);
        et_b_ptime = (EditText)findViewById(R.id.b_ptime);
        et_c_ptime = (EditText)findViewById(R.id.c_ptime);
        et_d_ptime = (EditText)findViewById(R.id.d_ptime);
        et_e_ptime = (EditText)findViewById(R.id.e_ptime);
        et_f_ptime = (EditText)findViewById(R.id.f_ptime);

        btn_cal=(Button)findViewById(R.id.cal);
        btn_cal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float south=strcvtf(et_south),north=strcvtf(et_north);
                float sch_time=strcvtf(et_sch_time);
                float advance_time=strcvtf(et_advance_time);
                float adjust_time=strcvtf(et_adjust_time);
                float maintain_number=strcvtf(et_maintain_number);
                float maintain_co=strcvtf(et_maintain_co);
                float rate[] = new float[6];
                float qty[] = new float[6];
                float ptime[] = new float[6];
                rate[0] = strcvtf(et_a_rate);
                qty[0] = strcvtf(et_a_qty);
                ptime[0] = strcvtf(et_a_ptime);

                rate[1] = strcvtf(et_b_rate);
                qty[1] = strcvtf(et_b_qty);
                ptime[1] = strcvtf(et_b_ptime);

                rate[2] = strcvtf(et_c_rate);
                qty[2] = strcvtf(et_c_qty);
                ptime[2] = strcvtf(et_c_ptime);

                rate[3] = strcvtf(et_d_rate);
                qty[3] = strcvtf(et_d_qty);
                ptime[3] = strcvtf(et_d_ptime);

                rate[4] = strcvtf(et_e_rate);
                qty[4] = strcvtf(et_e_qty);
                ptime[4] = strcvtf(et_e_ptime);

                rate[5] = strcvtf(et_f_rate);
                qty[5] = strcvtf(et_f_qty);
                ptime[5] = strcvtf(et_f_ptime);

                for(int i=0;i<13;++i){
                    for(int j=0;j<2;++j){
                        result[i][j]=Cal(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,i,j);
                    }
                }
            }
        });
    }
    private float Cal(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int svtype, int sorn){
        switch (svtype){
            case 0: { return Cal_lugcov(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 1: { return Cal_lugtra(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 2: { return Cal_psgsta(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 3: { return Cal_airtra(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 4: { return Cal_powser(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 5: { return Cal_airser(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 6: { return Cal_cwater(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 7: { return Cal_dwater(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 8: { return Cal_lifpla(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 9: { return Cal_aircon(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 10: { return Cal_deicev(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 11: { return Cal_disabv(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
            case 12: { return Cal_transv(south,north,sch_time,advance_time,adjust_time,maintain_number,maintain_co,rate,qty,ptime,sorn); }
        }
        return 0;
    }
    private float Cal_lugcov(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn){
        float sum = 0, result;
        for(int i=0;i<6;++i){
            sum+=rate[i]*qty[i]*(sch_time+advance_time+ptime[i]);
        }
        if(sorn==0)
            result=south*sum/60*maintain_co;
        else
            result=north*sum/60*maintain_co;
        return result;
    }
    private float Cal_lugtra(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn) {
        return 6;
    }
    private float Cal_psgsta(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_airtra(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_powser(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_airser(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_cwater(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_dwater(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_lifpla(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_aircon(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_deicev(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_disabv(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float Cal_transv(float south, float north, float sch_time, float advance_time, float adjust_time, float maintain_number, float maintain_co, float[] rate, float[] qty, float[] ptime, int sorn)  {
        return 6;
    }
    private float strcvtf(EditText et){
        return Float.parseFloat(et.getText().toString());
    }
}
