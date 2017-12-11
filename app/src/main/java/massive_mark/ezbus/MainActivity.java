package massive_mark.ezbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView kama,capa,kuo,metro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void View_1(View view){
        Intent intent1 = new Intent(MainActivity.this,kamalanActivity.class);
        startActivity(intent1);
    }
    public void View_2(View view){
        Intent intent2 = new Intent(MainActivity.this,capitalActivity.class);
        startActivity(intent2);
    }
    public void View_3(View view){
        Intent intent3 = new Intent(MainActivity.this,kuokuangActivity.class);
        startActivity(intent3);
    }
    public void View_4(View view){
        Intent intent4 = new Intent(MainActivity.this,mtcActivity.class);
        startActivity(intent4);
    }
}
