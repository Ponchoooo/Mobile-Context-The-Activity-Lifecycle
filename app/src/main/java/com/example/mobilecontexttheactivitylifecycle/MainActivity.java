package com.example.mobilecontexttheactivitylifecycle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) getSupportActionBar().setTitle("ID: 1234567");

        TextView tv = findViewById(R.id.tvDepartment);
        Button btn = findViewById(R.id.btnChangeName);

        tv.setText("Department of Computer, Information Sciences, and Mathematics");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                tv.setText("Angie M. Ceniza-Canillo");
            }
        });
    }
}