package com.example.numsai99.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener {

    EditText firstEditText;
    EditText SecoundEditText;
    TextView Resuslt;
    Double firstVal;
    Double secVal;

    MainController mainController = new MainController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        SecoundEditText = (EditText) findViewById(R.id.operand_two_edit_text);
        Resuslt = (TextView) findViewById(R.id.operation_result_text_view);

        mainController.setListener(this);
    }

    public void onAdd(View view) {
        if(isEmpty(firstEditText.getText().toString()) && isEmpty(SecoundEditText.getText().toString())){
            firstVal = Double.parseDouble(firstEditText.getText().toString());
            secVal = Double.parseDouble(SecoundEditText.getText().toString());
            mainController.add(firstVal,secVal);
        }

    }

    public void onSub(View view) {
        if(isEmpty(firstEditText.getText().toString()) && isEmpty(SecoundEditText.getText().toString())){
            firstVal = Double.parseDouble(firstEditText.getText().toString());
            secVal = Double.parseDouble(SecoundEditText.getText().toString());
            mainController.sub(firstVal,secVal);
        }

    }

    public void onDiv(View view) {
        if(isEmpty(firstEditText.getText().toString()) && isEmpty(SecoundEditText.getText().toString())){
            firstVal = Double.parseDouble(firstEditText.getText().toString());
            secVal = Double.parseDouble(SecoundEditText.getText().toString());
            mainController.div(firstVal,secVal);
        }

    }

    public void onMul(View view) {
        if(isEmpty(firstEditText.getText().toString()) && isEmpty(SecoundEditText.getText().toString())){
            firstVal = Double.parseDouble(firstEditText.getText().toString());
            secVal = Double.parseDouble(SecoundEditText.getText().toString());
            mainController.mul(firstVal,secVal);
        }

    }

    public boolean isEmpty(String input){
        if (input != null && !input.isEmpty() && !input.equals("null")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void onSucess(String result) {
        Resuslt.setText(String.valueOf(result));
    }
}
