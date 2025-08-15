package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: ka2  reason: default package */
public final class ka2 extends gv4 {
    public static final /* synthetic */ bc7[] E;
    public final h35 A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final long n;
    public final AtomicBoolean o = new AtomicBoolean(false);
    public volatile boolean p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final w4d y;
    public final w4d z;

    static {
        Class<ka2> cls = ka2.class;
        E = new bc7[]{new oi9(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ka2(long j, sx3 sx3) {
        super(sx3);
        boolean z2 = true;
        this.n = j;
        neb neb = neb.a;
        this.q = neb.b();
        je7 c = neb.c();
        this.r = c;
        this.s = neb.d();
        this.t = neb.getAccessor().d(zfc.class);
        this.u = neb.getAccessor().d(s8g.class);
        this.v = neb.getAccessor().d(t12.class);
        this.w = neb.getAccessor().d(r12.class);
        this.x = neb.getAccessor().d(yfc.class);
        this.y = mqd.D();
        this.z = mqd.D();
        this.A = new h35(y53.M(new Object(), new Object()));
        e52 p2 = p();
        this.B = p2 != null && p2.I();
        e52 p3 = p();
        this.C = p3 != null && p3.d0();
        e52 p4 = p();
        this.D = (p4 == null || !p4.t()) ? false : z2;
        od2.L(od2.F(new zn5(new ac(new mqc(new ha2(new t03(((jz2) ((iy2) c.getValue())).m(j), 11), (Continuation) null, this)), 10, this), new w92(this, (Continuation) null), 5), ((w9a) q()).a()), sx3);
    }

    public static final void n(ka2 ka2) {
        vxd S = j47.S(ka2.a, ((w9a) ka2.q()).b(), vx3.b, new z92(ka2, (Continuation) null));
        ka2.z.o1(ka2, E[1], S);
    }

    public static final wu4 o(ka2 ka2, e52 e52) {
        ka2.getClass();
        String g = e52.g(kk0.c, jk0.a);
        long j = e52.b.a;
        e52.l0();
        return new wu4(g, j, e52.x0, e52.q(), (a73) null, e52.k(), e52.b.r0);
    }

    public final void a(int i) {
        j47.T(this.a, ((w9a) q()).a(), (vx3) null, new x92(i, this, (Continuation) null), 2);
    }

    public final void b() {
        bc7[] bc7Arr = E;
        bc7 bc7 = bc7Arr[1];
        w4d w4d = this.z;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[1], (Object) null);
        bc7 bc72 = bc7Arr[0];
        w4d w4d2 = this.y;
        x77 x772 = (x77) w4d2.T0(this, bc72);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        w4d2.o1(this, bc7Arr[0], (Object) null);
    }

    public final boolean d() {
        return this.p;
    }

    public final long e() {
        return this.n;
    }

    public final void g(int i) {
        j47.T(this.a, ((w9a) q()).a(), (vx3) null, new ba2(i, this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ca2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ca2 r0 = (defpackage.ca2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ca2 r0 = new ca2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.util.concurrent.atomic.AtomicLong r6 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            defpackage.od2.a0(r9)
            e52 r9 = r6.p()
            if (r9 != 0) goto L_0x003d
            return r3
        L_0x003d:
            a20 r8 = defpackage.nd7.k(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.m
            je7 r6 = r6.w
            java.lang.Object r6 = r6.getValue()
            r12 r6 = (defpackage.r12) r6
            r0.o = r2
            r0.Z = r4
            long r4 = r9.a
            java.lang.Long r9 = r6.a(r4, r7, r8)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r6 = r2
        L_0x0059:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r6.set(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.h(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e5f i() {
        meb meb;
        e52 p2 = p();
        e5f e5f = e5f.a;
        if (p2 == null) {
            return e5f;
        }
        q0e q0e = this.b;
        meb meb2 = (meb) q0e.getValue();
        if (meb2 != null) {
            meb = meb.a(meb2, p2.b.b(kk0.c, jk0.a), false, 126);
        } else {
            meb = null;
        }
        q0e.setValue(meb);
        return e5f;
    }

    public final void j() {
        j47.T(this.a, ((w9a) q()).b(), (vx3) null, new da2(this, (Continuation) null), 2);
    }

    public final void k() {
        j47.T(this.a, ((w9a) q()).a(), (vx3) null, new ea2(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ia2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ia2 r0 = (defpackage.ia2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ia2 r0 = new ia2
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            defpackage.od2.a0(r11)
            goto L_0x00a3
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            defpackage.od2.a0(r11)
            q0e r11 = r10.j
            java.lang.Object r2 = r11.getValue()
            wu4 r2 = (defpackage.wu4) r2
            if (r2 != 0) goto L_0x0040
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x0040:
            e52 r4 = r10.p()
            if (r4 != 0) goto L_0x0049
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x0049:
            java.lang.Object r5 = r11.getValue()
            wu4 r5 = (defpackage.wu4) r5
            r6 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = r5.d
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            if (r5 != 0) goto L_0x005a
            java.lang.String r5 = ""
        L_0x005a:
            h35 r7 = r10.A
            r8 = 3
            a73 r5 = r7.a(r8, r5)
            if (r5 != 0) goto L_0x0065
            r7 = r3
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            java.lang.Object r8 = r11.getValue()
            wu4 r8 = (defpackage.wu4) r8
            if (r8 == 0) goto L_0x0075
            r9 = 111(0x6f, float:1.56E-43)
            wu4 r5 = defpackage.wu4.c(r8, r6, r5, r6, r9)
            goto L_0x0076
        L_0x0075:
            r5 = r6
        L_0x0076:
            r11.setValue(r5)
            zu4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            q0e r5 = r10.c
            r5.setValue(r11)
            if (r7 != 0) goto L_0x008b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x008b:
            kke r11 = r10.q()
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            ja2 r5 = new ja2
            r5.<init>(r2, r10, r4, r6)
            r0.Y = r3
            java.lang.Object r10 = defpackage.j47.t0(r11, r5, r0)
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        wu4 wu4;
        q0e q0e = this.j;
        if (i == 131072) {
            wu4 wu42 = (wu4) q0e.getValue();
            if (wu42 != null) {
                q0e.m((Object) null, wu4.c(wu42, str, (a73) null, (String) null, 103));
            }
        } else if (i == 4 && (wu4 = (wu4) q0e.getValue()) != null) {
            q0e.m((Object) null, wu4.c(wu4, (String) null, (a73) null, str, 95));
        }
    }

    public final e52 p() {
        return (e52) ((jz2) ((iy2) this.r.getValue())).m(this.n).a.getValue();
    }

    public final kke q() {
        return (kke) this.s.getValue();
    }
}
