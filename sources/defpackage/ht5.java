package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ht5  reason: default package */
public final class ht5 {
    public final String a;
    public final yu2 b;
    public final ta2 c;
    public final q0e d;
    public final t03 e;
    public final AtomicInteger f;
    public final q0e g;
    public final String h;

    public ht5(String str, yu2 yu2, ta2 ta2, av0 av0, nx3 nx3) {
        this.a = str;
        this.b = yu2;
        this.c = ta2;
        q0e a2 = r0e.a((Object) null);
        this.d = a2;
        this.e = new t03(new w7c(a2), 11);
        ContextScope a3 = j1e.a(nx3);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f = atomicInteger;
        q0e a4 = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.g = a4;
        this.h = wg0.i("FolderCountersDataSource-", str);
        av0.d(this);
        ki4 ki4 = new ki4(new mn5[]{((zb2) ta2).g(), a4}, 1);
        int i = ft4.o;
        od2.L(new zn5(nu0.Q(ki4, z7.R(1000, kt4.MILLISECONDS)), new ft5(this, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ht5 r12, kotlin.coroutines.Continuation r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof defpackage.gt5
            if (r0 == 0) goto L_0x0016
            r0 = r13
            gt5 r0 = (defpackage.gt5) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            gt5 r0 = new gt5
            r0.<init>(r12, r13)
        L_0x001b:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            tu2 r12 = r0.X
            ht5 r0 = r0.o
            defpackage.od2.a0(r13)
            r5 = r12
            goto L_0x0094
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            ht5 r12 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x005e
        L_0x0042:
            defpackage.od2.a0(r13)
            java.lang.String r13 = r12.h
            java.lang.String r2 = "updateCounter"
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            ta2 r13 = r12.c
            java.lang.String r2 = r12.a
            r0.o = r12
            r0.s0 = r4
            zb2 r13 = (defpackage.zb2) r13
            java.lang.Object r13 = r13.d(r2, r0)
            if (r13 != r1) goto L_0x005e
            goto L_0x0113
        L_0x005e:
            at5 r13 = (defpackage.at5) r13
            if (r13 != 0) goto L_0x0065
        L_0x0062:
            r1 = r3
            goto L_0x0113
        L_0x0065:
            boolean r2 = r13.b()
            if (r2 == 0) goto L_0x006e
            ru2 r13 = defpackage.ru2.a
            goto L_0x007f
        L_0x006e:
            su2 r2 = new su2
            java.util.Set r7 = r13.v0
            java.util.Set r8 = r13.Y
            java.util.Set r9 = r13.w0
            java.util.Set r10 = r13.x0
            java.util.Map r11 = r13.A0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r2
        L_0x007f:
            yu2 r2 = r12.b
            r0.o = r12
            r0.X = r13
            r0.s0 = r5
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r0 = r2.r(r13)
            if (r0 != r1) goto L_0x0091
            goto L_0x0113
        L_0x0091:
            r5 = r13
            r13 = r0
            r0 = r12
        L_0x0094:
            java.util.List r13 = (java.util.List) r13
            yu2 r12 = r0.b
            r4 = r12
            jz2 r4 = (defpackage.jz2) r4
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r12 = r4.s(r5, r6, r8, r9)
            java.util.ArrayList r12 = defpackage.x53.t0(r13, r12)
            boolean r13 = r12.isEmpty()
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L_0x00b5
            goto L_0x00d4
        L_0x00b5:
            java.util.Iterator r12 = r12.iterator()
        L_0x00b9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00d4
            java.lang.Object r13 = r12.next()
            e52 r13 = (defpackage.e52) r13
            k92 r13 = r13.b
            int r13 = r13.m
            if (r13 <= 0) goto L_0x00b9
            int r2 = r2 + 1
            if (r2 < 0) goto L_0x00d0
            goto L_0x00b9
        L_0x00d0:
            defpackage.y53.Q()
            throw r1
        L_0x00d4:
            java.lang.String r12 = r0.h
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto L_0x00db
            goto L_0x0102
        L_0x00db:
            boolean r4 = r13.c()
            if (r4 == 0) goto L_0x0102
            us7 r4 = defpackage.us7.X
            q0e r5 = r0.d
            java.lang.Object r5 = r5.getValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "updateCounter: unreadChatsCount = "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = ", old = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r13.d(r4, r12, r5, r1)
        L_0x0102:
            q0e r12 = r0.d
            if (r2 > 0) goto L_0x0109
            hy3 r13 = defpackage.hy3.b
            goto L_0x010e
        L_0x0109:
            hy3 r13 = new hy3
            r13.<init>(r2)
        L_0x010e:
            r12.m(r1, r13)
            goto L_0x0062
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht5.a(ht5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        this.g.m((Object) null, Integer.valueOf(this.f.incrementAndGet()));
    }

    @uae
    public final void onEvent(vz2 vz2) {
        b();
    }

    @uae
    public final void onEvent(kz6 kz6) {
        b();
    }

    @uae
    public final void onEvent(ut7 ut7) {
        b();
    }
}
