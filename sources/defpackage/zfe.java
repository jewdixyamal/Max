package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zfe  reason: default package */
public final class zfe extends hu3 {
    public int X;
    public final /* synthetic */ xfe Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zfe(xfe xfe, Continuation continuation) {
        super(continuation);
        this.Y = xfe;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
