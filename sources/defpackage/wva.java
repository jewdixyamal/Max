package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wva  reason: default package */
public final class wva implements zu6, a76, gq1, erd, kxd, abe, e1d, hpf, q70, l3a, ofc, ifg {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wva(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void A(String str) {
        File file = new File(str);
        ((xva) this.b).c((rx) ((mec) this.c).a, file);
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                Void voidR = (Void) obj;
                ((lq1) this.b).b((ay1) this.c);
                return;
            case 4:
                ((erd) this.c).a(obj);
                return;
            default:
                erd erd = (erd) this.b;
                try {
                    ((rqd) this.c).c.accept(obj);
                    erd.a(obj);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    erd.onError(th);
                    return;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x00ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            qne r1 = (defpackage.qne) r1
            r2 = r24
            bhg r2 = (defpackage.bhg) r2
            java.lang.Object r3 = r0.b
            td r3 = (defpackage.td) r3
            java.lang.Object r0 = r0.c
            r5 = r0
            com.google.android.gms.location.LocationRequest r5 = (com.google.android.gms.location.LocationRequest) r5
            r2.getClass()
            rw4 r0 = r3.x()
            java.lang.Object r4 = r0.c
            r13 = r4
            hm7 r13 = (defpackage.hm7) r13
            java.util.Objects.requireNonNull(r13)
            pe5[] r4 = r2.h()
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x004d
            r8 = r7
        L_0x002b:
            int r9 = r4.length
            if (r8 >= r9) goto L_0x003e
            r9 = r4[r8]
            java.lang.String r10 = "location_updates_with_callback"
            java.lang.String r11 = r9.a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x003e:
            r9 = r6
        L_0x003f:
            if (r9 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            long r8 = r9.b()
            r10 = 1
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x004d
            r7 = 1
        L_0x004d:
            qpd r14 = r2.L0
            monitor-enter(r14)
            qpd r4 = r2.L0     // Catch:{ all -> 0x00ce }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x00ce }
            ahg r4 = (defpackage.ahg) r4     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            td r3 = r4.d     // Catch:{ all -> 0x00ce }
            monitor-enter(r3)     // Catch:{ all -> 0x00ce }
            java.lang.Object r8 = r3.c     // Catch:{ all -> 0x006e }
            rw4 r8 = (defpackage.rw4) r8     // Catch:{ all -> 0x006e }
            if (r8 == r0) goto L_0x006c
            r8.b = r6     // Catch:{ all -> 0x006e }
            r8.c = r6     // Catch:{ all -> 0x006e }
            r3.c = r0     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = r4
            r4 = r6
            goto L_0x007f
        L_0x0073:
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x0075:
            ahg r0 = new ahg     // Catch:{ all -> 0x00ce }
            r0.<init>(r3)     // Catch:{ all -> 0x00ce }
            qpd r3 = r2.L0     // Catch:{ all -> 0x00ce }
            r3.put(r13, r0)     // Catch:{ all -> 0x00ce }
        L_0x007f:
            if (r7 == 0) goto L_0x00d0
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            nkg r2 = (defpackage.nkg) r2     // Catch:{ all -> 0x00ce }
            java.lang.Object r3 = r13.a     // Catch:{ all -> 0x00ce }
            int r3 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r7.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = r13.b     // Catch:{ all -> 0x00ce }
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = "@"
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            r7.append(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r20 = r7.toString()     // Catch:{ all -> 0x00ce }
            khg r3 = new khg     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00aa
            r17 = r6
            goto L_0x00ac
        L_0x00aa:
            r17 = r4
        L_0x00ac:
            r16 = 2
            r19 = 0
            r15 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ce }
            ygg r0 = new ygg     // Catch:{ all -> 0x00ce }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r1 = r2.G0()     // Catch:{ all -> 0x00ce }
            defpackage.zfg.b(r1, r3)     // Catch:{ all -> 0x00ce }
            defpackage.zfg.b(r1, r5)     // Catch:{ all -> 0x00ce }
            r1.writeStrongBinder(r0)     // Catch:{ all -> 0x00ce }
            r0 = 88
            r2.H0(r1, r0)     // Catch:{ all -> 0x00ce }
            goto L_0x0124
        L_0x00ce:
            r0 = move-exception
            goto L_0x0126
        L_0x00d0:
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            nkg r2 = (defpackage.nkg) r2     // Catch:{ all -> 0x00ce }
            lhg r17 = new lhg     // Catch:{ all -> 0x00ce }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r4 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ce }
            wgg r3 = new wgg     // Catch:{ all -> 0x00ce }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r13.a     // Catch:{ all -> 0x00ce }
            int r1 = java.lang.System.identityHashCode(r1)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = r13.b     // Catch:{ all -> 0x00ce }
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "@"
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            r4.append(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r22 = r4.toString()     // Catch:{ all -> 0x00ce }
            mhg r1 = new mhg     // Catch:{ all -> 0x00ce }
            r16 = 1
            r18 = 0
            r20 = 0
            r15 = r1
            r19 = r0
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r0 = r2.G0()     // Catch:{ all -> 0x00ce }
            defpackage.zfg.b(r0, r1)     // Catch:{ all -> 0x00ce }
            r1 = 59
            r2.H0(r0, r1)     // Catch:{ all -> 0x00ce }
        L_0x0124:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            return
        L_0x0126:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(oa5 oa5, l3f l3f) {
        int i = 0;
        while (true) {
            xze[] xzeArr = (xze[]) this.c;
            if (i < xzeArr.length) {
                l3f.a();
                l3f.b();
                xze B = oa5.B(l3f.e, 3);
                oy5 oy5 = (oy5) ((List) this.b).get(i);
                String str = oy5.w0;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                np8.c(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                String str2 = oy5.a;
                if (str2 == null) {
                    l3f.b();
                    str2 = l3f.f;
                }
                my5 my5 = new my5();
                my5.a = str2;
                my5.k = str;
                my5.d = oy5.o;
                my5.c = oy5.c;
                my5.C = oy5.O0;
                my5.m = oy5.y0;
                B.d(new oy5(my5));
                xzeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 4:
                dm4.c((AtomicReference) this.b, zl4);
                return;
            default:
                ((erd) this.b).c(zl4);
                return;
        }
    }

    public void d(Throwable th) {
        ((lq1) this.b).d(th);
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((gpf) this.c).a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove((cn9) this.b) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    public void e(sue sue, oa5 oa5, l3f l3f) {
    }

    public void f(yaf yaf) {
        h3f h3f;
        if (yaf.v() == 0 && (yaf.v() & 128) != 0) {
            yaf.I(6);
            int c2 = yaf.c() / 4;
            int i = 0;
            while (true) {
                h3f = (h3f) this.c;
                if (i >= c2) {
                    break;
                }
                s02 s02 = (s02) this.b;
                yaf.g(0, s02.b, 4);
                s02.q(0);
                int i2 = s02.i(16);
                s02.t(3);
                if (i2 == 0) {
                    s02.t(13);
                } else {
                    int i3 = s02.i(13);
                    if (h3f.f.get(i3) == null) {
                        h3f.f.put(i3, new g1d(new l0f(h3f, i3)));
                        h3f.l++;
                    }
                }
                i++;
            }
            if (h3f.a != 2) {
                h3f.f.remove(0);
            }
        }
    }

    public int g(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = maf.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Comparable h(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.caf
            if (r0 == 0) goto L_0x0013
            r0 = r7
            caf r0 = (defpackage.caf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            caf r0 = new caf
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r7)
            goto L_0x0055
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.c
            je7 r7 = (defpackage.je7) r7
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            java.lang.Object r6 = r6.b
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r4 = r6.t()
            r0.Y = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            oab r7 = (defpackage.oab) r7
            uj3 r6 = r7.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.h(kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public long i(int i) {
        boolean z = false;
        np8.d(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        np8.d(z);
        return jArr[i];
    }

    public long j(long j) {
        wv7 wv7 = (wv7) this.b;
        Long l = (Long) wv7.c(j);
        if (l == null) {
            lh4 lh4 = (lh4) this.c;
            long j2 = lh4.a;
            lh4.a = 1 + j2;
            l = Long.valueOf(j2);
            wv7.f(j, l);
        }
        return l.longValue();
    }

    public void k() {
        Exception exc = new Exception("onDownloadFailed");
        ((xva) this.b).b((rx) ((mec) this.c).a, exc);
    }

    public void l(Task task) {
        ((Map) ((aab) this.c).b).remove((qne) this.b);
    }

    public void m(b8c b8c, yic yic) {
        int intValue;
        cj6 cj6;
        cj6 cj62;
        String str;
        yic yic2 = yic;
        od odVar = yic2.x0;
        boolean z = true;
        try {
            ((m8c) this.b).a(yic2, odVar);
            b8c b8c2 = (b8c) odVar.c;
            if (!b8c2.s0) {
                b8c2.s0 = true;
                b8c2.c.j();
                f8c f = ((u45) odVar.Y).f();
                Socket socket = f.c;
                y7c y7c = f.g;
                x7c x7c = f.h;
                int i = 0;
                socket.setSoTimeout(0);
                f.k();
                e8c e8c = new e8c(odVar, y7c, x7c);
                cj6 cj63 = yic2.Y;
                int size = cj63.size();
                int i2 = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                Integer num = null;
                Integer num2 = null;
                while (i2 < size) {
                    if (eae.k0(cj63.b(i2), "Sec-WebSocket-Extensions", z)) {
                        String d = cj63.d(i2);
                        int i3 = i;
                        while (i3 < d.length()) {
                            int g = naf.g(d, ',', i3, i, 4);
                            char c2 = ';';
                            int e = naf.e(';', i3, g, d);
                            String y = naf.y(i3, e, d);
                            int i4 = e + (z ? 1 : 0);
                            if (y.equalsIgnoreCase("permessage-deflate")) {
                                if (z2) {
                                    z5 = true;
                                }
                                while (i4 < g) {
                                    int e2 = naf.e(c2, i4, g, d);
                                    int e3 = naf.e('=', i4, e2, d);
                                    String y2 = naf.y(i4, e3, d);
                                    if (e3 < e2) {
                                        str = naf.y(e3 + 1, e2, d);
                                        cj62 = cj63;
                                        if (str.length() >= 2 && w9e.T0("\"", str) && w9e.t0("\"", str)) {
                                            str = str.substring(1, str.length() - 1);
                                        }
                                    } else {
                                        cj62 = cj63;
                                        str = null;
                                    }
                                    int i5 = e2 + 1;
                                    if (y2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z5 = true;
                                        }
                                        Integer e0 = str != null ? dae.e0(str) : null;
                                        num = e0;
                                        if (e0 != null) {
                                            i4 = i5;
                                            cj63 = cj62;
                                            c2 = ';';
                                        }
                                    } else {
                                        if (y2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z3) {
                                                z5 = true;
                                            }
                                            z5 = str != null ? true : z5;
                                            z3 = true;
                                        } else if (y2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                z5 = true;
                                            }
                                            Integer e02 = str != null ? dae.e0(str) : null;
                                            num2 = e02;
                                            if (e02 != null) {
                                            }
                                        } else if (y2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z4) {
                                                z5 = true;
                                            }
                                            z5 = str != null ? true : z5;
                                            z4 = true;
                                        }
                                        i4 = i5;
                                        cj63 = cj62;
                                        c2 = ';';
                                    }
                                    z5 = true;
                                    i4 = i5;
                                    cj63 = cj62;
                                    c2 = ';';
                                }
                                cj6 = cj63;
                                i3 = i4;
                                z2 = true;
                            } else {
                                cj6 = cj63;
                                i3 = i4;
                                z5 = true;
                            }
                            cj63 = cj6;
                            z = true;
                            i = 0;
                        }
                    }
                    i2++;
                    cj63 = cj63;
                    z = true;
                    i = 0;
                }
                ((m8c) this.b).v = new k3g(z2, num, z3, num2, z4, z5);
                if (z5 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || 15 < intValue))) {
                    synchronized (((m8c) this.b)) {
                        ((m8c) this.b).j.clear();
                        ((m8c) this.b).b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    ((m8c) this.b).d(naf.g + " WebSocket " + ((mhc) this.c).b.g(), e8c);
                    ((m8c) this.b).s.b();
                    ((m8c) this.b).e();
                } catch (Exception e4) {
                    ((m8c) this.b).c(e4);
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IOException e5) {
            if (odVar != null) {
                odVar.a(true, true, (IOException) null);
            }
            ((m8c) this.b).c(e5);
            naf.c(yic);
        }
    }

    public int n(int i) {
        return i;
    }

    public int o(int i) {
        gpf gpf = (gpf) this.c;
        List list = (List) ((SparseArray) gpf.a).get(i);
        if (list == null) {
            list = new ArrayList();
            ((SparseArray) gpf.a).put(i, list);
        }
        cn9 cn9 = (cn9) this.b;
        if (!list.contains(cn9)) {
            list.add(cn9);
        }
        return i;
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((erd) this.c).onError(th);
                return;
            default:
                ((erd) this.b).onError(th);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = ((defpackage.xz3[]) r2.b)[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List p(long r3) {
        /*
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.c
            long[] r1 = (long[]) r1
            int r3 = defpackage.maf.f(r1, r3, r0)
            r4 = -1
            if (r3 == r4) goto L_0x001c
            java.lang.Object r2 = r2.b
            xz3[] r2 = (defpackage.xz3[]) r2
            r2 = r2[r3]
            xz3 r3 = defpackage.xz3.C0
            if (r2 != r3) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L_0x001c:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.p(long):java.util.List");
    }

    public void q(b8c b8c, IOException iOException) {
        ((m8c) this.b).c(iOException);
    }

    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.b)).a.b;
        if (context != null) {
            return new fkg(context, (kkg) ((ifg) this.c).r());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public String toString() {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) this.c;
                String n0 = th != null ? j47.n0(th) : null;
                return "ThreadDump(threadsCount=" + ((Map) this.b) + ", allStackTraces=" + n0 + ")";
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((long[]) this.c).length;
    }

    public /* synthetic */ wva(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public wva(Context context) {
        l63 l63;
        this.a = 10;
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            l63 = l63.a;
        } else if (i != 32) {
            l63 = l63.c;
        } else {
            l63 = l63.b;
        }
        q0e a2 = r0e.a(l63);
        this.b = a2;
        this.c = new w7c(a2);
        context.registerComponentCallbacks(new fd2(2, (Object) this));
    }

    public wva(List list) {
        this.a = 5;
        this.b = list;
        this.c = new xze[list.size()];
    }

    public wva() {
        this.a = 2;
        this.b = new tt3(cpc.e, (jqe) new eqe(dpc.j), Integer.valueOf(woc.c0), (Integer) null, 20);
        this.c = new tt3(cpc.a, (jqe) new eqe(dpc.g), Integer.valueOf(gpc.u), (Integer) null, 20);
    }

    public wva(lh4 lh4) {
        this.a = 8;
        this.c = lh4;
        this.b = new wv7();
    }

    public wva(h3f h3f) {
        this.a = 12;
        this.c = h3f;
        this.b = new s02(new byte[4], 4, 1, (byte) 0);
    }
}
