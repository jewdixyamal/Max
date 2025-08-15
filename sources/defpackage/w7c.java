package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: w7c  reason: default package */
public final class w7c implements j0e, vy1, y66 {
    public final /* synthetic */ j0e a;

    public w7c(j0e j0e) {
        this.a = j0e;
    }

    public final List b() {
        return this.a.b();
    }

    public final Object d(on5 on5, Continuation continuation) {
        return this.a.d(on5, continuation);
    }

    public final mn5 e(lx3 lx3, int i, int i2) {
        Symbol symbol = r0e.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? lld.e(this, lx3, i, i2) : this;
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}
