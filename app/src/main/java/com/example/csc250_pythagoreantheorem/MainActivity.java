package com.example.csc250_pythagoreantheorem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;
import static java.lang.Math.hypot;


public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.a = this.findViewById(R.id.inputA);
        this.b = this.findViewById(R.id.inputB);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onCalculateButtonClicked (View v)
    {
        String currA = this.a.getText().toString();
        String currB = this.b.getText().toString();
        int aVal = Integer.parseInt(currA);
        int bVal = Integer.parseInt(currB);

        double answer = hypot(aVal, bVal);
        DecimalFormat df = new DecimalFormat("###.##");
        this.answerTV.setText(""+ df.format(answer));



    }
}