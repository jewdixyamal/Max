package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ag2  reason: default package */
public final class ag2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eg2 Y;
    public int Z;
    public ArrayList o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag2(eg2 eg2, Continuation continuation) {
        super(continuation);
        this.Y = eg2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(0, 0, 0, this);
    }
}
