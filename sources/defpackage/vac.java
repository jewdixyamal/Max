package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vac  reason: default package */
public final class vac extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cbc Y;
    public int Z;
    public cbc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vac(cbc cbc, Continuation continuation) {
        super(continuation);
        this.Y = cbc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return cbc.q(this.Y, this);
    }
}
