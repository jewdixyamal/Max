package defpackage;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* renamed from: eve  reason: default package */
public final class eve extends hu3 {
    public ByteBuffer X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ tve Z;
    public tve o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eve(tve tve, Continuation continuation) {
        super(continuation);
        this.Z = tve;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b((ByteBuffer) null, this);
    }
}
