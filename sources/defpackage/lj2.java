package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: lj2  reason: default package */
public final class lj2 extends hu3 {
    public sb8 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ck2 Z;
    public ck2 o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lj2(ck2 ck2, Continuation continuation) {
        super(continuation);
        this.Z = ck2;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return ck2.s(this.Z, 0, (List) null, this);
    }
}
