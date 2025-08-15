package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nqd  reason: default package */
public final class nqd extends AtomicReference implements sqd, zl4, ab3 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public nqd(erd erd) {
        this.b = erd;
    }

    public void a(Object obj) {
        zl4 zl4;
        Object obj2 = get();
        dm4 dm4 = dm4.a;
        if (obj2 != dm4 && (zl4 = (zl4) getAndSet(dm4)) != dm4) {
            erd erd = (erd) this.b;
            if (obj == null) {
                try {
                    erd.onError(q45.b("onSuccess called with a null value."));
                } finally {
                    if (zl4 != null) {
                        zl4.g();
                    }
                }
            } else {
                erd.a(obj);
            }
        }
    }

    public void b() {
        zz9 zz9 = (zz9) this.b;
        zz9.X.c(this);
        zz9.b();
    }

    public void c(zl4 zl4) {
        dm4.e(this, zl4);
    }

    public boolean d(Throwable th) {
        zl4 zl4;
        if (th == null) {
            th = q45.b("onError called with a null Throwable.");
        }
        Object obj = get();
        dm4 dm4 = dm4.a;
        if (obj == dm4 || (zl4 = (zl4) getAndSet(dm4)) == dm4) {
            return false;
        }
        try {
            ((erd) this.b).onError(th);
        } finally {
            if (zl4 != null) {
                zl4.g();
            }
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            default:
                dm4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return dm4.b((zl4) get());
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!d(th)) {
                    j47.Z(th);
                    return;
                }
                return;
            default:
                zz9 zz9 = (zz9) this.b;
                zz9.X.c(this);
                zz9.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = nqd.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public nqd(zz9 zz9) {
        this.b = zz9;
    }
}
