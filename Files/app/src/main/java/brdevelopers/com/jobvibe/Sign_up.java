package brdevelopers.com.jobvibe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by End User on 27-03-2018.
 */

public class Sign_up extends AppCompatActivity implements TextWatcher{

    TextInputLayout til_password,til_cpassword;
    EditText et_password,et_cpassword,et_email;
    TextView tv_signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        til_password=findViewById(R.id.TIL_password);
        til_cpassword=findViewById(R.id.TIL_cpassword);
        et_password=findViewById(R.id.ET_password);
        et_cpassword=findViewById(R.id.ET_cpassword);
        tv_signupbtn=findViewById(R.id.TV_signbutton);
        et_email=findViewById(R.id.ET_email);

    }

    public void openProfile(View view)
    {
        Intent profile=new Intent(Sign_up.this,Profile.class);
        String email=et_email.getText().toString();
        String password=et_password.getText().toString();
        profile.putExtra("email",email);
        profile.putExtra("password",password);
        startActivity(profile);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        if(et_password.getText().length()>0){

        }
        else{

        }
    }
}
