package com.example.ozlemyaylaalti.mobil2015androidservice;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = (Button) findViewById(R.id.button);
        final TextView text1 = (TextView) findViewById(R.id.textView);

        Toast.makeText(this, "Service start", Toast.LENGTH_SHORT).show();


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

    public void MethodStart(View v) {
        // use this to start and trigger a service

        Intent i = new Intent(getBaseContext(), MyService.class);
        // potentially add data to the intent

        i.putExtra("KEY1", "Value to be used by the service");
        getBaseContext().startService(i);
    }
    public void MethodStop(View v){
        Intent i = new Intent(getBaseContext(), MyService.class);
        // potentially add data to the intent

        i.putExtra("KEY1", "Value to be used by the service");
        this.stopService(i);
        Toast.makeText(this, "Service stopped", Toast.LENGTH_SHORT).show();
    }
}
