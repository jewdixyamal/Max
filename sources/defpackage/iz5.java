package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: iz5  reason: default package */
public final class iz5 implements qza {
    public final Set a;
    public final d06 b;
    public final x3c c;
    public final Long d;
    public final boolean e;
    public final Context f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final q0e m;
    public final w7c n;
    public List o = nz4.a;
    public final kld p;
    public final v7c q;
    public final h7b r;
    public final q0e s;
    public final w7c t;
    public final je7 u;
    public final je7 v;
    public sx3 w;
    public boolean x;

    public iz5(Set set, d06 d06, x3c x3c, Long l2, boolean z, Context context, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = set;
        this.b = d06;
        this.c = x3c;
        this.d = l2;
        this.e = z;
        this.f = context;
        this.g = je7;
        this.h = je72;
        this.i = je73;
        this.j = je74;
        this.k = je75;
        this.l = je76;
        q0e a2 = r0e.a((Object) null);
        this.m = a2;
        this.n = new w7c(a2);
        kld b2 = lld.b(0, Integer.MAX_VALUE, 2, 1);
        this.p = b2;
        this.q = new v7c(b2);
        this.r = new h7b(17);
        q0e a3 = r0e.a(Boolean.TRUE);
        this.s = a3;
        this.t = new w7c(a3);
        this.u = tu0.r(3, new ez5(this, 0));
        this.v = tu0.r(3, new ez5(this, 1));
        if (!(!set.isEmpty())) {
            throw new IllegalStateException("You must specify messages to forward!".toString());
        }
    }

    public final void a() {
        this.w = null;
    }

    public final void b(gza gza) {
        ((AtomicReference) this.c.Y).updateAndGet(new iz0(9, gza));
    }

    public final void c(sx3 sx3) {
        this.w = sx3;
        j47.T(sx3, ((w9a) ((kke) this.g.getValue())).b(), (vx3) null, new hz5(this, (Continuation) null), 2);
    }

    public final void d() {
        ((AtomicReference) this.c.Y).updateAndGet(new oe2(10));
    }

    public final void e(long j2) {
        ((AtomicReference) this.c.Y).updateAndGet(new v79(j2, 3));
    }

    public final void f() {
        je7 je7 = this.l;
        if (!((t33) ((q33) je7.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
            this.p.g(mz5.a);
            ((t33) ((q33) je7.getValue())).j("app.onboarding.author_visibility", true);
        }
    }

    public final Drawable g() {
        return ((Boolean) this.s.getValue()).booleanValue() ? (Drawable) this.u.getValue() : (Drawable) this.v.getValue();
    }

    public final void h(CharSequence charSequence, Set set, boolean z) {
        Object obj;
        if (!set.isEmpty() && !this.x) {
            boolean z2 = true;
            this.x = true;
            Object f0 = x53.f0(set);
            ((Number) f0).longValue();
            fza fza = null;
            if (set.size() != 1) {
                f0 = null;
            }
            Long l2 = (Long) f0;
            if (l2 == null || z) {
                if (l2 != null) {
                    Iterator it = ((Set) ((AtomicReference) this.c.Y).get()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((gza) obj).a == l2.longValue()) {
                            break;
                        }
                    }
                    gza gza = (gza) obj;
                    if (gza != null) {
                        fza = gza.b;
                    }
                    if (fza != fza.a && this.d == null) {
                        z2 = false;
                    }
                }
                boolean z3 = z2;
                sx3 sx3 = this.w;
                if (sx3 != null) {
                    j47.S(sx3, xq9.a.plus(((w9a) ((kke) this.g.getValue())).a()), vx3.c, new gz5(this, charSequence, set, z3, l2, (Continuation) null));
                    return;
                }
                return;
            }
            this.p.g(new jz5(l2, this.a, this.d, this.e, (zy5) null, 16));
        }
    }
}
