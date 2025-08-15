package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kcd  reason: default package */
public final class kcd extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xw Y;
    public int Z;
    public xw o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kcd(xw xwVar, Continuation continuation) {
        super(continuation);
        this.Y = xwVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b((oab) null, this);
    }
}
