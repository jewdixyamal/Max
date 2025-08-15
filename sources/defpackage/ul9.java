package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.android.di.ConcurrentComponent;

/* renamed from: ul9  reason: default package */
public final class ul9 implements z2a {
    public static final ul9 a = new Object();
    public static final ContextScope b = j1e.a(((w9a) ConcurrentComponent.INSTANCE.getDispatchers()).a().limitedParallelism(1, "mytracker").plus(pag.a()));
    public static final kld c;
    public static final v7c d;

    /* JADX WARNING: type inference failed for: r0v0, types: [ul9, java.lang.Object] */
    static {
        kld b2 = lld.b(1, 0, 2, 2);
        c = b2;
        d = new v7c(b2);
    }
}
