package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tgf  reason: default package */
public final class tgf extends hu3 {
    public int X;
    public final /* synthetic */ llb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tgf(llb llb, Continuation continuation) {
        super(continuation);
        this.Y = llb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
