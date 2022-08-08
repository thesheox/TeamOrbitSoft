package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mazaheri extends AppCompatActivity {
TextView jad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazaheri);
        //salam


        jad=findViewById(R.id.textView4);
        String tv = "";
        String st="";
        int zar=1;
        for(int i=1;i<=11;i++)
        {
            for(int j=1;j<=11;j++)
            {
                zar=(i-1)*(j-1);
                if(i==1 && j>1){zar=j-1;}
                if(i>1 && j==1){zar=i-1;}
                if(i==1 && j==1)
                {
                    st="x     ";
                }
                else
                {
                    st=String.valueOf(zar);
                }
                if(st.length()==1){st=st+"     ";}
                if(st.length()==2){st=st+"   ";}
                tv = tv +" "+st;
            }
            tv=tv+"\n\n";
        }
        jad.setText(tv);


    }
}