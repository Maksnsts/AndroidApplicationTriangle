package net.learn2develop.triangle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.learn2develop.triangle.BackMusic.MyService;
import net.learn2develop.triangle.StageFour.FourActivityInstruction;
import net.learn2develop.triangle.StageOne.FirstActivityInstruction;

import java.util.Locale;

// http://developer.alexanderklimov.ru/android/views/listview.php
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_main);

       // startService(new Intent(this, MyService.class));


        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        Button startButton = findViewById(R.id.startButton);
        TextView version = findViewById(R.id.version1_0);

        Button btnChangeLang = findViewById(R.id.changeLang);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstActivityInstruction.class);
                startActivity(intent);
            }
        });

        btnChangeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showChangeLanguageDialog();
            }
        });

    }



    private void showChangeLanguageDialog() {

        final String[] listItems = {"English", "Polish", "Russian"};
        AlertDialog.Builder mBuillder = new AlertDialog.Builder(MainActivity.this);
        mBuillder.setTitle("Choose Language... ");
        mBuillder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i==0){
                    setLocale("en");
                    recreate();
                }
                else if(i==1){
                    setLocale("ro");
                    recreate();
                }
                else if(i==2){
                    setLocale("RU");
                    recreate();
                }

                dialogInterface.dismiss();

            }
        });

        AlertDialog mDialog = mBuillder.create();
        mDialog.show();

    }

    private  void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        // save  data to shared preference
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }

    public  void loadLocale(){
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }


}
