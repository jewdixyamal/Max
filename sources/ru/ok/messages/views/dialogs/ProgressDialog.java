package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class ProgressDialog extends FrgDlgBase {
    public fnb F1;

    public final Dialog h1() {
        String string = this.Z.getString("ru.ok.tamtam.extra.TITLE");
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.CANCELABLE");
        String string2 = this.Z.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT", "");
        boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.INDETERMINATE");
        this.r1 = z;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        if (string2 == null || string2.isEmpty()) {
            Context d0 = d0();
            s08 s08 = new s08(d0);
            s08.a.m = z;
            fm9.M(d0, string, s08, z2);
            return s08.create();
        }
        Context d02 = d0();
        s08 s082 = new s08(d02);
        oc ocVar = s082.a;
        ocVar.m = z;
        e10 e10 = new e10(1);
        ocVar.k = string2;
        ocVar.l = e10;
        fm9.M(d02, string, s082, z2);
        return s082.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        fnb fnb = this.F1;
        if (fnb != null) {
            fnb.b();
        }
    }
}
