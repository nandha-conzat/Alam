package rukina.alam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Nandha on 21-07-2016.
 */
public class ListFragmentAction extends Fragment {

    public ListFragmentAction(){}

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        CustomListAdapter adapter=new CustomListAdapter(getActivity(), itemname, imgid);
        list=(ListView)rootView.findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });

        return rootView;
    }
}
