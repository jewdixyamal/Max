package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: xv6  reason: default package */
public final class xv6 {
    public static final HashSet s = new HashSet();
    public Uri a;
    public vv6 b;
    public int c;
    public jic d;
    public anc e;
    public ju6 f;
    public uv6 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public a9b k;
    public q6b l;
    public Boolean m;
    public uhc n;
    public Boolean o;
    public bp4 p;
    public int q;
    public String r;

    public static xv6 b(wv6 wv6) {
        xv6 d2 = d(wv6.b);
        d2.f = wv6.h;
        wv6.getClass();
        d2.getClass();
        uv6 uv6 = wv6.a;
        d2.g = uv6;
        d2.i = wv6.f;
        d2.j = wv6.g;
        d2.b = wv6.l;
        d2.c = wv6.m;
        if (uv6 != uv6.c) {
            d2.r = null;
        }
        d2.l = wv6.q;
        d2.h = wv6.e;
        d2.k = wv6.k;
        d2.d = wv6.i;
        d2.n = wv6.r;
        d2.e = wv6.j;
        d2.m = wv6.p;
        d2.q = wv6.v;
        d2.r = wv6.u;
        d2.p = wv6.t;
        d2.o = wv6.s;
        return d2;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = s;
        if (!(hashSet == null || uri == null)) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xv6, java.lang.Object] */
    public static xv6 d(Uri uri) {
        ? obj = new Object();
        obj.a = null;
        obj.b = vv6.FULL_FETCH;
        obj.c = 0;
        obj.d = null;
        obj.e = null;
        obj.f = ju6.c;
        obj.g = uv6.b;
        obj.h = false;
        obj.i = false;
        obj.j = false;
        obj.k = a9b.c;
        obj.l = null;
        obj.m = null;
        obj.o = null;
        obj.p = null;
        obj.r = null;
        uri.getClass();
        obj.a = uri;
        return obj;
    }

    public final wv6 a() {
        Uri uri = this.a;
        if (uri != null) {
            if ("res".equals(e9f.b(uri))) {
                if (!this.a.isAbsolute()) {
                    throw new ImageRequestBuilder$BuilderException("Resource URI path must be absolute.");
                } else if (!this.a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new ImageRequestBuilder$BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new ImageRequestBuilder$BuilderException("Resource URI must not be empty");
                }
            }
            if (!"asset".equals(e9f.b(this.a)) || this.a.isAbsolute()) {
                return new wv6(this);
            }
            throw new ImageRequestBuilder$BuilderException("Asset URI path must be absolute.");
        }
        throw new ImageRequestBuilder$BuilderException("Source must be set!");
    }
}
