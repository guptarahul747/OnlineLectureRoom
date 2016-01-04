package developer.com.onlinelectureroom.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.fragments.EventListFragment;

/**
 * Created by rahul on 03-Jan-16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private String []titles;

    public ViewPagerAdapter(Context context, FragmentManager fm) {

        super(fm);

        this.context = context;
        this.titles = context.getResources().getStringArray(R.array.tabs);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        // Create fragment object
        Fragment fragment = null;
        switch (position) {
            case 0:

                fragment = EventListFragment.newInstance(""+getPageTitle(0));
                break;
            case 1:
                fragment = EventListFragment.newInstance(""+getPageTitle(1));
                break;
        }

        return fragment;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return titles.length;
    }

    /**
     * Return the Title Name.
     */
    @Override
    public CharSequence getPageTitle(int position) {

        return titles[position];
    }
}
