package developer.com.onlinelectureroom.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import developer.com.onlinelectureroom.R;
import developer.com.onlinelectureroom.base._Activity;

public class MainActivity extends _Activity implements View.OnClickListener{

    private Button btnSignIn,btnRegister;

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

        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnRegister = (Button)findViewById(R.id.btnRegister);
    }

    @Override
    public void initData() {

        btnSignIn.setOnClickListener(this);

        btnRegister.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {

            case R.id.btnSignIn:

                intent = new Intent(this,LoginActivity.class);
                break;
            case R.id.btnRegister:
                intent = new Intent(this,RegisterActivity.class);
                break;
        }
        startActivity(intent);
    }
}