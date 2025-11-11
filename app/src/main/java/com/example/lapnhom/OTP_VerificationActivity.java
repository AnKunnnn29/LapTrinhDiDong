package com.example.lapnhom;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OTP_VerificationActivity extends AppCompatActivity {

    private EditText etOtp;
    private Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        etOtp = findViewById(R.id.et_otp);
        btnVerify = findViewById(R.id.btn_verify);

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otp = etOtp.getText().toString().trim();

                if (TextUtils.isEmpty(otp)) {
                    Toast.makeText(OTP_VerificationActivity.this, "Please enter the OTP", Toast.LENGTH_SHORT).show();
                    return;
                }

                // TODO: Implement OTP verification logic here

                Toast.makeText(OTP_VerificationActivity.this, "OTP verified successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(OTP_VerificationActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
