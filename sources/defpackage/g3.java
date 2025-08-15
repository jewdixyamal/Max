package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: g3  reason: default package */
public final class g3 {
    public static final g3 c;
    public static final g3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (m3.o) {
            d = null;
            c = null;
            return;
        }
        d = new g3(false, (CancellationException) null);
        c = new g3(true, (CancellationException) null);
    }

    public g3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
