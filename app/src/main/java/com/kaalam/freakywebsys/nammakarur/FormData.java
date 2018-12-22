package com.kaalam.freakywebsys.nammakarur;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class FormData extends AppCompatActivity {
      private Button male,female,create;
      public ConstraintLayout colorchange;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_data);

        male = (Button) findViewById(R.id.male);
        female = (Button) findViewById(R.id.female);
        create = (Button) findViewById(R.id.create);
        colorchange = (ConstraintLayout) findViewById(R.id.colorchange);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male.setBackgroundColor(Color.BLUE);
                colorchange.setBackgroundColor(Color.BLUE);
                female.setBackgroundColor(Color.WHITE);
                male.setTextColor(Color.WHITE);
                female.setTextColor(Color.BLACK);

            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                female.setBackgroundColor(Color.rgb(255,20,147));
                colorchange.setBackgroundColor(Color.rgb(255,20,147));
                male.setBackgroundColor(Color.WHITE);
                female.setTextColor(Color.WHITE);
                male.setTextColor(Color.BLACK);

            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormData.this,HomePage.class));
            }
        });

    }
}
