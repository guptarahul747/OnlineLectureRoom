package developer.com.onlinelectureroom.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import developer.com.onlinelectureroom.base._Fragment;

/**
 * Created by rahul on 03-Jan-16.
 */
public class EventListFragment extends _Fragment {

    public static EventListFragment newInstance(String s) {

        final EventListFragment fragment = new EventListFragment();

        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        fragment.setArguments(bundle);
        return fragment;
    }

    public EventListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView textView = new TextView(getActivity());
        textView.setText(getArguments().getString("title"));
        return textView;
    }

    /**
     * Initializes the Ui elements
     *
     * @param view
     */
    @Override
    public void initViews(View view) {

    }

    @Override
    public void initData() {

    }
}
