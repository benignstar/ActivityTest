package benignstar.kr.hs.emirim.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button butSecond=(Button)findViewById(R.id.but_second);
        butSecond.setOnClickListener(butSecondHandler);
    }

    View.OnClickListener butSecondHandler= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
