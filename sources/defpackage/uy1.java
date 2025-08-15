package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uy1  reason: default package */
public final class uy1 extends AtomicReference implements zl4, ab3 {
    public final /* synthetic */ int a;

    public /* synthetic */ uy1(int i) {
        this.a = i;
    }

    public void b() {
        lazySet(dm4.a);
    }

    public void c(zl4 zl4) {
        dm4.e(this, zl4);
    }

    public final void g() {
        tpc tpc;
        switch (this.a) {
            case 0:
                if (get() != null && (tpc = (tpc) getAndSet((Object) null)) != null) {
                    try {
                        tpc.a.cancel((CancellationException) null);
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        j47.Z(th);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
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
                return get() == null;
            case 1:
                return get() == dm4.a;
            default:
                return dm4.b((zl4) get());
        }
    }

    public void onError(Throwable th) {
        lazySet(dm4.a);
        j47.Z(new OnErrorNotImplementedException(th));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy1(Object obj) {
        super(obj);
        this.a = 0;
    }

    public uy1(uy1 uy1) {
        this.a = 2;
        lazySet(uy1);
    }
}
