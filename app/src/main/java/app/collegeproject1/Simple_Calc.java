package app.collegeproject1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Simple_Calc extends AppCompatActivity {
    Button Zero, Equal, Float, Nine, Eight, Seven, Six, Five, Four, Three, Two, One, Res, Add, Sub, Mul, Div, Pow, reminder;
    Boolean Addition=false, Substraction=false, Multipication=false, Division=false, Reminder=false, Power=false;
    TextView editText, Result;
    double val=0, val2, result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple__calc);
        editText = findViewById(R.id.Calc_Edittext);
        Result = findViewById(R.id.Calc_Result);
        Nine = findViewById(R.id.Calc_Nine);
        Eight = findViewById(R.id.Calc_Eight);
        Seven = findViewById(R.id.Calc_Seven);
        Six = findViewById(R.id.Calc_Six);
        Five = findViewById(R.id.Calc_Five);
        Four = findViewById(R.id.Calc_Four);
        Three = findViewById(R.id.Calc_Three);
        Two = findViewById(R.id.Calc_Two);
        One = findViewById(R.id.Calc_One);
        Zero = findViewById(R.id.Calc_Zero);
        Equal = findViewById(R.id.Calc_Equal);
        Float = findViewById(R.id.Calc_Float);
        Add = findViewById(R.id.Calc_Addition);
        Sub = findViewById(R.id.Calc_Substraction);
        Mul = findViewById(R.id.Calc_Multiply);
        Div = findViewById(R.id.Calc_Division);
        Res = findViewById(R.id.Calc_Clear);
        Pow = findViewById(R.id.Calc_Pow);
        reminder = findViewById(R.id.Calc_Reminder);
//        slidrInterface= Slidr.attach(this);
//        int[] androidColors = getResources().getIntArray(R.array.rainbow)

//        layout.setBackgroundColor(androidColors[new Random().nextInt(androidColors.length)]);
//        layout.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//                startActivity(new Intent(getApplicationContext(), C4_Spinner.class));
//                return true;
//            }
//        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        Float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);

                }
                catch (Exception e)
                {

                }
                Addition = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("+");

            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                Substraction = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("-");

            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                Multipication = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("*");

            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                Division = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("/");

            }
        });
        Pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                Power = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("P");

            }
        });
        Res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=0;
                val=0;
                val2=0;
                editText.setText("");
                Result.setText("");
            }
        });

        reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                Reminder = true;
                String str=editText.getText().toString().trim();
                if(result==0)
                {
                    val = Double.parseDouble(str);
                }
                else
                    val=result;

                if(result==0) {
                    Result.setText(str);
                }
                else
                    Result.setText(String.valueOf(result));
                editText.setText("%");

            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(val!=0)
                    {
                        Calculation();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter any value",Toast.LENGTH_SHORT);
                }
                catch (Exception e)
                {

                }
                String Str=editText.getText().toString();
                Result.setText(Result.getText()+"/t"+Str);
                Result.setText("------");
                Result.setText(String.valueOf(result));
                editText.setText("");
            }
        });


    }
    void Calculation()
    {
        String str=editText.getText().toString();
        String str2= str.substring(1);
        val2=Double.parseDouble(str2);
        if(Addition==true)
        {
            result=this.val+val2;
            Addition=false;
        }

        else if(Substraction==true)
        {
            result=0;
            result=val-val2;
            Substraction=false;
        }

        else if(Multipication==true)
        {
            result=val*val2;
            Multipication=false;
        }


        else if(Division==true)
        {
            result=val/val2;
            Division=false;
        }
        else if(Power==true)
        {
            result=Math.pow(val,val2);
            Power=false;
        }
        else if(Reminder==true)
        {
            result=val%val2;
            Reminder=false;
        }
        else
        {
            Toast.makeText(this,"Hey chutiye",Toast.LENGTH_SHORT).show();
        }
    }



    public void Fun_show_Scin(View view) {
        startActivity(new Intent(this, Simple_Calc.class));
    }
}
