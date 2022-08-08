package com.orbitsoft.teamorbitsoft;

import static java.lang.Math.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Mazaheri extends AppCompatActivity {
TextView jad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazaheri);
        //salam
        zarb();
        sixgreat();



    }

    public void zarb(){
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

        public void sixgreat() {

            String tv = "";
            txt.setText(tv);

            int min = 200;
            int max = 400;
            int temp = 0;



            for (int i = 0; i <= 5; i++) {


                rnum[i] = (int) (random() * (max - min + 1) + min);

            }

            for (int i = 0; i <= 5; i++) {

                for (int j = i + 1; j <= 5; j++) {
                    if (rnum[i] < rnum[j]) {
                        temp = rnum[i];
                        rnum[i] = rnum[j];
                        rnum[j] = temp;
                        //Toast.makeText(this, " "+rnum[i], Toast.LENGTH_SHORT).show();
                    }
                }



            }

            for (int i = 0; i <= 5; i++) {

                st=String.valueOf(rnum[i]);


                tv = tv + " "+st;
            }
            tv=tv +"\n\n";
            tv=tv+"Last Two Great : " + rnum[0] + " " +rnum[1] ;
            tv=tv +"\n\n";
            int sum=rnum[0]  + rnum[1] ;

            tv=tv+"Sum Is : " + String.valueOf(sum);
            txt.setText(tv);


    }


}