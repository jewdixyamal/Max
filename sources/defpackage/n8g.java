package defpackage;

import java.util.HashMap;

/* renamed from: n8g  reason: default package */
public final class n8g {
    public static final String e = a14.O("WorkTimer");
    public final y8 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public n8g(y8 y8Var) {
        this.a = y8Var;
    }

    public final void a(l7g l7g) {
        synchronized (this.d) {
            try {
                if (((m8g) this.b.remove(l7g)) != null) {
                    a14 u = a14.u();
                    String str = e;
                    u.n(str, "Stopping timer for " + l7g);
                    this.c.remove(l7g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
