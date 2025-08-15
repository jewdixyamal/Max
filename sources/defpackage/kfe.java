package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kfe  reason: default package */
public final class kfe extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cge Y;
    public int Z;
    public v6f o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kfe(cge cge, Continuation continuation) {
        super(continuation);
        this.Y = cge;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return cge.b(this.Y, (v6f) null, this);
    }
}
