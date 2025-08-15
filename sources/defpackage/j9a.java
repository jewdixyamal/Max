package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j9a  reason: default package */
public final class j9a extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m9a Y;
    public int Z;
    public zy7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j9a(m9a m9a, Continuation continuation) {
        super(continuation);
        this.Y = m9a;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((az7) null, this);
    }
}
