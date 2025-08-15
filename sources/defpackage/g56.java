package defpackage;

import java.util.Locale;

/* renamed from: g56  reason: default package */
public abstract class g56 {
    public static final qec a = new qec("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");

    public static e56 a(String str) {
        e56 e56 = null;
        if (w9e.C0(str)) {
            return null;
        }
        String k = b0d.k(str);
        String upperCase = str.toUpperCase(Locale.getDefault());
        qec qec = a;
        String b = qec.b("", k);
        e56 e562 = b.length() > 0 ? new e56(b, qec.b("", upperCase), (e56) null) : null;
        if (!tpa.f(e562 != null ? e562.b : null, upperCase) || !tpa.f(e562.a, k)) {
            e56 = e562;
        }
        return new e56(k, upperCase, e56);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: e56} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: e56} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: e56} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: e56} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: e56} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e56 b(java.util.Collection r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0009:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r10.next()
            jl3 r1 = (defpackage.jl3) r1
            jl3 r3 = defpackage.jl3.e
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x001f
            goto L_0x002b
        L_0x001f:
            java.lang.String r1 = r1.a()
            int r3 = r1.length()
            if (r3 != 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r1
        L_0x002b:
            if (r2 == 0) goto L_0x0009
            r0.add(r2)
            goto L_0x0009
        L_0x0031:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0039
            goto L_0x010e
        L_0x0039:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            e56 r1 = a(r1)
            if (r1 == 0) goto L_0x0042
            r10.add(r1)
            goto L_0x0042
        L_0x0058:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0060
            goto L_0x010e
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r5 = r10.iterator()
            r6 = 0
        L_0x0079:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e5
            int r7 = r6 + 1
            java.lang.Object r8 = r5.next()
            e56 r8 = (defpackage.e56) r8
            java.lang.String r9 = r8.a
            r0.append(r9)
            java.lang.String r9 = r8.b
            r1.append(r9)
            e56 r8 = r8.c
            if (r8 == 0) goto L_0x0098
            java.lang.String r9 = r8.b
            goto L_0x0099
        L_0x0098:
            r9 = r2
        L_0x0099:
            if (r9 == 0) goto L_0x00ab
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00ab
        L_0x00a2:
            if (r8 == 0) goto L_0x00a7
            java.lang.String r9 = r8.b
            goto L_0x00a8
        L_0x00a7:
            r9 = r2
        L_0x00a8:
            r4.append(r9)
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            java.lang.String r9 = r8.a
            goto L_0x00b1
        L_0x00b0:
            r9 = r2
        L_0x00b1:
            if (r9 == 0) goto L_0x00c3
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            if (r8 == 0) goto L_0x00bf
            java.lang.String r8 = r8.a
            goto L_0x00c0
        L_0x00bf:
            r8 = r2
        L_0x00c0:
            r3.append(r8)
        L_0x00c3:
            int r8 = defpackage.y53.L(r10)
            if (r6 == r8) goto L_0x00e3
            r6 = 44
            r0.append(r6)
            r1.append(r6)
            int r8 = r4.length()
            if (r8 <= 0) goto L_0x00da
            r4.append(r6)
        L_0x00da:
            int r8 = r3.length()
            if (r8 <= 0) goto L_0x00e3
            r3.append(r6)
        L_0x00e3:
            r6 = r7
            goto L_0x0079
        L_0x00e5:
            int r10 = r3.length()
            if (r10 <= 0) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            int r10 = r4.length()
            if (r10 <= 0) goto L_0x0100
        L_0x00f2:
            e56 r10 = new e56
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r4.toString()
            r10.<init>(r3, r4, r2)
            r2 = r10
        L_0x0100:
            e56 r10 = new e56
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            r10.<init>(r0, r1, r2)
            r2 = r10
        L_0x010e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.b(java.util.Collection):e56");
    }

    public static String c(String str) {
        return zr6.i("*", str, "*");
    }

    public static String d(String str) {
        return zr6.i("%", str, "%");
    }

    public static f56 e(String str) {
        e56 a2 = a(str);
        e56 e56 = null;
        if (a2 == null) {
            return null;
        }
        String str2 = a2.b;
        String c = c(str2);
        String str3 = a2.a;
        String c2 = c(str3);
        e56 e562 = a2.c;
        e56 e563 = new e56(c2, c, e562 != null ? e56.a(e562, c(e562.b)) : null);
        String d = d(str2);
        String d2 = d(str3);
        if (e562 != null) {
            e56 = e56.a(e562, d(e562.b));
        }
        return new f56(e563, new e56(d2, d, e56));
    }
}
