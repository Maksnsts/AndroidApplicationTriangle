package net.learn2develop.triangle.StageTwo;

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

public class Stage2Player2 extends AppCompatActivity {

    private ArrayAdapter adapter;

    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_player_two);

        TextView infoStage2Player2 = findViewById(R.id.infoStage2Player2);
        Button buttonFinalTwo = findViewById(R.id.buttonFinalTwo);

        final ListView listViewSecondTwoPlayer = findViewById(R.id.listViewPlayerTwoStage2);

        adapter = new ArrayAdapter(Stage2Player2.this, R.layout.custom_listview_stage1, ClassArrayHelpStage2.arrayListDuplicatStage2);
        listViewSecondTwoPlayer.setAdapter(adapter);

        listViewSecondTwoPlayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                listViewSecondTwoPlayer.setEnabled(false);
                if (ClassArrayHelpStage2.arrayListDuplicatStage2.size() > 2) {
                listViewSecondTwoPlayer.setEnabled(true);
                }

                if (ClassArrayHelpStage2.arrayListDuplicatStage2.size() > 1) {

                    anim = AnimationUtils.loadAnimation(Stage2Player2.this, R.anim.my_anim);
                    listViewSecondTwoPlayer.getChildAt(position).startAnimation(anim);

                    parent.postDelayed(new Runnable() {
                        public void run() {
                            try{
                            ClassArrayHelpStage2.arrayListDuplicatStage2.remove(position);
                            adapter.notifyDataSetChanged();
                        }catch (IndexOutOfBoundsException ex){
                        }
                        }
                    }, 500);


                } else if (ClassArrayHelpStage2.arrayListDuplicatStage2.size() == 1) {
                    Toast.makeText(getApplicationContext(), R.string.ToastResult, Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonFinalTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ClassArrayHelpStage2.arrayListDuplicatStage2.size() == 1 && ClassArrayHelpStage2.arrayListFinalStage2.size() == 1) {
                    ClassArrayHelpStage2.arrayListFinalStage2Player2.add(ClassArrayHelpStage2.arrayListDuplicatStage2.get(0));
                }
                if(ClassArrayHelpStage2.arrayListDuplicatStage2.size() == 1 || ClassArrayHelpStage2.arrayListDuplicatStage2.size() == 0) {
                    Intent intent = new Intent(Stage2Player2.this, ResultActivityStage2.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), R.string.challengePlayer2 , Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
}
