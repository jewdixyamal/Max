package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dib  reason: default package */
public final class dib extends hu3 {
    public int X;
    public final /* synthetic */ eib Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dib(eib eib, Continuation continuation) {
        super(continuation);
        this.Y = eib;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
