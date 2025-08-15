package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: a1b  reason: default package */
public final class a1b {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public a1b(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [buc, java.lang.Object] */
    @uae
    public final void onEvent(vz2 vz2) {
        gi9 gi9 = new gi9((Object) null);
        for (Number longValue : vz2.b) {
            gi9.a(longValue.longValue());
        }
        j47.T(this.b, (lx3) null, (vx3) null, new z0b(this, new Object(), (Continuation) null), 3);
    }
}
