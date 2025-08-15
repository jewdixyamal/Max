package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qkc  reason: default package */
public final class qkc extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ alc Y;
    public int Z;
    public alc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qkc(alc alc, Continuation continuation) {
        super(continuation);
        this.Y = alc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return alc.c(this.Y, this);
    }
}
