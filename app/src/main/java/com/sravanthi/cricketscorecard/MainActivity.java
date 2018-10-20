package com.sravanthi.cricketscorecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView total,one,two,three,fours,sixes,extras;
    private Button single,doubles,triple,four,six,wide,noball;
    private int gettot=0,s=0,d=0,t=0,f=0,si=0,e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=findViewById(R.id.show);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        fours=findViewById(R.id.fours);
        sixes=findViewById(R.id.sixes);
        extras=findViewById(R.id.extras);
        single=findViewById(R.id.single);
        doubles=findViewById(R.id.doubles);
        triple=findViewById(R.id.triple);
        four=findViewById(R.id.four);
        six=findViewById(R.id.six);
        wide=findViewById(R.id.wide);
        noball=findViewById(R.id.no_ball);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                s=s+1;
                total.setText(gettot+" ");
                one.setText(s+" ");
            }
        });

        doubles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+2;
                d=d+1;
                total.setText(gettot+" ");
                two.setText(d+" ");
            }
        });

        triple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+3;
                t=t+1;
                total.setText(gettot+" ");
                three.setText(t+" ");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+4;
                f=f+1;
                total.setText(gettot+" ");
                fours.setText(f+" ");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+6;
                si=si+1;
                total.setText(gettot+" ");
                sixes.setText(si+" ");
            }
        });

        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                e=e+1;
                total.setText(gettot+" ");
                extras.setText(e+" ");
            }
        });

        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                e=e+1;
                total.setText(gettot+" ");
                extras.setText(e+" ");
            }
        });
    }

}
