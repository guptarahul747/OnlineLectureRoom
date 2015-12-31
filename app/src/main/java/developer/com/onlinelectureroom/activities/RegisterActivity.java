package developer.com.onlinelectureroom.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Activity;
import developer.com.onlinelectureroom.fragments.RegistrationFragment;
import developer.com.onlinelectureroom.fragments.RegistrationRoleFragment;

/**
 * Created by Rahul on 30/12/15.
 */
public class RegisterActivity extends _Activity {

    public static final int FRAGMENT_REGISTRATION_ROLE = 1;
    public static final int FRAGMENT_REGISTRATION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

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

        replaceFragment(FRAGMENT_REGISTRATION_ROLE, null, "RegistrationRoleFragment", false);
    }

    public void replaceFragment(int fragment, Bundle b, String tag,
                                 boolean addToBackStack) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();

        Fragment f = null;

        switch (fragment) {

            case FRAGMENT_REGISTRATION_ROLE:

                f = new RegistrationRoleFragment();
                break;
            case FRAGMENT_REGISTRATION:

                f = new RegistrationFragment();
                break;
        }

        if (b != null) {

            f.setArguments(b);
        }
        fragmentTransaction.replace(R.id.container, f);

        if (addToBackStack) {

            fragmentTransaction.addToBackStack(tag);
            dLog("Added = " + tag);
        }

        fragmentTransaction.commit();
    }
}
