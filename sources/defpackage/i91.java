package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: i91  reason: default package */
public final class i91 extends ffe implements a66 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((i91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.x(300, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xx6 i2 = y8a.a.i();
        if (i2 != null) {
            i2.f(Collections.singleton(new wx6(ux6.PARTICIPATED_IN_CALL, 1)), wuc.CALL);
        }
        return e5f.a;
    }
}
