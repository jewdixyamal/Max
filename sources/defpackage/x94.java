package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: x94  reason: default package */
public final class x94 implements fr4 {
    public final List a;
    public final t65 b;
    public final imc c;
    public final fd7 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final ex3 i;
    public final huc j;
    public final j4b k;
    public final w36 l;
    public final UUID m;
    public final Looper n;
    public final cy o;
    public int p;
    public int q;
    public HandlerThread r;
    public t94 s;
    public qz3 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public p65 x;
    public r65 y;

    public x94(UUID uuid, t65 t65, imc imc, fd7 fd7, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, w36 w36, Looper looper, huc huc, j4b j4b) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = imc;
        this.d = fd7;
        this.b = t65;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = w36;
        this.i = new ex3(1);
        this.j = huc;
        this.k = j4b;
        this.p = 2;
        this.n = looper;
        this.o = new cy(this, looper, 3);
    }

    public final UUID a() {
        p();
        return this.m;
    }

    public final boolean b() {
        p();
        return this.f;
    }

    public final boolean c(String str) {
        p();
        byte[] bArr = this.v;
        fm9.l(bArr);
        return this.b.i(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    public final qz3 e() {
        p();
        return this.t;
    }

    public final void f(lr4 lr4) {
        p();
        int i2 = this.q;
        if (i2 <= 0) {
            z04.u("release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.q = i3;
        if (i3 == 0) {
            this.p = 0;
            cy cyVar = this.o;
            int i4 = oaf.a;
            cyVar.removeCallbacksAndMessages((Object) null);
            t94 t94 = this.s;
            synchronized (t94) {
                t94.removeCallbacksAndMessages((Object) null);
                t94.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (lr4 != null) {
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                try {
                    Integer num = (Integer) ex3.c.get(lr4);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(ex3.X);
                        arrayList.remove(lr4);
                        ex3.X = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            ex3.c.remove(lr4);
                            HashSet hashSet = new HashSet(ex3.o);
                            hashSet.remove(lr4);
                            ex3.o = Collections.unmodifiableSet(hashSet);
                        } else {
                            ex3.c.put(lr4, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.i.a(lr4) == 0) {
                lr4.f();
            }
        }
        fd7 fd7 = this.d;
        int i5 = this.q;
        ba4 ba4 = (ba4) fd7.a;
        if (i5 == 1 && ba4.p > 0 && ba4.l != -9223372036854775807L) {
            ba4.o.add(this);
            Handler handler = ba4.u;
            handler.getClass();
            handler.postAtTime(new cu1(29, this), this, SystemClock.uptimeMillis() + ba4.l);
        } else if (i5 == 0) {
            ba4.m.remove(this);
            if (ba4.r == this) {
                ba4.r = null;
            }
            if (ba4.s == this) {
                ba4.s = null;
            }
            imc imc = ba4.i;
            HashSet hashSet2 = (HashSet) imc.b;
            hashSet2.remove(this);
            if (((x94) imc.c) == this) {
                imc.c = null;
                if (!hashSet2.isEmpty()) {
                    x94 x94 = (x94) hashSet2.iterator().next();
                    imc.c = x94;
                    r65 d2 = x94.b.d();
                    x94.y = d2;
                    t94 t942 = x94.s;
                    int i6 = oaf.a;
                    d2.getClass();
                    t942.getClass();
                    t942.obtainMessage(1, new v94(yn7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
                }
            }
            if (ba4.l != -9223372036854775807L) {
                Handler handler2 = ba4.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ba4.o.remove(this);
            }
        }
        ba4.j();
    }

    public final void g(lr4 lr4) {
        p();
        boolean z = false;
        if (this.q < 0) {
            z04.u("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (lr4 != null) {
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                try {
                    ArrayList arrayList = new ArrayList(ex3.X);
                    arrayList.add(lr4);
                    ex3.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) ex3.c.get(lr4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(ex3.o);
                        hashSet.add(lr4);
                        ex3.o = Collections.unmodifiableSet(hashSet);
                    }
                    ex3.c.put(lr4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            fm9.k(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new t94(this, this.r.getLooper(), 1);
            if (l()) {
                h(true);
            }
        } else if (lr4 != null && i() && this.i.a(lr4) == 1) {
            lr4.d(this.p);
        }
        ba4 ba4 = (ba4) this.d.a;
        if (ba4.l != -9223372036854775807L) {
            ba4.o.remove(this);
            Handler handler = ba4.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        p();
        return this.p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089 A[Catch:{ NumberFormatException -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.v
            int r1 = defpackage.oaf.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0038
            if (r1 == r2) goto L_0x0038
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f8
        L_0x0018:
            byte[] r1 = r10.w
            r1.getClass()
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.w
            r10.m(r0, r1, r11)
            goto L_0x00f8
        L_0x0029:
            byte[] r1 = r10.w
            if (r1 == 0) goto L_0x0033
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x0033:
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x0038:
            byte[] r1 = r10.w
            if (r1 != 0) goto L_0x0041
            r10.m(r2, r0, r11)
            goto L_0x00f8
        L_0x0041:
            int r1 = r10.p
            r2 = 4
            if (r1 == r2) goto L_0x004c
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x004c:
            java.util.UUID r1 = defpackage.ew0.d
            java.util.UUID r4 = r10.m
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005c
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00ac
        L_0x005c:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0064
            r1 = 0
            goto L_0x0095
        L_0x0064:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x007a }
            if (r5 == 0) goto L_0x007a
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r8 = r6
        L_0x007b:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x008d }
            if (r1 == 0) goto L_0x008d
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
        L_0x008d:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r1)
            r1 = r4
        L_0x0095:
            r1.getClass()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r4 = java.lang.Math.min(r4, r6)
        L_0x00ac:
            int r1 = r10.e
            if (r1 != 0) goto L_0x00cb
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x00cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Offline license has expired or will expire soon. Remaining seconds: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.z04.t(r1)
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x00cb:
            r0 = 0
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00da
            androidx.media3.exoplayer.drm.KeysExpiredException r11 = new androidx.media3.exoplayer.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f8
        L_0x00da:
            r10.p = r2
            ex3 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f9 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r10.next()
            lr4 r11 = (defpackage.lr4) r11
            r11.c()
            goto L_0x00e8
        L_0x00f8:
            return
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x94.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.p;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Throwable th, int i2) {
        int i3;
        Set<lr4> set;
        int i4 = oaf.a;
        if (i4 < 21 || !wr4.a(th)) {
            if (i4 < 23 || !yr4.a(th)) {
                if (!(th instanceof NotProvisionedException) && !xfg.s(th)) {
                    if (th instanceof DeniedByServerException) {
                        i3 = 6007;
                    } else if (th instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (th instanceof KeysExpiredException) {
                        i3 = 6008;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = 6004;
                        } else if (i2 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = 6002;
            }
            i3 = 6006;
        } else {
            i3 = wr4.b(th);
        }
        this.u = new DrmSession$DrmSessionException(th, i3);
        z04.v("DRM session error", th);
        if (th instanceof Exception) {
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                set = ex3.o;
            }
            for (lr4 e2 : set) {
                e2.e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        } else if (!xfg.t(th) && !xfg.s(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || xfg.s(th)) {
            this.c.Z(this);
        } else {
            j(th, z ? 1 : 2);
        }
    }

    public final boolean l() {
        Set<lr4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] g2 = this.b.g();
            this.v = g2;
            this.b.z(g2, this.k);
            this.t = this.b.f(this.v);
            this.p = 3;
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                set = ex3.o;
            }
            for (lr4 d2 : set) {
                d2.d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.Z(this);
            return false;
        } catch (Exception | NoSuchMethodError e2) {
            if (xfg.s(e2)) {
                this.c.Z(this);
                return false;
            }
            j(e2, 1);
            return false;
        }
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            p65 n2 = this.b.n(bArr, this.a, i2, this.h);
            this.x = n2;
            t94 t94 = this.s;
            int i3 = oaf.a;
            n2.getClass();
            t94.getClass();
            t94.obtainMessage(2, new v94(yn7.b.getAndIncrement(), z, SystemClock.elapsedRealtime(), n2)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    public final boolean o() {
        try {
            this.b.j(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e2) {
            j(e2, 1);
            return false;
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            z04.d0("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
