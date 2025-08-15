package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: upc  reason: default package */
public final class upc extends d0 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upc(lx3 lx3, AtomicReference atomicReference, int i) {
        super(lx3, false, true);
        this.a = i;
        this.b = atomicReference;
    }

    public final void onCancelled(Throwable th, boolean z) {
        switch (this.a) {
            case 0:
                try {
                    if (((ra3) ((va3) this.b)).a(th)) {
                        return;
                    }
                } catch (Throwable th2) {
                    j47.e(th, th2);
                }
                f46.S(getContext(), th);
                return;
            default:
                try {
                    if (((nqd) ((sqd) this.b)).d(th)) {
                        return;
                    }
                } catch (Throwable th3) {
                    j47.e(th, th3);
                }
                f46.S(getContext(), th);
                return;
        }
    }

    public final void onCompleted(Object obj) {
        switch (this.a) {
            case 0:
                e5f e5f = (e5f) obj;
                try {
                    ((ra3) ((va3) this.b)).b();
                    return;
                } catch (Throwable th) {
                    f46.S(getContext(), th);
                    return;
                }
            default:
                try {
                    ((nqd) ((sqd) this.b)).a(obj);
                    return;
                } catch (Throwable th2) {
                    f46.S(getContext(), th2);
                    return;
                }
        }
    }
}
