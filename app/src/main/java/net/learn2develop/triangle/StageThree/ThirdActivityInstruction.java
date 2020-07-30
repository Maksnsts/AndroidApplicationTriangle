package net.learn2develop.triangle.StageThree;

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

public class ThirdActivityInstruction extends AppCompatActivity {

    String n = null;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_instruction);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        TextView instuctionStage3 = findViewById(R.id.instuctionStage3);
        Button buttonReadyStage3 = findViewById(R.id.buttonReadyStage3);

        instuctionStage3.setText(R.string.TextInstruction3);


        buttonReadyStage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ThirdActivityInstruction.this);
                builder.setTitle(R.string.attention)
                        //.setMessage("Сейчас Игрок 1 выбирает задание. Просьба Игрока 2 не смореть в экран !")
                        .setMessage(R.string.warning)
                        .setCancelable(false)
                        .setNegativeButton(R.string.toBegin,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        WriteArray();

                                        Intent intent = new Intent(ThirdActivityInstruction.this, Stage3Player1.class);
                                        startActivity(intent);
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });
    }

    public void WriteArray(){
        ClassArrayHelpStage3.arrayListStage3.add(getSexHurtS3(n));
        ClassArrayHelpStage3.arrayListStage3.add(getEatWorldS3(n));
        ClassArrayHelpStage3.arrayListStage3.add(getHeadS3(n));

        for(int index = 0; index <   ClassArrayHelpStage3.arrayListStage3.size(); index++){
            ClassArrayHelpStage3.arrayListDuplicatStage3.add(ClassArrayHelpStage3.arrayListStage3.get(index));
        }

    }

    public String getSexHurtS3(String sexHurtS3){
        String String1 = getString(R.string.stage3SexHurt1);
        String String2 = getString(R.string.stage3SexHurt2);
        String String3 = getString(R.string.stage3SexHurt3);
        String String4 = getString(R.string.stage3SexHurt4);
        String String5 = getString(R.string.stage3SexHurt5);
        String String6 = getString(R.string.stage3SexHurt6);
        String String7 = getString(R.string.stage3SexHurt7);

        String[] sexHurtStage3 = {String1, String2, String3, String4, String5, String6, String7};

        return  sexHurtS3 = sexHurtStage3[(int) (Math.random()*sexHurtStage3.length)];

    }

    public String getEatWorldS3(String eatWorldS3){
        String String1 = getString(R.string.stage3EatWorld1);
        String String2 = getString(R.string.stage3EatWorld2);
        String String3 = getString(R.string.stage3EatWorld3);
        String String4 = getString(R.string.stage3EatWorld4);
        String String5 = getString(R.string.stage3EatWorld5);
        String String6 = getString(R.string.stage3EatWorld6);
        String String7 = getString(R.string.stage3EatWorld7);
        String String8 = getString(R.string.stage3EatWorld8);
        String String9 = getString(R.string.stage3EatWorld9);
        String String10 = getString(R.string.stage3EatWorld10);

        String[] eatWorldStage3 = {String1, String2, String3, String4, String5, String6, String7};

        return  eatWorldS3 = eatWorldStage3[(int) (Math.random()*eatWorldStage3.length)];

    }

    public String getHeadS3(String headS3){
        String String1 = getString(R.string.stage3Head1);
        String String2 = getString(R.string.stage3Head2);
        String String3 = getString(R.string.stage3Head3);
        String String4 = getString(R.string.stage3Head4);
        String String5 = getString(R.string.stage3Head5);
        String String6 = getString(R.string.stage3Head6);
        String String7 = getString(R.string.stage3Head7);
        String String8 = getString(R.string.stage3Head8);
        String String9 = getString(R.string.stage3Head9);

        String[] headStage3 = {String1, String2, String3, String4, String5, String6, String7};

        return  headS3 = headStage3[(int) (Math.random()*headStage3.length)];

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
}
