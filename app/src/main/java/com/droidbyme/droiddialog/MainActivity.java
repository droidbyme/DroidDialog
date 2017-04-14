package com.droidbyme.droiddialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.droidbyme.dialoglib.AnimUtils;
import com.droidbyme.dialoglib.DroidDialog;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
    }

    public void openDialog(View view) {
        new DroidDialog.Builder(context)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(true, true)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                    }
                })
                .negativeButton("No", new DroidDialog.onNegativeListener() {
                    @Override
                    public void onNegative(Dialog droidDialog) {

                    }
                })
                .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                    @Override
                    public void onNeutral(Dialog droidDialog) {

                    }
                })
                .typeface("regular.ttf")
                .animation(AnimUtils.AnimFadeInOut)
                .color(ContextCompat.getColor(context, R.color.indigo), ContextCompat.getColor(context, R.color.white),
                        ContextCompat.getColor(context, R.color.dark_indigo))
                .divider(true, ContextCompat.getColor(context, R.color.orange))
                .show();
    }
}
