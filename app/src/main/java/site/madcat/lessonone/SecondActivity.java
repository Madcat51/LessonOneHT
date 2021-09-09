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
    Button button1;
    Button button2;
    Button buttonprevAct;
    CalendarView calendarView;
    LinearLayout layout1;
    LinearLayout layout2;
    TextView textView;
    EditText textText;
    EditText textPersonal;
    EditText textPhone;
    EditText textNumber;
    EditText textMail;
    EditText textPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        buttonprevAct = (Button) findViewById(R.id.buttonPrevActivity);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        textView = (TextView) findViewById(R.id.textView2);
        textText = (EditText) findViewById(R.id.editTextSecActiv);
        textPersonal = (EditText) findViewById(R.id.editTextTextPersonName2);
        textPhone = (EditText) findViewById(R.id.editTextPhone);
        textNumber = (EditText) findViewById(R.id.editTextNumber);
        textMail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        textPass = (EditText) findViewById(R.id.editTextTextPassword);

        buttonprevAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.VISIBLE);
                textView.setText("На предыдущем экране вы ввели:" +
                        "\n в поле текст:" + textText.getText() + "\n в поле textPersonName:"
                        + textPersonal.getText() + "\n в поле телефон:" + textPhone.getText() +
                        "\n в поле число:" + textNumber.getText() + "\n в поле пароль - не скажу" +
                        "\n в поле email:" + textMail.getText());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setText("");
                layout2.setVisibility(View.INVISIBLE);
                layout1.setVisibility(View.VISIBLE);
            }
        });


    }
}