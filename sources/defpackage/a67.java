package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: a67  reason: default package */
public final class a67 extends ffe implements a66 {
    public c67 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ c67 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a67(c67 c67, Continuation continuation) {
        super(2, continuation);
        this.s0 = c67;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a67(this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a66, ffe] */
    public final Object o(Object obj) {
        c67 c67;
        s35 s35;
        Object obj2 = tx3.a;
        int i = this.Z;
        c67 c672 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35 = c672.t0;
            this.X = c672;
            this.Y = s35;
            this.Z = 1;
            obj = ((oc6) c672.o.getValue()).a(this);
            if (obj == obj2) {
                return obj2;
            }
            c67 = c672;
        } else if (i == 1) {
            s35 = this.Y;
            c67 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l57 l57 = new l57((Uri) obj);
        yxc yxc = c67.E0;
        c67.getClass();
        pnf.o(s35, l57);
        nx3 a = ((w9a) ((kke) c672.Z.getValue())).a();
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
