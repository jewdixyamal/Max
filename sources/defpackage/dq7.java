package defpackage;

import android.net.Uri;

/* renamed from: dq7  reason: default package */
public class dq7 implements m4d, l4d {
    public final up7 X;
    public final qq7 a;
    public final p4d b;
    public final hle c;
    public final hc3 o = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [hc3, java.lang.Object] */
    public dq7(qq7 qq7, p4d p4d, hle hle, up7 up7) {
        this.a = qq7;
        this.b = p4d;
        this.c = hle;
        this.X = up7;
    }

    public void a() {
        this.o.d();
    }

    public final void b() {
        p4d p4d = this.b;
        up7 up7 = this.X;
        awa e = p4d.e(up7);
        this.a.N(up7, awa.a(e, up7), 0, e != null ? e.X : null);
    }

    public void c() {
        up7 up7 = this.X;
        hm9.m("dq7", "loadThumbnail with localMediaId = %d", Long.valueOf(up7.b));
        Uri N = j47.N(up7.c);
        long j = up7.b;
        if (N != null) {
            hm9.m("dq7", "loadThumbnail: %d, cachedUri is not empty", Long.valueOf(j));
            d(0, N.toString());
            return;
        }
        this.a.N(up7, (Uri) null, 0, (Uri) null);
        r4d h = this.b.h(up7);
        String str = h != null ? oag.t(h.d) ? h.a.o : h.d : up7.o;
        q1a q1a = new q1a(2, new l5(8, str));
        hle hle = this.c;
        hle.getClass();
        jle jle = (jle) hle;
        rqd rqd = new rqd(q1a.m(jle.a()).i(jle.b()), new lt1(j, (Object) str, 4), 2);
        iq1 iq1 = new iq1(new d74(this, 21, str), 2, new z16(13, this));
        rqd.k(iq1);
        this.o.a(iq1);
    }

    public final void d(int i, String str) {
        Uri N = j47.N(str);
        p4d p4d = this.b;
        up7 up7 = this.X;
        awa e = p4d.e(up7);
        if (awa.b(e, up7)) {
            Uri a2 = awa.a(e, up7);
            if (!a2.getPath().equals(up7.c)) {
                N = a2;
            }
            i = 0;
        }
        this.a.N(up7, N, i, e != null ? e.X : null);
    }

    public final void j(r4d r4d) {
        up7 up7 = this.X;
        if (up7 != null) {
            String str = up7.c;
            up7 up72 = r4d.a;
            if (str.equals(up72.c)) {
                d(up72.X, oag.t(r4d.d) ? up72.o : r4d.d);
            }
        }
    }

    public final void s1(r4d r4d) {
        b();
    }
}
