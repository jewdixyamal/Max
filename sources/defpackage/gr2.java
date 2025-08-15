package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: gr2  reason: default package */
public final class gr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jr2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr2(jr2 jr2, Continuation continuation) {
        super(2, continuation);
        this.Y = jr2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gr2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gr2 gr2 = new gr2(this.Y, continuation);
        gr2.X = obj;
        return gr2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        boolean booleanValue = ((Boolean) this.Y.d.invoke()).booleanValue();
        e5f e5f = e5f.a;
        if (!booleanValue) {
            return e5f;
        }
        this.Y.j = false;
        x77 x77 = this.Y.f;
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        jr2 jr2 = this.Y;
        jr2.f = j47.T(sx3, jr2.l, (vx3) null, new cr2(jr2, (Continuation) null), 2);
        jr2 jr22 = this.Y;
        ac acVar = new ac(new t03(((jz2) jr22.c).m(jr22.a), 11), 14, this.Y);
        int i = ft4.o;
        od2.L(new ac(new zn5(od2.u(acVar, j47.p0(z7.R(10, kt4.SECONDS))), new dr2(this.Y, (Continuation) null), 5), 18, new er2(3, (Continuation) null, 0)), sx3);
        return e5f;
    }
}
