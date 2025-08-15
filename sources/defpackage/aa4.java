package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: aa4  reason: default package */
public final class aa4 implements sr4 {
    public final UUID b;
    public final av1 c;
    public final w36 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final h7b i = new h7b(15);
    public final buc j;
    public final re6 k = new re6(12, (Object) this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = ngg.B();
    public final Set o = ngg.B();
    public int p;
    public s65 q;
    public w94 r;
    public w94 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public i4b x;
    public volatile cy y;

    public aa4(UUID uuid, w36 w36, HashMap hashMap, boolean z, int[] iArr, boolean z2, buc buc, long j2) {
        av1 av1 = f36.X;
        uuid.getClass();
        np8.c("Use C.CLEARKEY_UUID instead", !bw0.b.equals(uuid));
        this.b = uuid;
        this.c = av1;
        this.d = w36;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = buc;
        this.l = j2;
    }

    public static boolean f(w94 w94) {
        if (w94.o == 1) {
            if (maf.a < 19) {
                return true;
            }
            DrmSession$DrmSessionException d2 = w94.d();
            d2.getClass();
            if (d2.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(cr4 cr4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(cr4.o);
        for (int i2 = 0; i2 < cr4.o; i2++) {
            ar4 ar4 = cr4.a[i2];
            if ((ar4.a(uuid) || (bw0.c.equals(uuid) && ar4.a(bw0.b))) && (ar4.X != null || z)) {
                arrayList.add(ar4);
            }
        }
        return arrayList;
    }

    public final er4 a(kr4 kr4, oy5 oy5) {
        np8.f(this.p > 0);
        np8.g(this.t);
        return e(this.t, kr4, oy5, true);
    }

    public final int b(oy5 oy5) {
        s65 s65 = this.q;
        s65.getClass();
        int o2 = s65.o();
        cr4 cr4 = oy5.z0;
        if (cr4 == null) {
            int g2 = ha9.g(oy5.w0);
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
            if (i(cr4, uuid, true).isEmpty()) {
                if (cr4.o == 1 && cr4.a[0].a(bw0.b)) {
                    new StringBuilder(String.valueOf(uuid).length() + 72);
                }
                return 1;
            }
            String str = cr4.c;
            if (str == null || "cenc".equals(str)) {
                return o2;
            }
            if ("cbcs".equals(str)) {
                if (maf.a >= 25) {
                    return o2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return o2;
            }
            return 1;
        }
    }

    public final void c(Looper looper, i4b i4b) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    np8.f(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = i4b;
    }

    public final qr4 d(kr4 kr4, oy5 oy5) {
        np8.f(this.p > 0);
        np8.g(this.t);
        y94 y94 = new y94(this, kr4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new wt1(y94, 19, oy5));
        return y94;
    }

    public final er4 e(Looper looper, kr4 kr4, oy5 oy5, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new cy(this, looper, 4);
        }
        cr4 cr4 = oy5.z0;
        int i2 = 0;
        w94 w94 = null;
        if (cr4 == null) {
            int g2 = ha9.g(oy5.w0);
            s65 s65 = this.q;
            s65.getClass();
            if (s65.o() == 2 && a36.d) {
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
            if (i2 == -1 || s65.o() == 1) {
                return null;
            }
            w94 w942 = this.r;
            if (w942 == null) {
                ls5 ls5 = zw6.b;
                w94 h2 = h(ffc.X, true, (kr4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                w942.g((kr4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(cr4, this.b, false);
            if (arrayList.isEmpty()) {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Media does not support uuid: ");
                sb.append(valueOf);
                Exception exc = new Exception(sb.toString());
                fm9.c("DRM error", exc);
                if (kr4 != null) {
                    kr4.e(exc);
                }
                return new f35(new DrmSession$DrmSessionException(exc, 6003));
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
                w94 w943 = (w94) it.next();
                if (maf.a(w943.a, arrayList)) {
                    w94 = w943;
                    break;
                }
            }
        } else {
            w94 = this.s;
        }
        if (w94 == null) {
            w94 = h(arrayList, false, kr4, z);
            if (!this.f) {
                this.s = w94;
            }
            this.m.add(w94);
        } else {
            w94.g(kr4);
        }
        return w94;
    }

    public final w94 g(List list, boolean z, kr4 kr4) {
        this.q.getClass();
        s65 s65 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        i4b i4b = this.x;
        i4b.getClass();
        w36 w36 = this.d;
        buc buc = this.j;
        buc buc2 = buc;
        w94 w94 = new w94(this.b, s65, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, w36, looper, buc2, i4b);
        w94.g(kr4);
        if (this.l != -9223372036854775807L) {
            w94.g((kr4) null);
        }
        return w94;
    }

    public final w94 h(List list, boolean z, kr4 kr4, boolean z2) {
        w94 g2 = g(list, z, kr4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            m5f g3 = jx6.j(set).iterator();
            while (g3.hasNext()) {
                ((er4) g3.next()).f((kr4) null);
            }
            g2.f(kr4);
            if (j2 != -9223372036854775807L) {
                g2.f((kr4) null);
            }
            g2 = g(list, z, kr4);
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
            ((y94) g4.next()).release();
        }
        if (!set.isEmpty()) {
            m5f g5 = jx6.j(set).iterator();
            while (g5.hasNext()) {
                ((er4) g5.next()).f((kr4) null);
            }
        }
        g2.f(kr4);
        if (j2 != -9223372036854775807L) {
            g2.f((kr4) null);
        }
        return g(list, z, kr4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            s65 s65 = this.q;
            s65.getClass();
            s65.release();
            this.q = null;
        }
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
            int r0 = r4.p
            int r1 = r0 + 1
            r4.p = r1
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            s65 r0 = r4.q
            if (r0 != 0) goto L_0x004c
            java.util.UUID r0 = r4.b
            av1 r1 = r4.c
            r1.getClass()
            f36 r1 = new f36     // Catch:{ UnsupportedSchemeException -> 0x001d, Exception -> 0x001b }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ UnsupportedSchemeException -> 0x001d, Exception -> 0x001b }
            goto L_0x003f
        L_0x001b:
            r1 = move-exception
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x0025
        L_0x001f:
            com.google.android.exoplayer2.drm.UnsupportedDrmException r2 = new com.google.android.exoplayer2.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002b }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002b }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002b }
        L_0x0025:
            com.google.android.exoplayer2.drm.UnsupportedDrmException r2 = new com.google.android.exoplayer2.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002b }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002b }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002b }
        L_0x002b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            dp3 r1 = new dp3
            r1.<init>()
        L_0x003f:
            r4.q = r1
            sy4 r0 = new sy4
            r2 = 12
            r0.<init>((int) r2, (java.lang.Object) r4)
            r1.p(r0)
            goto L_0x006d
        L_0x004c:
            long r0 = r4.l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r0 = 0
        L_0x0058:
            java.util.ArrayList r1 = r4.m
            int r2 = r1.size()
            if (r0 >= r2) goto L_0x006d
            java.lang.Object r1 = r1.get(r0)
            w94 r1 = (defpackage.w94) r1
            r2 = 0
            r1.g(r2)
            int r0 = r0 + 1
            goto L_0x0058
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa4.prepare():void");
    }

    public final void release() {
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((w94) arrayList.get(i3)).f((kr4) null);
                }
            }
            m5f g2 = jx6.j(this.n).iterator();
            while (g2.hasNext()) {
                ((y94) g2.next()).release();
            }
            j();
        }
    }
}
