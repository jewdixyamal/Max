package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: s79  reason: default package */
public final class s79 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u79 Y;
    public int Z;
    public u79 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s79(u79 u79, Continuation continuation) {
        super(continuation);
        this.Y = u79;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((List) null, this);
    }
}
