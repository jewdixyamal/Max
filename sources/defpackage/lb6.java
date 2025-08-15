package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lb6  reason: default package */
public final class lb6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mb6 Y;
    public int Z;
    public mb6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb6(mb6 mb6, Continuation continuation) {
        super(continuation);
        this.Y = mb6;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
