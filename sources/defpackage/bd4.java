package defpackage;

import android.net.TrafficStats;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bd4  reason: default package */
public final class bd4 implements k33 {
    public final cjg a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final LinkedHashMap c;
    public final LinkedHashSet d;
    public final ai3 e;
    public final ztc f;
    public final zwd g;
    public volatile Iterator h;
    public volatile mpb i;
    public final eh3 j;
    public tg3 k;

    public bd4(cjg cjg, String str, String str2, zwd zwd, xxc xxc, ai3 ai3, ztc ztc) {
        new AtomicBoolean();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        this.k = new tg3(false);
        this.a = cjg;
        this.e = ai3;
        this.f = ztc;
        this.g = zwd;
        this.j = new eh3(str, str2, true);
    }

    public final ai3 a() {
        return this.e;
    }

    public final void c(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public final void close() {
        hm9.k("bd4", "close request");
        l((mpb) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[SYNTHETIC, Splitter:B:27:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.Socket connect() {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "bd4"
            java.lang.String r2 = "connect request"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            tg3 r1 = new tg3
            r1.<init>(r0)
            r11.k = r1
            r11.close()
            cjg r1 = r11.a
            java.lang.Object r1 = r1.c
            gh3 r1 = (defpackage.gh3) r1
            boolean r1 = r1.f()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.b
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0029
            r1 = r0
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            r3 = 0
            if (r1 != 0) goto L_0x0036
            java.lang.String r0 = "bd4"
            java.lang.String r1 = "should not connect, breaking"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            goto L_0x021b
        L_0x0036:
            monitor-enter(r11)
            java.lang.String r1 = "hosts updated: "
            java.lang.String r4 = "bd4"
            java.lang.String r5 = "update hosts"
            defpackage.hm9.m(r4, r5, new java.lang.Object[0])     // Catch:{ all -> 0x010a }
            java.util.LinkedHashSet r4 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r4)     // Catch:{ all -> 0x010a }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            r5.clear()     // Catch:{ all -> 0x0056 }
            cjg r5 = r11.a     // Catch:{ all -> 0x0056 }
            eh3 r5 = defpackage.s5c.v(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0059
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            goto L_0x024f
        L_0x0059:
            cjg r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.a     // Catch:{ all -> 0x0056 }
            ri4 r5 = (defpackage.ri4) r5     // Catch:{ all -> 0x0056 }
            r5.e()     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            eh3 r6 = r11.j     // Catch:{ all -> 0x0056 }
            r5.add(r6)     // Catch:{ all -> 0x0056 }
            cjg r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x0056 }
            m7b r5 = (defpackage.m7b) r5     // Catch:{ all -> 0x0056 }
            p7b r5 = (defpackage.p7b) r5     // Catch:{ all -> 0x0056 }
            t33 r5 = r5.a     // Catch:{ all -> 0x0056 }
            ne7 r5 = r5.g     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "app.lastSuccessProxy"
            java.lang.String r5 = r5.getString(r6, r3)     // Catch:{ all -> 0x0056 }
            boolean r6 = defpackage.s5c.M(r5)     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x008b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008b }
            r6.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x008b }
            eh3 r5 = defpackage.eh3.a(r6)     // Catch:{ JSONException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r5 = r3
        L_0x008c:
            if (r5 == 0) goto L_0x0093
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
        L_0x0093:
            cjg r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            defpackage.s5c.g(r5, r6)     // Catch:{ all -> 0x0056 }
            cjg r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.util.List r5 = defpackage.s5c.B(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x00ad
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x00ad
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.addAll(r5)     // Catch:{ all -> 0x0056 }
        L_0x00ad:
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            eh3 r6 = r11.j     // Catch:{ all -> 0x0056 }
            r5.add(r6)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0056 }
            r11.h = r5     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "bd4"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r1 = r11.d     // Catch:{ all -> 0x0056 }
            int r1 = r1.size()     // Catch:{ all -> 0x0056 }
            r6.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0056 }
            defpackage.hm9.m(r5, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x00d4:
            java.util.LinkedHashSet r1 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r1)     // Catch:{ all -> 0x010a }
            java.util.Iterator r4 = r11.h     // Catch:{ all -> 0x024c }
            boolean r4 = r4.hasNext()     // Catch:{ all -> 0x024c }
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            if (r4 == 0) goto L_0x0213
            java.lang.String r1 = "bd4"
            java.lang.String r4 = "iterate connectClient: hasMoreProxies"
            defpackage.hm9.m(r1, r4, new java.lang.Object[0])     // Catch:{ all -> 0x010a }
            cjg r1 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x010a }
            gh3 r1 = (defpackage.gh3) r1     // Catch:{ all -> 0x010a }
            boolean r1 = r1.f()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00fd
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.b     // Catch:{ all -> 0x010a }
            boolean r1 = r1.get()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00fd
            r1 = r0
            goto L_0x00fe
        L_0x00fd:
            r1 = r2
        L_0x00fe:
            if (r1 != 0) goto L_0x010d
            java.lang.String r0 = "bd4"
            java.lang.String r1 = "should not connect, breaking"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x010a }
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            goto L_0x021b
        L_0x010a:
            r0 = move-exception
            goto L_0x0251
        L_0x010d:
            cjg r1 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x010a }
            gh3 r1 = (defpackage.gh3) r1     // Catch:{ all -> 0x010a }
            zh3 r1 = r1.b()     // Catch:{ all -> 0x010a }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x010a }
            r4 = 4
            if (r1 == r0) goto L_0x0122
            if (r1 == r4) goto L_0x0122
            r1 = r2
            goto L_0x0123
        L_0x0122:
            r1 = r0
        L_0x0123:
            if (r1 == 0) goto L_0x0128
            r1 = 10000(0x2710, float:1.4013E-41)
            goto L_0x012a
        L_0x0128:
            r1 = 15000(0x3a98, float:2.102E-41)
        L_0x012a:
            cjg r5 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x010a }
            gh3 r5 = (defpackage.gh3) r5     // Catch:{ all -> 0x010a }
            zh3 r5 = r5.b()     // Catch:{ all -> 0x010a }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x010a }
            if (r5 == r0) goto L_0x013e
            if (r5 == r4) goto L_0x013e
            r4 = r2
            goto L_0x013f
        L_0x013e:
            r4 = r0
        L_0x013f:
            if (r4 == 0) goto L_0x0144
            r4 = 1500(0x5dc, float:2.102E-42)
            goto L_0x0146
        L_0x0144:
            r4 = 3000(0xbb8, float:4.204E-42)
        L_0x0146:
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r5)     // Catch:{ all -> 0x010a }
            r6 = r2
        L_0x014a:
            r7 = 3
            if (r6 >= r7) goto L_0x0189
            java.util.Iterator r7 = r11.h     // Catch:{ all -> 0x0184 }
            boolean r7 = r7.hasNext()     // Catch:{ all -> 0x0184 }
            if (r7 != 0) goto L_0x0156
            goto L_0x0189
        L_0x0156:
            java.util.Iterator r7 = r11.h     // Catch:{ all -> 0x0184 }
            java.lang.Object r7 = r7.next()     // Catch:{ all -> 0x0184 }
            eh3 r7 = (defpackage.eh3) r7     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "bd4"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r9.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r10 = "step 2 "
            r9.append(r10)     // Catch:{ all -> 0x0184 }
            r9.append(r7)     // Catch:{ all -> 0x0184 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0184 }
            defpackage.hm9.m(r8, r9, new java.lang.Object[0])     // Catch:{ all -> 0x0184 }
            java.util.LinkedHashMap r8 = r11.c     // Catch:{ all -> 0x0184 }
            boolean r8 = r8.containsKey(r7)     // Catch:{ all -> 0x0184 }
            if (r8 != 0) goto L_0x0187
            int r8 = r4 * r6
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0184 }
            r11.n(r7, r1, r8, r9)     // Catch:{ all -> 0x0184 }
            goto L_0x0187
        L_0x0184:
            r0 = move-exception
            goto L_0x0211
        L_0x0187:
            int r6 = r6 + r0
            goto L_0x014a
        L_0x0189:
            monitor-exit(r5)     // Catch:{ all -> 0x0184 }
            mpb r1 = r11.m()     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x0199
            java.lang.String r1 = "bd4"
            java.lang.String r4 = "continue looking for available hosts"
            defpackage.hm9.m(r1, r4, new java.lang.Object[0])     // Catch:{ all -> 0x010a }
            goto L_0x00d4
        L_0x0199:
            tg3 r0 = r11.k     // Catch:{ all -> 0x010a }
            r0.getClass()     // Catch:{ all -> 0x010a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x010a }
            r0.b = r2     // Catch:{ all -> 0x010a }
            tg3 r0 = r11.k     // Catch:{ all -> 0x010a }
            tg3 r2 = r1.g     // Catch:{ all -> 0x010a }
            r0.getClass()     // Catch:{ all -> 0x010a }
            long r3 = r2.d     // Catch:{ all -> 0x010a }
            r0.d = r3     // Catch:{ all -> 0x010a }
            long r3 = r2.e     // Catch:{ all -> 0x010a }
            r0.e = r3     // Catch:{ all -> 0x010a }
            long r3 = r2.f     // Catch:{ all -> 0x010a }
            r0.f = r3     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r2.g     // Catch:{ all -> 0x010a }
            r0.g = r3     // Catch:{ all -> 0x010a }
            int r3 = r2.h     // Catch:{ all -> 0x010a }
            r0.h = r3     // Catch:{ all -> 0x010a }
            int r2 = r2.c     // Catch:{ all -> 0x010a }
            r0.c = r2     // Catch:{ all -> 0x010a }
            cjg r0 = r11.a     // Catch:{ all -> 0x010a }
            eh3 r2 = r1.f     // Catch:{ all -> 0x010a }
            int r3 = defpackage.s5c.c     // Catch:{ all -> 0x010a }
            r2.getClass()     // Catch:{ all -> 0x010a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x010a }
            r3.<init>()     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "host"
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "port"
            java.lang.String r5 = r2.b     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "tls"
            boolean r2 = r2.c     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (boolean) r2)     // Catch:{ all -> 0x010a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x010a }
            boolean r3 = defpackage.s5c.M(r2)     // Catch:{ all -> 0x010a }
            if (r3 != 0) goto L_0x01fd
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x010a }
            m7b r0 = (defpackage.m7b) r0     // Catch:{ all -> 0x010a }
            p7b r0 = (defpackage.p7b) r0     // Catch:{ all -> 0x010a }
            t33 r0 = r0.a     // Catch:{ all -> 0x010a }
            java.lang.String r3 = "app.lastSuccessProxy"
            r0.m(r3, r2)     // Catch:{ all -> 0x010a }
        L_0x01fd:
            java.lang.String r0 = "bd4"
            java.lang.String r2 = "connected to %s"
            eh3 r3 = r1.f     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x010a }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x010a }
            defpackage.hm9.m(r0, r2, r3)     // Catch:{ all -> 0x010a }
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            r3 = r1
            goto L_0x021b
        L_0x0211:
            monitor-exit(r5)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x0213:
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "bd4"
            java.lang.String r1 = "connection failed"
            defpackage.hm9.p(r0, r1, r3)
        L_0x021b:
            r11.i = r3
            mpb r0 = r11.i
            if (r0 == 0) goto L_0x0236
            mpb r0 = r11.i
            java.net.Socket r0 = r0.d
            if (r0 == 0) goto L_0x0236
            mpb r0 = r11.i
            java.net.Socket r0 = r0.d
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0236
            mpb r11 = r11.i
            java.net.Socket r11 = r11.d
            return r11
        L_0x0236:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "host connection failed "
            r1.<init>(r2)
            mpb r11 = r11.i
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x024c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x024f:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x0251:
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd4.connect():java.net.Socket");
    }

    public final int d() {
        if (this.i != null) {
            return ((Number) this.i.f.d.getValue()).intValue();
        }
        return -1;
    }

    public final boolean e() {
        return true;
    }

    public final void g(boolean z) {
        this.b.set(z);
    }

    public final long h(int i2) {
        return di0.o(i2, ((ri4) this.a.a).d());
    }

    public final String i() {
        return this.i != null ? this.i.f.a : "unresolved";
    }

    public final tg3 k() {
        return this.k;
    }

    public final void l(mpb mpb) {
        hm9.m("bd4", "cancel tasks".concat(mpb != null ? wg0.i(", except ", mpb.f.toString()) : ""), new Object[0]);
        synchronized (this.d) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    if (mpb == null) {
                        ((Future) entry.getValue()).cancel(true);
                    } else if (!((eh3) entry.getKey()).equals(mpb.f)) {
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
            } finally {
            }
        }
    }

    public final mpb m() {
        mpb mpb;
        Iterator it = this.c.values().iterator();
        while (true) {
            mpb = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                mpb mpb2 = (mpb) ((Future) it.next()).get();
                if (!(mpb2 == null || mpb2.d == null)) {
                    mpb = mpb2;
                    break;
                }
            } catch (CancellationException e2) {
                String obj = e2.toString();
                hm9.m("bd4", "skip cancelled task, error: " + obj, new Object[0]);
            } catch (Exception e3) {
                String obj2 = e3.toString();
                hm9.p("bd4", "execution error: " + obj2, (Throwable) null);
                hm9.m("bd4", "connection error", new Object[0]);
            }
        }
        synchronized (this.d) {
            this.c.clear();
        }
        return mpb;
    }

    public final void n(eh3 eh3, int i2, int i3, TimeUnit timeUnit) {
        hm9.m("bd4", "schedule connection: delay = %d host = %s", Integer.valueOf(i3), eh3.toString());
        eh3 eh32 = eh3;
        mpb mpb = new mpb(this.a, eh32, this.g, this.e, i2);
        q1a q1a = new q1a(1, new d74(this, 4, mpb));
        ztc ztc = this.f;
        ib3 ib3 = new ib3(new rqd(q1a.m(ztc), new q64(3, (Object) this), 2), 4, new p00(this, 1, mpb));
        d2a u = qy9.u((long) i3, timeUnit, ztc);
        c76 c76 = new c76();
        Objects.requireNonNull(c76, "observer is null");
        try {
            u.a(new pqd(c76, ib3));
            this.c.put(eh3, c76);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
