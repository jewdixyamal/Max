package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: lo3  reason: default package */
public final class lo3 extends ffe implements a66 {
    public oo3 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ oo3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lo3(oo3 oo3, Continuation continuation) {
        super(2, continuation);
        this.s0 = oo3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lo3(this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        oo3 oo3;
        s35 s35;
        Object obj2 = tx3.a;
        int i = this.Z;
        oo3 oo32 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35 = oo32.D0;
            this.X = oo32;
            this.Y = s35;
            this.Z = 1;
            obj = ((oc6) oo32.w0.getValue()).a(this);
            if (obj == obj2) {
                return obj2;
            }
            oo3 = oo32;
        } else if (i == 1) {
            s35 = this.Y;
            oo3 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jnd jnd = new jnd((Uri) obj);
        bc7[] bc7Arr = oo3.G0;
        oo3.getClass();
        pnf.o(s35, jnd);
        nx3 a = ((w9a) oo32.c).a();
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
