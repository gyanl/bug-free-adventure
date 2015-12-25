package xyz.gyanl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddClass extends AppCompatActivity {
    private TextView name_view;
    private Button mButton1;
    private Button mButton2;
    //counter for button
    private int noun_count;
    private int adjec_count;
    //string array
    String[] nouns;// = getResources().getStringArray(R.array.nouns);
    //String[] nouns; = (String) findViewById(R.array.n)
    String[] adje; //= getResources().getStringArray(R.array.adjec);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);
        //adding string res to java
        nouns = getResources().getStringArray(R.array.nouns);
        adje = getResources().getStringArray(R.array.adjec);
        //initialise counters
        noun_count = adjec_count = 0;
        //adding text view
        name_view = (TextView) findViewById(R.id.name_gen);


        android.graphics.Typeface custom_font = android.graphics.Typeface.createFromAsset(getAssets(),  "fonts/LeagueSpartan-Bold.otf");

        name_view.setTypeface(custom_font);



        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noun_count++;
                name_view.setText(adje[adjec_count]+nouns[noun_count%4]);

            }
        });

        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adjec_count++;
                name_view.setText(adje[adjec_count%4]+nouns[noun_count]);
            }
        });




    }
}
