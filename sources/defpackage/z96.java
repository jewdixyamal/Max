package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z96  reason: default package */
public final class z96 extends pnf {
    public static final /* synthetic */ int R0 = 0;
    public final q0e A0;
    public final q0e B0;
    public final w7c C0;
    public final zt0 D0;
    public final f32 E0;
    public final p4d F0;
    public boolean G0;
    public x77 H0;
    public vxd I0;
    public final je7 J0;
    public final b96 K0;
    public vxd L0;
    public final c96 M0;
    public final q96 N0;
    public final q0e O0 = r0e.a((Object) null);
    public final khe P0;
    public final s35 Q0;
    public final hq7 X;
    public final s86 Y;
    public final je7 Z;
    public final d86 b;
    public final Context c;
    public final ox3 o;
    public final je7 s0;
    public final je7 t0;
    public final q0e u0;
    public final q0e v0;
    public final q0e w0;
    public final j96 x0;
    public w86 y0;
    public final q0e z0;

    public z96(d86 d86, Context context, qj qjVar, xp7 xp7, hq7 hq7, je7 je7, je7 je72, s86 s86) {
        je7 je73 = iyc.m;
        je7 je74 = iyc.l;
        this.b = d86;
        this.c = context;
        this.o = qjVar;
        this.X = hq7;
        this.Y = s86;
        this.Z = je74;
        this.s0 = je7;
        this.t0 = je72;
        nz4 nz4 = nz4.a;
        this.u0 = r0e.a(nz4);
        Boolean bool = Boolean.FALSE;
        this.v0 = r0e.a(bool);
        q0e a = r0e.a(nz4);
        this.w0 = a;
        this.x0 = new j96(a, this, 2);
        this.y0 = tpa.a(context);
        q0e a2 = r0e.a(bool);
        this.z0 = a2;
        this.A0 = a2;
        q0e a3 = r0e.a((Object) null);
        this.B0 = a3;
        this.C0 = new w7c(a3);
        zt0 a4 = c37.a(-2, 0, 6);
        this.D0 = a4;
        this.E0 = od2.R(a4);
        p4d p4d = xp7.f;
        this.F0 = p4d;
        this.J0 = je73;
        b96 b96 = new b96(this);
        this.K0 = b96;
        c96 c96 = new c96(this);
        this.M0 = c96;
        q96 q96 = new q96(this);
        this.N0 = q96;
        khe khe = new khe(new es3(21, this));
        this.P0 = khe;
        s35 s35 = new s35(0);
        this.Q0 = s35;
        fz6 fz6 = (fz6) hq7;
        x77 x77 = fz6.y0;
        if (x77 == null || !x77.isCompleted()) {
            fz6.f();
        }
        hm9.m("z96", "init", new Object[0]);
        mn5 F = od2.F(new zn5(new j96(d86.b ? fz6.Z : fz6.u0, this, 0), new l96(this, (Continuation) null), 5), ((w9a) s()).e());
        ContextScope contextScope = this.a;
        od2.L(F, j1e.F(contextScope, qjVar));
        od2.L(od2.F(new zn5(new j96(fz6.w0, this, 1), new m96(this, (Continuation) null), 5), ((w9a) s()).a()), j1e.F(contextScope, qjVar));
        if (d86.c) {
            p4d.c.add(c96);
            p4d.e.add(q96);
            p4d.f.add(b96);
            p4d.m.add((d96) khe.getValue());
        }
        int i = ft4.o;
        od2.L(new zn5(m6d.O(s35, z7.S(300, kt4.MILLISECONDS)), new n96(this, (Continuation) null), 5), j1e.F(contextScope, qjVar));
    }

    public static final Object q(z96 z96, List list, Continuation continuation) {
        return j47.t0(((w9a) z96.s()).e(), new x96(z96, list, (Continuation) null), continuation);
    }

    public static void r(z96 z96, boolean z, int i) {
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        z96.getClass();
        hm9.m("z96", "clearSelections()", new Object[0]);
        if (z2) {
            p4d p4d = z96.F0;
            p4d.a.clear();
            p4d.n();
            p4d.b.clear();
            if (((jp) p4d.h).g.getBoolean("app.send.media.as.collage", true)) {
                p4d.l = 3;
            } else {
                p4d.l = 1;
            }
        }
        pnf.n(z96, ((w9a) z96.s()).e().plus(z96.o), (vx3) null, new e96(z96, z, (Continuation) null), 2);
        nz4 nz4 = nz4.a;
        s86 s86 = z96.Y;
        s86.getClass();
        pnf.o(s86.c, new m86(nz4));
    }

    public final void p() {
        hm9.m("z96", "onCleared()", new Object[0]);
        p4d p4d = this.F0;
        p4d.e.remove(this.N0);
        p4d.f.remove(this.K0);
        p4d.c.remove(this.M0);
        p4d.m.remove((d96) this.P0.getValue());
        ConcurrentHashMap concurrentHashMap = ((fz6) this.X).A0;
        for (a86 a86 : concurrentHashMap.keySet()) {
            if (a86 instanceof v76) {
                concurrentHashMap.put(a86, nz4.a);
            }
        }
    }

    public final kke s() {
        return (kke) this.Z.getValue();
    }

    public final int t(zp7 zp7) {
        return this.F0.g(ay7.H(zp7));
    }

    public final int u(zp7 zp7, boolean z) {
        hm9.m("z96", "onItemSelect: " + zp7, new Object[0]);
        this.G0 = true;
        up7 H = ay7.H(zp7);
        p4d p4d = this.F0;
        int g = p4d.g(H);
        if (g == 0 && ((Boolean) this.v0.getValue()).booleanValue()) {
            return 0;
        }
        qyc qyc = (qyc) ((y7d) this.t0.getValue());
        qyc.getClass();
        int q = (int) qyc.q(PmsKey.f63maxattachcount, (long) 12);
        s86 s86 = this.Y;
        if (!((Boolean) s86.b.invoke()).booleanValue() || g != 0 || p4d.b() < q) {
            if (z) {
                p4d.r(H);
            }
            pnf.n(this, ((w9a) s()).e().plus(this.o), (vx3) null, new p96(this, (Continuation) null), 2);
            this.G0 = false;
            return p4d.g(ay7.H(zp7));
        }
        pnf.o(s86.c, new o86(q));
        return 0;
    }
}
