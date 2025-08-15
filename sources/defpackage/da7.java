package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: da7  reason: default package */
public final class da7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c8d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public da7(c8d c8d, Continuation continuation) {
        super(2, continuation);
        this.Y = c8d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((da7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new da7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Iterator it = ((List) this.Y.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ia7) obj2).c().contains("WebAppBackButtonPressed")) {
                    break;
                }
            }
            ia7 ia7 = (ia7) obj2;
            if (ia7 != null) {
                this.X = 1;
                if (ia7.a("WebAppBackButtonPressed", "{}", this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
