package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uve  reason: default package */
public final class uve extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wve Y;
    public int Z;
    public wve o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uve(wve wve, Continuation continuation) {
        super(continuation);
        this.Y = wve;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
