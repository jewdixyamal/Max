package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: xcd  reason: default package */
public final class xcd extends ffe implements a66 {
    public add X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ add s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xcd(add add, Continuation continuation) {
        super(2, continuation);
        this.s0 = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xcd(this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        add add;
        s35 s35;
        Object obj2 = tx3.a;
        int i = this.Z;
        add add2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            q0e q0e = add2.D0;
            this.X = add2;
            s35 = add2.A0;
            this.Y = s35;
            this.Z = 1;
            obj = add2.o.a(this);
            if (obj == obj2) {
                return obj2;
            }
            add = add2;
        } else if (i == 1) {
            s35 = this.Y;
            add = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        agd agd = new agd((Uri) obj);
        bc7[] bc7Arr = add.K0;
        add.getClass();
        pnf.o(s35, agd);
        nx3 a = ((w9a) add2.r()).a();
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
