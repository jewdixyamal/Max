package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: lp6  reason: default package */
public final class lp6 implements u45 {
    public static final List Z = naf.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List s0 = naf.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final h8c X;
    public final kp6 Y;
    public volatile rp6 a;
    public final sob b;
    public volatile boolean c;
    public final f8c o;

    public lp6(u2a u2a, f8c f8c, h8c h8c, kp6 kp6) {
        this.o = f8c;
        this.X = h8c;
        this.Y = kp6;
        sob sob = sob.H2_PRIOR_KNOWLEDGE;
        this.b = !u2a.D0.contains(sob) ? sob.HTTP_2 : sob;
    }

    public final yud a(yic yic) {
        return this.a.g;
    }

    public final void b() {
        this.a.g().close();
    }

    public final ksd c(mhc mhc, long j) {
        return this.a.g();
    }

    public final void cancel() {
        this.c = true;
        rp6 rp6 = this.a;
        if (rp6 != null) {
            rp6.e(9);
        }
    }

    public final long d(yic yic) {
        if (!mq6.a(yic)) {
            return 0;
        }
        return naf.j(yic);
    }

    /* JADX INFO: finally extract failed */
    public final xic e(boolean z) {
        cj6 cj6;
        rp6 rp6 = this.a;
        synchronized (rp6) {
            rp6.i.i();
            while (rp6.e.isEmpty() && rp6.k == 0) {
                try {
                    rp6.k();
                } catch (Throwable th) {
                    rp6.i.m();
                    throw th;
                }
            }
            rp6.i.m();
            if (!rp6.e.isEmpty()) {
                cj6 = (cj6) rp6.e.removeFirst();
            } else {
                Throwable th2 = rp6.l;
                if (th2 == null) {
                    th2 = new StreamResetException(rp6.k);
                }
                throw th2;
            }
        }
        sob sob = this.b;
        ArrayList arrayList = new ArrayList(20);
        int size = cj6.size();
        jn jnVar = null;
        for (int i = 0; i < size; i++) {
            String b2 = cj6.b(i);
            String d = cj6.d(i);
            if (tpa.f(b2, ":status")) {
                jnVar = xfg.v("HTTP/1.1 " + d);
            } else if (!s0.contains(b2)) {
                arrayList.add(b2);
                arrayList.add(w9e.b1(d).toString());
            }
        }
        if (jnVar != null) {
            xic xic = new xic();
            xic.b = sob;
            xic.c = jnVar.b;
            xic.d = (String) jnVar.o;
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                bj6 bj6 = new bj6();
                d63.X(bj6.a, (String[]) array);
                xic.f = bj6;
                if (!z || xic.c != 100) {
                    return xic;
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final f8c f() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105 A[Catch:{ all -> 0x00cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.mhc r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            rp6 r2 = r0.a
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            tfg r2 = r1.e
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = r4
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.util.ArrayList r5 = new java.util.ArrayList
            cj6 r6 = r1.d
            int r7 = r6.size()
            r8 = 4
            int r7 = r7 + r8
            r5.<init>(r7)
            vi6 r7 = new vi6
            aw0 r9 = defpackage.vi6.f
            java.lang.String r10 = r1.c
            r7.<init>((defpackage.aw0) r9, (java.lang.String) r10)
            r5.add(r7)
            vi6 r7 = new vi6
            aw0 r9 = defpackage.vi6.g
            vq6 r1 = r1.b
            java.lang.String r10 = r1.b()
            java.lang.String r11 = r1.d()
            if (r11 == 0) goto L_0x004e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r10 = 63
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
        L_0x004e:
            r7.<init>((defpackage.aw0) r9, (java.lang.String) r10)
            r5.add(r7)
            java.lang.String r7 = "Host"
            java.lang.String r7 = r6.a(r7)
            if (r7 == 0) goto L_0x0066
            vi6 r9 = new vi6
            aw0 r10 = defpackage.vi6.i
            r9.<init>((defpackage.aw0) r10, (java.lang.String) r7)
            r5.add(r9)
        L_0x0066:
            vi6 r7 = new vi6
            aw0 r9 = defpackage.vi6.h
            java.lang.String r1 = r1.b
            r7.<init>((defpackage.aw0) r9, (java.lang.String) r1)
            r5.add(r7)
            int r1 = r6.size()
            r7 = 0
        L_0x0077:
            if (r7 >= r1) goto L_0x00b8
            java.lang.String r9 = r6.b(r7)
            java.util.Locale r10 = java.util.Locale.US
            if (r9 == 0) goto L_0x00b0
            java.lang.String r9 = r9.toLowerCase(r10)
            java.util.List r10 = Z
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x00a1
            java.lang.String r10 = "te"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00ad
            java.lang.String r10 = r6.d(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = defpackage.tpa.f(r10, r11)
            if (r10 == 0) goto L_0x00ad
        L_0x00a1:
            vi6 r10 = new vi6
            java.lang.String r11 = r6.d(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r5.add(r10)
        L_0x00ad:
            int r7 = r7 + 1
            goto L_0x0077
        L_0x00b0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            kp6 r1 = r0.Y
            r6 = r2 ^ 1
            sp6 r7 = r1.J0
            monitor-enter(r7)
            monitor-enter(r1)     // Catch:{ all -> 0x018c }
            int r9 = r1.Y     // Catch:{ all -> 0x00cd }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00d0
            r9 = 8
            r1.n(r9)     // Catch:{ all -> 0x00cd }
            goto L_0x00d0
        L_0x00cd:
            r0 = move-exception
            goto L_0x0194
        L_0x00d0:
            boolean r9 = r1.Z     // Catch:{ all -> 0x00cd }
            if (r9 != 0) goto L_0x018e
            int r15 = r1.Y     // Catch:{ all -> 0x00cd }
            int r9 = r15 + 2
            r1.Y = r9     // Catch:{ all -> 0x00cd }
            rp6 r14 = new rp6     // Catch:{ all -> 0x00cd }
            r16 = 0
            r13 = 0
            r9 = r14
            r10 = r15
            r11 = r1
            r12 = r6
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00fe
            long r9 = r1.G0     // Catch:{ all -> 0x00cd }
            long r11 = r1.H0     // Catch:{ all -> 0x00cd }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fe
            long r9 = r3.c     // Catch:{ all -> 0x00cd }
            long r11 = r3.d     // Catch:{ all -> 0x00cd }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r2 = 0
            goto L_0x00ff
        L_0x00fe:
            r2 = r4
        L_0x00ff:
            boolean r9 = r3.i()     // Catch:{ all -> 0x00cd }
            if (r9 == 0) goto L_0x010e
            java.util.LinkedHashMap r9 = r1.c     // Catch:{ all -> 0x00cd }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00cd }
            r9.put(r10, r3)     // Catch:{ all -> 0x00cd }
        L_0x010e:
            monitor-exit(r1)     // Catch:{ all -> 0x018c }
            sp6 r9 = r1.J0     // Catch:{ all -> 0x018c }
            monitor-enter(r9)     // Catch:{ all -> 0x018c }
            boolean r10 = r9.c     // Catch:{ all -> 0x0147 }
            if (r10 != 0) goto L_0x0182
            ro6 r10 = r9.o     // Catch:{ all -> 0x0147 }
            r10.d(r5)     // Catch:{ all -> 0x0147 }
            bt0 r5 = r9.a     // Catch:{ all -> 0x0147 }
            long r10 = r5.b     // Catch:{ all -> 0x0147 }
            int r5 = r9.b     // Catch:{ all -> 0x0147 }
            long r12 = (long) r5     // Catch:{ all -> 0x0147 }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x0147 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x012d
            r17 = r8
            goto L_0x012f
        L_0x012d:
            r17 = 0
        L_0x012f:
            if (r6 == 0) goto L_0x0133
            r17 = r17 | 1
        L_0x0133:
            r6 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x0147 }
            r9.g(r15, r8, r4, r6)     // Catch:{ all -> 0x0147 }
            eu0 r4 = r9.X     // Catch:{ all -> 0x0147 }
            bt0 r6 = r9.a     // Catch:{ all -> 0x0147 }
            r4.N(r6, r12)     // Catch:{ all -> 0x0147 }
            if (r5 <= 0) goto L_0x0149
            long r10 = r10 - r12
            r9.U(r15, r10)     // Catch:{ all -> 0x0147 }
            goto L_0x0149
        L_0x0147:
            r0 = move-exception
            goto L_0x018a
        L_0x0149:
            monitor-exit(r9)     // Catch:{ all -> 0x018c }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x0152
            sp6 r1 = r1.J0
            r1.flush()
        L_0x0152:
            r0.a = r3
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0173
            rp6 r1 = r0.a
            qp6 r1 = r1.i
            h8c r2 = r0.X
            int r2 = r2.d
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.g(r2, r4)
            rp6 r1 = r0.a
            qp6 r1 = r1.j
            h8c r0 = r0.X
            int r0 = r0.e
            long r2 = (long) r0
            r1.g(r2, r4)
            return
        L_0x0173:
            rp6 r0 = r0.a
            r1 = 9
            r0.e(r1)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0182:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x018a:
            monitor-exit(r9)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            goto L_0x0196
        L_0x018e:
            okhttp3.internal.http2.ConnectionShutdownException r0 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x00cd }
            r0.<init>()     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x0194:
            monitor-exit(r1)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0196:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp6.g(mhc):void");
    }

    public final void h() {
        this.Y.flush();
    }
}
