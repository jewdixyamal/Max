package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: izd  reason: default package */
public final class izd extends ffe implements a66 {
    public jzd X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ jzd s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public izd(jzd jzd, Continuation continuation) {
        super(2, continuation);
        this.s0 = jzd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((izd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new izd(this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        jzd jzd;
        s35 s35;
        Object obj2 = tx3.a;
        int i = this.Z;
        jzd jzd2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35 = jzd2.z0;
            this.X = jzd2;
            this.Y = s35;
            this.Z = 1;
            obj = ((oc6) jzd2.Z.getValue()).a(this);
            if (obj == obj2) {
                return obj2;
            }
            jzd = jzd2;
        } else if (i == 1) {
            s35 = this.Y;
            jzd = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ryd ryd = new ryd((Uri) obj);
        bc7[] bc7Arr = jzd.A0;
        jzd.getClass();
        pnf.o(s35, ryd);
        nx3 a = ((w9a) ((kke) jzd2.o.getValue())).a();
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
