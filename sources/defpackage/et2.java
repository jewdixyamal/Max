package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: et2  reason: default package */
public final class et2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ft2 Y;
    public int Z;
    public ft2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et2(ft2 ft2, Continuation continuation) {
        super(continuation);
        this.Y = ft2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((Set) null, this);
    }
}
