package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eb6  reason: default package */
public final class eb6 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gb6 Z;
    public gb6 o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb6(gb6 gb6, Continuation continuation) {
        super(continuation);
        this.Z = gb6;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(0, false, this);
    }
}
