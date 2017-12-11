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

public class kuokuangActivity extends AppCompatActivity {
    protected Context context;
    protected List<Map<String, Object>> datalist3;
    protected ListView listView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuokuang);

        context = this;
        listView3 = (ListView)findViewById(R.id.listView3);
        datalist3 = new ArrayList<Map<String, Object>>();

        SimpleAdapter adapter = new SimpleAdapter(
                context,
                getData(),
                R.layout.row,
                new String[]{"title_all","call_all","address_all","photo_all"},
                new int[]{R.id.row1,R.id.row2,R.id.row3,R.id.station_photo}
        );
        listView3.setAdapter(adapter);
    }


    private List<Map<String, Object>> getData(){

        String[] title = new String[]{
                "羅東轉運站",
                "宜蘭轉運站",
                "南港展覽館站",
                "圓山站",
                "頭城站"
        };
        String[] call = new String[]{
                "03-956-7505",
                "03-938-4171",
                "02-2783-9533",
                "02-2595-7385",
                "03-978-0013"
        };
        String[] address = new String[]{
                "宜蘭縣羅東鎮傳藝路三段229號",
                "宜蘭縣宜蘭市校舍路190號",
                "台北市南港區經貿二路1號",
                "台北市大同區酒泉街9-1號",
                "宜蘭縣頭城鎮青雲路三段199號"
        };
        int [] photo = new int[]{
                R.drawable.luodong,
                R.drawable.ilan,
                R.drawable.nangang,
                R.drawable.yuanshan,
                R.drawable.touchen
        };
        for(int i=0;i<title.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title_all",title[i]);
            map.put("call_all",call[i]);
            map.put("address_all",address[i]);
            map.put("photo_all",photo[i]);
            datalist3.add(map);
        }
        return datalist3;
    }
}
