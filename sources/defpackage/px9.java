package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: px9  reason: default package */
public final class px9 extends hu3 {
    public final /* synthetic */ qx9 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px9(qx9 qx9, Continuation continuation) {
        super(continuation);
        this.X = qx9;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return qx9.d(this.X, (ArrayList) null, this);
    }
}
