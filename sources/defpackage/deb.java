package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: deb  reason: default package */
public final class deb extends hu3 {
    public int X;
    public final /* synthetic */ beb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public deb(beb beb, Continuation continuation) {
        super(continuation);
        this.Y = beb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
