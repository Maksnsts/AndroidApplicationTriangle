package net.learn2develop.triangle.StageThree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;
import net.learn2develop.triangle.StageFive.FiveActivityInstruction;
import net.learn2develop.triangle.StageFour.FourActivityInstruction;

public class ResultActivityStage3 extends AppCompatActivity {

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_stage3);




        ListView listViewResultStage3 = findViewById(R.id.listViewResultStage3);
        ListView listViewResultStage3Player2 = findViewById(R.id.listViewResultStage3Player2);

        Button buttonStartStage4 = findViewById(R.id.buttonStartStage4);

        TextView infoResultStage3 = findViewById(R.id.infoResultStage3);
        TextView resultPlayer1 = findViewById(R.id.resultPlayer1);


        adapter = new ArrayAdapter(ResultActivityStage3.this, R.layout.custom_listview_stage1, ClassArrayHelpStage3.arrayListFinalStage3);
        listViewResultStage3.setAdapter(adapter);
        adapter = new ArrayAdapter(ResultActivityStage3.this, R.layout.custom_listview_stage1, ClassArrayHelpStage3.arrayListFinalStage3Player2);
        listViewResultStage3Player2.setAdapter(adapter);

        if(ClassArrayHelpStage3.arrayListFinalStage3.get(0).equals(ClassArrayHelpStage3.arrayListFinalStage3Player2.get(0))){
            ClassArrayHelpStage3.arrayListFinalStage3Player2.remove(0);
            resultPlayer1.setText(R.string.P1P2oneChallenge);
        }else {
            resultPlayer1.setText(R.string.P1P2twoChallenge);

        }

        buttonStartStage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ResultActivityStage3.this, FourActivityInstruction.class);
                startActivity(intent);


            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }

    }

