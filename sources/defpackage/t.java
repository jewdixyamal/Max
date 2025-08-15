package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t  reason: default package */
public final class t extends ffe implements a66 {
    public int X;
    public final /* synthetic */ v Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            v vVar = this.Y;
            q0e q0e = vVar.o;
            int i2 = f4a.b;
            eqe eqe = new eqe(g4a.b);
            ((x6a) vVar.b.getValue()).getClass();
            List singletonList = Collections.singletonList(new opd(i2, eqe, new iqe("25.8.1")));
            this.X = 1;
            q0e.setValue(singletonList);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
