package developer.com.onlinelectureroom.fragments;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.activities.RegisterActivity;
import developer.com.onlinelectureroom.base._Fragment;

/**
 * Created by Rahul on 31/12/15.
 */
public class RegistrationRoleFragment extends _Fragment implements View.OnClickListener {

    private Spinner spinner;
    private TextInputLayout txtInputVerificationCode;
    private Button btnValidate;
    private EditText ediVerificationCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.registration_role, container, false);

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

        spinner = (Spinner) view.findViewById(R.id.spinner);
        txtInputVerificationCode = (TextInputLayout) view.findViewById(R.id.txtInputVerificationCode);
        btnValidate = (Button) view.findViewById(R.id.btnValidate);
        ediVerificationCode = (EditText) view.findViewById(R.id.ediVerificationCode);
    }

    @Override
    public void initData() {

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        showVerification(false);
                        break;

                    case 1:

                        showVerification(false);
                        break;
                    case 2:

                        showVerification(true);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                showVerification(false);
            }
        });

        btnValidate.setOnClickListener(this);
    }

    private void showVerification(boolean b) {

        if (b) {

            txtInputVerificationCode.setVisibility(View.VISIBLE);
            btnValidate.setVisibility(View.VISIBLE);

        } else {

            txtInputVerificationCode.setVisibility(View.GONE);
            btnValidate.setVisibility(View.GONE);
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if (!(ediVerificationCode.getText().toString().length() < 10)) {

            ((RegisterActivity) getActivity()).replaceFragment(RegisterActivity.FRAGMENT_REGISTRATION,
                    null, "FRAGMENT_REGISTRATION", true);
        } else {

            ediVerificationCode.setError("Verification code should be of 10 digit");
            ediVerificationCode.requestFocus();
        }
    }
}
