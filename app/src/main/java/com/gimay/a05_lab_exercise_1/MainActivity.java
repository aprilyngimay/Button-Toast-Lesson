package com.gimay.a05_lab_exercise_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Variable Listener", Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Button Demo");

        Button ButtonText = findViewById(R.id.Button_Text);
        ImageButton imageButton = findViewById(R.id.Image_Button);
        Button imageButtonTextLeft = findViewById(R.id.Image_ButtonTextLeft);
        Button imageButtonTextRight = findViewById(R.id.Image_ButtonTextRight);

//        ButtonText.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Ordinary Button is clicked", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        imageButton.setOnClickListener(clickListener);
//        imageButtonTextLeft.setOnClickListener(clickListener);
        ButtonText.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        imageButtonTextLeft.setOnClickListener(this);
        imageButtonTextRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      //  Toast.makeText(this, "Activity Listener", Toast.LENGTH_LONG).show();
        int id = view.getId();

        switch (id){
            case R.id.Button_Text:
                Toast.makeText(this, "Button Text is clicked", Toast.LENGTH_LONG).show();
            break;

            case R.id.Image_Button:
                Toast.makeText(this, "Image Button is clicked", Toast.LENGTH_LONG).show();
            break;

            case R.id.Image_ButtonTextLeft:
                Toast.makeText(this, "Image Button Left is clicked", Toast.LENGTH_LONG).show();
            break;

            case R.id.Image_ButtonTextRight:
                Toast.makeText(this, "Image Button Right is clicked", Toast.LENGTH_LONG).show();
            break;
        }

    }
}
