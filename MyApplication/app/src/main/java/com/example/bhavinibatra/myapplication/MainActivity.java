package com.example.bhavinibatra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void pressButt(View view)
    {

        EditText editText = (EditText)findViewById(R.id.editText);
                Double dollarDouble= Double.parseDouble(editText.getText().toString());
        Double pound=dollarDouble*0.75;
        Toast.makeText(MainActivity.this," "+String.format("%.2f",pound),Toast.LENGTH_SHORT).show();




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
