package harold.delecerna.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText eFirstNum, eSecNum;
    Button bPlus, bMinus, bMultiply, bDivide, bClear, bExit;
    TextView textResult;
    String fNumber, sNumber;
    Operations mOperation = new Operations();
    double n1=0 , n2=0 , result =0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        eFirstNum = (EditText) findViewById(R.id.fNum);
        eSecNum = (EditText) findViewById(R.id.lNum);
        textResult = (TextView) findViewById(R.id.tAnswer);
        bPlus = (Button) findViewById(R.id.btnPlus);
        bMinus = (Button) findViewById(R.id.btnSub);
        bMultiply = (Button) findViewById(R.id.btnMultiply);
        bDivide = (Button) findViewById(R.id.btnDiv);
        bClear = (Button) findViewById(R.id.btnClear);
        bExit = (Button) findViewById(R.id.btnExit);
        bPlus.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        fNumber = eFirstNum.getText().toString();
        sNumber = eSecNum.getText().toString();

        n1 = Double.parseDouble(fNumber);
        n2 = Double.parseDouble(sNumber);

        result = mOperation.add(n1, n2);
        String answer = String.format("%,.2f",result);
        textResult.setText(answer);
    }
    public void Subtract (View view){
        fNumber = eFirstNum.getText().toString();
        sNumber = eSecNum.getText().toString();

        n1 = Double.parseDouble(fNumber);
        n2 = Double.parseDouble(sNumber);

        result = mOperation.sub(n1, n2);
        String answer = String.format("%,.2f",result);
        textResult.setText(answer);

    }
    public void Multiply (View view){
        fNumber = eFirstNum.getText().toString();
        sNumber = eSecNum.getText().toString();

        n1 = Double.parseDouble(fNumber);
        n2 = Double.parseDouble(sNumber);

        result = mOperation.multiply(n1, n2);
        String answer = String.format("%,.2f",result);
        textResult.setText(answer);

    }
    public void Divide (View view){
        fNumber = eFirstNum.getText().toString();
        sNumber = eSecNum.getText().toString();

        n1 = Double.parseDouble(fNumber);
        n2 = Double.parseDouble(sNumber);

        result = mOperation.divide(n1, n2);
        String answer = String.format("%,.2f",result);
        textResult.setText(answer);

    }
    public void Clear (View view){
        textResult.setText("0");
        eFirstNum.setText(" ");
        eSecNum.setText(" ");

    }
    public void Exit (View view){
        finish();
        System.exit(0);
    }
}
