package cn.fayne.project.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by fan on 2017/10/21.
 */

public class FaynePageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fayne_page_fragment, container, false);
        WebView wv = (WebView) rootView.findViewById(R.id.wv);
        wv.loadUrl("http://www.fayne.cn");
        return rootView;
    }
}
