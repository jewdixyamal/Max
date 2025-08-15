package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: fj2  reason: default package */
public final class fj2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ck2 Y;
    public int Z;
    public ck2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj2(ck2 ck2, Continuation continuation) {
        super(continuation);
        this.Y = ck2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ck2.q(this.Y, (List) null, this);
    }
}
