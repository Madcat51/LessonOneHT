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
    TextView textView;
    EditText editText;
    Button buttonlog;
    Button buttonnext;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intsec = new Intent(this, SecondActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        buttonlog = (Button) findViewById(R.id.button);
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        textView.setText("Программа запустилась;");
        buttonnext = (Button) findViewById(R.id.buttonNextActivity);


        buttonlog.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        textView.setText(textView.getText() + "\nВы нажали 'просто кнопку';");
                        break;
                    case MotionEvent.ACTION_UP:
                        textView.setText(textView.getText() + "\nВы отпустили 'просто кнопку';");
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

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) //Line A
            {
                if (isChecked) {
                    textView.setText(textView.getText() + "\nSwitch включен;");
                } else {
                    textView.setText(textView.getText() + "\nSwitch выключен;");
                }
            }
        });


    }
}


