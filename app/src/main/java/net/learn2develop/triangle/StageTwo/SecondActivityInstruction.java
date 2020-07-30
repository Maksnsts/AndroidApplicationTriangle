package net.learn2develop.triangle.StageTwo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;

public class SecondActivityInstruction extends AppCompatActivity {

    String n = null;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_instruction);

        TextView instuctionStage2 = findViewById(R.id.instuctionStage2);
        Button buttonReadyStage2 = findViewById(R.id.buttonReadyStage2);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        instuctionStage2.setText(R.string.TextInstruction2 );


        buttonReadyStage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivityInstruction.this);
                builder.setTitle(R.string.attention)
                        .setMessage(R.string.warning)
                        .setCancelable(false)
                        .setNegativeButton(R.string.toBegin,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        WriteArray(); // записывает задание в арай

                                        Intent intent = new Intent(SecondActivityInstruction.this, Stage2Player1.class);
                                        startActivity(intent);
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

    }

    public void WriteArray(){
        ClassArrayHelpStage2.arrayListStage2.add(getItemsFaceS2(n));
        ClassArrayHelpStage2.arrayListStage2.add(getPaintS2(n));
        ClassArrayHelpStage2.arrayListStage2.add(getHurtS2(n));
        ClassArrayHelpStage2.arrayListStage2.add(getCutS2(n));
        ClassArrayHelpStage2.arrayListStage2.add(getOtherS2(n));

        for(int index = 0; index <   ClassArrayHelpStage2.arrayListStage2.size(); index++){
            ClassArrayHelpStage2.arrayListDuplicatStage2.add(  ClassArrayHelpStage2.arrayListStage2.get(index));
        }
    }

    public String getItemsFaceS2(String itemsFaceS2){
        String String1 = getString(R.string.stage2ItemsFace1);
        String String2 = getString(R.string.stage2ItemsFace2);
        String String3 = getString(R.string.stage2ItemsFace3);
        String String4 = getString(R.string.stage2ItemsFace4);
        String String5 = getString(R.string.stage2ItemsFace5);
        String String6 = getString(R.string.stage2ItemsFace6);
        String String7 = getString(R.string.stage2ItemsFace7);

        String[] itemsFaceStage2 = {String1, String2, String3, String4, String5, String6, String7};

        return  itemsFaceS2 = itemsFaceStage2[(int) (Math.random()*itemsFaceStage2.length)];

    }

    public String getPaintS2(String paintS2){
        String String1 = getString(R.string.stage2Paint1);
        String String2 = getString(R.string.stage2Paint2);
        String String3 = getString(R.string.stage2Paint3);
        String String4 = getString(R.string.stage2Paint4);
        String String5 = getString(R.string.stage2Paint5);
        String String6 = getString(R.string.stage2Paint6);
        String String7 = getString(R.string.stage2Paint7);
        String String8 = getString(R.string.stage2Paint8);
        String String9 = getString(R.string.stage2Paint9);
        String String10 = getString(R.string.stage2Paint10);

        String[] paintStage2 = {String1, String2, String3, String4, String5, String6, String7, String8, String9, String10};

        return  paintS2 = paintStage2[(int) (Math.random()*paintStage2.length)];

    }

    public String getHurtS2(String hurtS2){
        String String1 = getString(R.string.stage2Hurt1);
        String String2 = getString(R.string.stage2Hurt2);
        String String3 = getString(R.string.stage2Hurt3);
        String String4 = getString(R.string.stage2Hurt4);
        String String5 = getString(R.string.stage2Hurt5);
        String String6 = getString(R.string.stage2Hurt6);
        String String7 = getString(R.string.stage2Hurt7);
        String String8 = getString(R.string.stage2Hurt8);
        String String9 = getString(R.string.stage2Hurt9);

        String[] hurtStage2 = {String1, String2, String3, String4, String5, String6, String7, String8, String9};

        return  hurtS2 = hurtStage2[(int) (Math.random()*hurtStage2.length)];

    }


    public String getCutS2(String cutS2){
        String String1 = getString(R.string.stage2Cut1);
        String String2 = getString(R.string.stage2Cut2);
        String String3 = getString(R.string.stage2Cut3);
        String String4 = getString(R.string.stage2Cut4);
        String String5 = getString(R.string.stage2Cut5);
        String String6 = getString(R.string.stage2Cut6);
        String String7 = getString(R.string.stage2Cut7);
        String String8 = getString(R.string.stage2Cut8);

        String[] cutStage2 = {String1, String2, String3, String4, String5, String6, String7, String8};

        return  cutS2 = cutStage2[(int) (Math.random()*cutStage2.length)];

    }

    public String getOtherS2(String otherS2){
        String String1 = getString(R.string.stage2Other1);
        String String2 = getString(R.string.stage2Other2);
        String String3 = getString(R.string.stage2Other3);
        String String4 = getString(R.string.stage2Other4);
        String String5 = getString(R.string.stage2Other5);
        String String6 = getString(R.string.stage2Other6);
        String String7 = getString(R.string.stage2Other7);
        String String8 = getString(R.string.stage2Other8);

        String[] otherStage2 = {String1, String2, String3, String4, String5, String6, String7, String8};

        return  otherS2 = otherStage2[(int) (Math.random()*otherStage2.length)];

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }

}
