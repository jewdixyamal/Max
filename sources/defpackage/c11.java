package defpackage;

import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* renamed from: c11  reason: default package */
public final class c11 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public c11(CallAnalyticsSender callAnalyticsSender, o23 o23, wte wte) {
        this.b = callAnalyticsSender;
        this.c = o23;
        this.d = wte;
        this.a = true;
        this.h = new ey1(5, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List a(java.util.Collection r7, defpackage.nnf r8, defpackage.la1 r9) {
        /*
            r6 = this;
            boolean r0 = r9.g
            nnf r1 = defpackage.nnf.a
            nz4 r2 = defpackage.nz4.a
            r3 = 1
            if (r0 != 0) goto L_0x000e
            if (r8 != r1) goto L_0x000e
        L_0x000b:
            r9 = r2
            goto L_0x0082
        L_0x000e:
            nnf r4 = defpackage.nnf.c
            if (r0 == 0) goto L_0x002b
            if (r8 != r4) goto L_0x002b
            i95 r5 = r9.e
            boolean r5 = r5 instanceof defpackage.h95
            if (r5 == 0) goto L_0x002b
            kl7 r9 = defpackage.j1e.l()
            r9.addAll(r7)
            jb1 r0 = defpackage.jb1.a
            r9.add(r0)
            kl7 r9 = defpackage.j1e.d(r9)
            goto L_0x0082
        L_0x002b:
            boolean r5 = r9.l
            if (r0 == 0) goto L_0x006f
            if (r8 != r4) goto L_0x006f
            if (r5 != 0) goto L_0x006f
            kl7 r0 = defpackage.j1e.l()
            r0.addAll(r7)
            j1e r1 = r9.b
            if (r1 == 0) goto L_0x006a
            m31 r1 = r9.f
            if (r1 == 0) goto L_0x006a
            boolean r1 = r1.e
            if (r1 != r3) goto L_0x006a
            boolean r1 = r6.a
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r6.e
            la1 r1 = (defpackage.la1) r1
            i95 r1 = r1.e
            boolean r1 = r1 instanceof defpackage.e95
            if (r1 != 0) goto L_0x006a
            ib1 r1 = new ib1
            java.lang.String r9 = r9.k
            if (r9 == 0) goto L_0x005f
            java.lang.String r9 = defpackage.c37.D(r9)
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            if (r9 != 0) goto L_0x0064
            java.lang.String r9 = ""
        L_0x0064:
            r1.<init>(r9)
            r0.add(r1)
        L_0x006a:
            kl7 r9 = defpackage.j1e.d(r0)
            goto L_0x0082
        L_0x006f:
            if (r0 == 0) goto L_0x007e
            if (r8 != r1) goto L_0x007e
            if (r5 != 0) goto L_0x0079
            boolean r0 = r6.a
            if (r0 != 0) goto L_0x007e
        L_0x0079:
            boolean r9 = r9.o
            if (r9 == 0) goto L_0x007e
            goto L_0x000b
        L_0x007e:
            java.util.List r9 = defpackage.x53.D0(r7)
        L_0x0082:
            int r8 = r8.ordinal()
            r0 = 0
            if (r8 == 0) goto L_0x00b2
            if (r8 == r3) goto L_0x00c1
            r7 = 2
            if (r8 != r7) goto L_0x00ac
            kl7 r7 = defpackage.j1e.l()
            java.lang.Object r6 = r6.d
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.ArrayList r6 = defpackage.dz7.a(r9, r6, r3, r0)
            r7.addAll(r6)
            kl7 r2 = defpackage.j1e.d(r7)
            goto L_0x00c1
        L_0x00ac:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00b2:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x00b9
            goto L_0x00c1
        L_0x00b9:
            int r6 = r7.size()
            java.util.ArrayList r2 = defpackage.dz7.a(r9, r6, r3, r0)
        L_0x00c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c11.a(java.util.Collection, nnf, la1):java.util.List");
    }

    public mvd b(Map map, zx7 zx7, List list, gg1 gg1) {
        hb1 hb1;
        la1 la1 = (la1) this.e;
        qma qma = null;
        if (la1.s) {
            return null;
        }
        if (la1.q == m38.b) {
            i95 i95 = la1.e;
            if (!((i95 instanceof c95) || (i95 instanceof b95) || (i95 instanceof d95)) && !la1.g) {
                if ((((nnf) this.f) == nnf.a) && (hb1 = (hb1) map.get(gg1)) != null) {
                    qma = dz7.f(hb1, true, la1.m, false);
                }
            }
        }
        return new mvd(list, zx7, qma);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: hb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: hb1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zx7 c(defpackage.nnf r24, java.util.Map r25, defpackage.gg1 r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            java.lang.Object r3 = r0.e
            la1 r3 = (defpackage.la1) r3
            m31 r3 = r3.f
            r4 = 0
            if (r3 == 0) goto L_0x003c
            java.lang.Long r5 = r3.a
            if (r5 == 0) goto L_0x001f
            long r5 = r5.longValue()
            gg1 r7 = new gg1
            r8 = 0
            r7.<init>(r5, r8)
            r12 = r7
            goto L_0x0020
        L_0x001f:
            r12 = r4
        L_0x0020:
            zx7 r5 = new zx7
            r18 = 0
            r19 = 0
            md0 r10 = r3.c
            java.lang.CharSequence r11 = r3.b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 3
            r21 = 0
            r22 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            java.lang.Object r3 = r0.e
            la1 r3 = (defpackage.la1) r3
            java.lang.Object r6 = r0.i
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.h
            gg1 r7 = (defpackage.gg1) r7
            java.lang.Object r7 = r6.get(r7)
            hb1 r7 = (defpackage.hb1) r7
            if (r7 != 0) goto L_0x009a
            gg1 r7 = r3.p
            java.lang.Object r7 = r6.get(r7)
            hb1 r7 = (defpackage.hb1) r7
            if (r7 != 0) goto L_0x009a
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0063:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0085
            java.lang.Object r8 = r7.next()
            r9 = r8
            gg1 r9 = (defpackage.gg1) r9
            fqa r10 = r3.h
            if (r10 == 0) goto L_0x007b
            ig1 r10 = r10.a
            gg1 r10 = r10.getId()
            goto L_0x007c
        L_0x007b:
            r10 = r4
        L_0x007c:
            boolean r9 = defpackage.tpa.f(r9, r10)
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0063
            goto L_0x0086
        L_0x0085:
            r8 = r4
        L_0x0086:
            java.lang.Object r3 = r6.get(r8)
            r7 = r3
            hb1 r7 = (defpackage.hb1) r7
            if (r7 != 0) goto L_0x009a
            java.util.Collection r3 = r6.values()
            java.lang.Object r3 = defpackage.x53.h0(r3)
            r7 = r3
            hb1 r7 = (defpackage.hb1) r7
        L_0x009a:
            java.lang.Object r3 = r0.e
            la1 r3 = (defpackage.la1) r3
            ak1 r6 = r3.i
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00a8
            goto L_0x0134
        L_0x00a8:
            nnf r6 = defpackage.nnf.c
            if (r1 != r6) goto L_0x00ae
            goto L_0x0134
        L_0x00ae:
            nnf r6 = defpackage.nnf.a
            java.lang.Object r8 = r0.c
            je7 r8 = (defpackage.je7) r8
            boolean r3 = r3.g
            if (r3 != 0) goto L_0x00eb
            if (r1 != r6) goto L_0x00eb
            if (r2 != 0) goto L_0x00eb
            java.util.Collection r1 = r25.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d8
            java.lang.Object r2 = r1.next()
            r3 = r2
            hb1 r3 = (defpackage.hb1) r3
            boolean r3 = r3.w0
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00c4
            r4 = r2
        L_0x00d8:
            hb1 r4 = (defpackage.hb1) r4
            if (r4 == 0) goto L_0x0124
            java.lang.Object r0 = r0.e
            la1 r0 = (defpackage.la1) r0
            java.lang.Object r1 = r8.getValue()
            bn1 r1 = (defpackage.bn1) r1
            zx7 r4 = defpackage.dz7.e(r4, r0, r1)
            goto L_0x0134
        L_0x00eb:
            if (r3 != 0) goto L_0x0122
            if (r1 != r6) goto L_0x0122
            java.util.Collection r1 = r25.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r1.next()
            r6 = r3
            hb1 r6 = (defpackage.hb1) r6
            gg1 r6 = r6.a
            boolean r6 = defpackage.tpa.f(r6, r2)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x00f7
            r4 = r3
        L_0x010f:
            hb1 r4 = (defpackage.hb1) r4
            if (r4 == 0) goto L_0x0124
            java.lang.Object r0 = r0.e
            la1 r0 = (defpackage.la1) r0
            java.lang.Object r1 = r8.getValue()
            bn1 r1 = (defpackage.bn1) r1
            zx7 r4 = defpackage.dz7.e(r4, r0, r1)
            goto L_0x0134
        L_0x0122:
            if (r7 != 0) goto L_0x0126
        L_0x0124:
            r4 = r5
            goto L_0x0134
        L_0x0126:
            java.lang.Object r0 = r0.e
            la1 r0 = (defpackage.la1) r0
            java.lang.Object r1 = r8.getValue()
            bn1 r1 = (defpackage.bn1) r1
            zx7 r4 = defpackage.dz7.e(r7, r0, r1)
        L_0x0134:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c11.c(nnf, java.util.Map, gg1):zx7");
    }

    public c11(je7 je7, ivc ivc) {
        this.b = ivc;
        this.c = je7;
        this.d = tu0.r(3, new md1(5, this));
        this.e = new la1();
        this.f = nnf.a;
        this.a = true;
        this.i = oz4.a;
    }
}
