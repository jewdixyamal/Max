package defpackage;

import android.content.Context;

/* renamed from: bn0  reason: default package */
public final class bn0 {
    public final Context a;

    public bn0(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }
}
