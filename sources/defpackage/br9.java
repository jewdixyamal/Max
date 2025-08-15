package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: br9  reason: default package */
public final class br9 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cr9 Y;
    public int Z;
    public cr9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br9(cr9 cr9, Continuation continuation) {
        super(continuation);
        this.Y = cr9;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c((gi9) null, this);
    }
}
