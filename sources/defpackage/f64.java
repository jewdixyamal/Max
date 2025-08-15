package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* renamed from: f64  reason: default package */
public final class f64 {
    public final String a = f64.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ArrayList f;
    public boolean g;

    public f64(je7 je7, khe khe, je7 je72, je7 je73) {
        this.b = je72;
        this.c = je73;
        this.d = je7;
        this.e = khe;
        this.f = new ArrayList();
    }

    public final x54 a() {
        return (x54) this.c.getValue();
    }

    public final boolean b(String str, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("try to open new screen from background thread".toString());
        } else if (w9e.S0(str, ':')) {
            return c(c54.h(str, "max", (String) null), bundle);
        } else {
            hm9.p(this.a, "Trying to open invalid app route=".concat(str), (Throwable) null);
            throw new InvalidDeeplinkNamingException(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: t6a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: t6a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: t6a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: t6a} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0315, code lost:
        if (r3.d != false) goto L_0x032c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x051d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r5 = r20
            java.lang.String r2 = r19.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "goto = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", bundle = "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DeepLinkRouter"
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            a64 r2 = (defpackage.a64) r2
            kpa r2 = r2.a(r1)
            if (r2 == 0) goto L_0x054c
            java.lang.Object r3 = r2.a
            e64 r3 = (defpackage.e64) r3
            java.lang.Object r2 = r2.b
            b64 r2 = (defpackage.b64) r2
            java.lang.String r4 = r19.getQuery()
            r6 = 61
            r7 = 38
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x008a
            boolean r10 = defpackage.w9e.C0(r4)
            if (r10 == 0) goto L_0x004e
            goto L_0x008a
        L_0x004e:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r8)
            r11 = r9
        L_0x0054:
            r12 = 4
            int r13 = defpackage.w9e.z0(r4, r7, r11, r9, r12)
            r14 = -1
            if (r13 != r14) goto L_0x0060
            int r13 = r4.length()
        L_0x0060:
            int r12 = defpackage.w9e.z0(r4, r6, r11, r9, r12)
            if (r12 > r13) goto L_0x0068
            if (r12 != r14) goto L_0x0069
        L_0x0068:
            r12 = r13
        L_0x0069:
            java.lang.String r11 = r4.substring(r11, r12)
            int r12 = r12 + r8
            if (r12 <= r13) goto L_0x0071
            r12 = r13
        L_0x0071:
            java.lang.String r12 = r4.substring(r12, r13)
            java.lang.String r11 = android.net.Uri.decode(r11)
            java.lang.String r12 = android.net.Uri.decode(r12)
            r10.put(r11, r12)
            int r11 = r13 + 1
            int r12 = r4.length()
            if (r11 < r12) goto L_0x0054
            r4 = r10
            goto L_0x008c
        L_0x008a:
            oz4 r4 = defpackage.oz4.a
        L_0x008c:
            java.util.Set r10 = r4.keySet()
            java.util.Set r11 = r3.c
            boolean r10 = r10.containsAll(r11)
            if (r10 == 0) goto L_0x0544
            java.util.Set r10 = r3.e
            if (r10 == 0) goto L_0x0101
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00a3
            goto L_0x0101
        L_0x00a3:
            if (r5 == 0) goto L_0x00af
            java.util.Set r12 = r20.keySet()
            boolean r10 = r12.containsAll(r10)
            if (r10 != 0) goto L_0x0101
        L_0x00af:
            one.me.deeplink.MissedRequiredBundleException r0 = new one.me.deeplink.MissedRequiredBundleException
            if (r5 == 0) goto L_0x00b9
            java.util.Set r2 = r20.keySet()
            r4 = r2
            goto L_0x00ba
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            java.lang.String r2 = r19.toString()
            java.util.Set r5 = r3.e
            r8 = 0
            r10 = 63
            r6 = 0
            r7 = 0
            r9 = 0
            java.lang.String r10 = defpackage.x53.n0(r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x00d7
            r7 = 0
            r9 = 63
            r5 = 0
            r6 = 0
            r8 = 0
            java.lang.String r11 = defpackage.x53.n0(r4, r5, r6, r7, r8, r9)
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            java.lang.String r1 = r19.toString()
            java.lang.String r4 = "Bundle required for "
            java.lang.String r5 = " not contains all params! requiredParams = "
            java.lang.String r6 = ", bundleKeys = "
            java.lang.StringBuilder r2 = defpackage.k7d.k(r4, r2, r5, r10, r6)
            r2.append(r11)
            java.lang.String r4 = ", uri="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ", route = "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0101:
            if (r5 != 0) goto L_0x0109
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            goto L_0x010a
        L_0x0109:
            r10 = r5
        L_0x010a:
            java.util.Set r12 = r4.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0112:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x012e
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r10.putString(r14, r13)
            goto L_0x0112
        L_0x012e:
            je7 r12 = r0.b
            java.lang.Object r12 = r12.getValue()
            h64 r12 = (defpackage.h64) r12
            jaa r12 = (defpackage.jaa) r12
            r12.getClass()
            int[] r13 = defpackage.iaa.$EnumSwitchMapping$0
            int r14 = r3.b
            int r14 = defpackage.au1.s(r14)
            r13 = r13[r14]
            if (r13 != r8) goto L_0x0154
            je7 r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            f5a r12 = (defpackage.f5a) r12
            boolean r12 = r12.d()
            goto L_0x0155
        L_0x0154:
            r12 = r8
        L_0x0155:
            java.lang.String r13 = ":login"
            if (r12 != 0) goto L_0x016b
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            h64 r1 = (defpackage.h64) r1
            jaa r1 = (defpackage.jaa) r1
            r1.getClass()
            boolean r0 = r0.b(r13, r10)
            return r0
        L_0x016b:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder
            r12.<init>()
            android.net.Uri r14 = r3.a
            java.lang.String r15 = defpackage.m64.a(r14)
            android.net.Uri$Builder r12 = r12.encodedPath(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.Set r8 = r3.c
            java.util.Iterator r16 = r8.iterator()
        L_0x0185:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01ae
            java.lang.Object r17 = r16.next()
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r6)
            java.lang.Object r11 = r4.get(r11)
            if (r11 == 0) goto L_0x01a8
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r7)
            goto L_0x0185
        L_0x01a8:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            r0.<init>(r14, r4, r8)
            throw r0
        L_0x01ae:
            java.lang.String r6 = r15.toString()
            java.lang.String r7 = "&"
            java.lang.String r6 = defpackage.w9e.L0(r6, r7)
            android.net.Uri$Builder r6 = r12.encodedQuery(r6)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            l64 r2 = r2.b(r6, r3, r10)     // Catch:{ all -> 0x0535 }
            if (r2 == 0) goto L_0x0527
            boolean r1 = r0.g
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x0296
            x54 r1 = r18.a()
            java.util.ArrayList r1 = r1.a()
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x01e0
            goto L_0x0296
        L_0x01e0:
            java.util.Iterator r1 = r1.iterator()
        L_0x01e4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0296
            java.lang.Object r5 = r1.next()
            faa r5 = (defpackage.faa) r5
            coc r5 = r5.a
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x01f7
            r5 = r4
        L_0x01f7:
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01e4
            x54 r0 = r18.a()
            haa r0 = (defpackage.haa) r0
            foc r1 = r0.f()
            znc r1 = r1.C()
            java.util.ArrayList r1 = r1.e()
            xs r3 = new xs
            r3.<init>((int) r9)
            gkc r4 = new gkc
            r4.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x021d:
            r5 = r4
            fkc r5 = (defpackage.fkc) r5
            java.util.ListIterator r6 = r5.b
            boolean r6 = r6.hasPrevious()
            java.lang.String r7 = r2.a
            if (r6 == 0) goto L_0x023e
            java.util.ListIterator r5 = r5.b
            java.lang.Object r5 = r5.previous()
            coc r5 = (defpackage.coc) r5
            java.lang.String r6 = r5.b
            boolean r6 = defpackage.tpa.f(r6, r7)
            if (r6 != 0) goto L_0x023e
            r3.add(r5)
            goto L_0x021d
        L_0x023e:
            r1.removeAll(r3)
            int r3 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r3)
        L_0x0249:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x025f
            java.lang.Object r4 = r3.previous()
            r5 = r4
            coc r5 = (defpackage.coc) r5
            java.lang.String r5 = r5.b
            boolean r5 = defpackage.tpa.f(r5, r7)
            if (r5 == 0) goto L_0x0249
            goto L_0x0260
        L_0x025f:
            r4 = 0
        L_0x0260:
            coc r4 = (defpackage.coc) r4
            if (r4 == 0) goto L_0x0288
            uu3 r3 = r4.a
            if (r3 != 0) goto L_0x0269
            goto L_0x0288
        L_0x0269:
            boolean r4 = r3 instanceof one.me.sdk.arch.Widget
            if (r4 == 0) goto L_0x0271
            r4 = r3
            one.me.sdk.arch.Widget r4 = (one.me.sdk.arch.Widget) r4
            goto L_0x0272
        L_0x0271:
            r4 = 0
        L_0x0272:
            android.os.Bundle r2 = r2.c
            if (r4 == 0) goto L_0x027a
            r4.updateArgs(r2)
            goto L_0x0288
        L_0x027a:
            android.os.Bundle r4 = r3.getArgs()
            r4.clear()
            android.os.Bundle r3 = r3.getArgs()
            r3.putAll(r2)
        L_0x0288:
            foc r0 = r0.f()
            znc r0 = r0.C()
            r2 = 0
            r0.P(r1, r2)
            r5 = 1
            return r5
        L_0x0296:
            r5 = 1
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x02a1
            java.util.ArrayList r0 = r0.f
            r0.add(r2)
            return r5
        L_0x02a1:
            x54 r1 = r18.a()
            int r1 = r1.b()
            r5 = 2
            if (r1 != 0) goto L_0x02ae
            goto L_0x032c
        L_0x02ae:
            android.net.Uri r1 = r3.a
            java.lang.String r1 = defpackage.m64.a(r1)
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x032c
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            h64 r1 = (defpackage.h64) r1
            jaa r1 = (defpackage.jaa) r1
            java.util.LinkedHashSet r1 = r1.b
            boolean r6 = r1 instanceof java.util.Collection
            if (r6 == 0) goto L_0x02d1
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x02d1
            goto L_0x0318
        L_0x02d1:
            java.util.Iterator r1 = r1.iterator()
        L_0x02d5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0318
            java.lang.Object r6 = r1.next()
            e64 r6 = (defpackage.e64) r6
            x54 r7 = r18.a()
            android.net.Uri r6 = r6.a
            java.lang.String r6 = defpackage.m64.a(r6)
            java.util.ArrayList r8 = r7.a()
            int r8 = r8.size()
            r10 = 1
            if (r8 != r10) goto L_0x02d5
            java.util.ArrayList r7 = r7.a()
            java.lang.Object r7 = defpackage.x53.g0(r7)
            faa r7 = (defpackage.faa) r7
            coc r7 = r7.a
            java.lang.String r7 = r7.b
            if (r7 != 0) goto L_0x0307
            r7 = r4
        L_0x0307:
            java.lang.String r8 = "?"
            java.lang.String r7 = defpackage.w9e.W0(r7, r8)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02d5
            boolean r1 = r3.d
            if (r1 == 0) goto L_0x0318
            goto L_0x032c
        L_0x0318:
            je7 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            i64 r1 = (defpackage.i64) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x032a
            r1 = 3
            goto L_0x032d
        L_0x032a:
            r1 = r5
            goto L_0x032d
        L_0x032c:
            r1 = 1
        L_0x032d:
            java.lang.String r3 = r0.a
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0334
            goto L_0x0365
        L_0x0334:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0365
            us7 r6 = defpackage.us7.X
            java.lang.String r7 = r2.a
            java.lang.String r8 = "show, screen="
            java.lang.String r10 = ", mode="
            java.lang.StringBuilder r7 = defpackage.au1.m(r8, r7, r10)
            r8 = 1
            if (r1 == r8) goto L_0x0358
            r8 = 2
            if (r1 == r8) goto L_0x0355
            r8 = 3
            if (r1 == r8) goto L_0x0352
            java.lang.String r8 = "null"
            goto L_0x035a
        L_0x0352:
            java.lang.String r8 = "BOTTOM_BAR_NAVIGATION"
            goto L_0x035a
        L_0x0355:
            java.lang.String r8 = "PUSH"
            goto L_0x035a
        L_0x0358:
            java.lang.String r8 = "SET_ROOT"
        L_0x035a:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r4.d(r6, r3, r7, r8)
        L_0x0365:
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x051d
            r3 = 1
            if (r1 == r3) goto L_0x0461
            if (r1 != r5) goto L_0x045b
            x54 r0 = r18.a()
            haa r0 = (defpackage.haa) r0
            foc r1 = r0.f()
            znc r1 = r1.C()
            r1.getClass()
            defpackage.ft.e()
            defpackage.ft.e()
            nf0 r3 = r1.a
            java.util.ArrayDeque r4 = r3.a
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L_0x03ce
            java.util.ArrayDeque r3 = r3.a
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L_0x03ab
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x03a1
            goto L_0x03b5
        L_0x03a1:
            int r4 = r3.size()
            int r4 = r4 - r5
            java.lang.Object r3 = r3.get(r4)
            goto L_0x03c7
        L_0x03ab:
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x03b7
        L_0x03b5:
            r3 = 0
            goto L_0x03c7
        L_0x03b7:
            java.lang.Object r4 = r3.next()
        L_0x03bb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03c6
            java.lang.Object r4 = r3.next()
            goto L_0x03bb
        L_0x03c6:
            r3 = r4
        L_0x03c7:
            coc r3 = (defpackage.coc) r3
            r1.E(r3)
            r1 = 1
            goto L_0x03cf
        L_0x03ce:
            r1 = r9
        L_0x03cf:
            foc r3 = r0.f()
            znc r3 = r3.C()
            java.util.ArrayList r3 = r3.e()
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0457
            java.lang.Object r3 = defpackage.x53.g0(r3)
            coc r3 = (defpackage.coc) r3
            uu3 r3 = r3.a
            boolean r4 = r3 instanceof one.me.main.MainScreen
            if (r4 == 0) goto L_0x03f0
            one.me.main.MainScreen r3 = (one.me.main.MainScreen) r3
            goto L_0x03f1
        L_0x03f0:
            r3 = 0
        L_0x03f1:
            if (r3 != 0) goto L_0x03fe
            if (r1 != 0) goto L_0x03fb
            r0.c(r2)
        L_0x03f8:
            r8 = 1
            goto L_0x0526
        L_0x03fb:
            r8 = r9
            goto L_0x0526
        L_0x03fe:
            ox7 r1 = r3.r0()
            java.util.List r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
        L_0x0408:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0427
            java.lang.Object r4 = r1.next()
            r5 = r4
            t6a r5 = (defpackage.t6a) r5
            java.lang.String r5 = r5.d
            e64 r6 = r2.b
            android.net.Uri r6 = r6.a
            java.lang.String r6 = defpackage.m64.a(r6)
            boolean r5 = defpackage.tpa.f(r5, r6)
            if (r5 == 0) goto L_0x0408
            r11 = r4
            goto L_0x0428
        L_0x0427:
            r11 = 0
        L_0x0428:
            t6a r11 = (defpackage.t6a) r11
            if (r11 != 0) goto L_0x0444
            java.lang.Class<one.me.main.MainScreen> r1 = one.me.main.MainScreen.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invalid screen! "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.m0(r1, r2, new java.lang.Object[0])
            goto L_0x0447
        L_0x0444:
            r3.s0(r11)
        L_0x0447:
            r61 r0 = r0.e
            if (r0 == 0) goto L_0x03f8
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            ty3 r0 = (defpackage.ty3) r0
            r0.getClass()
            goto L_0x03f8
        L_0x0457:
            r0.c(r2)
            goto L_0x03f8
        L_0x045b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0461:
            x54 r0 = r18.a()
            haa r0 = (defpackage.haa) r0
            r0.getClass()
            int r1 = r2.d
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x04a3
            k64 r2 = r2.f
            r3 = 1
            if (r1 == r3) goto L_0x0493
            if (r1 != r5) goto L_0x048d
            java.lang.Object r1 = r2.a()
            a8 r1 = (defpackage.a8) r1
            foc r2 = r0.f()
            znc r2 = r2.C()
            r1.a(r2)
            r1 = 1
            goto L_0x050c
        L_0x048d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0493:
            java.lang.Object r1 = r2.a()
            defpackage.au1.r(r1)
            foc r0 = r0.f()
            r0.C()
            r0 = 0
            throw r0
        L_0x04a3:
            android.os.Bundle r1 = r2.c
            java.lang.String r3 = "no_anim"
            java.lang.Boolean r3 = defpackage.i24.u(r3, r1)
            if (r3 == 0) goto L_0x04b2
            boolean r3 = r3.booleanValue()
            goto L_0x04b3
        L_0x04b2:
            r3 = r9
        L_0x04b3:
            java.lang.String r4 = "replace_top"
            java.lang.Boolean r1 = defpackage.i24.u(r4, r1)
            if (r1 == 0) goto L_0x04bf
            boolean r9 = r1.booleanValue()
        L_0x04bf:
            r1 = 1
            r3 = r3 ^ r1
            coc r2 = r0.d(r2, r3)
            boolean r3 = r0.b
            if (r3 == 0) goto L_0x04cf
            java.util.LinkedList r0 = r0.c
            r0.add(r2)
            goto L_0x051b
        L_0x04cf:
            uu3 r3 = r2.a
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            boolean r3 = r3.isDialog()
            if (r3 == 0) goto L_0x04f3
            if (r9 == 0) goto L_0x04e7
            foc r3 = r0.f()
            znc r3 = r3.T()
            r3.L(r2)
            goto L_0x050c
        L_0x04e7:
            foc r3 = r0.f()
            znc r3 = r3.T()
            r3.G(r2)
            goto L_0x050c
        L_0x04f3:
            if (r9 == 0) goto L_0x0501
            foc r3 = r0.f()
            znc r3 = r3.C()
            r3.L(r2)
            goto L_0x050c
        L_0x0501:
            foc r3 = r0.f()
            znc r3 = r3.C()
            r3.G(r2)
        L_0x050c:
            r61 r0 = r0.e
            if (r0 == 0) goto L_0x051b
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            ty3 r0 = (defpackage.ty3) r0
            r0.getClass()
        L_0x051b:
            r8 = r1
            goto L_0x0526
        L_0x051d:
            r1 = 1
            x54 r0 = r18.a()
            r0.c(r2)
            goto L_0x051b
        L_0x0526:
            return r8
        L_0x0527:
            one.me.deeplink.FailedCreateScreenException r7 = new one.me.deeplink.FailedCreateScreenException
            r8 = 0
            r0 = r7
            r1 = r19
            r2 = r6
            r5 = r20
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r7
        L_0x0535:
            r0 = move-exception
            r7 = r0
            one.me.deeplink.FailedCreateScreenException r8 = new one.me.deeplink.FailedCreateScreenException
            r0 = r8
            r1 = r19
            r2 = r6
            r5 = r20
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r8
        L_0x0544:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            java.util.Set r2 = r3.c
            r0.<init>(r1, r4, r2)
            throw r0
        L_0x054c:
            one.me.deeplink.MissedDeeplinkFactoryException r0 = new one.me.deeplink.MissedDeeplinkFactoryException
            java.lang.String r1 = r19.toString()
            java.lang.String r2 = "Missed factory or route for uri="
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.c(android.net.Uri, android.os.Bundle):boolean");
    }

    public final boolean d() {
        coc coc;
        if (a().b() <= 1) {
            return false;
        }
        haa haa = (haa) a();
        if (haa.b) {
            LinkedList linkedList = haa.c;
            if (!linkedList.isEmpty()) {
                linkedList.removeLast();
            }
            return true;
        } else if (haa.b() <= 1 || (coc = (coc) x53.q0(haa.f().C().e())) == null || coc.a == null) {
            return false;
        } else {
            return haa.f().C().C();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(k56 k56) {
        Object obj;
        this.g = true;
        ArrayList arrayList = this.f;
        arrayList.clear();
        try {
            k56.invoke();
            this.g = false;
            x54 a2 = a();
            List<l64> D0 = x53.D0(arrayList);
            haa haa = (haa) a2;
            haa.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (l64 d2 : D0) {
                try {
                    obj = haa.d(d2, true);
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (obj instanceof njc) {
                    obj = null;
                }
                coc coc = (coc) obj;
                if (coc != null) {
                    arrayList2.add(coc);
                }
            }
            haa.f().C().P(arrayList2, haa.e());
            arrayList.clear();
        } catch (Throwable th2) {
            this.g = false;
            throw th2;
        }
    }
}
