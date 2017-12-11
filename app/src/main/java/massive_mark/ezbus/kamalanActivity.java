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

public class kamalanActivity extends AppCompatActivity {
    protected Context context;
    protected List<Map<String, Object>> datalist1;
    protected ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamalan);

        context = this;
        listView1 = (ListView)findViewById(R.id.listView1);
        datalist1 = new ArrayList<Map<String, Object>>();

        SimpleAdapter adapter = new SimpleAdapter(
                context,
                getData(),
                R.layout.row,
                new String[]{"title_all","call_all","address_all","photo_all"},
                new int[]{R.id.row1,R.id.row2,R.id.row3,R.id.station_photo}
        );
        listView1.setAdapter(adapter);
    }

    private List<Map<String, Object>> getData(){
        String[] title =new String[]{
                "羅東轉運站",
                "宜蘭轉運站",
                "礁溪轉運站",
                "科技大樓站",
                "台北轉運站",
                "萬華車站",
                "板橋轉運站"
        };
        String[] call = new String[]{
                "03-956-6198",
                "03-938-5655",
                "02-978-6739",
                "02-2705-2881",
                "02-2550-4668",
                "02-2550-4668",
                "02-8968-1668"
        };
        String[] address = new String[]{
                "宜蘭縣羅東鎮傳藝路三段229號",
                "宜蘭縣宜蘭市校舍路190號",
                "宜蘭縣礁溪鄉礁溪路6段17號",
                "台北市復興南路二段202號",
                "台北市大同區市民大道一段209號",
                "台北市萬華區艋舺大道174號",
                "新北市板橋區新店路66-1號"
        };
        int[] photo = new int[]{
                R.drawable.luodong,
                R.drawable.ilan,
                R.drawable.jiaoshi,
                R.drawable.tech_build,
                R.drawable.taipei_station,
                R.drawable.wanhua,
                R.drawable.newtaipei_station
        };

        for(int i=0;i<title.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title_all",title[i]);
            map.put("call_all",call[i]);
            map.put("address_all",address[i]);
            map.put("photo_all",photo[i]);
            datalist1.add(map);
        }


        return datalist1;
    }

}
