package lv.kjerins.viewpagerloopingfragmentsdemo;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment, container, false);
        TextView text = root.findViewById(R.id.text_view);
        text.setText("Trešais fragments " + this.toString());
        root.setBackgroundColor(getResources().getColor(R.color.frag_3, null));
        return root;
    }

}
