package gunjika.varshney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etOne,etTwo;
    Button btncalc;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etOne=findViewById(R.id.et_first);
        etTwo=findViewById(R.id.et_second);
        btncalc=findViewById(R.id.btn_add);
        result=findViewById(R.id.btn_add);
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=etOne.getText().toString();
                int a =Integer.parseInt(etOne.getText().toString().trim());
                int b =Integer.parseInt(etTwo.getText().toString().trim());
               // Toast.makeText(MainActivity.this, a+b +"", Toast.LENGTH_SHORT).show();
                result.setText(Integer.toString(a+b));
            }
        });
    }
}
