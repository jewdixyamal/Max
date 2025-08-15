package defpackage;

import java.util.HashMap;
import java.util.Set;

/* renamed from: jg7  reason: default package */
public final class jg7 implements ah7 {
    public final x3c a;
    public final eh7 b;

    public jg7(eh7 eh7, x3c x3c) {
        this.b = eh7;
        this.a = x3c;
    }

    @p3a(eg7.ON_DESTROY)
    public void onDestroy(eh7 eh7) {
        x3c x3c = this.a;
        synchronized (x3c.b) {
            try {
                jg7 e = x3c.e(eh7);
                if (e != null) {
                    x3c.l(eh7);
                    for (wa0 remove : (Set) ((HashMap) x3c.o).get(e)) {
                        ((HashMap) x3c.c).remove(remove);
                    }
                    ((HashMap) x3c.o).remove(e);
                    e.b.Q().f(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p3a(eg7.ON_START)
    public void onStart(eh7 eh7) {
        this.a.k(eh7);
    }

    @p3a(eg7.ON_STOP)
    public void onStop(eh7 eh7) {
        this.a.l(eh7);
    }
}
