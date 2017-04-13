package benignstar.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView result=(TextView)findViewById(R.id.text_result);
        Button butSecond=(Button)findViewById(R.id.but_second);
        butSecond.setOnClickListener(butSecondHandler);

        Intent intent = getIntent();
        name=intent.getStringExtra("name");
        tel=intent.getStringExtra("tel");
        result.setText("성명 : "+name+"\n전화번호 : "+tel);
    }

    View.OnClickListener butSecondHandler= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
