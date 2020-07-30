package net.learn2develop.triangle.StageThree;

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

public class Stage3Player1 extends AppCompatActivity {

    private ArrayAdapter adapter;

    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3_player1);

        TextView infoStage3Player1 = findViewById(R.id.infoStage2Player1);

        Button buttonFinalOneS3 = findViewById(R.id.buttonFinalOneS3);

        final ListView listViewPlayerOneStage3 = findViewById(R.id.listViewPlayerOneStage3);

        adapter = new ArrayAdapter(Stage3Player1.this, R.layout.custom_listview_stage1,  ClassArrayHelpStage3.arrayListStage3);
        listViewPlayerOneStage3.setAdapter(adapter);



        listViewPlayerOneStage3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                listViewPlayerOneStage3.setEnabled(false);
                if (ClassArrayHelpStage3.arrayListStage3.size() > 2) {
                    listViewPlayerOneStage3.setEnabled(true);
                }

                if (  ClassArrayHelpStage3.arrayListStage3.size() > 1) {

                    anim = AnimationUtils.loadAnimation(Stage3Player1.this, R.anim.my_anim2);
                    listViewPlayerOneStage3.getChildAt(position).startAnimation(anim);

                    parent.postDelayed(new Runnable() {
                        public void run() {
                            try {
                                ClassArrayHelpStage3.arrayListStage3.remove(position);
                                adapter.notifyDataSetChanged();
                            }catch (IndexOutOfBoundsException ex){}

                        }
                    }, 500);


                } else if (  ClassArrayHelpStage3.arrayListStage3.size() == 1) {
                    Toast.makeText(getApplicationContext(), R.string.selectPlayer2, Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonFinalOneS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (  ClassArrayHelpStage3.arrayListStage3.size() == 1 && ClassArrayHelpStage3.arrayListFinalStage3.size() == 0) {
                    ClassArrayHelpStage3.arrayListFinalStage3.add(  ClassArrayHelpStage3.arrayListStage3.get(0));
                }
                if(ClassArrayHelpStage3.arrayListStage3.size() == 1 || ClassArrayHelpStage3.arrayListStage3.size() == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Stage3Player1.this);
                    builder.setTitle(R.string.attention)
                            .setMessage(R.string.warning)
                            .setCancelable(false)
                            .setNegativeButton(R.string.toBegin,
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(Stage3Player1.this, Stage3Player2.class);
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
