package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: nx3  reason: default package */
public abstract class nx3 extends e0 implements iu3 {
    public static final mx3 Key = new mx3(vu4.b, new pz2(12));

    public nx3() {
        super(vu4.b);
    }

    public static /* synthetic */ nx3 limitedParallelism$default(nx3 nx3, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return nx3.limitedParallelism(i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    public abstract void dispatch(lx3 lx3, Runnable runnable);

    public void dispatchYield(lx3 lx3, Runnable runnable) {
        dispatch(lx3, runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends defpackage.jx3> E get(defpackage.kx3 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.mx3
            r1 = 0
            if (r0 == 0) goto L_0x0027
            mx3 r4 = (defpackage.mx3) r4
            kx3 r0 = r3.getKey()
            if (r0 == r4) goto L_0x0014
            kx3 r2 = r4.b
            if (r2 != r0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r0 = 0
            goto L_0x0018
        L_0x0014:
            r4.getClass()
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x002e
            m56 r4 = r4.a
            java.lang.Object r3 = r4.invoke(r3)
            jx3 r3 = (defpackage.jx3) r3
            boolean r4 = r3 instanceof defpackage.jx3
            if (r4 == 0) goto L_0x002e
            goto L_0x002d
        L_0x0027:
            vu4 r0 = defpackage.vu4.b
            if (r0 != r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            r1 = r3
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx3.get(kx3):jx3");
    }

    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(lx3 lx3) {
        return true;
    }

    public nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    public lx3 minusKey(kx3 kx3) {
        boolean z;
        boolean z2 = kx3 instanceof mx3;
        hz4 hz4 = hz4.a;
        if (z2) {
            mx3 mx3 = (mx3) kx3;
            kx3 key = getKey();
            if (key == mx3) {
                mx3.getClass();
            } else if (mx3.b != key) {
                z = false;
                if (!z || ((jx3) mx3.a.invoke(this)) == null) {
                    return this;
                }
            }
            z = true;
            return this;
        } else if (vu4.b != kx3) {
            return this;
        }
        return hz4;
    }

    public final nx3 plus(nx3 nx3) {
        return nx3;
    }

    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c54.u(this);
    }

    public /* synthetic */ nx3 limitedParallelism(int i) {
        return limitedParallelism(i, (String) null);
    }
}
