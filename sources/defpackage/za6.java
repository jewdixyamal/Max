package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: za6  reason: default package */
public final class za6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ab6 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ boolean u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public za6(ab6 ab6, long j, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = ab6;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((za6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        za6 za6 = new za6(this.Z, this.s0, this.t0, this.u0, continuation);
        za6.Y = obj;
        return za6;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ac h = nu0.h(od2.D(((ds3) this.Z.a.getValue()).c(this.s0), new xa6((sx3) this.Y, this.s0, this.Z, this.t0, this.u0, (Continuation) null)), ft4.e(this.t0), new ffe(2, (Continuation) null));
            this.X = 1;
            obj = od2.A(h, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj3 = ((pjc) obj).a;
        if (obj3 instanceof njc) {
            return null;
        }
        return obj3;
    }
}
