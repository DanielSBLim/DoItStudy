package myborad.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button type의 startBtn를 R.id.startBtn를 찾아 선언한다.
        Button startBtn = findViewById(R.id.startBtn);

        //Button를 클릭하는 메소드를 선언한다.
        startBtn.setOnClickListener(new View.OnClickListener() {

            //선언한 내역을 원래 내역에 대입한다.
            @Override
            public void onClick (View v) {

                // 팝업을 만들게 하고 text "시작버튼이 눌렸어오"를 출력한다.
                Toast.makeText(getApplicationContext(), "시작버튼이 눌렸어요.",
                        Toast.LENGTH_LONG).show();
            }
        });

        Button start02Btn = findViewById(R.id.start02Btn);
        start02Btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick (View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://m.naver.com"));
                startActivity(myIntent);
            }
        });
    }

}
