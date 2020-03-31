package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox cBM;
    private CheckBox cBS;
    private DatePicker dpSonuc;
    private Button btnSiparis;
    private TextView sonuc;
    private Spinner spinner1;
    String [] veriler;
    String tarih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinnerSecenek);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sonuc.setText(("Seçilen eleman: "+parent.getItemAtPosition(position)).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        cBM = (CheckBox) findViewById(R.id.cBM);
        cBS = (CheckBox) findViewById(R.id.cBS);
        sonuc = (TextView) findViewById(R.id.sonuc);
        dpSonuc = (DatePicker) findViewById(R.id.dpSonuc);
        btnSiparis = (Button) findViewById(R.id.btnSiparis);
    }
    public void btnSiparis_Click(View view) {
        tarih = dpSonuc.getYear() +"/"+dpSonuc.getMonth()+"/"+dpSonuc.getDayOfMonth();
        veriler[0]=tarih;
        veriler[0]=cBM.getText().toString();
        veriler[0]=cBS.getText().toString();
        sonuc.setText(tarih);
    }
}
