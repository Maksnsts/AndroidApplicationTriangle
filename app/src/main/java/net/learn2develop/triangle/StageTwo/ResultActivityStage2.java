package net.learn2develop.triangle.StageTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;
import net.learn2develop.triangle.StageThree.ThirdActivityInstruction;

public class ResultActivityStage2 extends AppCompatActivity {

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_stage2);

        ListView listViewResultStage2 = findViewById(R.id.listViewResultStage2);
        ListView listViewResultStage2Player2 = findViewById(R.id.listViewResultStage2Player2);

        Button buttonStartStage3 = findViewById(R.id.buttonStartStage3);

        TextView infoResultStage2 = findViewById(R.id.infoResultStage2);
        TextView resultPlayer1 = findViewById(R.id.resultPlayer1);
        TextView resultPlayer2 = findViewById(R.id.resultPlayer2);

        adapter = new ArrayAdapter(ResultActivityStage2.this, R.layout.custom_listview_stage1, ClassArrayHelpStage2.arrayListFinalStage2);
        listViewResultStage2.setAdapter(adapter);

        adapter = new ArrayAdapter(ResultActivityStage2.this, R.layout.custom_listview_stage1, ClassArrayHelpStage2.arrayListFinalStage2Player2);
        listViewResultStage2Player2.setAdapter(adapter);

        if(ClassArrayHelpStage2.arrayListFinalStage2.get(0).equals(ClassArrayHelpStage2.arrayListFinalStage2Player2.get(0))){
            ClassArrayHelpStage2.arrayListFinalStage2Player2.remove(0);
            resultPlayer1.setText(R.string.infoStage1);
            resultPlayer2.setText("");
        }

        buttonStartStage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(ResultActivityStage2.this, ThirdActivityInstruction.class);
                    startActivity(intent);


            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }

}
