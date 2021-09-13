package site.madcat.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button buttonAuth;
    Button buttonBack;
    Button buttonprevAct;
    CalendarView calendarView;
    LinearLayout layout1;
    LinearLayout layout2;
    TextView textView;
    EditText textFirstName;
    EditText textSecondName;
    EditText textPhone;
    EditText textPinCode;
    EditText textMail;
    EditText textPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonAuth = (Button) findViewById(R.id.buttonAuth);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonprevAct = (Button) findViewById(R.id.buttonPrevActivity);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        textView = (TextView) findViewById(R.id.textView2);
        textFirstName = (EditText) findViewById(R.id.editTextFirstName);
        textSecondName = (EditText) findViewById(R.id.editTextSecondName);
        textPhone = (EditText) findViewById(R.id.editTextPhone);
        textPinCode = (EditText) findViewById(R.id.editTextPInCode);
        textMail = (EditText) findViewById(R.id.editTextEmailAddress);
        textPass = (EditText) findViewById(R.id.editTextPassword);

        buttonprevAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        buttonAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.VISIBLE);
                textView.setText("На предыдущем экране вы ввели:" +
                        "\n в поле Имя:" + textFirstName.getText() + "\n в поле Фамилия:"
                        + textSecondName.getText() + "\n в поле телефон:" + textPhone.getText() +
                        "\n в поле Pin Вашей карты:" + textPinCode.getText() + "\n в поле пароль - не скажу" +
                        "\n в поле email:" + textMail.getText());

            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setText("");
                layout2.setVisibility(View.INVISIBLE);
                layout1.setVisibility(View.VISIBLE);
            }
        });


    }
}