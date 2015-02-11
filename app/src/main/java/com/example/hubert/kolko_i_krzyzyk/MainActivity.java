package com.example.hubert.kolko_i_krzyzyk;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive;
    private Button buttonSix, buttonSeven, buttonEight, buttonNine;
    private String sign4Button;



    WhichSignMoves whichSign = new WhichSignMoves("O");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFive = (Button) findViewById(R.id.button5);
        buttonSix = (Button) findViewById(R.id.button6);
        buttonSeven = (Button) findViewById(R.id.button7);
        buttonEight = (Button) findViewById(R.id.button8);
        buttonNine = (Button) findViewById(R.id.button9);

        initializeButtons();


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

    public void onButton1Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonOne.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonOne.setEnabled(false);

    }

    public void onButton2Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonTwo.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonTwo.setEnabled(false);
    }

    public void onButton3Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonThree.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonThree.setEnabled(false);
    }

    public void onButton4Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonFour.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonFour.setEnabled(false);
    }

    public void onButton5Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonFive.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonFive.setEnabled(false);
    }

    public void onButton6Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonSix.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonSix.setEnabled(false);
    }

    public void onButton7Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonSeven.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonSeven.setEnabled(false);
    }

    public void onButton8Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonEight.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonEight.setEnabled(false);
    }

    public void onButton9Click(View view) {

        sign4Button = whichSign.getMoveSign();
        buttonNine.setText(sign4Button);
        whichSign.changeSign(sign4Button);
        buttonNine.setEnabled(false);
    }

    public void onRefreshButtonClick(View view) {
        initializeButtons();

    }

    public void initializeButtons (){
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);

        buttonOne.setText("");
        buttonTwo.setText("");
        buttonThree.setText("");
        buttonFour.setText("");
        buttonFive.setText("");
        buttonSix.setText("");
        buttonSeven.setText("");
        buttonEight.setText("");
        buttonNine.setText("");
    }
}
