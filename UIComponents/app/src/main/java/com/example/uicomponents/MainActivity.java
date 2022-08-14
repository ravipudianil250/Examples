package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText pName, pAge;
    private RadioGroup gGroup;
    private Spinner countrySpinner;
    private Switch fanSwitch;
    private Button submit;
    private TextView result;
   private String nation,gender,fan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we initilize view
        initViews();
        submit.setOnClickListener(this);
        gGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    // get the RadioButton Id that is checked.
                    int id = radioGroup.getCheckedRadioButtonId();
                    if(id == R.id.male){
                       // result.setText("MALE");
                          gender = "Male";
                    }else if(id == R.id.female){
                        //result.setText("FEMALE");
                         gender = "Female";
                    }else{
                        //result.setText("Prefer Not to Say");
                        gender = "Prefer Not to Say";
                    }
                }
        });
        countrySpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String country = adapterView.getItemAtPosition(i).toString();
                result.setText(country);
            }

        });
    fanSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        }
    });

    }

    private void initViews() {
        //findViewById(...) connect to xml file
        pName = findViewById(R.id.Name);
        pAge = findViewById(R.id.age);
        gGroup = findViewById(R.id.gender);
        countrySpinner = findViewById(R.id.spinner);
        fanSwitch = findViewById(R.id.switch_pref);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);
    }

    @Override
    public void onClick(View view) {
        // This is the place where your button logic goes
        String n = pName.getText().toString();
        int a = Integer.parseInt(pAge.getText().toString());
    }
}