package com.example.tilek_shambetaliev_hw2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String textView_second_activity = getIntent().getStringExtra("key");
        ((TextView)findViewById(R.id.current_pol)).setText(textView_second_activity);

        findViewById(R.id.btn_all_close).setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            System.exit(1);
        });
    }
}
