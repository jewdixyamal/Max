package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: f2g  reason: default package */
public final class f2g implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final Set d;
    public final zt0 e;
    public wsf f;

    public f2g(ja7 ja7, je7 je7, je7 je72) {
        this.a = ja7;
        this.b = je7;
        this.c = je72;
        v25 v25 = v1g.v0;
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(((v1g) u1Var.next()).a);
        }
        this.d = x53.H0(arrayList);
        this.e = c37.a(0, 0, 7);
    }

    public static final void e(f2g f2g, String str) {
        wsf wsf = f2g.f;
        if (wsf != null) {
            iwf.a((iwf) f2g.b.getValue(), str, wsf.a, wsf.b, true, 0, (Integer) null, (Integer) null, 240);
        }
    }

    public static ga7 f(Throwable th) {
        o1g o1g = th instanceof o1g ? (o1g) th : null;
        int i = 1;
        int i2 = 3;
        if (o1g instanceof n1g) {
            if (((n1g) o1g).a) {
                i = 3;
            }
            return new ea7(new ha7("too_many_keys", i));
        }
        int i3 = 4;
        if (o1g instanceof k1g) {
            if (((k1g) o1g).a) {
                i3 = 6;
            }
            return new ea7(new ha7("not_found", i3));
        } else if (o1g instanceof j1g) {
            return new ea7(new ha7("not_found", 1));
        } else {
            if (o1g == null) {
                return fa7.d;
            }
            if (o1g instanceof l1g) {
                if (((l1g) o1g).a) {
                    i2 = 5;
                }
                return new ea7(new ha7("too_large_key", i2));
            } else if (o1g instanceof m1g) {
                if (!((m1g) o1g).a) {
                    i3 = 2;
                }
                return new ea7(new ha7("too_large_value", i3));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object h;
        boolean contains = this.d.contains(str);
        e5f e5f = e5f.a;
        if (!contains) {
            String name = f2g.class.getName();
            hm9.p(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return e5f;
        }
        v1g v1g = v1g.SECURE_SAVE_KEY;
        boolean f2 = tpa.f(str, "WebAppSecureStorageSaveKey");
        tx3 tx3 = tx3.a;
        if (f2) {
            Object j = j(str2, true, continuation);
            return j == tx3 ? j : e5f;
        } else if (tpa.f(str, "WebAppSecureStorageGetKey")) {
            Object i = i(str2, true, continuation);
            return i == tx3 ? i : e5f;
        } else if (tpa.f(str, "WebAppSecureStorageClear")) {
            Object h2 = h(str2, true, continuation);
            return h2 == tx3 ? h2 : e5f;
        } else if (tpa.f(str, "WebAppDeviceStorageSaveKey")) {
            Object j2 = j(str2, false, continuation);
            return j2 == tx3 ? j2 : e5f;
        } else if (!tpa.f(str, "WebAppDeviceStorageGetKey")) {
            return (!tpa.f(str, "WebAppDeviceStorageClear") || (h = h(str2, false, continuation)) != tx3) ? e5f : h;
        } else {
            Object i2 = i(str2, false, continuation);
            return i2 == tx3 ? i2 : e5f;
        }
    }

    public final zt0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(wsf wsf) {
        this.f = wsf;
    }

    public final y83 g() {
        return (y83) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.w1g
            if (r0 == 0) goto L_0x0013
            r0 = r12
            w1g r0 = (defpackage.w1g) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            w1g r0 = new w1g
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            defpackage.od2.a0(r12)
            goto L_0x00b6
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            v1g r9 = r0.Y
            i1g r10 = r0.X
            f2g r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00a0
        L_0x0041:
            m8e r9 = r0.Z
            v1g r10 = r0.Y
            i1g r11 = r0.X
            f2g r2 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x0087
        L_0x004d:
            defpackage.od2.a0(r12)
            ja7 r12 = defpackage.ja7.d
            r12.getClass()
            h1g r2 = defpackage.i1g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r12.a(r2, r10)
            i1g r10 = (defpackage.i1g) r10
            if (r11 == 0) goto L_0x0066
            v1g r12 = defpackage.v1g.SECURE_CLEAR_KEYS
            goto L_0x0068
        L_0x0066:
            v1g r12 = defpackage.v1g.CLEAR_KEYS
        L_0x0068:
            m8e r2 = new m8e
            java.lang.String r7 = r10.a
            r2.<init>(r7, r11)
            r0.o = r9
            r0.X = r10
            r0.Y = r12
            r0.Z = r2
            r0.u0 = r5
            zt0 r11 = r9.e
            java.lang.Object r11 = r11.o(r2, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r11 = r10
            r10 = r12
            r8 = r2
            r2 = r9
            r9 = r8
        L_0x0087:
            x1g r12 = new x1g
            r12.<init>(r11, r10, r2, r6)
            r0.o = r2
            r0.X = r11
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r12 = r9.c(r12, r0)
            if (r12 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r9 = r10
            r10 = r11
            r11 = r2
        L_0x00a0:
            w97 r12 = (defpackage.w97) r12
            y1g r2 = new y1g
            r2.<init>(r10, r9, r11, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r12.d(r2, r0)
            if (r9 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.h(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.z1g
            if (r0 == 0) goto L_0x0013
            r0 = r13
            z1g r0 = (defpackage.z1g) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            z1g r0 = new z1g
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            defpackage.od2.a0(r13)
            goto L_0x00b8
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            v1g r10 = r0.Y
            r1g r11 = r0.X
            f2g r12 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x00a2
        L_0x0041:
            n8e r10 = r0.Z
            v1g r11 = r0.Y
            r1g r12 = r0.X
            f2g r2 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x0089
        L_0x004d:
            defpackage.od2.a0(r13)
            ja7 r13 = defpackage.ja7.d
            r13.getClass()
            q1g r2 = defpackage.r1g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r11 = r13.a(r2, r11)
            r1g r11 = (defpackage.r1g) r11
            if (r12 == 0) goto L_0x0066
            v1g r13 = defpackage.v1g.SECURE_GET_KEY
            goto L_0x0068
        L_0x0066:
            v1g r13 = defpackage.v1g.GET_KEY
        L_0x0068:
            n8e r2 = new n8e
            java.lang.String r7 = r11.a
            java.lang.String r8 = r11.c
            r2.<init>(r7, r8, r12)
            r0.o = r10
            r0.X = r11
            r0.Y = r13
            r0.Z = r2
            r0.u0 = r5
            zt0 r12 = r10.e
            java.lang.Object r12 = r12.o(r2, r0)
            if (r12 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r12 = r11
            r11 = r13
            r9 = r2
            r2 = r10
            r10 = r9
        L_0x0089:
            a2g r13 = new a2g
            r13.<init>(r12, r11, r2, r6)
            r0.o = r2
            r0.X = r12
            r0.Y = r11
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r13 = r10.c(r13, r0)
            if (r13 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r10 = r11
            r11 = r12
            r12 = r2
        L_0x00a2:
            w97 r13 = (defpackage.w97) r13
            b2g r2 = new b2g
            r2.<init>(r11, r10, r12, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r10 = r13.d(r2, r0)
            if (r10 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.i(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.c2g
            if (r3 == 0) goto L_0x001a
            r3 = r2
            c2g r3 = (defpackage.c2g) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.u0 = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            c2g r3 = new c2g
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r9.s0
            tx3 r3 = defpackage.tx3.a
            int r4 = r9.u0
            e5f r10 = defpackage.e5f.a
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L_0x006c
            if (r4 == r11) goto L_0x0067
            if (r4 == r8) goto L_0x0063
            if (r4 == r7) goto L_0x0052
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            defpackage.od2.a0(r2)
            goto L_0x0115
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            v1g r0 = r9.Y
            i2g r1 = r9.X
            f2g r4 = r9.o
            defpackage.od2.a0(r2)
            goto L_0x00ff
        L_0x0052:
            w97 r0 = r9.Z
            v1g r1 = r9.Y
            i2g r4 = r9.X
            f2g r7 = r9.o
            defpackage.od2.a0(r2)
            r15 = r0
            r13 = r1
            r1 = r4
            r0 = r7
            goto L_0x00e7
        L_0x0063:
            defpackage.od2.a0(r2)
            goto L_0x00c2
        L_0x0067:
            defpackage.od2.a0(r2)
            goto L_0x0131
        L_0x006c:
            defpackage.od2.a0(r2)
            ja7 r2 = defpackage.ja7.d
            r2.getClass()
            h2g r4 = defpackage.i2g.Companion
            cc7 r4 = r4.serializer()
            r13 = r17
            java.lang.Object r2 = r2.a(r4, r13)
            i2g r2 = (defpackage.i2g) r2
            if (r1 == 0) goto L_0x0088
            v1g r4 = defpackage.v1g.SECURE_SAVE_KEY
        L_0x0086:
            r13 = r4
            goto L_0x008b
        L_0x0088:
            v1g r4 = defpackage.v1g.SAVE_KEY
            goto L_0x0086
        L_0x008b:
            java.lang.String r4 = r2.c
            java.nio.charset.Charset r14 = defpackage.a52.a
            byte[] r4 = r4.getBytes(r14)
            int r4 = r4.length
            r15 = 128(0x80, float:1.794E-43)
            zt0 r11 = r0.e
            if (r4 > r15) goto L_0x0116
            java.lang.String r4 = r2.d
            if (r4 == 0) goto L_0x00c3
            byte[] r14 = r4.getBytes(r14)
            int r14 = r14.length
            r15 = 4000(0xfa0, float:5.605E-42)
            if (r14 > r15) goto L_0x00a8
            goto L_0x00c3
        L_0x00a8:
            m1g r4 = new m1g
            r4.<init>(r1)
            ga7 r6 = f(r4)
            y83 r4 = r16.g()
            r9.u0 = r8
            java.lang.String r8 = r2.b
            r5 = r11
            r7 = r13
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x00c2
            return r3
        L_0x00c2:
            return r10
        L_0x00c3:
            java.lang.String r8 = r2.c
            java.lang.String r14 = r2.a
            if (r4 != 0) goto L_0x00d0
            o8e r4 = new o8e
            r4.<init>(r14, r8, r1)
            r15 = r4
            goto L_0x00d5
        L_0x00d0:
            p8e r15 = new p8e
            r15.<init>(r14, r8, r4, r1)
        L_0x00d5:
            r9.o = r0
            r9.X = r2
            r9.Y = r13
            r9.Z = r15
            r9.u0 = r7
            java.lang.Object r1 = r11.o(r15, r9)
            if (r1 != r3) goto L_0x00e6
            return r3
        L_0x00e6:
            r1 = r2
        L_0x00e7:
            d2g r2 = new d2g
            r2.<init>(r13, r0, r1, r12)
            r9.o = r0
            r9.X = r1
            r9.Y = r13
            r9.Z = r12
            r9.u0 = r6
            java.lang.Object r2 = r15.c(r2, r9)
            if (r2 != r3) goto L_0x00fd
            return r3
        L_0x00fd:
            r4 = r0
            r0 = r13
        L_0x00ff:
            w97 r2 = (defpackage.w97) r2
            e2g r6 = new e2g
            r6.<init>(r0, r4, r1, r12)
            r9.o = r12
            r9.X = r12
            r9.Y = r12
            r9.u0 = r5
            java.lang.Object r0 = r2.d(r6, r9)
            if (r0 != r3) goto L_0x0115
            return r3
        L_0x0115:
            return r10
        L_0x0116:
            l1g r4 = new l1g
            r4.<init>(r1)
            ga7 r6 = f(r4)
            y83 r4 = r16.g()
            r0 = 1
            r9.u0 = r0
            java.lang.String r8 = r2.b
            r5 = r11
            r7 = r13
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x0131
            return r3
        L_0x0131:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.j(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
