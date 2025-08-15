package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mrc  reason: default package */
public final class mrc extends hu3 {
    public final /* synthetic */ qrc X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mrc(qrc qrc, Continuation continuation) {
        super(continuation);
        this.X = qrc;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b((String) null, false, this);
    }
}
