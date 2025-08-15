package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: pw2  reason: default package */
public final class pw2 extends ffe implements a66 {
    public nx2 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ nx2 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.s0 = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pw2(this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        nx2 nx2;
        s35 s35;
        Object obj2 = tx3.a;
        int i = this.Z;
        nx2 nx22 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35 = nx22.P0;
            this.X = nx22;
            this.Y = s35;
            this.Z = 1;
            obj = ((oc6) nx22.F0.getValue()).a(this);
            if (obj == obj2) {
                return obj2;
            }
            nx2 = nx22;
        } else if (i == 1) {
            s35 = this.Y;
            nx2 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        knd knd = new knd((Uri) obj);
        bc7[] bc7Arr = nx2.X0;
        nx2.getClass();
        pnf.o(s35, knd);
        nx3 a = ((w9a) nx22.Y).a();
        ? ffe = new ffe(2, (Continuation) null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(a, ffe, this) == obj2) {
            return obj2;
        }
        return e5f.a;
    }
}
