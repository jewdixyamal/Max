package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import java.util.HashMap;

/* renamed from: oj9  reason: default package */
public final class oj9 extends u2 {
    public final GestureDetector X;
    public final Handler Y = new Handler(Looper.getMainLooper());
    public final Rect Z = new Rect();
    public final cn4 c;
    public final cn4 o;
    public rk9 s0;
    public final ad t0;
    public wk9 u0;

    public oj9(sk9 sk9, rk9 rk9, Context context, ad adVar) {
        super(0, (Object) sk9);
        this.s0 = rk9;
        this.t0 = adVar;
        cn4 cn4 = new cn4(context);
        this.c = cn4;
        cn4 cn42 = new cn4(context);
        this.o = cn42;
        this.X = new GestureDetector(context, new q00(14, this));
        cn4.a = new y8((Object) this);
        cn42.a = new bkg(19, this);
        sk9.A(this.s0);
        sk9.r(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, qk9] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r4 = r1.E0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Z1(defpackage.oj9 r8, boolean r9, int r10) {
        /*
            wk9 r0 = r8.u0
            if (r0 != 0) goto L_0x0006
            goto L_0x0094
        L_0x0006:
            android.os.Handler r0 = r8.Y
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            rk9 r1 = r8.s0
            qk9 r2 = new qk9
            r2.<init>()
            int r1 = r1.a
            r2.a = r10
            r2.b = r9
            r1 = 1
            r2.c = r1
            rk9 r1 = new rk9
            r1.<init>((defpackage.qk9) r2)
            r8.s0 = r1
            java.lang.Object r2 = r8.b
            kk9 r2 = (defpackage.kk9) r2
            sk9 r2 = (defpackage.sk9) r2
            r2.A(r1)
            wk9 r1 = r8.u0
            r2 = 0
            if (r1 != 0) goto L_0x0034
        L_0x0032:
            r4 = r2
            goto L_0x003b
        L_0x0034:
            hkf r4 = r1.E0
            if (r4 != 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            long r4 = r4.k
        L_0x003b:
            r6 = 10000(0x2710, double:4.9407E-320)
            if (r9 == 0) goto L_0x0041
            long r4 = r4 + r6
            goto L_0x0042
        L_0x0041:
            long r4 = r4 - r6
        L_0x0042:
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r6 = r2
            goto L_0x004d
        L_0x0046:
            hkf r1 = r1.E0
            if (r1 != 0) goto L_0x004b
            goto L_0x0044
        L_0x004b:
            long r6 = r1.j
        L_0x004d:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            r8.b2(r10, r9)
            r8.a2()
            r4 = r6
        L_0x0058:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r8.b2(r10, r9)
            r8.a2()
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            wk9 r1 = r8.u0
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0070:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r1.next()
            ol9 r4 = (defpackage.ol9) r4
            r4.Y0(r2)
            goto L_0x0070
        L_0x0080:
            nj9 r1 = new nj9
            r1.<init>(r8, r9, r10)
            r9 = 600(0x258, double:2.964E-321)
            r0.postDelayed(r1, r9)
            nn6 r1 = new nn6
            r2 = 20
            r1.<init>(r2, r8)
            r0.postDelayed(r1, r9)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj9.Z1(oj9, boolean, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, qk9] */
    public final void a2() {
        rk9 rk9 = this.s0;
        ? obj = new Object();
        obj.a = rk9.a;
        obj.b = rk9.b;
        obj.c = rk9.c;
        obj.a = 0;
        obj.c = false;
        rk9 rk92 = new rk9((qk9) obj);
        this.s0 = rk92;
        ((sk9) ((kk9) this.b)).A(rk92);
        this.c.c = 0;
        this.o.c = 0;
    }

    public final void b2(int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("forward", Boolean.valueOf(z));
        hashMap.put("seconds", Integer.valueOf(i));
        this.t0.h("SEEK_BY_DOUBLE_TAP", hashMap);
    }
}
