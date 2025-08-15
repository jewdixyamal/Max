package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dge  reason: default package */
public final class dge extends hu3 {
    public int X;
    public final /* synthetic */ ege Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dge(ege ege, Continuation continuation) {
        super(continuation);
        this.Y = ege;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
