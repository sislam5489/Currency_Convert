package edu.fordham.currencyconvert2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ShowToast")
    public void convert(View view) {
        Log.i("currencyconverter",  "Convert clicked!");
        EditText usdText = findViewById(R.id.usdEditText);
        EditText takaText = findViewById(R.id.takaEditText);

        String usdStr = usdText.getText().toString();
        if(usdStr.isEmpty()){
            Toast.makeText(this, "Please enter amount!", Toast.LENGTH_LONG ).show();
            return;
        }
        double usdAmount = Double.parseDouble(usdStr);
        Log.i("ccmobdev","Entered " + usdAmount + "USD");

        double takaAmount = usdAmount * 84.79;
        String takaStr = String.valueOf(takaAmount);
        Log.i("ccmobdev","Entered" + takaAmount + "TAKA");

        takaText.setText(takaStr);
    }
}