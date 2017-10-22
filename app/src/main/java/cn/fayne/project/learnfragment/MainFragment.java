package cn.fayne.project.learnfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        rootView.findViewById(R.id.btnShowAnotherFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, new AnotherFragment()).commit();
            }
        });

        rootView.findViewById(R.id.btnStartSliderActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SliderActivity.class));
            }
        });

        rootView.findViewById(R.id.btnStartTabbedActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Tabs.class));
            }
        });

        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Msg", "A onDestroy");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Msg", "A onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Msg", "A onDestroyView");
    }
}
