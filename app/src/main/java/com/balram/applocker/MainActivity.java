package com.balram.applocker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.balram.locker.view.AppLocker;
import com.balram.locker.view.LockActivity;
import com.balram.locker.utils.Locker;


/**
 * Created by Balram Pandey 12/11/16.
 */

public class MainActivity extends LockActivity implements View.OnClickListener {

    private Button btOnOff;
    private Button btChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOnOff = (Button) findViewById(R.id.bt_on_off);
        btOnOff.setOnClickListener(this);

        btChange = (Button) findViewById(R.id.bt_change);
        btChange.setText(R.string.change_passcode);
        btChange.setOnClickListener(this);

        updateUI();
    }
    @Override
    public void onClick(View view) {
        if (view.equals(btOnOff)) {
            int type = AppLocker.getInstance().getAppLock().isPasscodeSet() ? Locker.DISABLE_PASSLOCK
                    : Locker.ENABLE_PASSLOCK;
            Intent intent = new Intent(this, LockActivity.class);
            intent.putExtra(Locker.TYPE, type);
            startActivityForResult(intent, type);
        } else if (view.equals(btChange)) {
            Intent intent = new Intent(this, LockActivity.class);
            intent.putExtra(Locker.TYPE, Locker.CHANGE_PASSWORD);
            intent.putExtra(Locker.MESSAGE,
                    getString(R.string.enter_old_passcode));
            startActivityForResult(intent, Locker.CHANGE_PASSWORD);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case Locker.DISABLE_PASSLOCK:
                break;
            case Locker.ENABLE_PASSLOCK:
            case Locker.CHANGE_PASSWORD:
                if (resultCode == RESULT_OK) {
                    Toast.makeText(this, getString(R.string.setup_passcode),
                            Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
        updateUI();
    }

    private void updateUI() {
        if (AppLocker.getInstance().getAppLock().isPasscodeSet()) {
            btOnOff.setText(R.string.disable_passcode);
            btChange.setEnabled(true);
        } else {
            btOnOff.setText(R.string.enable_passcode);
            btChange.setEnabled(false);
        }
    }
}
