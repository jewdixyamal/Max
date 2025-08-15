package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: x7e  reason: default package */
public final class x7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ b8e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x7e(b8e b8e, Continuation continuation) {
        super(2, continuation);
        this.Y = b8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x7e(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            x9c x9c = (x9c) this.Y.o.getValue();
            za3 k = new c0a(x9c.b().a(Collections.singletonList(t9c.STICKER)), new gd1(19, x9c)).k((ztc) x9c.c.getValue());
            this.X = 1;
            if (s36.e(k, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
