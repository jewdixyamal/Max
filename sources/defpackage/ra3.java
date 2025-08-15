package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ra3  reason: default package */
public final class ra3 extends AtomicReference implements va3, zl4, f2a, ab3 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ra3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(Throwable th) {
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
            ((ab3) this.b).onError(th);
        } finally {
            if (zl4 != null) {
                zl4.g();
            }
        }
    }

    public final void b() {
        zl4 zl4;
        switch (this.a) {
            case 0:
                Object obj = get();
                dm4 dm4 = dm4.a;
                if (obj != dm4 && (zl4 = (zl4) getAndSet(dm4)) != dm4) {
                    try {
                        ((ab3) this.b).b();
                        if (zl4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (zl4 != null) {
                            zl4.g();
                        }
                    }
                } else {
                    return;
                }
            case 1:
                ((Queue) this.b).offer(hv9.a);
                return;
            default:
                b0a b0a = (b0a) this.b;
                b0a.X.c(this);
                b0a.b();
                return;
        }
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 1:
                dm4.e(this, zl4);
                return;
            default:
                dm4.e(this, zl4);
                return;
        }
    }

    public void e(Object obj) {
        ((Queue) this.b).offer(obj);
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            case 1:
                if (dm4.a(this)) {
                    ((Queue) this.b).offer(c);
                    return;
                }
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
            case 1:
                return get() == dm4.a;
            default:
                return dm4.b((zl4) get());
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                ((Queue) this.b).offer(new fv9(th));
                return;
            default:
                b0a b0a = (b0a) this.b;
                b0a.X.c(this);
                b0a.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = ra3.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public ra3(b0a b0a) {
        this.a = 2;
        this.b = b0a;
    }
}
