package net.learn2develop.triangle.StageTwo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

public class Stage2Player1 extends AppCompatActivity {

    private ArrayAdapter adapter;

    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_player_one);

        TextView infoStage2Player1 = findViewById(R.id.infoStage2Player1);

        Button buttonFinalOne = findViewById(R.id.buttonFinalOne);

        final ListView listViewSecondOnePlayer = findViewById(R.id.listViewPlayerOneStage2);


        adapter = new ArrayAdapter(Stage2Player1.this, R.layout.custom_listview_stage1,   ClassArrayHelpStage2.arrayListStage2);
        listViewSecondOnePlayer.setAdapter(adapter);



            listViewSecondOnePlayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                    listViewSecondOnePlayer.setEnabled(false);
                    if(ClassArrayHelpStage2.arrayListStage2.size() > 2) {
                        listViewSecondOnePlayer.setEnabled(true);
                    }


                    if (ClassArrayHelpStage2.arrayListStage2.size() > 1) {

                        anim = AnimationUtils.loadAnimation(Stage2Player1.this, R.anim.my_anim2);
                        listViewSecondOnePlayer.getChildAt(position).startAnimation(anim);

                        parent.postDelayed(new Runnable() {
                            public void run() {
                                try{
                        ClassArrayHelpStage2.arrayListStage2.remove(position);
                        adapter.notifyDataSetChanged();
                            }catch (IndexOutOfBoundsException ex){
                            }
                            }
                        }, 500);
                    } else if (ClassArrayHelpStage2.arrayListStage2.size() == 1) {
                        Toast.makeText(getApplicationContext(), R.string.ToastStage2, Toast.LENGTH_SHORT).show();
                    }

                }
            });




            buttonFinalOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ClassArrayHelpStage2.arrayListStage2.size() == 1 && ClassArrayHelpStage2.arrayListFinalStage2.size() == 0) {
                        ClassArrayHelpStage2.arrayListFinalStage2.add(ClassArrayHelpStage2.arrayListStage2.get(0));
                    }
                    if (ClassArrayHelpStage2.arrayListStage2.size() == 1 || ClassArrayHelpStage2.arrayListStage2.size() == 0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Stage2Player1.this);
                        builder.setTitle(R.string.attention)
                                .setMessage(R.string.warning)
                                .setCancelable(false)
                                .setNegativeButton(R.string.toBegin,
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(Stage2Player1.this, Stage2Player2.class);
                                                startActivity(intent);
                                            }
                                        });
                        AlertDialog alert = builder.create();
                        alert.show();


                    }else {
                        Toast.makeText(getApplicationContext(), R.string.challengePlayer1, Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
    }

