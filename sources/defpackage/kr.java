package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kr  reason: default package */
public final class kr extends pnf {
    public static final /* synthetic */ bc7[] E0;
    public final w7c A0;
    public final bq B0;
    public final s35 C0;
    public final w4d D0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final jp c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public volatile Map w0;
    public volatile Map x0;
    public final qp4 y0;
    public final q0e z0;

    static {
        oi9 oi9 = new oi9(kr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        E0 = new bc7[]{oi9};
    }

    public kr() {
        bq bqVar;
        jq jqVar = jq.a;
        khe d = jqVar.getAccessor().d(m7b.class);
        khe d2 = jqVar.getAccessor().d(Context.class);
        khe d3 = jqVar.getAccessor().d(ma2.class);
        khe d4 = jqVar.getAccessor().d(zu8.class);
        khe d5 = jqVar.getAccessor().d(el3.class);
        khe d6 = jqVar.getAccessor().d(k29.class);
        khe d7 = jqVar.getAccessor().d(kke.class);
        khe d8 = jqVar.getAccessor().d(qe5.class);
        this.b = d;
        this.c = ((p7b) jqVar.getAccessor().c(p7b.class)).c;
        this.o = d2;
        this.X = d3;
        this.Y = d4;
        this.Z = d5;
        this.s0 = d6;
        this.t0 = d7;
        this.u0 = tu0.r(3, new dr(d7, d8, 0));
        this.v0 = tu0.r(3, new x2((Object) this, 2, (Object) d7));
        oz4 oz4 = oz4.a;
        this.w0 = oz4;
        this.x0 = oz4;
        qp4 b2 = qp4.u0.b((Context) d2.getValue());
        this.y0 = b2;
        q0e a = r0e.a((Object) null);
        this.z0 = a;
        this.A0 = new w7c(a);
        gq9 y = ((pl8) b2.Y).y();
        if ((y instanceof bq9) || (y instanceof eq9) || y.equals(fq9.b)) {
            bqVar = bq.a;
        } else if (y.equals(cq9.b)) {
            bqVar = bq.b;
        } else if (y.equals(dq9.b)) {
            bqVar = bq.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.B0 = bqVar;
        this.C0 = new s35(0);
        this.D0 = mqd.D();
        pnf.n(this, (lx3) null, (vx3) null, new ir(this, (Continuation) null), 3);
    }

    public final es8 q(int i, String str, ix8 ix8, boolean z) {
        long j = (long) i;
        je7 je7 = this.b;
        long n = ((p7b) ((m7b) je7.getValue())).a.n();
        long t = z ? 1 : ((p7b) ((m7b) je7.getValue())).a.t();
        iu8 iu8 = iu8.READ;
        vx8 vx8 = vx8.ACTIVE;
        long n2 = ((p7b) ((m7b) je7.getValue())).a.n();
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList();
        cu8 cu8 = r1;
        cu8 cu82 = new cu8(j, 0, 0, 0, n, t, 0, str, iu8, vx8, n2, (String) null, (String) null, (k8g) null, 0, 0, 0, (cu8) null, (String) null, (String) null, false, 0, 0, 2, 0, 0, (cu8) null, 0, 0, 0, 0, 0, arrayList, ix8, (ng4) null);
        return zu8.a((zu8) this.Y.getValue(), cu8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.gr
            if (r0 == 0) goto L_0x0013
            r0 = r14
            gr r0 = (defpackage.gr) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            gr r0 = new gr
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            kr r13 = r0.o
            defpackage.od2.a0(r14)
            goto L_0x005a
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            defpackage.od2.a0(r14)
            r0.o = r13
            r0.Z = r4
            je7 r14 = r13.t0
            java.lang.Object r14 = r14.getValue()
            kke r14 = (defpackage.kke) r14
            w9a r14 = (defpackage.w9a) r14
            nx3 r14 = r14.b()
            x5 r2 = new x5
            r5 = 10
            r2.<init>(r5, r13)
            h47 r5 = new h47
            r5.<init>(r2, r3)
            java.lang.Object r14 = defpackage.j47.t0(r14, r5, r0)
            if (r14 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r6 = r14
            e52 r6 = (defpackage.e52) r6
            je7 r14 = r13.o
            java.lang.Object r14 = r14.getValue()
            android.content.Context r14 = (android.content.Context) r14
            int r0 = defpackage.o4a.g
            java.lang.String r14 = defpackage.z7.B(r14, r0)
            r0 = -3
            es8 r7 = r13.q(r0, r14, r3, r4)
            je7 r14 = r13.o
            java.lang.Object r0 = r14.getValue()
            android.content.Context r0 = (android.content.Context) r0
            int r1 = defpackage.o4a.j
            java.lang.String r0 = defpackage.z7.B(r0, r1)
            ix8 r1 = new ix8
            hx8 r2 = new hx8
            c6c r5 = new c6c
            d6c r8 = defpackage.d6c.EMOJI
            v5c r9 = new v5c
            java.lang.String r10 = "🔥"
            r9.<init>(r10)
            r5.<init>(r8, r9)
            r2.<init>(r5, r4)
            hx8 r5 = new hx8
            c6c r9 = new c6c
            v5c r10 = new v5c
            java.lang.String r11 = "❤️"
            r10.<init>(r11)
            r9.<init>(r8, r10)
            r5.<init>(r9, r4)
            hx8[] r2 = new defpackage.hx8[]{r2, r5}
            java.util.List r2 = defpackage.y53.M(r2)
            r5 = 2
            r1.<init>(r2, r5, r3)
            r2 = 0
            r5 = -2
            es8 r9 = r13.q(r5, r0, r1, r2)
            java.lang.Object r14 = r14.getValue()
            android.content.Context r14 = (android.content.Context) r14
            int r0 = defpackage.o4a.h
            java.lang.String r14 = defpackage.z7.B(r14, r0)
            r0 = -1
            es8 r8 = r13.q(r0, r14, r3, r4)
            zof r10 = defpackage.zof.Seen
            je7 r14 = r13.s0
            java.lang.Object r14 = r14.getValue()
            r11 = r14
            k29 r11 = (defpackage.k29) r11
            qp4 r13 = r13.y0
            fka r13 = r13.i()
            nr2 r12 = r13.a()
            qm2 r13 = new qm2
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Drawable s() {
        return (Drawable) (this.y0.j() ? this.w0 : this.x0).get(this.y0.g().a);
    }

    public final ArrayList t(List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wre wre = (wre) it.next();
            Object obj = (this.y0.j() ? this.w0 : this.x0).get(wre.b);
            rre rre = null;
            rre rre2 = obj instanceof rre ? (rre) obj : null;
            if (rre2 != null) {
                rre = rre2.a(0.45f);
            }
            arrayList.add(wre.k(wre, false, rre, 7));
        }
        return arrayList;
    }
}
