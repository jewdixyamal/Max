package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: pe2  reason: default package */
public final class pe2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe2(ye2 ye2, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pe2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pe2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ye2 ye2 = this.Y;
            ne2 ne2 = (ne2) ye2.z0.getAndUpdate(new oe2(0));
            if (ne2 == null) {
                return e5f;
            }
            en4 en4 = ne2.d;
            en4.getClass();
            if ((en4 == en4.b || en4 == en4.c) && !ne2.e) {
                File s = ((kk5) ((zi5) ye2.s0.getValue())).s(ne2.b);
                this.X = 1;
                if (((dfe) ye2.Y.getValue()).a.c(s, ne2.c, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
