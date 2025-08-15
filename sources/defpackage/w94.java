package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: w94  reason: default package */
public final class w94 implements er4 {
    public final List a;
    public final s65 b;
    public final h7b c;
    public final re6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final ex3 i;
    public final buc j;
    public final i4b k;
    public final w36 l;
    public final UUID m;
    public final cy n;
    public int o;
    public int p;
    public HandlerThread q;
    public t94 r;
    public pz3 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public o65 w;
    public q65 x;

    public w94(UUID uuid, s65 s65, h7b h7b, re6 re6, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, w36 w36, Looper looper, buc buc, i4b i4b) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = h7b;
        this.d = re6;
        this.b = s65;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = w36;
        this.i = new ex3(0);
        this.j = buc;
        this.k = i4b;
        this.o = 2;
        this.n = new cy(this, looper, 2);
    }

    public final UUID a() {
        return this.m;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c(String str) {
        byte[] bArr = this.u;
        np8.g(bArr);
        return this.b.i(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    public final pz3 e() {
        return this.s;
    }

    public final void f(kr4 kr4) {
        int i2 = this.p;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.p = i3;
            if (i3 == 0) {
                this.o = 0;
                cy cyVar = this.n;
                int i4 = maf.a;
                cyVar.removeCallbacksAndMessages((Object) null);
                t94 t94 = this.r;
                synchronized (t94) {
                    t94.removeCallbacksAndMessages((Object) null);
                    t94.b = true;
                }
                this.r = null;
                this.q.quit();
                this.q = null;
                this.s = null;
                this.t = null;
                this.w = null;
                this.x = null;
                byte[] bArr = this.u;
                if (bArr != null) {
                    this.b.k(bArr);
                    this.u = null;
                }
            }
            if (kr4 != null) {
                ex3 ex3 = this.i;
                synchronized (ex3.b) {
                    try {
                        Integer num = (Integer) ex3.c.get(kr4);
                        if (num != null) {
                            ArrayList arrayList = new ArrayList(ex3.X);
                            arrayList.remove(kr4);
                            ex3.X = Collections.unmodifiableList(arrayList);
                            if (num.intValue() == 1) {
                                ex3.c.remove(kr4);
                                HashSet hashSet = new HashSet(ex3.o);
                                hashSet.remove(kr4);
                                ex3.o = Collections.unmodifiableSet(hashSet);
                            } else {
                                ex3.c.put(kr4, Integer.valueOf(num.intValue() - 1));
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (this.i.a(kr4) == 0) {
                    kr4.f();
                }
            }
            re6 re6 = this.d;
            int i5 = this.p;
            aa4 aa4 = (aa4) re6.b;
            if (i5 == 1 && aa4.p > 0 && aa4.l != -9223372036854775807L) {
                aa4.o.add(this);
                Handler handler = aa4.u;
                handler.getClass();
                handler.postAtTime(new cu1(28, this), this, SystemClock.uptimeMillis() + aa4.l);
            } else if (i5 == 0) {
                aa4.m.remove(this);
                if (aa4.r == this) {
                    aa4.r = null;
                }
                if (aa4.s == this) {
                    aa4.s = null;
                }
                h7b h7b = aa4.i;
                HashSet hashSet2 = (HashSet) h7b.b;
                hashSet2.remove(this);
                if (((w94) h7b.c) == this) {
                    h7b.c = null;
                    if (!hashSet2.isEmpty()) {
                        w94 w94 = (w94) hashSet2.iterator().next();
                        h7b.c = w94;
                        q65 d2 = w94.b.d();
                        w94.x = d2;
                        t94 t942 = w94.r;
                        int i6 = maf.a;
                        d2.getClass();
                        t942.getClass();
                        t942.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
                    }
                }
                if (aa4.l != -9223372036854775807L) {
                    Handler handler2 = aa4.u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(this);
                    aa4.o.remove(this);
                }
            }
            aa4.j();
        }
    }

    public final void g(kr4 kr4) {
        boolean z = false;
        if (this.p < 0) {
            this.p = 0;
        }
        if (kr4 != null) {
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                try {
                    ArrayList arrayList = new ArrayList(ex3.X);
                    arrayList.add(kr4);
                    ex3.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) ex3.c.get(kr4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(ex3.o);
                        hashSet.add(kr4);
                        ex3.o = Collections.unmodifiableSet(hashSet);
                    }
                    ex3.c.put(kr4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 == 1) {
            if (this.o == 2) {
                z = true;
            }
            np8.f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new t94(this, this.q.getLooper(), 0);
            if (l()) {
                h(true);
            }
        } else if (kr4 != null && i() && this.i.a(kr4) == 1) {
            kr4.d(this.o);
        }
        aa4 aa4 = (aa4) this.d.b;
        if (aa4.l != -9223372036854775807L) {
            aa4.o.remove(this);
            Handler handler = aa4.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ NumberFormatException -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.u
            int r1 = defpackage.maf.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x003e
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f3
        L_0x0018:
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.u
            r1.getClass()
            byte[] r1 = r10.v
            r10.m(r0, r1, r11)
            goto L_0x00f3
        L_0x0029:
            byte[] r1 = r10.v
            if (r1 == 0) goto L_0x0039
            s65 r4 = r10.b     // Catch:{ Exception -> 0x0033 }
            r4.j(r0, r1)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0039:
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x003e:
            byte[] r1 = r10.v
            if (r1 != 0) goto L_0x0047
            r10.m(r2, r0, r11)
            goto L_0x00f3
        L_0x0047:
            int r4 = r10.o
            r5 = 4
            if (r4 == r5) goto L_0x0058
            s65 r4 = r10.b     // Catch:{ Exception -> 0x0052 }
            r4.j(r0, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0058:
            java.util.UUID r1 = defpackage.bw0.d
            java.util.UUID r2 = r10.m
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b8
        L_0x0068:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0070
            r1 = 0
            goto L_0x00a1
        L_0x0070:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x0086 }
            if (r4 == 0) goto L_0x0086
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0099 }
            if (r1 == 0) goto L_0x0099
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0099 }
        L_0x0099:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2.<init>(r4, r1)
            r1 = r2
        L_0x00a1:
            r1.getClass()
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r6, r1)
        L_0x00b8:
            int r4 = r10.e
            if (r4 != 0) goto L_0x00c6
            r6 = 60
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00c6
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x00c6:
            r6 = 0
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00d5
            com.google.android.exoplayer2.drm.KeysExpiredException r11 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f3
        L_0x00d5:
            r10.o = r5
            ex3 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f4 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f3
            java.lang.Object r11 = r10.next()
            kr4 r11 = (defpackage.kr4) r11
            r11.c()
            goto L_0x00e3
        L_0x00f3:
            return
        L_0x00f4:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w94.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.o;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Exception exc, int i2) {
        int i3;
        Set<kr4> set;
        int i4 = maf.a;
        if (i4 < 21 || !vr4.a(exc)) {
            if (i4 < 23 || !xr4.a(exc)) {
                if (i4 < 18 || !ur4.b(exc)) {
                    if (i4 >= 18 && ur4.a(exc)) {
                        i3 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
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
            i3 = vr4.b(exc);
        }
        this.t = new DrmSession$DrmSessionException(exc, i3);
        fm9.c("DRM session error", exc);
        ex3 ex3 = this.i;
        synchronized (ex3.b) {
            set = ex3.o;
        }
        for (kr4 e2 : set) {
            e2.e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void k(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            h7b h7b = this.c;
            ((HashSet) h7b.b).add(this);
            if (((w94) h7b.c) == null) {
                h7b.c = this;
                q65 d2 = this.b.d();
                this.x = d2;
                t94 t94 = this.r;
                int i2 = maf.a;
                d2.getClass();
                t94.getClass();
                t94.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
                return;
            }
            return;
        }
        j(exc, z ? 1 : 2);
    }

    public final boolean l() {
        Set<kr4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] g2 = this.b.g();
            this.u = g2;
            this.b.t(g2, this.k);
            this.s = this.b.f(this.u);
            this.o = 3;
            ex3 ex3 = this.i;
            synchronized (ex3.b) {
                set = ex3.o;
            }
            for (kr4 d2 : set) {
                d2.d(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            h7b h7b = this.c;
            ((HashSet) h7b.b).add(this);
            if (((w94) h7b.c) == null) {
                h7b.c = this;
                q65 d3 = this.b.d();
                this.x = d3;
                t94 t94 = this.r;
                int i2 = maf.a;
                d3.getClass();
                t94.getClass();
                t94.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), d3)).sendToTarget();
            }
        } catch (Exception e2) {
            j(e2, 1);
        }
        return false;
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            o65 n2 = this.b.n(bArr, this.a, i2, this.h);
            this.w = n2;
            t94 t94 = this.r;
            int i3 = maf.a;
            n2.getClass();
            t94.getClass();
            t94.obtainMessage(1, new u94(xn7.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), n2)).sendToTarget();
        } catch (Exception e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }
}
