package defpackage;

import android.os.CancellationSignal;

/* renamed from: zy1  reason: default package */
public abstract class zy1 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
