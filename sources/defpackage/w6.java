package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w6  reason: default package */
public final class w6 extends AtomicReference implements zl4 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((f6) obj).run();
                    return;
                } catch (Throwable th) {
                    throw q45.f(th);
                }
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    public final void g() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            a(andSet);
        }
    }

    public final boolean h() {
        return get() == null;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ActionDisposable(disposed=" + h() + ", " + get() + ")";
            default:
                return "RunnableDisposable(disposed=" + h() + ", " + get() + ")";
        }
    }
}
