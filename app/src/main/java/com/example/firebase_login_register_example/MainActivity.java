package com.example.firebase_login_register_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private TextView tv_idToken, tv_email, tv_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        Intent intent = getIntent();
        String idToken = intent.getStringExtra("idToken");
        String email = intent.getStringExtra("email_id");
        String pw = intent.getStringExtra("pw");

        tv_idToken = findViewById(R.id.tv_idToken);
        tv_email = findViewById(R.id.tv_email);
        tv_pw = findViewById(R.id.tv_pw);

        tv_idToken.setText(idToken);
        tv_email.setText(email);
        tv_pw.setText(pw);

        findViewById(R.id.btn_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut(); // Logout

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

                finish();
            }
        });

//        firebaseAuth.getCurrentUser().delete(); // 탈퇴처리
        /*
        Firebase Authentication에서 해당 정보 삭제됨
         */
    }
}