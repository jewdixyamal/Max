package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* renamed from: mfe  reason: default package */
public final class mfe implements qj3, ifg {
    public Object a;

    public /* synthetic */ mfe(Object obj) {
        this.a = obj;
    }

    public void accept(Object obj) {
        Integer num = (Integer) obj;
        hm9.m(((cge) this.a).b, "Connection restored", new Object[0]);
    }

    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.a)).a.b;
        if (context != null) {
            wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
            new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
            Object obj = new Object();
            new HashSet();
            context.getApplicationContext();
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
