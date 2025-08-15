package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d59  reason: default package */
public final class d59 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ cdf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d59(n59 n59, cdf cdf, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = cdf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d59(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cdf cdf = this.Z;
            long j = cdf.a;
            String str = cdf.b;
            long j2 = cdf.d;
            long j3 = cdf.e;
            boolean z = cdf.f;
            this.X = 1;
            if (((wrc) this.Y.a1.getValue()).a(j, str, j2, j3, z, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
