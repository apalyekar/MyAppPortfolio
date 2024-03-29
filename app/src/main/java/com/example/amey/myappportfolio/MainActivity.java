package com.example.amey.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_spotify = (Button) findViewById(R.id.button_spotify);
        final Button btn_scores = (Button) findViewById(R.id.button_scores);
        final Button btn_library = (Button) findViewById(R.id.button_library);
        final Button btn_build = (Button) findViewById(R.id.button_build);
        final Button btn_reader = (Button) findViewById(R.id.button_reader);
        final Button btn_capstone = (Button) findViewById(R.id.button_capstone);
    }

    public void clickOnBtn(View view) {
        Button btn = (Button) view;
        showToast(getResources().getString(R.string.main_menu_toast) + " " + (CharSequence)btn.getText());
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

    void showToast(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
