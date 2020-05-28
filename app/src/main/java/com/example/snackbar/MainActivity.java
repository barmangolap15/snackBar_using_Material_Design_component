package com.example.snackbar;
// snackbar using MDC library

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mSnackbarBtn;
    private FloatingActionButton mFloatingActionButton;
    private CoordinatorLayout mSnackbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSnackbarBtn = findViewById(R.id.snackbarBtn);
        mFloatingActionButton = findViewById(R.id.floatingActionButton);
        mSnackbarLayout = findViewById(R.id.snackbar_layout);

        mSnackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start create the snakeBar
                Snackbar snackbar = Snackbar.make(v, "Hello Guys!", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAnchorView(mFloatingActionButton);;
                snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                snackbar.setAction("OKAY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Do Something here
                    }
                });
                snackbar.show();
            }
        });
    }
}



