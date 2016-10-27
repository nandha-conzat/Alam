package rukina.alam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Nandha on 21-07-2016.
 */
public class CustomListActivity extends AppCompatActivity{

    ListView list;
    String[] itemname ={
            "Grill Chicken",
            "Thandoori",
            "Chicken Wraps",
            "Chicken Burger",
            "Fish Fries",
            "Pepper Chicken",
            "Chicken Chittinad",
            "Masala Chicken"
    };

    Integer[] imgid={
            R.drawable.grill_item,
            R.drawable.new_item,
            R.drawable.new_grill,
            R.drawable.grill_item,
            R.drawable.new_item,
            R.drawable.new_grill,
            R.drawable.grill_item,
            R.drawable.new_item,
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
