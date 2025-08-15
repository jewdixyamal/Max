package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;

/* renamed from: x4a  reason: default package */
public final class x4a extends fz4 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final /* synthetic */ OneMeApplication b;

    public x4a(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.add(new WeakReference(activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.removeIf(new au5(2, new vp(activity, 1)));
    }

    public final void onActivityResumed(Activity activity) {
        Object value;
        q0e q0e = (q0e) qp4.u0.b(this.b).s0;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }
}
