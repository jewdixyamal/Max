package defpackage;

import android.net.Uri;
import java.io.File;
import org.apache.commons.logging.LogFactory;

/* renamed from: wv6  reason: default package */
public final class wv6 {
    public final uv6 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ju6 h;
    public final jic i;
    public final anc j;
    public final a9b k;
    public final vv6 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final q6b q;
    public final uhc r;
    public final Boolean s;
    public final bp4 t;
    public final String u;
    public final int v;

    public wv6(xv6 xv6) {
        this.a = xv6.g;
        Uri uri = xv6.a;
        this.b = uri;
        boolean z = false;
        int i2 = -1;
        if (uri != null) {
            if (e9f.e(uri)) {
                i2 = 0;
            } else if (uri.getPath() != null && "file".equals(e9f.b(uri))) {
                String a2 = ym8.a(uri.getPath());
                i2 = a2 != null ? eae.o0(a2, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(e9f.b(uri))) {
                i2 = 4;
            } else if ("asset".equals(e9f.b(uri))) {
                i2 = 5;
            } else if ("res".equals(e9f.b(uri))) {
                i2 = 6;
            } else if ("data".equals(uri.getScheme())) {
                i2 = 7;
            } else if ("android.resource".equals(e9f.b(uri))) {
                i2 = 8;
            }
        }
        this.c = i2;
        this.e = xv6.h;
        this.f = xv6.i;
        this.g = xv6.j;
        this.h = xv6.f;
        this.i = xv6.d;
        anc anc = xv6.e;
        this.j = anc == null ? anc.b : anc;
        xv6.getClass();
        this.k = xv6.k;
        this.l = xv6.b;
        boolean z2 = (xv6.c & 48) == 0 && (e9f.e(xv6.a) || xv6.c(xv6.a));
        this.n = z2;
        int i3 = xv6.c;
        this.m = !z2 ? i3 | 48 : i3;
        this.o = (i3 & 15) == 0 ? true : z;
        this.p = xv6.m;
        this.q = xv6.l;
        this.r = xv6.n;
        this.s = xv6.o;
        this.t = xv6.p;
        this.v = xv6.q;
        this.u = xv6.r;
    }

    public static wv6 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return xv6.d(uri).a();
    }

    public static wv6 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final synchronized File c() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.d;
    }

    public final boolean d(int i2) {
        return (this.m & i2) == 0;
    }

    public final boolean equals(Object obj) {
        wv6 wv6;
        if (!(obj instanceof wv6) || this.f != (wv6 = (wv6) obj).f || this.n != wv6.n || this.o != wv6.o || !j47.B(this.b, wv6.b) || !j47.B(this.a, wv6.a) || !j47.B(this.u, wv6.u) || !j47.B(this.d, wv6.d)) {
            return false;
        }
        wv6.getClass();
        if (!j47.B((Object) null, (Object) null) || !j47.B(this.h, wv6.h) || !j47.B(this.i, wv6.i) || !j47.B(this.k, wv6.k) || !j47.B(this.l, wv6.l) || !j47.B(Integer.valueOf(this.m), Integer.valueOf(wv6.m)) || !j47.B(this.p, wv6.p) || !j47.B(this.s, wv6.s) || !j47.B(this.t, wv6.t) || !j47.B(this.j, wv6.j) || this.g != wv6.g) {
            return false;
        }
        ww0 ww0 = null;
        q6b q6b = this.q;
        ww0 b2 = q6b != null ? q6b.b() : null;
        q6b q6b2 = wv6.q;
        if (q6b2 != null) {
            ww0 = q6b2.b();
        }
        return j47.B(b2, ww0) && this.v == wv6.v;
    }

    public final int hashCode() {
        q6b q6b = this.q;
        return tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(0, this.a), this.b), Boolean.valueOf(this.f)), (Object) null), this.k), this.l), Integer.valueOf(this.m)), Boolean.valueOf(this.n)), Boolean.valueOf(this.o)), this.h), this.p), this.i), this.j), q6b != null ? q6b.b() : null), this.s), this.t), Integer.valueOf(this.v)), Boolean.valueOf(this.g));
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(this.b, "uri");
        r0.e(this.a, "cacheChoice");
        r0.e(this.h, "decodeOptions");
        r0.e(this.q, "postprocessor");
        r0.e(this.k, LogFactory.PRIORITY_KEY);
        r0.e(this.i, "resizeOptions");
        r0.e(this.j, "rotationOptions");
        r0.e((Object) null, "bytesRange");
        r0.e(this.s, "resizingAllowedOverride");
        r0.e(this.t, "downsampleOverride");
        r0.d("progressiveRenderingEnabled", this.e);
        r0.d("localThumbnailPreviewsEnabled", this.f);
        r0.d("loadThumbnailOnly", this.g);
        r0.e(this.l, "lowestPermittedRequestLevel");
        r0.a(this.m, "cachesDisabled");
        r0.d("isDiskCacheEnabled", this.n);
        r0.d("isMemoryCacheEnabled", this.o);
        r0.e(this.p, "decodePrefetches");
        r0.a(this.v, "delayMs");
        return r0.toString();
    }
}
