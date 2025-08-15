package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: e37  reason: default package */
public abstract class e37 {
    public static final /* synthetic */ int a = 0;

    static {
        new yh9(0);
    }

    public static final yh9 a(int i, int i2, int i3) {
        yh9 yh9 = new yh9();
        yh9.e(8192, i);
        yh9.e(4, i2);
        yh9.e(16384, i3);
        return yh9;
    }

    public static final yh9 b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        yh9 yh9 = new yh9();
        yh9.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, i);
        yh9.e(2048, i2);
        yh9.e(i3, i4);
        yh9.e(i5, i6);
        yh9.e(128, i7);
        return yh9;
    }
}
