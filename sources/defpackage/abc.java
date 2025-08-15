package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: abc  reason: default package */
public final class abc extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cbc Y;
    public int Z;
    public cbc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abc(cbc cbc, Continuation continuation) {
        super(continuation);
        this.Y = cbc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return cbc.s(this.Y, 0, this);
    }
}
