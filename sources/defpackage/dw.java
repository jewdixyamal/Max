package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dw  reason: default package */
public final class dw extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bx Y;
    public int Z;
    public bx o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw(bx bxVar, Continuation continuation) {
        super(continuation);
        this.Y = bxVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return bx.c(this.Y, (pfc) null, 0, this);
    }
}
