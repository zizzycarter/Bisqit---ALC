package com.example.android.budgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        /* this code accept users allowance input and initialize it to the variable allowance
            thank you!
         */
        EditText editText = (EditText) findViewById(R.id.allowance);
        String input = editText.getText().toString();
        int allowance = Integer.parseInt(input);


        // end of allowance accept and initialization
        double feeding = 0.4 * allowance;
        double clothing = 0.2 * allowance;
        double transport = 0.1 * allowance;
        double miscellaneous = 0.1 * allowance;
        double savings = 0.2 * allowance;
        double studyMaterial = 0.2 * allowance;


        displayClothing(clothing);
        displayFeeding(feeding);
        displayMiscellaneous(miscellaneous);
        displaySavings(savings);
        displayStudyMaterial(studyMaterial);
        displayTransport(transport);

    }

    public void reset(View view) {
        EditText editText = (EditText) findViewById(R.id.allowance);
        editText.setText("");

        TextView feedingTextView = (TextView) findViewById(R.id.feeding_text_view);
        feedingTextView.setText(R.string.amount_text_field);

        TextView miscellaneousTextView = (TextView) findViewById(R.id.miscellaneous_text_view);
        miscellaneousTextView.setText(R.string.amount_text_field);

        TextView clothingTextView = (TextView) findViewById(R.id.clothing_text_view);
        clothingTextView.setText(R.string.amount_text_field);

        TextView transportTextView = (TextView) findViewById(R.id.transport_text_view);
        transportTextView.setText(R.string.amount_text_field);

        TextView studyMaterialTextView = (TextView) findViewById(R.id.studyMaterial_text_view);
        studyMaterialTextView.setText(R.string.amount_text_field);

        TextView savingsTextView = (TextView) findViewById(R.id.savings_text_view);
        savingsTextView.setText(R.string.amount_text_field);

    }


    private void displayMiscellaneous(double number) {
        TextView budgetTextView = (TextView) findViewById(R.id.miscellaneous_text_view);
        budgetTextView.setText("" + number);
    }

    private void displayFeeding(double number) {
        TextView feedingTextView = (TextView) findViewById(R.id.feeding_text_view);
        feedingTextView.setText("" + number);
    }

    private void displayClothing(double number) {
        TextView clothingTextView = (TextView) findViewById(R.id.clothing_text_view);
        clothingTextView.setText("" + number);
    }

    private void displayTransport(double number) {
        TextView transportTextView = (TextView) findViewById(R.id.transport_text_view);
        transportTextView.setText("" + number);
    }

    private void displayStudyMaterial(double number) {
        TextView studyMaterialTextView = (TextView) findViewById(R.id.studyMaterial_text_view);
        studyMaterialTextView.setText("" + number);
    }

    private void displaySavings(double number) {
        TextView savingsTextView = (TextView) findViewById(R.id.savings_text_view);
        savingsTextView.setText("" + number);
    }
}
