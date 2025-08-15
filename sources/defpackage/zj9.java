package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: zj9  reason: default package */
public final class zj9 extends u2 implements n4d, m4d {
    public final boolean A0;
    public final boolean B0;
    public iq1 C0;
    public up7 X;
    public final xdf Y;
    public List Z;
    public final tj9 c;
    public pq7 o;
    public long s0;
    public ref t0;
    public awa u0;
    public final ad v0;
    public final p4d w0;
    public final zi5 x0;
    public final bn0 y0;
    public final o45 z0;

    /* JADX WARNING: type inference failed for: r3v1, types: [oq7, java.lang.Object] */
    public zj9(dl9 dl9, tj9 tj9, boolean z, boolean z2, ad adVar, p4d p4d, kk5 kk5, bn0 bn0, o45 o45, xdf xdf) {
        super(0, (Object) dl9);
        this.c = tj9;
        this.A0 = z;
        this.B0 = z2;
        this.w0 = p4d;
        this.v0 = adVar;
        this.x0 = kk5;
        this.y0 = bn0;
        this.z0 = o45;
        this.Y = xdf;
        dl9.r(this);
        ? obj = new Object();
        obj.b = false;
        obj.d = z;
        obj.e = false;
        obj.g = false;
        obj.h = false;
        obj.i = mqb.P_2160;
        obj.k = 0;
        obj.n = false;
        if (p4d.l == 2) {
            obj.b = false;
        }
        pq7 pq7 = new pq7(obj);
        this.o = pq7;
        dl9.A(pq7);
    }

    public final void B1(Set set) {
        d2(new uj9(this, 3));
    }

    public final void Z1(up7 up7) {
        hm9.m("zj9", "setLocalMedia: %s", up7.c);
        this.X = up7;
        this.u0 = this.w0.e(up7);
        cqc.b(this.C0);
        cqc.b((zl4) null);
        if (up7.b()) {
            d2(new uj9(this, 1));
            hm9.m("zj9", "setupVideoLocalMedia", new Object[0]);
            cqc.b(this.C0);
            if ((!(up7 instanceof j00) || !oag.t(((j00) up7).u0.s)) && this.B0) {
                d2(new mu1(14));
                hm9.m("zj9", "initVideoLocalMedias", new Object[0]);
                rqd rqd = new rqd(new q1a(1, new vj9(this, 1)).m(muc.a()).i(ce.a()), new vj9(this, 2), 2);
                e5 e5Var = new e5(14, this);
                iq1 iq1 = new iq1(ft.e, 2, ft.f);
                Objects.requireNonNull(iq1, "observer is null");
                try {
                    rqd.k(new cb3(iq1, 7, e5Var));
                    this.C0 = iq1;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    c37.B(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                hm9.m("zj9", "localMedia instanceof EditAttachLocalMedia -> can't edit video -> hide controls", new Object[0]);
                d2(new mu1(13));
            }
        } else if (up7.a != 1 || up7.d()) {
            d2(new mu1(12));
        } else {
            d2(new uj9(this, 2));
            d2(new uj9(this, 4));
            d2(new uj9(this, 0));
        }
        d2(new uj9(this, 3));
    }

    public final void a2() {
        Set<q96> set;
        up7 up7 = this.X;
        if (up7 != null) {
            boolean b = up7.b();
            p4d p4d = this.w0;
            if (!b) {
                up7 up72 = this.X;
                if (up72.a != 1) {
                    p4d.r(up72);
                } else if (p4d.j(up72)) {
                    r4d h = p4d.h(this.X);
                    if (h != null) {
                        h.f = false;
                    }
                    p4d.n();
                    if (h != null && (set = p4d.e) != null) {
                        for (q96 a : set) {
                            try {
                                a.a(h);
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                    }
                } else {
                    p4d.r(this.X);
                }
            } else if (p4d.j(this.X)) {
                p4d.r(this.X);
            } else {
                c2();
            }
        }
    }

    public final void b2() {
        up7 up7 = this.X;
        awa awa = this.u0;
        p4d p4d = this.w0;
        p4d.a(up7, p4d.a.size());
        r4d h = p4d.h(up7);
        if (h != null) {
            h.c = awa;
        }
        p4d.b.put(Long.valueOf(up7.b), awa);
        p4d.m(h);
    }

    public final void c2() {
        Object obj;
        boolean z;
        ref ref = this.t0;
        p4d p4d = this.w0;
        if (ref == null) {
            p4d.q(this.X, (ref) null);
            return;
        }
        List list = this.Z;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((nqb) obj).a == this.t0.a) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            nqb nqb = (nqb) obj;
            if (nqb == null || nqb.f) {
                ref ref2 = this.t0;
                if (ref2.b == 0.0f && ref2.c == 1.0f && !ref2.d) {
                    p4d.q(this.X, (ref) null);
                }
            }
            p4d.q(this.X, this.t0);
            return;
        }
        obj = null;
        nqb nqb2 = (nqb) obj;
        ref ref22 = this.t0;
        p4d.q(this.X, (ref) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [oq7, java.lang.Object] */
    public final void d2(l66 l66) {
        pq7 pq7 = this.o;
        ? obj = new Object();
        obj.a = pq7.a;
        obj.b = pq7.b;
        obj.c = pq7.c;
        obj.d = pq7.o;
        obj.e = pq7.X;
        obj.f = pq7.Y;
        obj.g = pq7.Z;
        obj.h = pq7.s0;
        obj.i = pq7.t0;
        obj.j = pq7.u0;
        obj.k = pq7.v0;
        obj.l = pq7.w0;
        obj.m = pq7.x0;
        obj.n = pq7.y0;
        obj.o = pq7.z0;
        oq7 oq7 = (oq7) l66.apply(obj);
        oq7.getClass();
        pq7 pq72 = new pq7(oq7);
        if (!pq72.equals(this.o)) {
            hm9.m("zj9", "updateViewState: %s", this.o);
            this.o = pq72;
            ((dl9) ((kk9) this.b)).A(pq72);
        }
    }

    public final void s1(r4d r4d) {
        d2(new uj9(this, 0));
        d2(new uj9(this, 4));
    }
}
