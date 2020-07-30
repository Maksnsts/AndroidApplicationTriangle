package net.learn2develop.triangle.StageOne;

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

import net.learn2develop.triangle.BackMusic.MyService;
import net.learn2develop.triangle.R;
import net.learn2develop.triangle.StageFive.ClassArrayHelpStage5;
import net.learn2develop.triangle.StageTwo.SecondActivityInstruction;

public class Stage1 extends AppCompatActivity {


    private ArrayAdapter<String> adapter;

    private static final String KEY_INDEX = "index";
    private static final String KEY_COUNTARRAYSTAGE5 = "array5";



    private int countKolejka = 0;
    private int countArrayStage5 = 0;


     Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_game);

        if(savedInstanceState != null){
            countKolejka = savedInstanceState.getInt(KEY_INDEX);
            countArrayStage5 = savedInstanceState.getInt(KEY_COUNTARRAYSTAGE5);
        }


        final TextView infoAboutPlayers = findViewById(R.id.infoAboutPlayers);
        final TextView infoAboutPlayers2 = findViewById(R.id.infoAboutPlayers2);
        final TextView infoGame = findViewById(R.id.infoGame);
        Button buttonStage2 = findViewById(R.id.buttonStage2);

        infoAboutPlayers.setText("1");
        infoAboutPlayers2.setText("");

        final ListView listViewFirstStage = findViewById(R.id.listViewFirstStage);


        adapter = new ArrayAdapter<>(Stage1.this, R.layout.custom_listview_stage1,ClassArrayStage1.arrayListFirstStage);
        listViewFirstStage.setAdapter(adapter);





            listViewFirstStage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                    listViewFirstStage.setEnabled(false);
                    if(ClassArrayStage1.arrayListFirstStage.size() > 2) {
                        listViewFirstStage.setEnabled(true);
                    }



                    countArrayStage5++;

                    countKolejka++;

                    // if(ClassArrayStage1.arrayListFirstStage.size() > 1) {

                        if (countArrayStage5 <= 4 && ClassArrayHelpStage5.arrayListFirstAsks5.size() <= 8) {
                            ClassArrayHelpStage5.arrayListFirstAsks5.add(ClassArrayStage1.arrayListFirstStage.get(position)); // position??
                        }


                        if (countKolejka % 2 == 0) {
                            anim = AnimationUtils.loadAnimation(Stage1.this, R.anim.my_anim);
                            listViewFirstStage.getChildAt(position).startAnimation(anim);
                        }
                        if (countKolejka % 2 != 0) {
                            anim = AnimationUtils.loadAnimation(Stage1.this, R.anim.my_anim2);
                            listViewFirstStage.getChildAt(position).startAnimation(anim);

                        }


                        parent.postDelayed(new Runnable() {
                            public void run() {
                                try {
                                    ClassArrayStage1.arrayListFirstStage.remove(position);
                                    adapter.notifyDataSetChanged();
                                } catch (IndexOutOfBoundsException ex) {
                                }

                            }
                        }, 500);




//                    } else if (ClassArrayStage1.arrayListFirstStage.size() == 1) {
//                        Toast.makeText(getApplicationContext(), R.string.Toast1Stage1, Toast.LENGTH_SHORT).show();
//                   }


                    if (countKolejka % 2 == 0) {
                        infoAboutPlayers.setText("1");
                        infoAboutPlayers2.setText("");
                    }
                    if (countKolejka % 2 != 0) {
                        infoAboutPlayers2.setText("2");
                        infoAboutPlayers.setText("");
                    }
                    if (countKolejka >= 6) {
                        infoAboutPlayers.setText("");
                        infoAboutPlayers2.setText("");
                    }

                    if (ClassArrayStage1.arrayListFirstStage.size() == 1) {
                        infoGame.setText(R.string.infoStage1);
                    }



                }


            });


        buttonStage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ClassArrayStage1.arrayListFirstStage.size() == 1) {
                    Intent intent = new Intent(Stage1.this, SecondActivityInstruction.class);
                    startActivity(intent);
                }else if(ClassArrayStage1.arrayListFirstStage.size() == 0) {
                    Intent intent = new Intent(Stage1.this, FirstActivityInstruction.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), R.string.Toast2Stage1, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
        stopService(new Intent(this, MyService.class));
    }

    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void onPause(){
        super.onPause();
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(KEY_INDEX, countKolejka);

        savedInstanceState.putInt(KEY_COUNTARRAYSTAGE5, countArrayStage5);



    }

    // android:screenOrientation="portrait"


    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        stopService(new Intent(this, MyService.class));
        super.onDestroy();
    }


}
