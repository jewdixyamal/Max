package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gj7  reason: default package */
public final class gj7 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj7(long j, vj7 vj7, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = vj7;
        this.Z = j2;
        this.s0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gj7(this.X, this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = (this.X > 0 ? 1 : (this.X == 0 ? 0 : -1));
        vj7 vj7 = this.Y;
        long j = this.Z;
        if (i > 0) {
            return ((au8) vj7.c.getValue()).q(j);
        }
        if (j > 0) {
            return ((au8) vj7.c.getValue()).j(this.s0, j);
        }
        return null;
    }
}
