package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 float num1, num2 , result=0 ;
 boolean plu, mul , div , min =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1= findViewById(R.id.One);
        Button but2= findViewById(R.id.Two);
        Button but3= findViewById(R.id.Three);
        Button but4= findViewById(R.id.four);
        Button but5= findViewById(R.id.five);
        Button but6= findViewById(R.id.six_6);
        Button but7= findViewById(R.id.seven_7);
        Button but8= findViewById(R.id.eight_8);
        Button but9= findViewById(R.id.nine_9);
        Button zero= findViewById(R.id.Zero);
        Button delete= findViewById(R.id.DEL);
        Button plus= findViewById(R.id.Plus);
        Button minus= findViewById(R.id.Minus);
        Button divide= findViewById(R.id.Divide);
        Button multi= findViewById(R.id.Multiply);
        Button equal= findViewById(R.id.Equal);
        TextView textView= findViewById(R.id.Text1) ;


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "1");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                textView.setText(textView.getText() + "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                num1 = Float.parseFloat(textView.getText().toString());
                plu =true;
                textView.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                num1 = Float.parseFloat(textView.getText().toString());
                min =true;
                textView.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                num1 = Float.parseFloat(textView.getText().toString());
                mul =true;
                textView.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                num1 = Float.parseFloat(textView.getText().toString());
                div =true;
                textView.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if( plu || min || div || mul == true)
                {
                    num2 = Float.parseFloat(textView.getText().toString());
                }
                if(plu == true)
                {
                    result =num1+num2;
                    plu=false;
                    textView.setText(String.valueOf(result));
                }
                else if(min == true)
                {
                    result =num1-num2;
                    min=false;
                    textView.setText(String.valueOf(result));
                }
                else if(mul == true)
                {
                    result =num1 * num2;
                    mul=false;
                    textView.setText(String.valueOf(result));
                }
               else if(div  == true)
                {
                    if(num2!=0)
                    {
                    result =num1/num2;
                    div=false;
                    textView.setText(String.valueOf(result));
                    }
                    else
                    {
                        textView.setText("You can't divide over 0");
                    }
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                num1 = num2 =Float.parseFloat("0"); ;
                textView.setText(null);
            }
        });

    }
}