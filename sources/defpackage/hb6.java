package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hb6  reason: default package */
public final class hb6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ib6 Y;
    public int Z;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb6(ib6 ib6, Continuation continuation) {
        super(continuation);
        this.Y = ib6;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((String) null, this);
    }
}
