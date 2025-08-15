package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: el4  reason: default package */
public final class el4 implements lg5 {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final d0e f;
    public final dl4 g;
    public final pq9 h;
    public final lq9 i;
    public final boolean j;
    public final dw0 k;
    public final qx7 l;
    public final Object m = new Object();

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, dw0] */
    public el4(cu4 cu4, pq9 pq9, l7 l7Var, mq9 mq9, lq9 lq9, ExecutorService executorService) {
        d0e d0e;
        this.a = l7Var.b;
        long j2 = l7Var.c;
        this.b = j2;
        this.c = j2;
        d0e d0e2 = d0e.h;
        synchronized (d0e.class) {
            try {
                if (d0e.h == null) {
                    d0e.h = new d0e();
                }
                d0e = d0e.h;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f = d0e;
        this.g = cu4;
        this.h = pq9;
        this.e = -1;
        this.i = lq9;
        ? obj = new Object();
        obj.a = false;
        obj.b = -1;
        obj.c = -1;
        this.k = obj;
        this.l = qx7.Y;
        this.j = false;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a() {
        synchronized (this.m) {
            try {
                this.g.e();
                this.d.clear();
            } catch (IOException | NullPointerException e2) {
                lq9 lq9 = this.i;
                e2.getMessage();
                lq9.getClass();
            }
            dw0 dw0 = this.k;
            synchronized (dw0) {
                dw0.a = false;
                dw0.c = -1;
                dw0.b = -1;
            }
        }
    }

    public final void b(long j2) {
        dl4 dl4 = this.g;
        try {
            ArrayList d2 = d(dl4.d());
            dw0 dw0 = this.k;
            long a2 = dw0.a() - j2;
            Iterator it = d2.iterator();
            int i2 = 0;
            long j3 = 0;
            while (it.hasNext()) {
                l94 l94 = (l94) it.next();
                if (j3 > a2) {
                    break;
                }
                long c2 = dl4.c(l94);
                this.d.remove(l94.a);
                if (c2 > 0) {
                    i2++;
                    j3 += c2;
                    re6.p0().q0();
                }
            }
            dw0.b(-j3, (long) (-i2));
            dl4.b();
        } catch (IOException e2) {
            e2.getMessage();
            this.i.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.kg5 c(defpackage.ww0 r9) {
        /*
            r8 = this;
            re6 r0 = defpackage.re6.p0()
            r1 = 0
            java.lang.Object r2 = r8.m     // Catch:{ IOException -> 0x0042 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0042 }
            java.util.ArrayList r3 = defpackage.v3c.r(r9)     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = r1
            r6 = r5
        L_0x000f:
            int r7 = r3.size()     // Catch:{ all -> 0x0027 }
            if (r4 >= r7) goto L_0x0029
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0027 }
            dl4 r6 = r8.g     // Catch:{ all -> 0x0027 }
            kg5 r6 = r6.a(r9, r5)     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0027:
            r9 = move-exception
            goto L_0x003e
        L_0x0029:
            if (r6 != 0) goto L_0x0031
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.remove(r5)     // Catch:{ all -> 0x0027 }
            goto L_0x0039
        L_0x0031:
            r5.getClass()     // Catch:{ all -> 0x0027 }
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.add(r5)     // Catch:{ all -> 0x0027 }
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            r0.q0()
            return r6
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r9     // Catch:{ IOException -> 0x0042 }
        L_0x0040:
            r8 = move-exception
            goto L_0x004b
        L_0x0042:
            lq9 r8 = r8.i     // Catch:{ all -> 0x0040 }
            r8.getClass()     // Catch:{ all -> 0x0040 }
            r0.q0()
            return r1
        L_0x004b:
            r0.q0()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el4.c(ww0):kg5");
    }

    public final ArrayList d(Collection collection) {
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l94 l94 = (l94) it.next();
            if (l94.a() > currentTimeMillis) {
                arrayList.add(l94);
            } else {
                arrayList2.add(l94);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new fs4(23));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final kg5 e(ww0 ww0, f9 f9Var) {
        boolean z;
        String encodeToString;
        vq7 g2;
        kg5 m2;
        re6 p0 = re6.p0();
        synchronized (this.m) {
            try {
                byte[] bytes = ww0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                z = false;
                instance.update(bytes, 0, bytes.length);
                encodeToString = Base64.encodeToString(instance.digest(), 11);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException(e3);
            }
        }
        try {
            g2 = g(encodeToString, ww0);
            g2.w(f9Var);
            synchronized (this.m) {
                m2 = g2.m();
                this.d.add(encodeToString);
                this.k.b(m2.a.length(), 1);
            }
            m2.a.length();
            this.k.a();
            File file = (File) g2.c;
            if (!file.exists() || file.delete()) {
                z = true;
            }
            if (!z) {
                ta5.a(el4.class, "Failed to delete temp file");
            }
            p0.q0();
            return m2;
        } catch (IOException e4) {
            Class<el4> cls = el4.class;
            if (ta5.a.i(6)) {
                ta5.a.e(cls.getSimpleName(), "Failed inserting a file into the cache", e4);
            }
            throw e4;
        } catch (Throwable th) {
            p0.q0();
            throw th;
        }
    }

    public final boolean f() {
        boolean z;
        long j2;
        boolean z2;
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        dw0 dw0 = this.k;
        synchronized (dw0) {
            z = dw0.a;
        }
        long j3 = -1;
        if (z) {
            long j4 = this.e;
            if (j4 != -1 && currentTimeMillis - j4 <= o) {
                return false;
            }
        }
        this.l.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j5 = n + currentTimeMillis2;
        HashSet hashSet = (!this.j || !this.d.isEmpty()) ? this.j ? new HashSet() : null : this.d;
        try {
            boolean z3 = false;
            int i2 = 0;
            long j6 = 0;
            for (l94 l94 : this.g.d()) {
                boolean z4 = z3;
                int i3 = i2 + 1;
                if (l94.c < 0) {
                    l94.c = l94.b.a.length();
                }
                j6 += l94.c;
                if (l94.a() > j5) {
                    if (l94.c < 0) {
                        l94.c = l94.b.a.length();
                    }
                    j3 = Math.max(l94.a() - currentTimeMillis2, j3);
                    z3 = true;
                } else {
                    if (this.j) {
                        hashSet.getClass();
                        hashSet.add(l94.a);
                    }
                    z3 = z4;
                }
                i2 = i3;
            }
            if (z3) {
                this.i.getClass();
            }
            dw0 dw02 = this.k;
            synchronized (dw02) {
                j2 = dw02.c;
            }
            long j7 = (long) i2;
            if (j2 == j7) {
                if (this.k.a() == j6) {
                    z2 = true;
                    this.e = currentTimeMillis2;
                    return z2;
                }
            }
            if (this.j && this.d != hashSet) {
                hashSet.getClass();
                this.d.clear();
                this.d.addAll(hashSet);
            }
            dw0 dw03 = this.k;
            synchronized (dw03) {
                dw03.c = j7;
                dw03.b = j6;
                z2 = true;
                dw03.a = true;
            }
            this.e = currentTimeMillis2;
            return z2;
        } catch (IOException e2) {
            lq9 lq9 = this.i;
            e2.getMessage();
            lq9.getClass();
            return false;
        }
    }

    public final vq7 g(String str, ww0 ww0) {
        synchronized (this.m) {
            boolean f2 = f();
            h();
            long a2 = this.k.a();
            if (a2 > this.c && !f2) {
                dw0 dw0 = this.k;
                synchronized (dw0) {
                    dw0.a = false;
                    dw0.c = -1;
                    dw0.b = -1;
                }
                f();
            }
            long j2 = this.c;
            if (a2 > j2) {
                b((j2 * 9) / 10);
            }
        }
        return this.g.f(ww0, str);
    }

    public final void h() {
        char c2 = this.g.isExternal() ? (char) 2 : 1;
        d0e d0e = this.f;
        long a2 = this.b - this.k.a();
        d0e.a();
        d0e.a();
        ReentrantLock reentrantLock = d0e.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - d0e.e > d0e.i) {
                    d0e.a = d0e.b(d0e.a, d0e.b);
                    d0e.c = d0e.b(d0e.c, d0e.d);
                    d0e.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c2 == 1 ? d0e.a : d0e.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0;
        if (availableBlocksLong <= 0 || availableBlocksLong < a2) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
