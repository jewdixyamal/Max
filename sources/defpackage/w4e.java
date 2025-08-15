package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w4e  reason: default package */
public final class w4e extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y4e Y;
    public int Z;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w4e(y4e y4e, Continuation continuation) {
        super(continuation);
        this.Y = y4e;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b((String) null, 0, 0, this);
    }
}
