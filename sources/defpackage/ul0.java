package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ul0  reason: default package */
public final class ul0 extends hu3 {
    public final /* synthetic */ yl0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ul0(yl0 yl0, Continuation continuation) {
        super(continuation);
        this.X = yl0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.g((ArrayList) null, this);
    }
}
