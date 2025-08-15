package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x32  reason: default package */
public final class x32 extends s32 {
    public final c66 X;

    public x32(c66 c66, mn5 mn5, lx3 lx3, int i, int i2) {
        super(i, i2, lx3, mn5);
        this.X = c66;
    }

    public final l32 k(lx3 lx3, int i, int i2) {
        return new x32(this.X, this.o, lx3, i, i2);
    }

    public final Object n(on5 on5, Continuation continuation) {
        Object k = j1e.k(new w32(this, on5, (Continuation) null), continuation);
        return k == tx3.a ? k : e5f.a;
    }
}
