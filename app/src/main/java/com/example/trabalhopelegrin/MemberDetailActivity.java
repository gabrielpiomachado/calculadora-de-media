package com.example.trabalhopelegrin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MemberDetailActivity extends AppCompatActivity {

    private TextView txtName, txtRole;
    private ImageView imgMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_detail);

        txtName = findViewById(R.id.txtDetailName);
        txtRole = findViewById(R.id.txtDetailRole);
        imgMember = findViewById(R.id.imgDetailMember);

        String name = getIntent().getStringExtra("name");
        String role = getIntent().getStringExtra("role");
        int image = getIntent().getIntExtra("image", 0);

        txtName.setText(name);
        txtRole.setText(role);
        imgMember.setImageResource(image);
    }
}