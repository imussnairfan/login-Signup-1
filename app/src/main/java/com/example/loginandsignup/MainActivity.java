package com.example.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView login_pg_login_txt,login_pg_signup_txt;
    EditText login_pg_email_ed_txt,login_pg_pass_ed_txt;
    CheckBox login_pg_checkbox;
    Button login_pg_login_reg_btn;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_pg_login_txt = findViewById(R.id.login_page_login_go_btn_txt);
        login_pg_signup_txt = findViewById(R.id.login_page_signup_go_btn_txt);
        login_pg_email_ed_txt = findViewById(R.id.login_email_id);
        login_pg_pass_ed_txt = findViewById(R.id.login_passwrod_id);
        login_pg_checkbox = findViewById(R.id.login_checkBox);
        login_pg_login_reg_btn = findViewById(R.id.login_register_open);

        Animation start_login_pg_login_txt = AnimationUtils.loadAnimation(this,R.anim.login_pg_login_txt);
        login_pg_login_txt.startAnimation(start_login_pg_login_txt);
        Animation start_login_pg_signup_txt = AnimationUtils.loadAnimation(this,R.anim.login_pg_signup_txt);
        login_pg_signup_txt.startAnimation(start_login_pg_signup_txt);
        Animation start_login_pg_emial_ed_txt = AnimationUtils.loadAnimation(this,R.anim.login_pg_email_ed_txt);
        login_pg_email_ed_txt.startAnimation(start_login_pg_emial_ed_txt);
        Animation start_login_pg_pass_ed_txt = AnimationUtils.loadAnimation(this,R.anim.login_pg_pass_ed_txt);
        login_pg_pass_ed_txt.startAnimation(start_login_pg_pass_ed_txt);
        Animation start_login_pg_checkbox = AnimationUtils.loadAnimation(this,R.anim.login_pg_checbox_btn);
        login_pg_checkbox.startAnimation(start_login_pg_checkbox);
        Animation start_login_pg_login_reg_btn = AnimationUtils.loadAnimation(this,R.anim.login_pg_login_reg_btn);
        login_pg_login_reg_btn.startAnimation(start_login_pg_login_reg_btn);

    }

    public void Login_page_to_login_page(View v)
    {
        Toast.makeText(this, "You are already on the login page", Toast.LENGTH_SHORT).show();
    }

    public void Login_page_to_Signup_page(View v)
    {
        Intent open_signup = new Intent(this, MainActivity2.class);
        startActivity(open_signup);
        finish();
    }

    public void Login_page_login_resgister_open(View v)
    {
        Toast.makeText(this, "This is just a test login button", Toast.LENGTH_SHORT).show();
    }

}