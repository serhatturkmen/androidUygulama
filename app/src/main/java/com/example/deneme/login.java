package com.example.deneme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    private TextView  tbKullaniciAdi;
    private TextView  tbSifre;
    private Button btnLogin;
    String kadi;
    String sifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        tbKullaniciAdi = (TextView) findViewById(R.id.tbKullaniciAdi);
        tbSifre = (TextView) findViewById(R.id.tbSifre);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
    //btn click
    public void btnLogin_Click (View v){
        kadi = tbKullaniciAdi.getText().toString();
        sifre = tbSifre.getText().toString();
        if (kadi.equals("admin") && sifre.equals("1234")){
            setContentView(R.layout.activity_main);
        }
    }
}
