package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t32  reason: default package */
public final class t32 extends s32 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t32(int i, int i2, int i3, lx3 lx3, mn5 mn5) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? hz4.a : lx3, mn5);
    }

    public final l32 k(lx3 lx3, int i, int i2) {
        return new s32(i, i2, lx3, this.o);
    }

    public final mn5 l() {
        return this.o;
    }

    public final Object n(on5 on5, Continuation continuation) {
        Object d = this.o.d(on5, continuation);
        return d == tx3.a ? d : e5f.a;
    }
}
