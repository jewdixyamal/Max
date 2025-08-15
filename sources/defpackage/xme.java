package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* renamed from: xme  reason: default package */
public final class xme implements yme {
    public final yme a;
    public final HashMap b = new HashMap();

    public xme(yme yme) {
        this.a = yme;
    }

    public final ThreadFactory a(String str) {
        HashMap hashMap = this.b;
        ThreadFactory threadFactory = (ThreadFactory) hashMap.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory a2 = this.a.a(str);
        hashMap.put(str, a2);
        return a2;
    }
}
