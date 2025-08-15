package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vvf  reason: default package */
public final class vvf implements ia7 {
    public static final List i = Collections.singletonList("unknown");
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final Set f;
    public final zt0 g;
    public wsf h;

    public vvf(ja7 ja7, je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = ja7;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        v25 v25 = evf.u0;
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(((evf) u1Var.next()).a);
        }
        this.f = x53.H0(arrayList);
        this.g = c37.a(0, 0, 7);
    }

    public static final void e(vvf vvf, String str) {
        wsf wsf = vvf.h;
        if (wsf != null) {
            iwf.a((iwf) vvf.b.getValue(), str, wsf.a, wsf.b, true, 0, (Integer) null, (Integer) null, 240);
        }
    }

    public static ga7 f(Throwable th) {
        xuf xuf = th instanceof xuf ? (xuf) th : null;
        int i2 = 3;
        if (xuf instanceof quf) {
            return new ea7(new ha7("access_denied", 3));
        }
        int i3 = 0;
        if (xuf instanceof ruf) {
            int i4 = fvf.$EnumSwitchMapping$0[((ruf) xuf).a.ordinal()];
            if (i4 == 1) {
                i3 = 4;
            } else if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    i3 = 6;
                } else if (i4 == 5) {
                    i3 = 5;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new ea7(new ha7("not_found", i3));
        } else if (xuf instanceof suf) {
            if (!((suf) xuf).a) {
                i2 = 1;
            }
            return new ea7(new ha7("not_supported", i2));
        } else if (xuf instanceof tuf) {
            int i5 = fvf.$EnumSwitchMapping$0[((tuf) xuf).a.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (!(i5 == 3 || i5 == 4)) {
                        if (i5 == 5) {
                            i3 = 4;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return new ea7(new ha7("permission_denied", i3));
            }
            i3 = 2;
            return new ea7(new ha7("permission_denied", i3));
        } else if (xuf instanceof vuf) {
            return new ea7(new ha7("token_not_found", 4));
        } else {
            if (xuf instanceof wuf) {
                return new ea7(new ha7("too_large", 3));
            }
            if (xuf instanceof uuf) {
                return new ea7(new ha7("refused", 1));
            }
            if (xuf == null) {
                return fa7.d;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object j;
        boolean contains = this.f.contains(str);
        e5f e5f = e5f.a;
        Class<vvf> cls = vvf.class;
        if (!contains) {
            String name = cls.getName();
            hm9.p(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return e5f;
        }
        se5 se5 = (se5) ((qe5) this.e.getValue());
        se5.getClass();
        if (!se5.n(PmsKey.f132webappbiometryenabled, false)) {
            hm9.m0(cls.getName(), "Processing is disable", new Object[0]);
            return e5f;
        }
        evf evf = evf.GET_INFO;
        boolean f2 = tpa.f(str, "WebAppBiometryGetInfo");
        tx3 tx3 = tx3.a;
        if (f2) {
            Object i2 = i(str2, continuation);
            return i2 == tx3 ? i2 : e5f;
        } else if (tpa.f(str, "WebAppBiometryRequestAccess")) {
            Object k = k(str2, continuation);
            return k == tx3 ? k : e5f;
        } else if (tpa.f(str, "WebAppBiometryUpdateToken")) {
            Object l = l(str2, continuation);
            return l == tx3 ? l : e5f;
        } else if (!tpa.f(str, "WebAppBiometryRequestAuth")) {
            return (!tpa.f(str, "WebAppBiometryOpenSettings") || (j = j(str2, continuation)) != tx3) ? e5f : j;
        } else {
            Object h2 = h(str2, continuation);
            return h2 == tx3 ? h2 : e5f;
        }
    }

    public final zt0 b() {
        return this.g;
    }

    public final Set c() {
        return this.f;
    }

    public final void d(wsf wsf) {
        this.h = wsf;
    }

    public final y83 g() {
        return (y83) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gvf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            gvf r0 = (defpackage.gvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            gvf r0 = new gvf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.s0
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
            defpackage.od2.a0(r11)
            goto L_0x00b2
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            evf r9 = r0.Y
            etf r10 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x009c
        L_0x0041:
            in0 r9 = r0.Z
            evf r10 = r0.Y
            etf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x0083
        L_0x004d:
            defpackage.od2.a0(r11)
            ja7 r11 = defpackage.ja7.d
            r11.getClass()
            dtf r2 = defpackage.etf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            etf r10 = (defpackage.etf) r10
            evf r11 = defpackage.evf.REQUEST_AUTH
            in0 r2 = new in0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L_0x0083:
            hvf r11 = new hvf
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r9 = r10
            r10 = r2
            r2 = r5
        L_0x009c:
            w97 r11 = (defpackage.w97) r11
            ivf r4 = new ivf
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.jvf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jvf r0 = (defpackage.jvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            jvf r0 = new jvf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.s0
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
            defpackage.od2.a0(r10)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            evf r8 = r0.Y
            avf r9 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x009a
        L_0x0041:
            jn0 r8 = r0.Z
            evf r9 = r0.Y
            avf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x0081
        L_0x004d:
            defpackage.od2.a0(r10)
            ja7 r10 = defpackage.ja7.d
            r10.getClass()
            zuf r2 = defpackage.avf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            avf r9 = (defpackage.avf) r9
            evf r10 = defpackage.evf.GET_INFO
            jn0 r2 = new jn0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0081:
            kvf r10 = new kvf
            r10.<init>(r2, r9, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r8 = r9
            r9 = r2
            r2 = r5
        L_0x009a:
            w97 r10 = (defpackage.w97) r10
            lvf r4 = new lvf
            r4.<init>(r9, r8, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.mvf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            mvf r0 = (defpackage.mvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            mvf r0 = new mvf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.s0
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
            defpackage.od2.a0(r10)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            evf r8 = r0.Y
            yvf r9 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x009a
        L_0x0041:
            kn0 r8 = r0.Z
            evf r9 = r0.Y
            yvf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x0081
        L_0x004d:
            defpackage.od2.a0(r10)
            ja7 r10 = defpackage.ja7.d
            r10.getClass()
            xvf r2 = defpackage.yvf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            yvf r9 = (defpackage.yvf) r9
            evf r10 = defpackage.evf.OPEN_SETTINGS
            kn0 r2 = new kn0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0081:
            nvf r10 = new nvf
            r10.<init>(r9, r5, r2, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r8 = r9
            r9 = r2
            r2 = r5
        L_0x009a:
            w97 r10 = (defpackage.w97) r10
            ovf r4 = new ovf
            r4.<init>(r8, r2, r9, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.j(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.pvf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            pvf r0 = (defpackage.pvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            pvf r0 = new pvf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.s0
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
            defpackage.od2.a0(r11)
            goto L_0x00b2
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            evf r9 = r0.Y
            btf r10 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x009c
        L_0x0041:
            hn0 r9 = r0.Z
            evf r10 = r0.Y
            btf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x0083
        L_0x004d:
            defpackage.od2.a0(r11)
            ja7 r11 = defpackage.ja7.d
            r11.getClass()
            atf r2 = defpackage.btf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            btf r10 = (defpackage.btf) r10
            evf r11 = defpackage.evf.REQUEST_ACCESS
            hn0 r2 = new hn0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L_0x0083:
            qvf r11 = new qvf
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r9 = r10
            r10 = r2
            r2 = r5
        L_0x009c:
            w97 r11 = (defpackage.w97) r11
            rvf r4 = new rvf
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.svf
            if (r2 == 0) goto L_0x0018
            r2 = r1
            svf r2 = (defpackage.svf) r2
            int r3 = r2.v0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.v0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            svf r2 = new svf
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.t0
            tx3 r2 = defpackage.tx3.a
            int r3 = r8.v0
            e5f r9 = defpackage.e5f.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0064
            if (r3 == r7) goto L_0x0060
            if (r3 == r6) goto L_0x004d
            if (r3 == r5) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            defpackage.od2.a0(r1)
            goto L_0x0103
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            evf r0 = r8.Y
            hwf r3 = r8.X
            vvf r5 = r8.o
            defpackage.od2.a0(r1)
            goto L_0x00ed
        L_0x004d:
            ln0 r0 = r8.s0
            java.lang.String r3 = r8.Z
            evf r6 = r8.Y
            hwf r7 = r8.X
            vvf r11 = r8.o
            defpackage.od2.a0(r1)
            r13 = r3
            r3 = r7
            r7 = r0
            r0 = r11
            goto L_0x00cc
        L_0x0060:
            defpackage.od2.a0(r1)
            goto L_0x00ac
        L_0x0064:
            defpackage.od2.a0(r1)
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            gwf r3 = defpackage.hwf.Companion
            cc7 r3 = r3.serializer()
            r11 = r19
            java.lang.Object r1 = r1.a(r3, r11)
            hwf r1 = (defpackage.hwf) r1
            evf r11 = defpackage.evf.UPDATE_TOKEN
            java.lang.String r3 = r1.d
            zt0 r12 = r0.g
            if (r3 == 0) goto L_0x00ad
            int r13 = r3.length()
            if (r13 != 0) goto L_0x0089
            goto L_0x00ad
        L_0x0089:
            int r13 = r3.length()
            r14 = 1024(0x400, float:1.435E-42)
            if (r13 > r14) goto L_0x0092
            goto L_0x00ad
        L_0x0092:
            wuf r3 = new wuf
            r3.<init>()
            ga7 r5 = f(r3)
            y83 r3 = r18.g()
            r8.v0 = r7
            java.lang.String r7 = r1.b
            r4 = r12
            r6 = r11
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8)
            if (r0 != r2) goto L_0x00ac
            return r2
        L_0x00ac:
            return r9
        L_0x00ad:
            ln0 r7 = new ln0
            java.lang.String r13 = r1.a
            java.lang.String r14 = r1.c
            r7.<init>(r13, r3, r14)
            r8.o = r0
            r8.X = r1
            r8.Y = r11
            r8.Z = r3
            r8.s0 = r7
            r8.v0 = r6
            java.lang.Object r6 = r12.o(r7, r8)
            if (r6 != r2) goto L_0x00c9
            return r2
        L_0x00c9:
            r13 = r3
            r6 = r11
            r3 = r1
        L_0x00cc:
            tvf r1 = new tvf
            r17 = 0
            r12 = r1
            r14 = r3
            r15 = r0
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r8.o = r0
            r8.X = r3
            r8.Y = r6
            r8.Z = r10
            r8.s0 = r10
            r8.v0 = r5
            java.lang.Object r1 = r7.c(r1, r8)
            if (r1 != r2) goto L_0x00eb
            return r2
        L_0x00eb:
            r5 = r0
            r0 = r6
        L_0x00ed:
            w97 r1 = (defpackage.w97) r1
            uvf r6 = new uvf
            r6.<init>(r5, r0, r3, r10)
            r8.o = r10
            r8.X = r10
            r8.Y = r10
            r8.v0 = r4
            java.lang.Object r0 = r1.d(r6, r8)
            if (r0 != r2) goto L_0x0103
            return r2
        L_0x0103:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.l(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
