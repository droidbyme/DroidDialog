package com.droidbyme.droiddialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.droidbyme.dialoglib.AnimUtils;
import com.droidbyme.dialoglib.DroidDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialog(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(true, true)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_SHORT).show();
                    }
                })
                .negativeButton("No", new DroidDialog.onNegativeListener() {
                    @Override
                    public void onNegative(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                })
                .neutralButton("SKIP", new DroidDialog.onNeutralListener() {
                    @Override
                    public void onNeutral(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Skip", Toast.LENGTH_SHORT).show();
                    }
                })
                .typeface("regular.ttf")
                .animation(AnimUtils.AnimZoomInOut)
                .color(ContextCompat.getColor(MainActivity.this, R.color.indigo), ContextCompat.getColor(MainActivity.this, R.color.white),
                        ContextCompat.getColor(MainActivity.this, R.color.dark_indigo))
                .divider(true, ContextCompat.getColor(MainActivity.this, R.color.orange))
                .show();
    }

    public void openDialog1(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(false, false)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                        droidDialog.dismiss();
                    }
                })
                .show();
    }

    public void openDialog2(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(true, true)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                        droidDialog.dismiss();
                    }
                })
                .show();
    }

    public void openDialog6(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(true, true)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .typeface("regular.ttf")
                .animation(AnimUtils.AnimFadeInOut)
                .color(ContextCompat.getColor(MainActivity.this, R.color.indigo), ContextCompat.getColor(MainActivity.this, R.color.white),
                        ContextCompat.getColor(MainActivity.this, R.color.dark_indigo))
                .divider(true, ContextCompat.getColor(MainActivity.this, R.color.orange))
                .show();
    }

    public void openDialog5(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.short_text))
                .cancelable(true, true)
                .positiveButton("Yes", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                })
                .negativeButton("No", new DroidDialog.onNegativeListener() {
                    @Override
                    public void onNegative(Dialog droidDialog) {
                        droidDialog.dismiss();
                        Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                })
                .typeface("regular.ttf")
                .animation(AnimUtils.AnimLeftRight)
                .show();
    }

    public void openDialog4(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("Expiry")
                .content(getString(R.string.dummy_text))
                .positiveButton("Yes", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        droidDialog.dismiss();
                    }
                })
                .negativeButton("Dont Ask Again", new DroidDialog.onNegativeListener() {
                    @Override
                    public void onNegative(Dialog droidDialog) {
                        droidDialog.dismiss();
                    }
                })
                .neutralButton("Skip", new DroidDialog.onNeutralListener() {
                    @Override
                    public void onNeutral(Dialog droidDialog) {
                        droidDialog.dismiss();
                    }
                })
                .typeface("regular.ttf")
                .cancelable(true, true)
                .show();
    }

    public void openDialog3(View view) {
        new DroidDialog.Builder(MainActivity.this)
                .icon(R.drawable.ic_action_tick)
                .title("All Well!")
                .content(getString(R.string.long_text))
                .cancelable(true, true)
                .positiveButton("OK", new DroidDialog.onPositiveListener() {
                    @Override
                    public void onPositive(Dialog droidDialog) {
                        Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                        droidDialog.dismiss();
                    }
                })
                .show();
    }
}
