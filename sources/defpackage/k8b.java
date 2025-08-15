package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: k8b  reason: default package */
public final class k8b implements py9 {
    public final yw1 a;
    public final ci9 b;
    public p8b c;
    public final pu9 d;
    public b76 e;
    public boolean f = false;

    public k8b(yw1 yw1, ci9 ci9, pu9 pu9) {
        this.a = yw1;
        this.b = ci9;
        this.d = pu9;
        synchronized (this) {
            this.c = (p8b) ci9.d();
        }
    }

    public final void a(Object obj) {
        zw1 zw1 = (zw1) obj;
        zw1 zw12 = zw1.CLOSING;
        p8b p8b = p8b.a;
        if (zw1 == zw12 || zw1 == zw1.CLOSED || zw1 == zw1.RELEASING || zw1 == zw1.RELEASED) {
            b(p8b);
            if (this.f) {
                this.f = false;
                b76 b76 = this.e;
                if (b76 != null) {
                    b76.cancel(false);
                    this.e = null;
                }
            }
        } else if ((zw1 == zw1.OPENING || zw1 == zw1.OPEN || zw1 == zw1.PENDING_OPEN) && !this.f) {
            b(p8b);
            ArrayList arrayList = new ArrayList();
            yw1 yw1 = this.a;
            b76 a2 = b76.a(f8.g(new u00((Object) this, (Object) yw1, (Object) arrayList, 22)));
            yt8 yt8 = new yt8(19, (Object) this);
            ok4 k = ju0.k();
            a2.getClass();
            k12 K = kq0.K(a2, yt8, k);
            iw1 iw1 = new iw1(2, this);
            k12 K2 = kq0.K(K, new re6(15, (Object) iw1), ju0.k());
            this.e = K2;
            kq0.a(K2, new vq7(10, this, arrayList, yw1, false), ju0.k());
            this.f = true;
        }
    }

    public final void b(p8b p8b) {
        synchronized (this) {
            try {
                if (!this.c.equals(p8b)) {
                    this.c = p8b;
                    Objects.toString(p8b);
                    this.b.i(p8b);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void onError(Throwable th) {
        b76 b76 = this.e;
        if (b76 != null) {
            b76.cancel(false);
            this.e = null;
        }
        b(p8b.a);
    }
}
