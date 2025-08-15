package defpackage;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p58  reason: default package */
public final class p58 extends pnf {
    public static final /* synthetic */ bc7[] I0;
    public final w7c A0;
    public final j31 B0;
    public final t03 C0;
    public final w7c D0;
    public final w7c E0;
    public final w7c F0;
    public final w4d G0;
    public final w4d H0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final k56 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0 = r0e.a(n00.a);
    public final zt0 t0 = c37.a(-2, 0, 6);
    public volatile List u0;
    public final h7b v0 = new h7b(17);
    public final s35 w0 = new s35(0);
    public final q0e x0;
    public final dua y0;
    public final dua z0;

    static {
        Class<p58> cls = p58.class;
        I0 = new bc7[]{new oi9(cls, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;")};
    }

    public p58(je7 je7, je7 je72, je7 je73, je7 je74, fn2 fn2) {
        je7 je75 = so2.a;
        this.b = fn2;
        this.c = je7;
        this.o = je72;
        this.X = je75;
        this.Y = je73;
        this.Z = je74;
        q0e a = r0e.a(nz4.a);
        this.x0 = a;
        String[] strArr = eua.m;
        dua dua = new dua(strArr);
        this.y0 = dua;
        dua dua2 = new dua(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.z0 = dua2;
        j31 j31 = new j31(dua, dua2, new i58(3, (Continuation) null, 0), 4);
        v8b v8b = v8b.a;
        c32 c32 = wld.a;
        w7c X2 = od2.X(j31, this.a, c32, v8b);
        this.A0 = X2;
        this.B0 = new j31(dua, dua2, new i58(3, (Continuation) null, 1), 4);
        this.C0 = new t03(X2, 29);
        m58 m58 = new m58(a, 0);
        Boolean bool = Boolean.FALSE;
        this.D0 = od2.X(m58, this.a, c32, bool);
        m58 m582 = new m58(a, 1);
        q0e q0e = vc7.f;
        this.E0 = od2.X(new j31(m582, q0e, new t11(3, (Continuation) null, 1), 4), this.a, c32, bool);
        this.F0 = od2.X(new ac(new j31(q0e, a, g58.s0, 4), 28, this), this.a, c32, i5d.b);
        this.G0 = mqd.D();
        this.H0 = mqd.D();
        pnf.n(this, (lx3) null, (vx3) null, new h58(this, (Continuation) null), 3);
    }

    public static final xp7 q(p58 p58) {
        return (xp7) p58.o.getValue();
    }

    public final p4d r() {
        return (p4d) this.X.getValue();
    }

    public final boolean s() {
        return this.b.invoke() != null;
    }

    public final void t(boolean z) {
        zt0 zt0 = this.t0;
        if (!z) {
            int i = vc7.a;
            if (vc7.b(vc7.c)) {
                zt0.n(b48.a);
                return;
            }
        }
        Long l = (Long) this.b.invoke();
        vx3 vx3 = vx3.b;
        w4d w4d = this.H0;
        bc7[] bc7Arr = I0;
        if (l != null) {
            long longValue = l.longValue();
            qyc qyc = (qyc) ((y7d) this.Z.getValue());
            qyc.getClass();
            int q = (int) qyc.q(PmsKey.f63maxattachcount, (long) 12);
            if (r().b() > q) {
                zt0.n(new i48(q));
                return;
            }
            w4d.o1(this, bc7Arr[1], j47.S(this.a, ((w9a) ((kke) this.Y.getValue())).b(), vx3, new e58(this, longValue, (Continuation) null)));
            return;
        }
        w4d.o1(this, bc7Arr[1], pnf.n(this, (lx3) null, vx3, new j58(this, (Continuation) null), 1));
        pnf.o(this.w0, y48.a);
    }

    public final boolean u() {
        if ((!(!((Collection) this.x0.getValue()).isEmpty()) || s()) && (this.u0 == null || tpa.f(this.x0.getValue(), this.u0))) {
            return true;
        }
        this.t0.n(e48.a);
        return false;
    }
}
