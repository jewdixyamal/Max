package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nh2  reason: default package */
public final class nh2 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ gi2 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh2(Object obj, Continuation continuation, xm8 xm8, long j, long j2, gi2 gi2) {
        super(2, continuation);
        this.X = obj;
        this.Y = xm8;
        this.Z = j;
        this.s0 = j2;
        this.t0 = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nh2(this.X, continuation, this.Y, this.Z, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l20 l20 = (l20) this.X;
        g20 g20 = l20.a;
        int i = g20 == null ? -1 : mh2.$EnumSwitchMapping$0[g20.ordinal()];
        xm8 xm8 = this.Y;
        if (i == 1) {
            x10 x10 = l20.b;
            if (x10 != null) {
                if (x10.s0 == xm8.i()) {
                    return null;
                }
            }
            return crd.f(l20, this.Z, this.s0, false, 24);
        } else if (i == 2) {
            k20 k20 = l20.d;
            if (k20 != null) {
                if (k20.a == xm8.i()) {
                    return null;
                }
            }
            return crd.f(l20, this.Z, this.s0, this.t0.z0.v(), 8);
        } else if (i == 3) {
            c20 c20 = l20.g;
            if (c20 != null) {
                if (c20.a == xm8.i()) {
                    return null;
                }
            }
            return crd.f(l20, this.Z, this.s0, false, 24);
        } else if (i != 4) {
            return crd.f(l20, this.Z, this.s0, false, 24);
        } else {
            s10 s10 = l20.j;
            if (s10 != null) {
                if (s10.a == xm8.i()) {
                    return null;
                }
            }
            return crd.f(l20, this.Z, this.s0, false, 24);
        }
    }
}
