package developer.com.onlinelectureroom.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rahul Gupta on 28/12/15.
 */
public abstract class _Activity extends AppCompatActivity {

    /**
     * Initializes the Ui elements
    * */
    abstract public void initViews();

    abstract public void initData();
}
