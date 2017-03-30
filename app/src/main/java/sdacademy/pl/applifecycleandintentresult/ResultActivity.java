package sdacademy.pl.applifecycleandintentresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    protected EditText editText;

    @OnClick(R.id.buttonFinish)
    protected void finishClicked() {
        Intent returnIntent = new Intent();

        //umieszczam dodatkowe informacje (zawartosc text fielda)
        returnIntent.putExtra("resultString", editText.getText().toString());

        //ustawiam wynik/result tego Activity podajac równiez intent jako
        //zwracana wartosc
        setResult(RESULT_OK, returnIntent);
        //zamyka sie to activity, powraca do
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
}
