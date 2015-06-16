package io.github.piejak.counter;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int numvar = 0;

    public void addOne(View view){
        numvar++;
        TextView textView = (TextView) findViewById(R.id.value);
        if(numvar == 1){
            textView.setText("You've pressed this button " + numvar + " time... Cool");
        }
        else if(numvar > 1) {
            textView.setText("You've pressed this button " + numvar + " times... Cool");
        }
        if(numvar == 10){
            //change the bg color to something
            textView.setTextColor(Color.RED);
        }
        if(numvar == 20){
            //change the bg color to something
            textView.setTextColor(Color.BLUE);
        }
        if(numvar == 30){
            //change the bg color to something
            textView.setTextColor(Color.YELLOW);
        }
        if(numvar == 40){
            //change the bg color to something
            textView.setTextColor(Color.CYAN);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
