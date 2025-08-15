package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: zzf  reason: default package */
public final class zzf extends pnf {
    public static final /* synthetic */ bc7[] T0;
    public final je7 A0;
    public wsf B0;
    public final w4d C0 = mqd.D();
    public final c8d D0;
    public final q0e E0;
    public final q0e F0;
    public final q0e G0;
    public final q0e H0;
    public boolean I0;
    public boolean J0;
    public volatile String K0;
    public final w7c L0;
    public final s35 M0;
    public final khe N0;
    public final je7 O0;
    public w97 P0;
    public owf Q0;
    public final ConcurrentHashMap R0;
    public vxd S0;
    public final String X;
    public final r10 Y;
    public final q33 Z;
    public final long b;
    public final osf c;
    public final Long o;
    public final ty3 s0;
    public final gc6 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9 = new oi9(zzf.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        T0 = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, c8d] */
    /* JADX WARNING: type inference failed for: r5v5, types: [a66, ffe] */
    /* JADX WARNING: type inference failed for: r6v15, types: [ffe, e66] */
    public zzf(long j, osf osf, Long l, String str) {
        long j2 = j;
        jwf jwf = jwf.a;
        Class<q33> cls = q33.class;
        long t = ((hyc) ((q33) jwf.getAccessor().c(cls))).t();
        y7d y7d = (y7d) jwf.getAccessor().c(y7d.class);
        ? obj = new Object();
        obj.a = j2;
        obj.b = t;
        obj.c = (Context) jwf.getAccessor().c(Context.class);
        obj.d = new khe(new p3g(obj, y7d, 0));
        obj.e = new khe(new p3g(obj, y7d, 1));
        aa7 aa7 = (aa7) jwf.getAccessor().c(aa7.class);
        khe d = jwf.getAccessor().d(kke.class);
        khe d2 = jwf.getAccessor().d(iy2.class);
        khe d3 = jwf.getAccessor().d(ds3.class);
        khe d4 = jwf.getAccessor().d(vsf.class);
        khe d5 = jwf.getAccessor().d(rf5.class);
        khe d6 = jwf.getAccessor().d(ysf.class);
        khe khe = d3;
        khe d7 = jwf.getAccessor().d(blb.class);
        khe d8 = jwf.getAccessor().d(hp.class);
        this.b = j2;
        this.c = osf;
        this.o = l;
        this.X = str;
        this.Y = obj;
        this.Z = (q33) jwf.getAccessor().c(cls);
        this.s0 = (ty3) jwf.getAccessor().c(ty3.class);
        this.t0 = (gc6) jwf.getAccessor().c(gc6.class);
        this.u0 = d;
        this.v0 = d2;
        this.w0 = d4;
        this.x0 = d5;
        this.y0 = d7;
        this.z0 = d8;
        this.A0 = tu0.r(3, new ile(8, d6));
        ContextScope contextScope = this.a;
        List<ia7> list = aa7.b;
        ? obj2 = new Object();
        obj2.a = contextScope;
        obj2.b = (kke) aa7.a.getValue();
        obj2.c = list;
        obj2.o = c37.a(0, 0, 7);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (ia7 b2 : list) {
            arrayList.add(od2.R(b2.b()));
        }
        int i = wp5.a;
        od2.L(od2.F(new zn5(new m32(arrayList, hz4.a, -2, 1, 1), new ba7(obj2, (Continuation) null), 5), ((w9a) ((kke) obj2.b)).b()), (sx3) obj2.a);
        this.D0 = obj2;
        q0e a = r0e.a(cpa.a);
        this.E0 = a;
        Boolean bool = Boolean.FALSE;
        q0e a2 = r0e.a(bool);
        this.F0 = a2;
        this.G0 = r0e.a(bool);
        mn5 x = od2.x(new j31(od2.M(a, new ffe(2, (Continuation) null)), a2, new xi1(3, (Continuation) null, 7), 4));
        ovc ovc = new ovc(new t03(((ds3) khe.getValue()).c(j2), 11), 10);
        q0e a3 = r0e.a("");
        this.H0 = a3;
        this.J0 = true;
        mn5 x2 = od2.x(od2.t(a3, ovc, x, new ffe(4, (Continuation) null)));
        e0g e0g = new e0g("", false, c0g.a);
        this.L0 = od2.X(x2, this.a, wld.a, e0g);
        this.M0 = new s35(0);
        this.N0 = new khe(new khf(this, 4, d));
        this.O0 = tu0.r(3, new rzd(15, this));
        this.R0 = new ConcurrentHashMap();
        pnf.n(this, (lx3) null, (vx3) null, new lzf(this, (Continuation) null), 3);
        pnf.n(this, ((w9a) ((kke) d.getValue())).a(), (vx3) null, new tzf(this, (Continuation) null), 2);
    }

    /* JADX WARNING: type inference failed for: r9v23, types: [w97] */
    /* JADX WARNING: type inference failed for: r9v24, types: [w97] */
    /* JADX WARNING: type inference failed for: r9v25, types: [w97] */
    /* JADX WARNING: type inference failed for: r9v27, types: [w97] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.zzf r9, defpackage.q8e r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.uzf
            if (r0 == 0) goto L_0x0016
            r0 = r11
            uzf r0 = (defpackage.uzf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            uzf r0 = new uzf
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r7) goto L_0x0057
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            w97 r9 = r0.o
            r10 = r9
            q8e r10 = (defpackage.q8e) r10
            defpackage.od2.a0(r11)
            goto L_0x0182
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0043:
            w97 r9 = r0.o
            r10 = r9
            q8e r10 = (defpackage.q8e) r10
            defpackage.od2.a0(r11)
            goto L_0x013a
        L_0x004d:
            w97 r9 = r0.o
            r10 = r9
            q8e r10 = (defpackage.q8e) r10
            defpackage.od2.a0(r11)
            goto L_0x00eb
        L_0x0057:
            w97 r9 = r0.o
            r10 = r9
            q8e r10 = (defpackage.q8e) r10
            defpackage.od2.a0(r11)
            goto L_0x009d
        L_0x0060:
            defpackage.od2.a0(r11)
            boolean r11 = r10 instanceof defpackage.p8e
            r10 r2 = r9.Y
            r8 = 0
            if (r11 == 0) goto L_0x00b8
            r11 = r10
            p8e r11 = (defpackage.p8e) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.K0
            if (r9 == 0) goto L_0x0077
            boolean r8 = defpackage.tpa.f(r4, r9)
        L_0x0077:
            boolean r9 = r11.f
            if (r8 != 0) goto L_0x0086
            k1g r10 = new k1g
            r10.<init>(r9)
            r11.b(r10)
        L_0x0083:
            r1 = r3
            goto L_0x019d
        L_0x0086:
            o3g r9 = r2.c(r9)
            r2 = r10
            w97 r2 = (defpackage.w97) r2
            r0.o = r2
            r0.Z = r7
            java.lang.String r0 = r11.d
            java.lang.String r11 = r11.e
            java.lang.Boolean r11 = r9.a(r0, r11)
            if (r11 != r1) goto L_0x009d
            goto L_0x019d
        L_0x009d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00ab
            p8e r10 = (defpackage.p8e) r10
            r10.a(r3)
            goto L_0x0083
        L_0x00ab:
            p8e r10 = (defpackage.p8e) r10
            n1g r9 = new n1g
            boolean r11 = r10.f
            r9.<init>(r11)
            r10.b(r9)
            goto L_0x0083
        L_0x00b8:
            boolean r11 = r10 instanceof defpackage.o8e
            if (r11 == 0) goto L_0x0107
            r11 = r10
            o8e r11 = (defpackage.o8e) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.K0
            if (r9 == 0) goto L_0x00c9
            boolean r8 = defpackage.tpa.f(r4, r9)
        L_0x00c9:
            boolean r9 = r11.e
            if (r8 != 0) goto L_0x00d6
            k1g r10 = new k1g
            r10.<init>(r9)
            r11.b(r10)
            goto L_0x0083
        L_0x00d6:
            o3g r9 = r2.c(r9)
            r2 = r10
            w97 r2 = (defpackage.w97) r2
            r0.o = r2
            r0.Z = r6
            java.lang.String r11 = r11.d
            java.lang.Boolean r11 = r9.remove(r11)
            if (r11 != r1) goto L_0x00eb
            goto L_0x019d
        L_0x00eb:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00f9
            o8e r10 = (defpackage.o8e) r10
            r10.a(r3)
            goto L_0x0083
        L_0x00f9:
            o8e r10 = (defpackage.o8e) r10
            k1g r9 = new k1g
            boolean r11 = r10.e
            r9.<init>(r11)
            r10.b(r9)
            goto L_0x0083
        L_0x0107:
            boolean r11 = r10 instanceof defpackage.n8e
            if (r11 == 0) goto L_0x0151
            r11 = r10
            n8e r11 = (defpackage.n8e) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.K0
            if (r9 == 0) goto L_0x0118
            boolean r8 = defpackage.tpa.f(r4, r9)
        L_0x0118:
            if (r8 != 0) goto L_0x0124
            j1g r9 = new j1g
            r9.<init>()
            r11.b(r9)
            goto L_0x0083
        L_0x0124:
            boolean r9 = r11.e
            o3g r9 = r2.c(r9)
            r2 = r10
            w97 r2 = (defpackage.w97) r2
            r0.o = r2
            r0.Z = r5
            java.lang.String r11 = r11.d
            java.lang.String r11 = r9.b(r11)
            if (r11 != r1) goto L_0x013a
            goto L_0x019d
        L_0x013a:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0145
            n8e r10 = (defpackage.n8e) r10
            r10.a(r11)
            goto L_0x0083
        L_0x0145:
            n8e r10 = (defpackage.n8e) r10
            j1g r9 = new j1g
            r9.<init>()
            r10.b(r9)
            goto L_0x0083
        L_0x0151:
            boolean r11 = r10 instanceof defpackage.m8e
            if (r11 == 0) goto L_0x019e
            r11 = r10
            m8e r11 = (defpackage.m8e) r11
            java.lang.String r5 = r11.c
            java.lang.String r9 = r9.K0
            if (r9 == 0) goto L_0x0162
            boolean r8 = defpackage.tpa.f(r5, r9)
        L_0x0162:
            if (r8 != 0) goto L_0x016e
            j1g r9 = new j1g
            r9.<init>()
            r11.b(r9)
            goto L_0x0083
        L_0x016e:
            boolean r9 = r11.d
            o3g r9 = r2.c(r9)
            r11 = r10
            w97 r11 = (defpackage.w97) r11
            r0.o = r11
            r0.Z = r4
            java.lang.Boolean r11 = r9.clear()
            if (r11 != r1) goto L_0x0182
            goto L_0x019d
        L_0x0182:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x0191
            m8e r10 = (defpackage.m8e) r10
            r10.a(r3)
            goto L_0x0083
        L_0x0191:
            m8e r10 = (defpackage.m8e) r10
            j1g r9 = new j1g
            r9.<init>()
            r10.b(r9)
            goto L_0x0083
        L_0x019d:
            return r1
        L_0x019e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.q(zzf, q8e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.zzf r4, defpackage.w97 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.vzf
            if (r0 == 0) goto L_0x0016
            r0 = r6
            vzf r0 = (defpackage.vzf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            vzf r0 = new vzf
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            zzf r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            defpackage.od2.a0(r6)
            w97 r6 = r4.P0
            if (r6 == 0) goto L_0x0043
            s0 r2 = new s0
            r2.<init>()
            r6.b(r2)
        L_0x0043:
            r4.P0 = r5
            r0.o = r4
            r0.Z = r3
            q0e r5 = r4.H0
            java.lang.Object r6 = defpackage.od2.A(r5, r0)
            if (r6 != r1) goto L_0x0052
            goto L_0x0060
        L_0x0052:
            java.lang.String r6 = (java.lang.String) r6
            s35 r4 = r4.M0
            hzf r5 = new hzf
            r5.<init>(r6)
            defpackage.pnf.o(r4, r5)
            e5f r1 = defpackage.e5f.a
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.r(zzf, w97, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        qxf qxf = (qxf) this.A0.getValue();
        ((av0) qxf.a.getValue()).f(qxf);
        this.B0 = null;
        for (ia7 d : (List) this.D0.c) {
            d.d((wsf) null);
        }
    }

    public final ouf s() {
        return (ouf) this.N0.getValue();
    }

    public final void t(boolean z) {
        ouf s = s();
        s.getClass();
        j47.T(s.c, (lx3) null, (vx3) null, new utf(s, (Continuation) null, z), 3);
    }

    public final void u(boolean z) {
        if (z) {
            owf owf = this.Q0;
            if (owf != null) {
                owf.a(e5f.a);
            }
        } else {
            owf owf2 = this.Q0;
            if (owf2 != null) {
                owf2.b(new Throwable());
            }
        }
        this.Q0 = null;
    }

    public final void v(boolean z) {
        w97 w97 = this.P0;
        if (w97 != null) {
            if (z) {
                j47.T(this.a, ((w9a) ((kke) this.u0.getValue())).b(), (vx3) null, new rzf(this, w97, (Continuation) null), 2);
                return;
            }
            w97.b(new Throwable());
        }
    }
}
