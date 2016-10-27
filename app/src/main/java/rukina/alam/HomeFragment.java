package rukina.alam;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
    }

    // Restart @ 8.16 AM 16-10-2016

    LinearLayout popular, special, snax_veg, snax_non_veg, burgers, pasta, wraps, sanwiches, noodles, combo_veg, combo_non_veg,
            milk, mock, beverages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        popular = (LinearLayout) rootView.findViewById(R.id.popular);
        special = (LinearLayout) rootView.findViewById(R.id.special);
        snax_veg = (LinearLayout) rootView.findViewById(R.id.snax_veg);
        snax_non_veg = (LinearLayout) rootView.findViewById(R.id.snax_non_veg);
        burgers = (LinearLayout) rootView.findViewById(R.id.burgers);
        pasta = (LinearLayout) rootView.findViewById(R.id.pasta);
        wraps = (LinearLayout) rootView.findViewById(R.id.wraps);
        sanwiches = (LinearLayout) rootView.findViewById(R.id.sanwiches);
        noodles = (LinearLayout) rootView.findViewById(R.id.noodles);
        combo_veg = (LinearLayout) rootView.findViewById(R.id.combo_veg);
        combo_non_veg = (LinearLayout) rootView.findViewById(R.id.combo_non_veg);
        milk = (LinearLayout) rootView.findViewById(R.id.milk);
        mock = (LinearLayout) rootView.findViewById(R.id.mock);
        beverages = (LinearLayout) rootView.findViewById(R.id.beverages);

        popular.setOnClickListener(this);
        special.setOnClickListener(this);
        snax_veg.setOnClickListener(this);
        snax_non_veg.setOnClickListener(this);
        burgers.setOnClickListener(this);
        pasta.setOnClickListener(this);
        wraps.setOnClickListener(this);
        sanwiches.setOnClickListener(this);
        noodles.setOnClickListener(this);
        combo_veg.setOnClickListener(this);
        combo_non_veg.setOnClickListener(this);
        milk.setOnClickListener(this);
        mock.setOnClickListener(this);
        beverages.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.popular:
                Intent popular = new Intent(getActivity(), CustomListActivity.class);
                startActivity(popular);
                break;
            case R.id.special:
                Intent special = new Intent(getActivity(), CustomListActivity.class);
                startActivity(special);
                break;
            case R.id.snax_veg:
                Intent snax_veg = new Intent(getActivity(), CustomListActivity.class);
                startActivity(snax_veg);
                break;
            case R.id.snax_non_veg:
                Intent i = new Intent(getActivity(), CustomListActivity.class);
                startActivity(i);
                break;
            case R.id.burgers:
                Intent burgers = new Intent(getActivity(), CustomListActivity.class);
                startActivity(burgers);
                break;
            case R.id.pasta:
                Intent pasta = new Intent(getActivity(), CustomListActivity.class);
                startActivity(pasta);
                break;
            case R.id.wraps:
                Intent wraps = new Intent(getActivity(), CustomListActivity.class);
                startActivity(wraps);
                break;
            case R.id.sanwiches:
                Intent sanwiches = new Intent(getActivity(), CustomListActivity.class);
                startActivity(sanwiches);
                break;
            case R.id.noodles:
                Intent noodles = new Intent(getActivity(), CustomListActivity.class);
                startActivity(noodles);
                break;
            case R.id.combo_veg:
                Intent combo_veg = new Intent(getActivity(), CustomListActivity.class);
                startActivity(combo_veg);
                break;
            case R.id.combo_non_veg:
                Intent combo_non_veg = new Intent(getActivity(), CustomListActivity.class);
                startActivity(combo_non_veg);
                break;
            case R.id.milk:
                Intent milk = new Intent(getActivity(), CustomListActivity.class);
                startActivity(milk);
                break;
            case R.id.mock:
                Intent mock = new Intent(getActivity(), CustomListActivity.class);
                startActivity(mock);
                break;
            case R.id.beverages:
                Intent beverages = new Intent(getActivity(), CustomListActivity.class);
                startActivity(beverages);
                break;
            default:
                break;
        }
    }
}
