package developer.com.onlinelectureroom.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Fragment;
import developer.com.onlinelectureroom.utils.Methods;

/**
 * Created by Rahul on 31/12/15.
 */
public class RegistrationFragment extends _Fragment implements View.OnClickListener {

    private EditText editFirstName, editLastName, editUserName, editEmail, editPassword, editConfirmPassword;
    private Spinner spinner;
    private Button btnSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.registration_fragment, container, false);

        initViews(view);

        initData();

        return view;
    }

    /**
     * Initializes the Ui elements
     *
     * @param view
     */
    @Override
    public void initViews(View view) {

        editFirstName = (EditText) view.findViewById(R.id.editFirstName);
        editLastName = (EditText) view.findViewById(R.id.editLastName);
        editUserName = (EditText) view.findViewById(R.id.editUserName);
        editEmail = (EditText) view.findViewById(R.id.editEmail);
        editPassword = (EditText) view.findViewById(R.id.editPassword);

        editConfirmPassword = (EditText) view.findViewById(R.id.editConfirmPassword);

        spinner = (Spinner) view.findViewById(R.id.spinner);

        btnSignUp = (Button) view.findViewById(R.id.btnSignUp);
    }

    @Override
    public void initData() {

        btnSignUp.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if (validate()) {

        }
    }

    private boolean validate() {

        if (!Methods.validateEmptyString(editFirstName, getString(R.string.errorFirstName))) {

            editFirstName.requestFocus();
            return false;
        } else if (!Methods.validateEmptyString(editLastName, getString(R.string.errorLastName))) {

            editLastName.requestFocus();
            return false;
        } else if (!Methods.validateEmptyString(editUserName, getString(R.string.errorUserName))){

            editUserName.requestFocus();
            return false;
        }
        else if (!Methods.isValidEmail(editEmail, getString(R.string.error_invalid_email))) {

            editEmail.requestFocus();
            return false;
        } else if (!Methods.validateString(editPassword, getString(R.string.error_field_required))) {

            editPassword.requestFocus();
            return false;
        } else if (!editConfirmPassword.getText().toString().
                equalsIgnoreCase(editPassword.getText().toString())) {

            editConfirmPassword.setError(getString(R.string.error_incorrect_password));
            editConfirmPassword.requestFocus();
            return false;
        }else if (spinner.getSelectedItemPosition() == 0){

            longSnack("Select Branch");
            return false;
        } else {

            return true;
        }

    }
}
