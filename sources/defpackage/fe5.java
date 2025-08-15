package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: fe5  reason: default package */
public final class fe5 extends hu3 {
    public final /* synthetic */ he5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fe5(he5 he5, Continuation continuation) {
        super(continuation);
        this.X = he5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.u((Set) null, this);
    }
}
