package developer.com.onlinelectureroom.base;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Rahul on 31/12/15.
 */
public abstract class _Fragment extends Fragment {

    public static final String TAG = "OnlineLectureRoom";

    private boolean isLogLevel = true;

    /**
     * Initializes the Ui elements
     */
    abstract public void initViews(View view);

    abstract public void initData();

    public void smallToast(String msg) {

        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    public void longToast(String msg) {

        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }

    public void smallSnack(String msg) {

        Snackbar.make(getActivity().findViewById(android.R.id.content), msg, Snackbar.LENGTH_SHORT).show();
    }

    public void longSnack(String msg) {

        Snackbar.make(getActivity().findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG).show();
    }

    public void eLog(String msg) {

        if (isLogLevel) {

            Log.e(TAG, msg);
        }
    }

    public void dLog(String msg) {

        if (isLogLevel) {

            Log.d(TAG, msg);
        }
    }

    public void iLog(String msg) {

        if (isLogLevel) {

            Log.i(TAG, msg);
        }
    }
}