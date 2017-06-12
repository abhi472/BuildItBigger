package com.udacity.gradle.builditbigger;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;

/**
 * Created by abhi on 6/12/17.
 */

public class ProgressDialog {
    private Context ctx;
    private Dialog dialog;

    private void init(final Context ctx) {
        this.ctx = ctx;
        dialog = new Dialog(ctx);

        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.progress_dialog);
        View v = dialog.getWindow().getDecorView();
        v.setBackgroundResource(android.R.color.transparent);




    }
    public void showDailyPopup(Context ctx) {
        init(ctx);
        dialog.show();
    }
    public void dismissPopup() {
        if(dialog != null)
            dialog.dismiss();
    }
}
