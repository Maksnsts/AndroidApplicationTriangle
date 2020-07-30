package net.learn2develop.triangle.StageOne;

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

public class FirstActivityInstruction extends AppCompatActivity {

    String n = null;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_instruction);


        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);
        TextView instuctionStage1 = findViewById(R.id.instuctionStage1);
        Button buttonReadyStage1 = findViewById(R.id.buttonReadyStage1);

        instuctionStage1.setText(R.string.TextInstruction1);


        buttonReadyStage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WriteArray();

                Intent intent = new Intent(FirstActivityInstruction.this, Stage1.class);
                startActivity(intent);
            }
        });
    }

    public void WriteArray(){
        ClassArrayStage1.arrayListFirstStage.add(getDrinkS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getItemsFaceS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getTogetherS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getExchangeS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getHurtS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getSexS1(n));
        ClassArrayStage1.arrayListFirstStage.add(getEatS1(n));
    }

    public String getDrinkS1(String drinkS1){
        String String1 = getString(R.string.stage1drink1);
        String String2 = getString(R.string.stage1drink2);
        String String3 = getString(R.string.stage1drink3);
        String String4 = getString(R.string.stage1drink4);
        String String5 = getString(R.string.stage1drink5);
        String String6 = getString(R.string.stage1drink6);
        String String7 = getString(R.string.stage1drink7);
        String String8 = getString(R.string.stage1drink8);

        String[] drinkStage1 = {String1, String2, String3, String4, String5, String6, String7, String8};

        return  drinkS1 = drinkStage1[(int) (Math.random()*drinkStage1.length)];

    }

    public String getItemsFaceS1(String itemsFaceS1){
        String String1 = getString(R.string.stage1ItemsFace1);
        String String2 = getString(R.string.stage1ItemsFace2);
        String String3 = getString(R.string.stage1ItemsFace3);
        String String4 = getString(R.string.stage1ItemsFace4);
        String String5 = getString(R.string.stage1ItemsFace5);

        String[] itemsFaceStage1 = {String1, String2 ,String3 ,String4 , String5};

        return  itemsFaceS1 = itemsFaceStage1[(int) (Math.random()*itemsFaceStage1.length)];

    }

    public String getTogetherS1(String togetherS1){
        String String1 = getString(R.string.stage1Together1);
        String String2 = getString(R.string.stage1Together2);
        String String3 = getString(R.string.stage1Together3);
        String String4 = getString(R.string.stage1Together4);
        String String5 = getString(R.string.stage1Together5);

        String[] togetherStage1 = {String1, String2 ,String3 ,String4 , String5};

        return  togetherS1 = togetherStage1[(int) (Math.random()*togetherStage1.length)];

    }

    public String getExchangeS1(String exchangeS1){
        String String1 = getString(R.string.stage1Exchange1);
        String String2 = getString(R.string.stage1Exchange2);
        String String3 = getString(R.string.stage1Exchange3);
        String String4 = getString(R.string.stage1Exchange4);
        String String5 = getString(R.string.stage1Exchange5);
        String String6 = getString(R.string.stage1Exchange6);


        String[] exchangeStage1 = {String1, String2 ,String3 ,String4 , String5, String6};

        return  exchangeS1 = exchangeStage1[(int) (Math.random()*exchangeStage1.length)];

    }

    public String getHurtS1(String hurtS1){
        String String1 = getString(R.string.stage1Hurt1);
        String String2 = getString(R.string.stage1Hurt2);
        String String3 = getString(R.string.stage1Hurt3);
        String String4 = getString(R.string.stage1Hurt4);
        String String5 = getString(R.string.stage1Hurt5);
        String String6 = getString(R.string.stage1Hurt6);


        String[] hurtStage1 = {String1, String2 ,String3 ,String4 , String5, String6};

        return  hurtS1 = hurtStage1[(int) (Math.random()*hurtStage1.length)];

    }

    public String getSexS1(String sexS1){
        String String1 = getString(R.string.stage1Sex1);
        String String2 = getString(R.string.stage1Sex2);
        String String3 = getString(R.string.stage1Sex3);
        String String4 = getString(R.string.stage1Sex4);
        String String5 = getString(R.string.stage1Sex5);
        String String6 = getString(R.string.stage1Sex6);


        String[] sexStage1 = {String1, String2 ,String3 ,String4 , String5, String6};

        return  sexS1 = sexStage1[(int) (Math.random()*sexStage1.length)];

    }

    public String getEatS1(String eatS1){
        String String1 = getString(R.string.stage1Eat1);
        String String2 = getString(R.string.stage1Eat2);
        String String3 = getString(R.string.stage1Eat3);
        String String4 = getString(R.string.stage1Eat4);
        String String5 = getString(R.string.stage1Eat5);
        String String6 = getString(R.string.stage1Eat6);
        String String7 = getString(R.string.stage1Eat7);
        String String8 = getString(R.string.stage1Eat8);
        String String9 = getString(R.string.stage1Eat9);
        String String10 = getString(R.string.stage1Eat10);
        String String11= getString(R.string.stage1Eat11);


        String[] eatStage1 = {String1, String2 ,String3 ,String4 , String5, String6, String7, String8, String9, String10, String11};

        return  eatS1 = eatStage1[(int) (Math.random()*eatStage1.length)];

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }



}
