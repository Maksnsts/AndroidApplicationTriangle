package net.learn2develop.triangle.StageFive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.learn2develop.triangle.R;

public class FiveActivityInstruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_instuction);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_6);

        TextView instuctionStage5 = findViewById(R.id.instuctionStage5);
        Button buttonReadyStage5 = findViewById(R.id.buttonReadyStage5);

        instuctionStage5.setText(R.string.TextInstruction5 );


        buttonReadyStage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FiveActivityInstruction.this, Stage5.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), R.string.StopBack, Toast.LENGTH_SHORT).show();
    }
}
