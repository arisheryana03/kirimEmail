package com.aries.kirimemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ArisShop@gmail.com"});
        intent.putExtra(Intent.EXTRA_CC, new String[]{"arisheryana03@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aris Testpen");
        intent.putExtra(Intent.EXTRA_TEXT, "Hai, ini adalah percobaan mengirim dari aplikasi android");
        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }

    }
}
