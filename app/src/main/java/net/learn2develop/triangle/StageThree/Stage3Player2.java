package net.learn2develop.triangle.StageThree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;

public class Stage3Player2 extends AppCompatActivity {
    private ArrayAdapter adapter;

    Animation anim = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3_player2);

        TextView infoStage3Player2 = findViewById(R.id.infoStage3Player2);
        Button buttonFinalTwoS3 = findViewById(R.id.buttonFinalThree);

        final ListView listViewPlayerTwoStage3 = findViewById(R.id.listViewPlayerTwoStage3);


        adapter = new ArrayAdapter(Stage3Player2.this, R.layout.custom_listview_stage1, ClassArrayHelpStage3.arrayListDuplicatStage3);
        listViewPlayerTwoStage3.setAdapter(adapter);

        listViewPlayerTwoStage3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                listViewPlayerTwoStage3.setEnabled(false);
                if (ClassArrayHelpStage3.arrayListDuplicatStage3.size() > 2) {
                    listViewPlayerTwoStage3.setEnabled(true);
                }

                if (ClassArrayHelpStage3.arrayListDuplicatStage3.size() > 1) {

                    anim = AnimationUtils.loadAnimation(Stage3Player2.this, R.anim.my_anim);
                    listViewPlayerTwoStage3.getChildAt(position).startAnimation(anim);

                    parent.postDelayed(new Runnable() {
                        public void run() {
                            try {
                                ClassArrayHelpStage3.arrayListDuplicatStage3.remove(position);
                                adapter.notifyDataSetChanged();
                            }catch (IndexOutOfBoundsException ex){}
                        }
                    }, 500);


                } else if (ClassArrayHelpStage3.arrayListDuplicatStage3.size() == 1) {
                    Toast.makeText(getApplicationContext(), R.string.ToastResult, Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonFinalTwoS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ClassArrayHelpStage3.arrayListDuplicatStage3.size() == 1 && ClassArrayHelpStage3.arrayListFinalStage3Player2.size() == 0) {
                    ClassArrayHelpStage3.arrayListFinalStage3Player2.add(ClassArrayHelpStage3.arrayListDuplicatStage3.get(0));
                }
                if(ClassArrayHelpStage3.arrayListDuplicatStage3.size() == 1 || ClassArrayHelpStage3.arrayListDuplicatStage3.size() == 0 ) {
                Intent intent = new Intent(Stage3Player2.this, ResultActivityStage3.class);
                startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), R.string.challengePlayer2, Toast.LENGTH_SHORT).show();
                }
            }

        });


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
}
