package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r7e  reason: default package */
public final class r7e extends hu3 {
    public int X;
    public final /* synthetic */ llb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r7e(llb llb, Continuation continuation) {
        super(continuation);
        this.Y = llb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
