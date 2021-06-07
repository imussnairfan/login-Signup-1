package com.example.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity2 extends AppCompatActivity {

    TextView signup_pg_login_txt,signup_pg_signup_txt;
    EditText signup_pg_email_ed_txt,signup_pg_pass_ed_txt,signup_pg_pass_con_ed_txt;
    CheckBox signup_pg_checkbox;
    Button signup_pg_signup_reg_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signup_pg_login_txt = findViewById(R.id.signup_page_login_go_btn_txt);
        signup_pg_signup_txt = findViewById(R.id.signup_page_signup_go_btn_txt);
        signup_pg_email_ed_txt = findViewById(R.id.signup_emial_id);
        signup_pg_pass_ed_txt = findViewById(R.id.signup_passwrod_id);
        signup_pg_pass_con_ed_txt =findViewById(R.id.signup_passwrod_conf_id);
        signup_pg_checkbox = findViewById(R.id.signup_checkBox);
        signup_pg_signup_reg_btn = findViewById(R.id.signup_register_open);

        Animation start_signup_pg_login_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_login_txt);
        signup_pg_login_txt.startAnimation(start_signup_pg_login_txt);
        Animation start_signup_pg_signup_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_signup_txt);
        signup_pg_signup_txt.startAnimation(start_signup_pg_signup_txt);
        Animation start_signup_pg_email_ed_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_email_ed_txt);
        signup_pg_email_ed_txt.startAnimation(start_signup_pg_email_ed_txt);
        Animation start_signup_pg_pass_ed_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_pass_ed_txt);
        signup_pg_pass_ed_txt.startAnimation(start_signup_pg_pass_ed_txt);
        Animation start_signup_pg_pass_con_ed_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_pass_conf_ed_txt);
        signup_pg_pass_con_ed_txt.startAnimation(start_signup_pg_pass_con_ed_txt);
        Animation start_sinup_pg_checkbox = AnimationUtils.loadAnimation(this,R.anim.signup_pg_checkbox_btn);
        signup_pg_checkbox.startAnimation(start_sinup_pg_checkbox);
        Animation start_signup_pg_signup_reg_btn = AnimationUtils.loadAnimation(this,R.anim.signup_pg_signup_reg_btn);
        signup_pg_signup_reg_btn.startAnimation(start_signup_pg_signup_reg_btn);
    }

    public void Signup_page_to_signup_page(View v)
    {
        Toast.makeText(this, "You are already on the signup page", Toast.LENGTH_SHORT).show();
    }

    public void Signup_page_to_login_page(View v)
    {
        Intent open_login = new Intent(this,MainActivity.class);
        startActivity(open_login);
        finish();
    }

    public void Signup_page_Signup_register_open(View v)
    {
        Toast.makeText(this,"This is just a test signup button",Toast.LENGTH_SHORT).show();
    }

}