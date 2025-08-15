package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cea  reason: default package */
public final class cea {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public cea(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final void a(long j) {
        o44 b2 = b();
        b2.getClass();
        String str = o44.k;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.h(j, "cancelServerChatId "), (Throwable) null);
        }
        b2.c(new h44(j, b2, (Continuation) null));
    }

    public final o44 b() {
        return (o44) this.d.getValue();
    }

    public final void c() {
        o44 b2 = b();
        b2.getClass();
        String str = o44.k;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "notifyAllChats", (Throwable) null);
        }
        b2.c(new g44(b2, (Continuation) null, 3));
        h();
    }

    public final void d(long j) {
        o44 b2 = b();
        b2.getClass();
        String str = o44.k;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.h(j, "notify #"), (Throwable) null);
        }
        b2.c(new g44(b2, (Continuation) null, 1));
        h();
    }

    public final void e(gi9 gi9) {
        o44 b2 = b();
        b2.getClass();
        if (!gi9.i()) {
            String str = o44.k;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "notifyLocalChats", (Throwable) null);
            }
            b2.c(new g44(b2, (Continuation) null, 2));
        }
        h();
    }

    public final void f(long j) {
        o44 b2 = b();
        b2.getClass();
        String str = o44.k;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.h(j, "notifyServerChatIds #"), (Throwable) null);
        }
        b2.c(new h44(b2, j, (Continuation) null));
        h();
    }

    public final void g(gi9 gi9) {
        o44 b2 = b();
        b2.getClass();
        String str = o44.k;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "notifyServerChatIds ".concat(gi9.k(gi9, (String) null, (String) null, 31)), (Throwable) null);
        }
        if (!gi9.i()) {
            b2.c(new m44(b2, gi9, (Continuation) null, 0));
        }
        h();
    }

    public final void h() {
        ((and) this.c.getValue()).d();
    }
}
