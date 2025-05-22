package com.example.trabalhopelegrin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MemberDetailActivity extends AppCompatActivity {

    private TextView txtName, txtRa;
    private ImageView imgMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_detail);

        txtName = findViewById(R.id.txtDetailName);
        txtRa = findViewById(R.id.txtDetailRa);
        imgMember = findViewById(R.id.imgDetailMember);

        String name = getIntent().getStringExtra("name");
        String ra = getIntent().getStringExtra("ra");
        int image = getIntent().getIntExtra("image", 0);

        txtName.setText(name);
        txtRa.setText(ra);
        imgMember.setImageResource(image);
    }
}