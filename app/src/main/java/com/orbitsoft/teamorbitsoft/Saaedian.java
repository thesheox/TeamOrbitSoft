package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Saaedian extends AppCompatActivity {
    int aa=1;
    String bb="";
    TextView test;
    int a=1;
    int b=2;
    int c=4;
    int d=9;
    int jam;
    int miangin;
    int largest=0;
    int secondlargest=0;
    int sum;
    int min;
    int[]array={2,4,6,80,1,26,90};

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaedian);
        test = findViewById(R.id.textView);
        //adadfard ta 30
        while (a<=30)
        {

            bb= bb+Integer.toString(a)+"\n";


            test.setText(b);
            a=a+2;
        }
        ///////////////////////////////////////////
        //esm va famil va email
        test.setText("shayan"+"saeidian"+"\n"+"thesheox@gmail.com");
        //////////////////////////////////////////////
        //miangin adad
        jam=a+b+c+d;
        miangin=jam/4;

        test = findViewById(R.id.textView);
        test.setText("miangin="+Integer.toString(miangin));
    ////////////////////////////////
        //jame dota bozorgtarin
        for(int i=0;i<array.length; i++)
        {
            if(array[i]>largest)
            {
                secondlargest=largest;
                largest=array[i];
            }
            else if (array[i]>secondlargest)
            {
                secondlargest=array[i];
            }

        }
        test.setText(Integer.toString(largest+secondlargest));
        ///////////////////////////////////////////////////////
        //jadvalzarb:to layout hamasho neveshtam

    }
}
