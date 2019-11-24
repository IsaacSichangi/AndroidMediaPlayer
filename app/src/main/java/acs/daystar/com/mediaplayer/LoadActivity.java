package acs.daystar.com.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoadActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        editText = findViewById(R.id.url_edittext);
        button = findViewById(R.id.load_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().length() == 0){

                    Toast.makeText(getApplicationContext(), "input a media url", Toast.LENGTH_LONG);

                }else{

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("url", editText.getText().toString());
                    startActivity(intent);


                }


            }
        });


    }
}
