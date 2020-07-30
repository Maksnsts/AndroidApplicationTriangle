package net.learn2develop.triangle.StageFive;

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

import net.learn2develop.triangle.FinalActivity;
import net.learn2develop.triangle.R;
import net.learn2develop.triangle.StageFour.ClassArrayStage4;
import net.learn2develop.triangle.StageFour.Stage4;
import net.learn2develop.triangle.StageThree.ClassArrayHelpStage3;

import java.util.ArrayList;

public class Stage5 extends AppCompatActivity {


    private ArrayAdapter adapter;

    private static final String KEY_INDEX = "index";

    private int countKolejka = 0;

    Animation anim = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage5);

        if(savedInstanceState != null){
            countKolejka = savedInstanceState.getInt(KEY_INDEX);
        }

        final TextView infoAboutPlayers = findViewById(R.id.infoAboutPlayers);
        final TextView infoAboutPlayers2 = findViewById(R.id.infoAboutPlayers2);
        final TextView infoGame = findViewById(R.id.infoGame);
        Button buttonStageFinal = findViewById(R.id.buttonStageFinal);

        final ListView listViewStage5 = findViewById(R.id.listViewStage5);


        adapter = new ArrayAdapter(Stage5.this, R.layout.custom_listview_stage1, ClassArrayHelpStage5.arrayListFirstAsks5);
        listViewStage5.setAdapter(adapter);
            //ClassArrayHelpStage5.arrayListFirstAsks5.size()


        listViewStage5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                listViewStage5.setEnabled(false);
                if (ClassArrayHelpStage5.arrayListFirstAsks5.size() > 2) {
                    listViewStage5.setEnabled(true);
                }

                countKolejka++;

                if( countKolejka == 6){
                    infoAboutPlayers.setText("");
                    infoAboutPlayers2.setText("");
                    infoGame.setText(R.string.Toast2Stage5);
                }
                if(countKolejka == 7){
                    infoAboutPlayers.setText("");
                    infoAboutPlayers2.setText("");
                    infoGame.setText(R.string.infoStage1);
                }

                if(ClassArrayHelpStage5.arrayListFirstAsks5.size() > 1) {

                    if(countKolejka%2 == 0) {
                        anim = AnimationUtils.loadAnimation(Stage5.this, R.anim.my_anim);
                        listViewStage5.getChildAt(position).startAnimation(anim);
                    }if(countKolejka%2 != 0) {
                        anim = AnimationUtils.loadAnimation(Stage5.this, R.anim.my_anim2);
                        listViewStage5.getChildAt(position).startAnimation(anim);

                    }

                    parent.postDelayed(new Runnable() {
                        public void run() {
                            try {
                                ClassArrayHelpStage5.arrayListFirstAsks5.remove(position);
                                adapter.notifyDataSetChanged();
                            }catch (IndexOutOfBoundsException ex){}
                        }
                    }, 500);


                }else if(ClassArrayHelpStage5.arrayListFirstAsks5.size() == 1){
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


            }
        });

        buttonStageFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ClassArrayHelpStage5.arrayListFirstAsks5.size() == 1) {
                    Intent intent = new Intent(Stage5.this, FinalActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), R.string.Toast3Stage5, Toast.LENGTH_SHORT).show();
                }

            }
        });
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
