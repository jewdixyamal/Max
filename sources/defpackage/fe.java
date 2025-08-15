package defpackage;

import android.os.Process;

/* renamed from: fe  reason: default package */
public final class fe implements vse {
    public static final fe a = new Object();
    public static final yh9 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, fe] */
    static {
        yh9 yh9 = new yh9(10);
        yh9.e(1, 10);
        yh9.e(2, 16);
        yh9.e(3, 13);
        yh9.e(4, 16);
        yh9.e(5, 0);
        yh9.e(6, -2);
        yh9.e(7, -4);
        yh9.e(8, -6);
        yh9.e(9, -5);
        yh9.e(10, -8);
        b = yh9;
    }

    public final void a(int i) {
        yh9 yh9 = b;
        int b2 = yh9.b(i);
        int i2 = b2 >= 0 ? yh9.c[b2] : -1;
        if (i2 != -1) {
            try {
                Process.setThreadPriority(i2);
            } catch (Throwable unused) {
            }
        }
    }
}
