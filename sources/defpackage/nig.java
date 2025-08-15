package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: nig  reason: default package */
public abstract class nig {
    public static final jn a = new jn("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        bkg.y(context).n();
        Set set = mdg.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (ie6.B0) {
                try {
                    ie6 ie6 = ie6.C0;
                    if (ie6 != null) {
                        ie6.t0.incrementAndGet();
                        fc9 fc9 = ie6.x0;
                        fc9.sendMessageAtFrontOfQueue(fc9.obtainMessage(10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((mdg) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
