package developer.com.onlinelectureroom.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.adapter.ViewPagerAdapter;
import developer.com.onlinelectureroom.base._Activity;

/**
 * Created by rahul on 02-Jan-16.
 */
public class EventListActivity extends _Activity implements TabLayout.OnTabSelectedListener{


    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FloatingActionButton fabButton;
    private ViewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_event_list);
        initViews();

        initData();
    }

    /**
     * Initializes the Ui elements
     */
    @Override
    public void initViews() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        fabButton = (FloatingActionButton) findViewById(R.id.fabButton);
    }

    @Override
    public void initData() {

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        pagerAdapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(this);
    }

    /**
     * Called when a tab enters the selected state.
     *
     * @param tab The tab that was selected
     */
    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    /**
     * Called when a tab exits the selected state.
     *
     * @param tab The tab that was unselected
     */
    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    /**
     * Called when a tab that is already selected is chosen again by the user. Some applications
     * may use this action to return to the top level of a category.
     *
     * @param tab The tab that was reselected.
     */
    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
