package com.example.prasanth.serializable_learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SerializableActivity extends Activity{
    private EditText firstName,lastName,nickName;
    private Button sendData;
public void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_serializable__example);
    firstName=(EditText)findViewById(R.id.name);
    lastName=(EditText)findViewById(R.id.name2);
    nickName=(EditText)findViewById(R.id.name3);
    sendData=(Button)findViewById(R.id.click_here);
    sendData.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String empFrstName=firstName.getText().toString();
            String empLstName=lastName.getText().toString();
            String empNickName=nickName.getText().toString();
            ModelEmployee model_employee=new ModelEmployee();
            model_employee.setName(empFrstName);
            model_employee.setName2(empLstName);
            model_employee.setName3(empNickName);
            Toast.makeText(SerializableActivity.this,"SENDING TOTAL OBJECT DATA AT A TIME",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(SerializableActivity.this,SampleActivity.class);
            Bundle b=new Bundle();
            b.putSerializable("empDetails",model_employee);
            intent.putExtras(b);
            startActivity(intent);
        }
    });

}

}
