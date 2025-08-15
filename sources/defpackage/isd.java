package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: isd  reason: default package */
public final class isd extends AtomicReference implements erd {
    public final hsd a;
    public final int b;

    public isd(hsd hsd, int i) {
        this.a = hsd;
        this.b = i;
    }

    public final void a(Object obj) {
        hsd hsd = this.a;
        erd erd = hsd.a;
        Object[] objArr = hsd.o;
        if (objArr != null) {
            objArr[this.b] = obj;
        }
        if (hsd.decrementAndGet() == 0) {
            try {
                Object apply = hsd.b.apply(objArr);
                Objects.requireNonNull(apply, "The zipper returned a null value");
                hsd.o = null;
                erd.a(apply);
            } catch (Throwable th) {
                c37.B(th);
                hsd.o = null;
                erd.onError(th);
            }
        }
    }

    public final void c(zl4 zl4) {
        dm4.e(this, zl4);
    }

    public final void onError(Throwable th) {
        this.a.a(th, this.b);
    }
}
