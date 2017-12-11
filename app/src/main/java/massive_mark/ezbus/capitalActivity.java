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

public class capitalActivity extends AppCompatActivity {
    protected Context context;
    protected List<Map<String, Object>> datalist2;
    protected ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        context = this;
        listView2 = (ListView)findViewById(R.id.listView2);
        datalist2 = new ArrayList<Map<String, Object>>();

        SimpleAdapter adapter = new SimpleAdapter(
                context,
                getData(),
                R.layout.row,
                new String[]{"title_all","call_all","address_all","photo_all"},
                new int[]{R.id.row1,R.id.row2,R.id.row3,R.id.station_photo}
        );
        listView2.setAdapter(adapter);
    }


    private List<Map<String, Object>> getData(){
        String[] title = new String[]{
                "羅東轉運站",
                "宜蘭轉運站",
                "礁溪轉運站",
                "市府轉運站",
                "基隆站"
        };
        String[] call = new String[]{
                "03-955-6585",
                "03-937-4171",
                "02-988-0700",
                "02-2758-0868",
                "02-2422-2624"
        };
        String[] address = new String[]{
                "宜蘭縣羅東鎮傳藝路三段229號",
                "宜蘭縣宜蘭市校舍路190號",
                "宜蘭縣礁溪鄉礁溪路6段17號",
                "台北市復忠孝東路5段6號",
                "基隆市仁愛區港西街3號"
        };
        int[] photo = new int[]{
                R.drawable.luodong,
                R.drawable.ilan,
                R.drawable.jiaoshi,
                R.drawable.taipei_hall,
                R.drawable.keelung
        };
        for(int i=0;i<title.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title_all",title[i]);
            map.put("call_all",call[i]);
            map.put("address_all",address[i]);
            map.put("photo_all",photo[i]);
            datalist2.add(map);
        }

        return datalist2;
    }
}
