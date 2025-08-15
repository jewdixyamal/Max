package defpackage;

import android.content.DialogInterface;

/* renamed from: e10  reason: default package */
public final /* synthetic */ class e10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e10(int i) {
        this.a = i;
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = v3c.c;
                return;
            case 1:
                dialogInterface.cancel();
                return;
            case 2:
                return;
            default:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
        }
    }
}
