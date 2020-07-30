package net.learn2develop.triangle.StageFour;

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
import net.learn2develop.triangle.StageFive.ClassArrayHelpStage5;
import net.learn2develop.triangle.StageFive.FiveActivityInstruction;

public class Stage4 extends AppCompatActivity {


    private ArrayAdapter<String> adapter;

    private static final String KEY_INDEX = "index";
    private static final String KEY_COUNTARRAYSTAGE5 = "array5";

    private int countKolejka = 0;
    private int countArrayStage5 = 0;

    Animation anim = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage4);

        if(savedInstanceState != null){
            countKolejka = savedInstanceState.getInt(KEY_INDEX);
            countArrayStage5 = savedInstanceState.getInt(KEY_COUNTARRAYSTAGE5);
        }

        final TextView infoAboutPlayers = findViewById(R.id.infoAboutPlayers);
        final TextView infoAboutPlayers2 = findViewById(R.id.infoAboutPlayers2);
        final TextView infoGame = findViewById(R.id.infoGame);
        Button buttonStage5 = findViewById(R.id.buttonStage5);

        final ListView listViewStage4 = findViewById(R.id.listViewStage4);


        adapter = new ArrayAdapter<>(Stage4.this, R.layout.custom_listview_stage1,ClassArrayStage4.arrayListStage4);
        listViewStage4.setAdapter(adapter);


        listViewStage4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                listViewStage4.setEnabled(false);


                countArrayStage5++;
                countKolejka++;

                if(ClassArrayStage4.arrayListStage4.size() > 1) {

                    if(countArrayStage5 <= 4 && ClassArrayHelpStage5.arrayListFirstAsks5.size() <= 8) {
                        ClassArrayHelpStage5.arrayListFirstAsks5.add(ClassArrayStage4.arrayListStage4.get(position)); // position??
                    }

                    if(countKolejka%2 == 0) {
                        anim = AnimationUtils.loadAnimation(Stage4.this, R.anim.my_anim);
                        listViewStage4.getChildAt(position).startAnimation(anim);
                    }if(countKolejka%2 != 0) {
                        anim = AnimationUtils.loadAnimation(Stage4.this, R.anim.my_anim2);
                        listViewStage4.getChildAt(position).startAnimation(anim);

                    }


                    parent.postDelayed(new Runnable() {
                        public synchronized void run() {
                            try {
                                ClassArrayStage4.arrayListStage4.remove(position);
                                adapter.notifyDataSetChanged();
                            }catch (IndexOutOfBoundsException ex){

                            }
                            }
                    }, 500);


                    // Bot //
                    int countBot = (int) (Math.random()*ClassArrayStage4.arrayListStage4.size());
                    if(countBot > 2){

                        final int bot = (int) (Math.random()*ClassArrayStage4.arrayListStage4.size());

                        if(bot != position) {
                        anim = AnimationUtils.loadAnimation(Stage4.this, R.anim.my_anim_bot);
                            listViewStage4.getChildAt(bot).startAnimation(anim);


                        parent.postDelayed(new Runnable() {
                            public synchronized void run() {
                                try {
                                ClassArrayStage4.arrayListStage4.remove(bot);
                                adapter.notifyDataSetChanged();

                                } catch (IndexOutOfBoundsException ignored) {
                                }

                            }


                        }, 500);}

                    }
                    //Bot//



                }else if(ClassArrayStage4.arrayListStage4.size() == 1){
                    Toast.makeText(getApplicationContext(), R.string.Toast1Stage1, Toast.LENGTH_SHORT).show();
                }



                if(countKolejka%2 == 0){
                    infoAboutPlayers.setText("1");
                    infoAboutPlayers2.setText("");
                }
                if(countKolejka%2 != 0) {
                    infoAboutPlayers2.setText("2");
                    infoAboutPlayers.setText("");
                }
                if(ClassArrayStage4.arrayListStage4.size() == 1){
                    infoAboutPlayers.setText("");
                    infoAboutPlayers2.setText("");
                    infoGame.setText(R.string.infoStage1);
                }


                if (ClassArrayStage4.arrayListStage4.size() > 2) {
                    listViewStage4.setEnabled(true);
                }



            }
        });

        buttonStage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ClassArrayStage4.arrayListStage4.size() == 1) {
                    Intent intent = new Intent(Stage4.this, FiveActivityInstruction.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), R.string.Toast2Stage4, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void bot(){

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
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
        super.onDestroy();
    }


}
