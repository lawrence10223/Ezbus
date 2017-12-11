package massive_mark.ezbus;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mtcActivity extends AppCompatActivity {
    protected Context context;
    protected List<Map<String, Object>> datalist4;
    protected ListView listView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtc);

        context = this;
        listView4 = (ListView)findViewById(R.id.listView4);
        datalist4 = new ArrayList<Map<String, Object>>();

        SimpleAdapter adapter = new SimpleAdapter(
                context,
                getData(),
                R.layout.row,
                new String[]{"title_all","call_all","address_all","photo_all"},
                new int[]{R.id.row1,R.id.row2,R.id.row3,R.id.station_photo}
        );
        listView4.setAdapter(adapter);
    }


    private List<Map<String, Object>> getData(){

        String[] title = new String[]{
                "羅東轉運站",
                "蘇澳站",
                "大坪林站"
        };
        String[] call = new String[]{
                "03-957-3952",
                "03-995-5607",
                "02-8914-5036"
        };
        String[] address = new String[]{
                "宜蘭縣羅東鎮傳藝路三段229號",
                "宜蘭縣蘇澳鎮太平路5號",
                "新北市新店區北新路三段220號"
        };
        int [] photo = new int[]{
                R.drawable.luodong,
                R.drawable.suao,
                R.drawable.dapinglin
        };
        for(int i=0;i<title.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title_all",title[i]);
            map.put("call_all",call[i]);
            map.put("address_all",address[i]);
            map.put("photo_all",photo[i]);
            datalist4.add(map);
        }
        return datalist4;
    }
}
