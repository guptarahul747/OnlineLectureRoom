package developer.com.onlinelectureroom.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Activity;

/**
 * Created by rahul on 02-Jan-16.
 */
public class EventListActivity extends _Activity {


    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FloatingActionButton fabButton;

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
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        fabButton = (FloatingActionButton)findViewById(R.id.fabButton);
    }

    @Override
    public void initData() {

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
