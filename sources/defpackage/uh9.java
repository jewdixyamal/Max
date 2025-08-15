package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: uh9  reason: default package */
public final class uh9 implements ch9, yp {
    public static final long I;
    public static final long J;
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public tb8 B;
    public tb8 C;
    public gd8 D;
    public long E;
    public float F;
    public final q0e G;
    public final w7c H;
    public final Context a;
    public final kke b;
    public final kk5 c;
    public final au8 d;
    public final q33 e;
    public final av0 f;
    public final taa g;
    public final ContextScope h;
    public final je7 i;
    public final je7 j;
    public volatile vxd k;
    public int l;
    public a98 m;
    public gh9 n;
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final LinkedHashMap p = new LinkedHashMap();
    public Handler q;
    public final nn6 r = new nn6(18, this);
    public final q0e s;
    public final w7c t;
    public final q0e u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final float z;

    static {
        int i2 = ft4.o;
        kt4 kt4 = kt4.SECONDS;
        I = z7.R(1, kt4);
        J = z7.R(3, kt4);
    }

    public uh9(Context context, y7d y7d, kke kke, kk5 kk5, au8 au8, q33 q33, av0 av0, zp zpVar, taa taa, ox3 ox3, je7 je7, je7 je72) {
        this.a = context;
        this.b = kke;
        this.c = kk5;
        this.d = au8;
        this.e = q33;
        this.f = av0;
        this.g = taa;
        this.i = je7;
        this.j = je72;
        this.h = j1e.a(((w9a) kke).c().getImmediate().plus(f46.a()).plus(ox3));
        q0e a2 = r0e.a(-1L);
        this.s = a2;
        this.t = new w7c(a2);
        this.u = r0e.a(-1L);
        this.v = 1;
        this.z = 1.0f;
        this.A = true;
        this.E = -1;
        this.F = 1.0f;
        lqf lqf = (lqf) zpVar;
        lqf.i.add(this);
        if (lqf.c()) {
            h();
        }
        q0e a3 = r0e.a(Float.valueOf(0.0f));
        this.G = a3;
        this.H = new w7c(a3);
    }

    public static final tb8 d(uh9 uh9, int i2) {
        if (i2 == -1) {
            uh9.getClass();
            return null;
        }
        a98 a98 = uh9.m;
        if (a98 != null) {
            return a98.x0().n(i2, a98.a, 0).c;
        }
        return null;
    }

    public static final void i(uh9 uh9) {
        uh9.l = 0;
        j47.T(uh9.h, (lx3) null, (vx3) null, new th9(uh9, (Continuation) null), 3);
        if (uh9.n == null) {
            gh9 gh9 = new gh9(uh9);
            a98 a98 = uh9.m;
            if (a98 != null) {
                a98.z(gh9);
            }
            uh9.n = gh9;
        }
        hm9.m("uh9", "notifyListeners", new Object[0]);
        synchronized (uh9.o) {
            Iterator it = uh9.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).a(uh9.l(), uh9.m());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: db8} */
    /* JADX WARNING: type inference failed for: r4v0, types: [ed8, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tb8 j(java.lang.String r21, java.lang.String r22, defpackage.ub8 r23, java.lang.String r24, java.lang.String r25, android.os.Bundle r26) {
        /*
            za8 r0 = new za8
            r0.<init>()
            s74 r1 = new s74
            r1.<init>()
            java.util.List r7 = java.util.Collections.emptyList()
            ffc r9 = defpackage.ffc.X
            fb8 r13 = new fb8
            r13.<init>()
            lb8 r20 = defpackage.lb8.d
            r2 = 0
            if (r21 != 0) goto L_0x001c
            r3 = r2
            goto L_0x0020
        L_0x001c:
            android.net.Uri r3 = android.net.Uri.parse(r21)
        L_0x0020:
            r22.getClass()
            ed8 r4 = new ed8
            r4.<init>()
            r5 = r24
            r4.b = r5
            r5 = r25
            r4.a = r5
            r5 = r26
            r4.H = r5
            int r5 = r23.ordinal()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.G = r5
            gd8 r15 = new gd8
            r15.<init>(r4)
            java.lang.Object r4 = r1.e
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r1.d
            java.util.UUID r4 = (java.util.UUID) r4
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            goto L_0x0053
        L_0x0052:
            r4 = 1
        L_0x0053:
            defpackage.fm9.k(r4)
            if (r3 == 0) goto L_0x0076
            ib8 r14 = new ib8
            java.lang.Object r4 = r1.d
            java.util.UUID r4 = (java.util.UUID) r4
            if (r4 == 0) goto L_0x0065
            eb8 r2 = new eb8
            r2.<init>(r1)
        L_0x0065:
            r5 = r2
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r17 = r14
            goto L_0x0078
        L_0x0076:
            r17 = r2
        L_0x0078:
            tb8 r1 = new tb8
            db8 r2 = new db8
            r2.<init>(r0)
            hb8 r0 = new hb8
            r0.<init>(r13)
            r14 = r1
            r3 = r15
            r15 = r22
            r16 = r2
            r18 = r0
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh9.j(java.lang.String, java.lang.String, ub8, java.lang.String, java.lang.String, android.os.Bundle):tb8");
    }

    public final void a() {
        hm9.m("uh9", "disconnect: ", new Object[0]);
        g();
        this.k = j47.T(this.h, (lx3) null, (vx3) null, new kh9(this, (Continuation) null), 3);
    }

    public final void c() {
        h();
    }

    public final void e(ah9 ah9) {
        synchronized (this.o) {
            try {
                hh9 hh9 = new hh9(ah9);
                fh9 fh9 = (fh9) this.p.put(ah9, hh9);
                if (fh9 != null) {
                    this.o.remove(fh9);
                }
                this.o.add(hh9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        hm9.m("uh9", "cancelPositionObserving", new Object[0]);
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
    }

    public final void g() {
        hm9.m("uh9", "cancelScheduledConnectionAction", new Object[0]);
        vxd vxd = this.k;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.k = null;
    }

    public final void h() {
        g();
        this.k = j47.T(this.h, (lx3) null, (vx3) null, new ih9(this, (Continuation) null), 3);
    }

    public final void k(boolean z2) {
        hm9.m("uh9", "disconnectNow started", new Object[0]);
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
        this.q = null;
        j47.T(this.h, (lx3) null, (vx3) null, new th9(this, (Continuation) null), 3);
        if (z2) {
            g();
        }
    }

    public final long l() {
        String str;
        Long f0;
        tb8 tb8 = this.B;
        if (tb8 == null || (str = tb8.a) == null || (f0 = dae.f0(str)) == null) {
            return -1;
        }
        return f0.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = (r1 = r1.d).H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ub8 m() {
        /*
            r1 = this;
            kj6 r0 = defpackage.ub8.a
            tb8 r1 = r1.B
            if (r1 == 0) goto L_0x0013
            gd8 r1 = r1.d
            if (r1 == 0) goto L_0x0013
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0013
            int r1 = r1.intValue()
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            r0.getClass()
            ub8 r1 = defpackage.kj6.m(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh9.m():ub8");
    }

    public final bh9 n() {
        gd8 gd8 = this.D;
        Map map = null;
        if (gd8 == null) {
            return null;
        }
        CharSequence charSequence = gd8.a;
        if (charSequence == null) {
            charSequence = "";
        }
        Bundle bundle = gd8.I;
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            int Z = mz7.Z(z53.S(keySet, 10));
            if (Z < 16) {
                Z = 16;
            }
            Map linkedHashMap = new LinkedHashMap(Z);
            for (String str : keySet) {
                linkedHashMap.put(str, bundle.get(str));
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = oz4.a;
        }
        return new bh9(gd8.b, charSequence, map);
    }

    public final long o() {
        return ((Number) this.s.getValue()).longValue();
    }

    public final boolean p(long j2) {
        return l() == j2;
    }

    public final void q() {
        j47.T(this.h, (lx3) null, (vx3) null, new mh9(this, (Continuation) null), 3);
    }

    public final void r() {
        j47.T(this.h, (lx3) null, (vx3) null, new nh9(this, (Continuation) null), 3);
    }

    public final void s(ah9 ah9) {
        synchronized (this.o) {
            fh9 fh9 = (fh9) this.p.remove(ah9);
            if (fh9 != null) {
                this.o.remove(fh9);
            }
        }
    }

    public final void t() {
        j47.T(this.h, (lx3) null, (vx3) null, new sh9(this, (Continuation) null), 3);
    }

    public final void u() {
        hm9.m("uh9", "tryToStartPositionObserving", new Object[0]);
        f();
        if (this.q == null) {
            this.q = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.post(this.r);
        }
    }
}
