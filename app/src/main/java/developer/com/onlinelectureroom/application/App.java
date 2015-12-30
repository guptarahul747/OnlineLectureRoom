package developer.com.onlinelectureroom.application;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Rahul  on 30/12/15.
 */
public class App extends Application {

    private static App instance;
    private static SharedPreferences sp;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        sp = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
    }

    public static final App getInstance() {
        return instance;
    }
}
