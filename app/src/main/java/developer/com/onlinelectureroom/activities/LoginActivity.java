package developer.com.onlinelectureroom.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Activity;
import developer.com.onlinelectureroom.utils.Methods;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends _Activity implements View.OnClickListener {

    private EditText editEmail;
    private EditText editPassword;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        initViews();

        initData();
    }

    /**
     * Initializes the Ui elements
     */
    @Override
    public void initViews() {

        editEmail = (EditText) findViewById(R.id.editEmail);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
    }

    @Override
    public void initData() {

        btnSignIn.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if (!Methods.validateEmptyString(editEmail, "Enter username")) {

            editEmail.requestFocus();
        } else if (!Methods.validateString(editPassword, "Enter Password")) {

            editPassword.requestFocus();
        } else {

            if (Methods.isDeviceConnected(this)) {

                doLogin();
            } else {

                smallSnack(getString(R.string.errorNoInternet));
            }
        }
    }

    private void doLogin() {


        Intent intent = new Intent(this,EventListActivity.class);
        startActivity(intent);
    }
}