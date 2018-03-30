package in.weclub.srmweclubapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Jaggi on 3/30/2018.
 */

public class EventActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        //defining cards
        c1 = findViewById(R.id.event1);
        c2 = findViewById(R.id.event2);
        c3 = findViewById(R.id.event3);
        c4 = findViewById(R.id.event4);
        c5 = findViewById(R.id.event5);
        //Add click listeners to class
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.event1:
                i = new Intent(this, Event1_Activity.class);
                startActivity(i);
                break;
            case R.id.event2:
                i = new Intent(this, Event2_Activity.class);
                startActivity(i);
                break;
            case R.id.event3:
                i = new Intent(this, Event3_Activity.class);
                startActivity(i);
                break;
            case R.id.event4:
                i = new Intent(this, Event4_Activity.class);
                startActivity(i);
                break;
            case R.id.event5:
                i = new Intent(this, Event5_Activity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
