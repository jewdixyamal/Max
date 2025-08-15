package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: zr  reason: default package */
public final class zr extends pnf {
    public static final /* synthetic */ bc7[] J0;
    public final w4d A0 = mqd.D();
    public final je7 B0;
    public final je7 C0;
    public aq D0;
    public final q0e E0;
    public final w7c F0;
    public final s35 G0;
    public final q0e H0;
    public final w7c I0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final jp c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final qp4 v0;
    public volatile Map w0;
    public volatile Map x0;
    public volatile ze0 y0;
    public volatile ze0 z0;

    static {
        oi9 oi9 = new oi9(zr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        J0 = new bc7[]{oi9};
    }

    public zr(je7 je7, p7b p7b, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79) {
        aq aqVar;
        this.b = je7;
        this.c = p7b.c;
        this.o = je72;
        this.X = je73;
        this.Y = je74;
        this.Z = je75;
        this.s0 = je76;
        this.t0 = je77;
        this.u0 = je78;
        qp4 b2 = qp4.u0.b(t());
        this.v0 = b2;
        oz4 oz4 = oz4.a;
        this.w0 = oz4;
        this.x0 = oz4;
        this.B0 = tu0.r(3, new dr(je78, je79, 1));
        this.C0 = tu0.r(3, new x2((Object) this, 3, (Object) je78));
        gq9 y = ((pl8) b2.Y).y();
        if ((y instanceof bq9) || (y instanceof eq9) || y.equals(fq9.b)) {
            aqVar = aq.a;
        } else if (y.equals(cq9.b)) {
            aqVar = aq.b;
        } else if (y.equals(dq9.b)) {
            aqVar = aq.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.D0 = aqVar;
        List D02 = x53.D0(aq.X);
        ArrayList arrayList = new ArrayList(z53.S(D02, 10));
        Iterator it = D02.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            aq aqVar2 = (aq) it.next();
            if (aqVar2 == this.D0) {
                z = true;
            }
            arrayList.add(new eq(aqVar2, Boolean.valueOf(z)));
        }
        q0e a = r0e.a(arrayList);
        this.E0 = a;
        this.F0 = new w7c(a);
        this.G0 = new s35(0);
        q0e a2 = r0e.a(nz4.a);
        this.H0 = a2;
        this.I0 = new w7c(a2);
        if (w()) {
            s(true, true);
            s(false, false);
            return;
        }
        s(false, true);
        s(true, false);
    }

    public final es8 q(int i, String str) {
        long n = ((p7b) u()).a.n();
        long t = ((p7b) u()).a.t();
        iu8 iu8 = iu8.READ;
        vx8 vx8 = vx8.ACTIVE;
        long n2 = ((p7b) u()).a.n();
        ArrayList arrayList = r0;
        ArrayList arrayList2 = new ArrayList();
        cu8 cu8 = r0;
        cu8 cu82 = new cu8((long) i, 0, 0, 0, n, t, 0, str, iu8, vx8, n2, (String) null, (String) null, (k8g) null, 0, 0, 0, (cu8) null, (String) null, (String) null, false, 0, 0, 2, 0, 0, (cu8) null, 0, 0, 0, 0, 0, arrayList, (ix8) null, (ng4) null);
        return zu8.a((zu8) this.Z.getValue(), cu8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.vr
            if (r0 == 0) goto L_0x0013
            r0 = r8
            vr r0 = (defpackage.vr) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            vr r0 = new vr
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            zr r7 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0056
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            defpackage.od2.a0(r8)
            r0.o = r7
            r0.Z = r3
            kke r8 = r7.v()
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            x5 r2 = new x5
            r3 = 11
            r2.<init>(r3, r7)
            h47 r3 = new h47
            r4 = 0
            r3.<init>(r2, r4)
            java.lang.Object r8 = defpackage.j47.t0(r8, r3, r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r1 = r8
            e52 r1 = (defpackage.e52) r1
            android.content.Context r8 = r7.t()
            int r0 = defpackage.o4a.i
            java.lang.String r8 = defpackage.z7.B(r8, r0)
            r0 = -2
            es8 r3 = r7.q(r0, r8)
            android.content.Context r8 = r7.t()
            int r0 = defpackage.o4a.f
            java.lang.String r8 = defpackage.z7.B(r8, r0)
            r0 = -1
            es8 r2 = r7.q(r0, r8)
            pm2 r8 = new pm2
            zof r4 = defpackage.zof.Seen
            je7 r0 = r7.t0
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            k29 r5 = (defpackage.k29) r5
            qp4 r7 = r7.v0
            fka r7 = r7.i()
            nr2 r6 = r7.a()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(boolean z, boolean z2) {
        pnf.n(this, ((w9a) v()).b(), (vx3) null, new wr(this, z, z2, (Continuation) null), 2);
    }

    public final Context t() {
        return (Context) this.o.getValue();
    }

    public final m7b u() {
        return (m7b) this.b.getValue();
    }

    public final kke v() {
        return (kke) this.u0.getValue();
    }

    public final boolean w() {
        return ((tme) this.X.getValue()).e();
    }

    public final void x() {
        vxd n = pnf.n(this, ((w9a) v()).b(), (vx3) null, new yr(this, (Continuation) null), 2);
        this.A0.o1(this, J0[0], n);
    }
}
