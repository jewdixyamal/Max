package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: be0  reason: default package */
public final class be0 extends k87 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(be0.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final ry1 b;
    public cm4 c;
    public final /* synthetic */ de0 o;

    public be0(de0 de0, sy1 sy1) {
        this.o = de0;
        this.b = sy1;
    }

    public final boolean c() {
        return false;
    }

    public final void d(Throwable th) {
        ry1 ry1 = this.b;
        if (th != null) {
            Symbol j = ry1.j(th);
            if (j != null) {
                ry1.q(j);
                ce0 ce0 = (ce0) X.get(this);
                if (ce0 != null) {
                    ce0.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = de0.b;
        de0 de0 = this.o;
        if (atomicIntegerFieldUpdater.decrementAndGet(de0) == 0) {
            yf4[] yf4Arr = de0.a;
            ArrayList arrayList = new ArrayList(yf4Arr.length);
            for (yf4 m : yf4Arr) {
                arrayList.add(m.m());
            }
            ry1.resumeWith(arrayList);
        }
    }
}
