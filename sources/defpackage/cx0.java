package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cx0  reason: default package */
public final class cx0 {
    public static final LinkedHashSet l;
    public final ng5 a;
    public final f40 b;
    public final s8g c;
    public final s23 d;
    public final qj3 e;
    public final ztc f;
    public final ztc g;
    public final bx0 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public volatile y0a j;
    public volatile ax0 k;

    static {
        LinkedList linkedList = new LinkedList(Arrays.asList(gx0.values()));
        linkedList.remove(gx0.a);
        l = new LinkedHashSet(linkedList);
    }

    public cx0(ng5 ng5, f40 f40, s23 s23, s8g s8g, ztc ztc, ztc ztc2, qj3 qj3, bx0 bx0) {
        this.a = ng5;
        this.b = f40;
        this.c = s8g;
        this.h = bx0;
        this.d = s23;
        this.e = qj3;
        this.f = ztc;
        this.g = ztc2;
    }

    public final void a(sd7 sd7) {
        try {
            this.e.accept(sd7);
        } catch (Throwable th) {
            hm9.p("cx0", "updateData: failed to accept disposable", th);
        }
    }

    public final void b() {
        r0a n = c().r(this.f).n(this.g);
        sd7 sd7 = new sd7(new yw0(this, 0), new un0(5), ft.d);
        n.a(sd7);
        a(sd7);
    }

    public final synchronized qy9 c() {
        if (this.j != null) {
            return this.j;
        }
        qy9 n = new rqd(new q1a(2, new l5(2, this)), new yw0(this, 6), 2).n();
        yw0 yw0 = new yw0(this, 7);
        kj6 kj6 = ft.e;
        this.j = new y0a(new v0a(new xy9(new oz9(n, kj6, yw0, ft.d), kj6, new e5(3, this), 2)));
        return this.j;
    }
}
