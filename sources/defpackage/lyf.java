package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: lyf  reason: default package */
public final class lyf implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final Set d;
    public final zt0 e;
    public wsf f;

    public lyf(ja7 ja7, je7 je7, je7 je72) {
        this.a = ja7;
        this.b = je7;
        this.c = je72;
        v25 v25 = hyf.o;
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            ((hyf) u1Var.next()).getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = x53.H0(arrayList);
        this.e = c37.a(0, 0, 7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r2 = e(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            java.util.Set r0 = r2.d
            boolean r0 = r0.contains(r3)
            e5f r1 = defpackage.e5f.a
            if (r0 != 0) goto L_0x002b
            java.lang.Class<lyf> r4 = defpackage.lyf.class
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown method with name = "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " in JsDelegate: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3 = 0
            defpackage.hm9.p(r4, r2, r3)
            return r1
        L_0x002b:
            hyf r0 = defpackage.hyf.b
            java.lang.String r0 = "WebAppRequestPhone"
            boolean r3 = defpackage.tpa.f(r3, r0)
            if (r3 == 0) goto L_0x003e
            java.lang.Object r2 = r2.e(r4, r5)
            tx3 r3 = defpackage.tx3.a
            if (r2 != r3) goto L_0x003e
            return r2
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyf.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zt0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(wsf wsf) {
        ((y83) this.c.getValue()).c = wsf;
        this.f = wsf;
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [whc, w97, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.iyf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            iyf r0 = (defpackage.iyf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            iyf r0 = new iyf
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            defpackage.od2.a0(r9)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            oyf r7 = r0.X
            lyf r8 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x008d
        L_0x003f:
            whc r7 = r0.Y
            oyf r8 = r0.X
            lyf r2 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0075
        L_0x0049:
            defpackage.od2.a0(r9)
            ja7 r9 = defpackage.ja7.d
            r9.getClass()
            nyf r2 = defpackage.oyf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            oyf r8 = (defpackage.oyf) r8
            whc r9 = new whc
            r9.<init>()
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r5
            zt0 r2 = r7.e
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r7
            r7 = r9
        L_0x0075:
            hyf r9 = defpackage.hyf.b
            jyf r9 = new jyf
            r9.<init>(r2, r8, r6)
            r0.o = r2
            r0.X = r8
            r0.Y = r6
            r0.t0 = r4
            java.lang.Object r9 = r7.c(r9, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r8
            r8 = r2
        L_0x008d:
            w97 r9 = (defpackage.w97) r9
            kyf r2 = new kyf
            r2.<init>(r8, r7, r6)
            r0.o = r6
            r0.X = r6
            r0.t0 = r3
            java.lang.Object r7 = r9.d(r2, r0)
            if (r7 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyf.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
