package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ak6  reason: default package */
public final class ak6 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final me6 b;
    public final lr7 c;
    public final Context d;

    public ak6(me6 me6, lr7 lr7, Context context) {
        this.b = me6;
        this.d = context;
        this.c = lr7;
    }

    public final kr7 a() {
        kr7 kr7 = new kr7();
        kr7.b = 3;
        kr7.c = 500L;
        kr7.d = 10L;
        return new kr7(kr7);
    }
}
