package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: ba4  reason: default package */
public final class ba4 implements tr4 {
    public final UUID b;
    public final av1 c;
    public final w36 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final imc i = new imc(15);
    public final huc j;
    public final fd7 k = new fd7(this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = ngg.B();
    public final Set o = ngg.B();
    public int p;
    public t65 q;
    public x94 r;
    public x94 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public j4b x;
    public volatile cy y;

    public ba4(UUID uuid, w36 w36, HashMap hashMap, boolean z, int[] iArr, boolean z2, huc huc, long j2) {
        av1 av1 = f36.Y;
        uuid.getClass();
        fm9.e("Use C.CLEARKEY_UUID instead", !ew0.b.equals(uuid));
        this.b = uuid;
        this.c = av1;
        this.d = w36;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = huc;
        this.l = j2;
    }

    public static boolean f(x94 x94) {
        x94.p();
        if (x94.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException d2 = x94.d();
        d2.getClass();
        Throwable cause = d2.getCause();
        return (cause instanceof ResourceBusyException) || xfg.t(cause);
    }

    public static ArrayList i(dr4 dr4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(dr4.o);
        for (int i2 = 0; i2 < dr4.o; i2++) {
            br4 br4 = dr4.a[i2];
            if ((br4.a(uuid) || (ew0.c.equals(uuid) && br4.a(ew0.b))) && (br4.X != null || z)) {
                arrayList.add(br4);
            }
        }
        return arrayList;
    }

    public final fr4 a(lr4 lr4, qy5 qy5) {
        boolean z = false;
        k(false);
        if (this.p > 0) {
            z = true;
        }
        fm9.k(z);
        fm9.l(this.t);
        return e(this.t, lr4, qy5, true);
    }

    public final rr4 b(lr4 lr4, qy5 qy5) {
        fm9.k(this.p > 0);
        fm9.l(this.t);
        z94 z94 = new z94(this, lr4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new wt1(z94, 20, qy5));
        return z94;
    }

    public final void c(Looper looper, j4b j4b) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    fm9.k(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = j4b;
    }

    public final int d(qy5 qy5) {
        k(false);
        t65 t65 = this.q;
        t65.getClass();
        int o2 = t65.o();
        dr4 dr4 = qy5.r;
        if (dr4 == null) {
            int g2 = ia9.g(qy5.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                return o2;
            }
            return 0;
        } else if (this.w != null) {
            return o2;
        } else {
            UUID uuid = this.b;
            if (i(dr4, uuid, true).isEmpty()) {
                if (dr4.o == 1 && dr4.a[0].a(ew0.b)) {
                    z04.c0("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = dr4.c;
            if (str == null || "cenc".equals(str)) {
                return o2;
            }
            if ("cbcs".equals(str)) {
                if (oaf.a >= 25) {
                    return o2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return o2;
            }
            return 1;
        }
    }

    public final fr4 e(Looper looper, lr4 lr4, qy5 qy5, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new cy(this, looper, 5);
        }
        dr4 dr4 = qy5.r;
        int i2 = 0;
        x94 x94 = null;
        if (dr4 == null) {
            int g2 = ia9.g(qy5.n);
            t65 t65 = this.q;
            t65.getClass();
            if (t65.o() == 2 && b36.c) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1 || t65.o() == 1) {
                return null;
            }
            x94 x942 = this.r;
            if (x942 == null) {
                ls5 ls5 = zw6.b;
                x94 h2 = h(ffc.X, true, (lr4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                x942.g((lr4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(dr4, this.b, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.b);
                z04.v("DRM error", exc);
                if (lr4 != null) {
                    lr4.e(exc);
                }
                return new g35(new DrmSession$DrmSessionException(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x94 x943 = (x94) it.next();
                if (oaf.a(x943.a, arrayList)) {
                    x94 = x943;
                    break;
                }
            }
        } else {
            x94 = this.s;
        }
        if (x94 == null) {
            x94 = h(arrayList, false, lr4, z);
            if (!this.f) {
                this.s = x94;
            }
            this.m.add(x94);
        } else {
            x94.g(lr4);
        }
        return x94;
    }

    public final x94 g(List list, boolean z, lr4 lr4) {
        this.q.getClass();
        t65 t65 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        j4b j4b = this.x;
        j4b.getClass();
        w36 w36 = this.d;
        huc huc = this.j;
        huc huc2 = huc;
        x94 x94 = new x94(this.b, t65, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, w36, looper, huc2, j4b);
        x94.g(lr4);
        if (this.l != -9223372036854775807L) {
            x94.g((lr4) null);
        }
        return x94;
    }

    public final x94 h(List list, boolean z, lr4 lr4, boolean z2) {
        x94 g2 = g(list, z, lr4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            m5f g3 = jx6.j(set).iterator();
            while (g3.hasNext()) {
                ((fr4) g3.next()).f((lr4) null);
            }
            g2.f(lr4);
            if (j2 != -9223372036854775807L) {
                g2.f((lr4) null);
            }
            g2 = g(list, z, lr4);
        }
        if (!f(g2) || !z2) {
            return g2;
        }
        Set set2 = this.n;
        if (set2.isEmpty()) {
            return g2;
        }
        m5f g4 = jx6.j(set2).iterator();
        while (g4.hasNext()) {
            ((z94) g4.next()).release();
        }
        if (!set.isEmpty()) {
            m5f g5 = jx6.j(set).iterator();
            while (g5.hasNext()) {
                ((fr4) g5.next()).f((lr4) null);
            }
        }
        g2.f(lr4);
        if (j2 != -9223372036854775807L) {
            g2.f((lr4) null);
        }
        return g(list, z, lr4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            t65 t65 = this.q;
            t65.getClass();
            t65.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (!z || this.t != null) {
            Thread currentThread = Thread.currentThread();
            Looper looper = this.t;
            looper.getClass();
            if (currentThread != looper.getThread()) {
                z04.d0("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
                return;
            }
            return;
        }
        z04.d0("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: f36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: f36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: f36} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void prepare() {
        /*
            r4 = this;
            r0 = 1
            r4.k(r0)
            int r0 = r4.p
            int r1 = r0 + 1
            r4.p = r1
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            t65 r0 = r4.q
            if (r0 != 0) goto L_0x0057
            java.util.UUID r0 = r4.b
            av1 r1 = r4.c
            r1.getClass()
            f36 r1 = new f36     // Catch:{ UnsupportedSchemeException -> 0x0021, Exception -> 0x001f }
            r2 = 1
            r1.<init>(r0, r2)     // Catch:{ UnsupportedSchemeException -> 0x0021, Exception -> 0x001f }
            goto L_0x004a
        L_0x001f:
            r1 = move-exception
            goto L_0x0023
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            androidx.media3.exoplayer.drm.UnsupportedDrmException r2 = new androidx.media3.exoplayer.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002f }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002f }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002f }
        L_0x0029:
            androidx.media3.exoplayer.drm.UnsupportedDrmException r2 = new androidx.media3.exoplayer.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002f }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002f }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002f }
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to instantiate a FrameworkMediaDrm for uuid: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.z04.u(r0)
            sp3 r1 = new sp3
            r1.<init>()
        L_0x004a:
            r4.q = r1
            wd6 r0 = new wd6
            r2 = 12
            r0.<init>((int) r2, (java.lang.Object) r4)
            r1.x(r0)
            goto L_0x0078
        L_0x0057:
            long r0 = r4.l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            r0 = 0
        L_0x0063:
            java.util.ArrayList r1 = r4.m
            int r2 = r1.size()
            if (r0 >= r2) goto L_0x0078
            java.lang.Object r1 = r1.get(r0)
            x94 r1 = (defpackage.x94) r1
            r2 = 0
            r1.g(r2)
            int r0 = r0 + 1
            goto L_0x0063
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba4.prepare():void");
    }

    public final void release() {
        k(true);
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((x94) arrayList.get(i3)).f((lr4) null);
                }
            }
            m5f g2 = jx6.j(this.n).iterator();
            while (g2.hasNext()) {
                ((z94) g2.next()).release();
            }
            j();
        }
    }
}
