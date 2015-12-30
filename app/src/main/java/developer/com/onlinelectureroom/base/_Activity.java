package developer.com.onlinelectureroom.base;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Rahul Gupta on 28/12/15.
 */
public abstract class _Activity extends AppCompatActivity {

    public static final String TAG = "OnlineLectureRoom";

    private boolean isLogLevel = true;
    /**
     * Initializes the Ui elements
    * */
    abstract public void initViews();

    abstract public void initData();

    public void smallToast(String msg){

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    public void longToast(String msg){

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void smallSnack(String msg){

        Snackbar.make(findViewById(android.R.id.content), msg, Snackbar.LENGTH_SHORT).show();
    }

    public void longSnack(String msg){

        Snackbar.make(findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG).show();
    }

    public void eLog(String msg) {

        if (isLogLevel){

            Log.e(TAG, msg);
        }
    }
    public void dLog(String msg) {

        if (isLogLevel){

            Log.d(TAG,msg);
        }
    }
    public void iLog(String msg) {

        if (isLogLevel){

            Log.i(TAG,msg);
        }
    }
}