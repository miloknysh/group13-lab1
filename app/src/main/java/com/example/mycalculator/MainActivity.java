package com.example.mycalculator;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btn_minus, btn_mult, btn_div, btn_dot, btn_clear, btn_plus, btn_equal;
    TextView text_display;

    // This is to evaluate the math expression (this comment is from the starter code, idk)


    //done
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_mult = (Button) findViewById(R.id.btn_mult);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        text_display = (TextView) findViewById(R.id.textview_input_display);

        setClickListeners();
    }

    //done
    private void setClickListeners() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }


    //every case in onClick() is done except btn_equal
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                addNumber("1");
                break;
            case R.id.btn2:
                addNumber("2");
                break;

            case R.id.btn3:
                addNumber("3");
                break;

            case R.id.btn4:
                addNumber("4");
                break;

            case R.id.btn5:
                addNumber("5");
                break;

            case R.id.btn6:
                addNumber("6");
                break;

            case R.id.btn7:
                addNumber("7");
                break;

            case R.id.btn8:
                addNumber("8");
                break;

            case R.id.btn9:
                addNumber("9");
                break;

            case R.id.btn0:
                addNumber("0");
                break;

            case R.id.btn_minus:
                addNumber("-");
                break;

            case R.id.btn_plus:
                addNumber("+");
                break;

            case R.id.btn_mult:
                addNumber("×");
                break;

            case R.id.btn_div:
                addNumber("÷");
                break;

            case R.id.btn_dot:
                addNumber(".");
                break;

            case R.id.btn_equal: // case btn_equal is starter code from brightspace, needs to be coded properly.
                String result = null;
                try {
                    result = evaluate(text_display.getText().toString());
                    text_display.setText(result);
                } catch (Exception e) {
                    text_display.setText("Error");
                }
                break;

            case R.id.btn_clear:
                clear_display();
                break;


        }
    }

    //method evaluate() is starter code from brightspace, needs to be coded properly.
    private String evaluate(String expression) throws Exception {
        String result = evaluate(expression);
        BigDecimal decimal = new BigDecimal(result);
        return decimal.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();
    }


    //done
    private void addNumber(String number) {
        text_display.setText(text_display.getText() + number);
    }

    //done
    private void clear_display() {
        text_display.setText("");
    }
}
