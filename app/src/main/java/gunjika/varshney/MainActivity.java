package gunjika.varshney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etOne,etTwo;
    Button btncalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etOne=findViewById(R.id.et_first);
        etTwo=findViewById(R.id.et_second);
        btncalc=findViewById(R.id.btn_calc);
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=etOne.getText().toString();
                Int a =Integer.parseInt(etOne.getText().toString().trim());
                Int b =Integer.parseInt(etTwo.getText().toString().trim());
                Toast.makeText(MainActivity.this, a+b +"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
