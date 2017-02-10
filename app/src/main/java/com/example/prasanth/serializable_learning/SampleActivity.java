package com.example.prasanth.serializable_learning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SampleActivity extends Activity {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_layout);
        TextView textView3=(TextView)findViewById(R.id.textview1);
        TextView textView1=(TextView)findViewById(R.id.textView2);
        TextView textView2=(TextView)findViewById(R.id.textView3);
        Bundle bundle=getIntent().getExtras();
        ModelEmployee model_employee1=(ModelEmployee)bundle.getSerializable("empDetails");
        textView3.setText("FIRST NAME IS "+model_employee1.getName());
        textView1.setText("LAST NAME IS "+model_employee1.getName2());
        textView2.setText("SWEET NAME IS "+model_employee1.getName3());
    }
}
