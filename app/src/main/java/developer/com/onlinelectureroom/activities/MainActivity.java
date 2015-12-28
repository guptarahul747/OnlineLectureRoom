package developer.com.onlinelectureroom.activities;

import android.os.Bundle;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Activity;

public class MainActivity extends _Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();

        initData();
    }

    /**
     * Initializes the Ui elements
     */
    @Override
    public void initViews() {

    }

    @Override
    public void initData() {

    }
}
