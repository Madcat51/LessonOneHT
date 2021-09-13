package site.madcat.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewLog;
    Button buttonlog;
    Button buttonnext;
    Switch switchTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intsec = new Intent(this, SecondActivity.class);
        TextView textViewLog = (TextView) findViewById(R.id.textViewLog);
        EditText editText = (EditText) findViewById(R.id.editTextTest);
        buttonlog = (Button) findViewById(R.id.buttonSimply);
        Switch switchTest = (Switch) findViewById(R.id.switchTest);
        textViewLog.setText("Программа запустилась;");
        buttonnext = (Button) findViewById(R.id.buttonNextActivity);


        buttonlog.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        textViewLog.setText(textViewLog.getText() + "\nВы нажали 'просто кнопку';");
                        break;
                    case MotionEvent.ACTION_UP:
                        textViewLog.setText(textViewLog.getText() + "\nВы отпустили 'просто кнопку';");
                        break;
                }
                return false;
            }
        });


        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intsec);
            }
        });

        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) //Line A
            {
                if (isChecked) {
                    textViewLog.setText(textViewLog.getText() + "\nSwitch включен;");
                } else {
                    textViewLog.setText(textViewLog.getText() + "\nSwitch выключен;");
                }
            }
        });


    }
}


