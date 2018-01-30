package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

        TextView mstoryTextview;
        Button mbuttontop;
        Button mbuttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

            mstoryTextview = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

           mbuttontop = (Button) findViewById(R.id.buttonTop);

            mbuttontop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("top button", "pressed");


                    if(mbuttontop.getText() == mbuttontop.getResources().getString(R.string.T1_Ans1)){
                        mstoryTextview.setText(R.string.T3_Story);
                        mbuttontop.setText(R.string.T3_Ans1);
                        mbuttonBottom.setText(R.string.T3_Ans2);
                    }

                    else if (mbuttontop.getText()==mbuttontop.getResources().getString(R.string.T3_Ans1)){
                        mstoryTextview.setText(R.string.T6_End);
                            mbuttontop.setVisibility(View.GONE);
                            mbuttonBottom.setVisibility(View.GONE);
                    }
                    else if (mbuttontop.getText()==mbuttontop.getResources().getString(R.string.T2_Ans1)){
                        mstoryTextview.setText(R.string.T3_Story);
                        mbuttontop.setText(R.string.T3_Ans1);
                        mbuttonBottom.setText(R.string.T3_Ans2);
                    }


            }});


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

            mbuttonBottom = (Button) findViewById(R.id.buttonBottom);
            mbuttonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Log.d("bottom", "clicked");
                    if (mbuttonBottom.getText() == mbuttonBottom.getResources().getString(R.string.T1_Ans2)) {
                        mstoryTextview.setText(R.string.T2_Story);
                        mbuttontop.setText(R.string.T2_Ans1);
                        mbuttonBottom.setText(R.string.T2_Ans2);
                    }
                    else if (mbuttonBottom.getText()==mbuttonBottom.getResources().getString(R.string.T3_Ans2)){
                        mstoryTextview.setText(R.string.T5_End);
                        mbuttontop.setVisibility(View.GONE);
                        mbuttonBottom.setVisibility(View.GONE);
                    }
                    else if (mbuttonBottom.getText()==mbuttonBottom.getResources().getString(R.string.T2_Ans2)){
                        mstoryTextview.setText(R.string.T4_End);
                        mbuttontop.setVisibility(View.GONE);
                        mbuttonBottom.setVisibility(View.GONE);
                    }
                }

            });

}}
