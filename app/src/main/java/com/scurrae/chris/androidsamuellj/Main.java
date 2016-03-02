package com.scurrae.chris.androidsamuellj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        Button[] button = {b1,b2,b3};
        for(int x = 0; x < button.length; x++) {
            button[x].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button:
                            Intent i = new Intent(getBaseContext(), About.class);
                            startActivity(i);
                            break;
                        case R.id.button2:
                            Intent j = new Intent(getBaseContext(), Movies.class);
                            startActivity(j);
                            break;
                        case R.id.button3:
                            Intent k = new Intent(getBaseContext(), Quotes.class);
                            startActivity(k);
                            break;
                        default:
                            break;
                    }
                }


            });
        }
    }
}
