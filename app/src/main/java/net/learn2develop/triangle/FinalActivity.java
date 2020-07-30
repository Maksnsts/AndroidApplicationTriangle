package net.learn2develop.triangle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.BackMusic.MyService;
import net.learn2develop.triangle.StageFive.ClassArrayHelpStage5;
import net.learn2develop.triangle.StageFive.FiveActivityInstruction;
import net.learn2develop.triangle.StageFive.Stage5;
import net.learn2develop.triangle.StageFour.ClassArrayStage4;
import net.learn2develop.triangle.StageOne.ClassArrayStage1;
import net.learn2develop.triangle.StageThree.ClassArrayHelpStage3;
import net.learn2develop.triangle.StageTwo.ClassArrayHelpStage2;

import java.util.ArrayList;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        Button buttonMenu  = findViewById(R.id.buttonMenu);
        TextView instuctionFinal = findViewById(R.id.instuctionStage1);

        instuctionFinal.setText(R.string.TextFinal);

        ArrayList<Integer> arrlist2 = new ArrayList<Integer>();

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClassClearArrayAll.clearArrayAll();


                Intent intent = new Intent(FinalActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
        stopService(new Intent(this, MyService.class));
    }


}
