package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: de0  reason: default package */
public final class de0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(de0.class, "notCompletedCount$volatile");
    public final yf4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public de0(yf4[] yf4Arr) {
        this.a = yf4Arr;
        this.notCompletedCount$volatile = yf4Arr.length;
    }

    public final Object a(Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        yf4[] yf4Arr = this.a;
        int length = yf4Arr.length;
        be0[] be0Arr = new be0[length];
        for (int i = 0; i < length; i++) {
            yf4 yf4 = yf4Arr[i];
            ((z87) yf4).start();
            be0 be0 = new be0(this, sy1);
            be0.c = pag.q(yf4, true, be0);
            be0Arr[i] = be0;
        }
        ce0 ce0 = new ce0(be0Arr);
        for (int i2 = 0; i2 < length; i2++) {
            be0 be02 = be0Arr[i2];
            be02.getClass();
            be0.X.set(be02, ce0);
        }
        if (!(sy1.o.get(sy1) instanceof ir9)) {
            ce0.a();
        } else {
            nu0.w(sy1, ce0);
        }
        return sy1.m();
    }
}
