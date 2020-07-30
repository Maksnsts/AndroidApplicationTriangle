package net.learn2develop.triangle.StageFour;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;



public class FourActivityInstruction extends AppCompatActivity {

    String n = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_instruction);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        TextView instuctionStage4 = findViewById(R.id.instuctionStage4);
        Button buttonReadyStage4 = findViewById(R.id.buttonReadyStage4);

        instuctionStage4.setText(R.string.TextInstruction4);


        buttonReadyStage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WriteArray();

                Intent intent = new Intent(FourActivityInstruction.this, Stage4.class);
                startActivity(intent);
            }
        });
    }

    public void WriteArray(){
        ClassArrayStage4.arrayListStage4.add(getItemsFaceS4(n));
        ClassArrayStage4.arrayListStage4.add(getHurtS4(n));
        ClassArrayStage4.arrayListStage4.add(getSexS4(n));
        ClassArrayStage4.arrayListStage4.add(getDrinkEatS4(n));
        ClassArrayStage4.arrayListStage4.add(getSportS4(n));
        ClassArrayStage4.arrayListStage4.add(getWorldS4(n));
        ClassArrayStage4.arrayListStage4.add(getFaceS4(n));
        ClassArrayStage4.arrayListStage4.add(getOtherS4(n));
    }

    public String getItemsFaceS4(String itemsFaceS4){
        String String1 = getString(R.string.stage4ItemsFace1);
        String String2 = getString(R.string.stage4ItemsFace2);
        String String3 = getString(R.string.stage4ItemsFace3);
        String String4 = getString(R.string.stage4ItemsFace4);
        String String5 = getString(R.string.stage4ItemsFace5);

        String[] itemsFaceStage4 = {String1, String2, String3, String4, String5};

        return  itemsFaceS4 = itemsFaceStage4[(int) (Math.random()*itemsFaceStage4.length)];

    }

    public String getHurtS4(String hurtS4){
        String String1 = getString(R.string.stage4Hurt1);
        String String2 = getString(R.string.stage4Hurt2);
        String String3 = getString(R.string.stage4Hurt3);
        String String4 = getString(R.string.stage4Hurt4);
        String String5 = getString(R.string.stage4Hurt5);
        String String6 = getString(R.string.stage4Hurt6);

        String[] hurtStage4 = {String1, String2, String3, String4, String5, String6};

        return  hurtS4 = hurtStage4[(int) (Math.random()*hurtStage4.length)];

    }

    public String getSexS4(String sexS4){
        String String1 = getString(R.string.stage4Sex1);
        String String2 = getString(R.string.stage4Sex2);
        String String3 = getString(R.string.stage4Sex3);
        String String4 = getString(R.string.stage4Sex4);
        String String5 = getString(R.string.stage4Sex5);
        String String6 = getString(R.string.stage4Sex6);

        String[] sexStage4 = {String1, String2, String3, String4, String5, String6};

        return  sexS4 = sexStage4[(int) (Math.random()*sexStage4.length)];

    }

    public String getDrinkEatS4(String drinkEatS4){
        String String1 = getString(R.string.stage4DrinkEat1);
        String String2 = getString(R.string.stage4DrinkEat2);
        String String3 = getString(R.string.stage4DrinkEat3);
        String String4 = getString(R.string.stage4DrinkEat4);
        String String5 = getString(R.string.stage4DrinkEat5);
        String String6 = getString(R.string.stage4DrinkEat6);
        String String7 = getString(R.string.stage4DrinkEat7);
        String String8 = getString(R.string.stage4DrinkEat8);
        String String9 = getString(R.string.stage4DrinkEat9);

        String[] drinkEatStage4 = {String1, String2, String3, String4, String5, String6, String7, String8, String9};

        return  drinkEatS4 = drinkEatStage4[(int) (Math.random()*drinkEatStage4.length)];

    }

    public String getSportS4(String sportS4){
        String String1 = getString(R.string.stage4Sport1);
        String String2 = getString(R.string.stage4Sport2);
        String String3 = getString(R.string.stage4Sport3);
        String String4 = getString(R.string.stage4Sport4);
        String String5 = getString(R.string.stage4Sport5);
        String String6 = getString(R.string.stage4Sport6);
        String String7 = getString(R.string.stage4Sport7);


        String[] sportStage4 = {String1, String2, String3, String4, String5, String6, String7};

        return  sportS4 = sportStage4[(int) (Math.random()*sportStage4.length)];

    }

    public String getWorldS4(String worldS4){
        String String1 = getString(R.string.stage4World1);
        String String2 = getString(R.string.stage4World2);
        String String3 = getString(R.string.stage4World3);
        String String4 = getString(R.string.stage4World4);
        String String5 = getString(R.string.stage4World5);
        String String6 = getString(R.string.stage4World6);
        String String7 = getString(R.string.stage4World7);
        String String8 = getString(R.string.stage4World8);
        String String9 = getString(R.string.stage4World9);

        String[] worldStage4 = {String1, String2, String3, String4, String5, String6, String7, String8, String9};

        return  worldS4 = worldStage4[(int) (Math.random()*worldStage4.length)];

    }

    public String getFaceS4(String faceS4){
        String String1 = getString(R.string.stage4Face1);
        String String2 = getString(R.string.stage4Face2);
        String String3 = getString(R.string.stage4Face3);
        String String4 = getString(R.string.stage4Face4);
        String String5 = getString(R.string.stage4Face5);
        String String6 = getString(R.string.stage4Face6);
        String String7 = getString(R.string.stage4Face7);
        String String8 = getString(R.string.stage4Face8);
        String String9 = getString(R.string.stage4Face9);

        String[] faceStage4 = {String1, String2, String3, String4, String5, String6, String7, String8, String9};

        return  faceS4 = faceStage4[(int) (Math.random()*faceStage4.length)];

    }

    public String getOtherS4(String otherS4){
        String String1 = getString(R.string.stage4Other1);
        String String2 = getString(R.string.stage4Other2);
        String String3 = getString(R.string.stage4Other3);
        String String4 = getString(R.string.stage4Other4);
        String String5 = getString(R.string.stage4Other5);

        String[] otherStage4 = {String1, String2, String3, String4, String5};

        return  otherS4 = otherStage4[(int) (Math.random()*otherStage4.length)];

    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
}
