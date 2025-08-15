package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: d91  reason: default package */
public final class d91 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ e91 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d91(e91 e91, Continuation continuation) {
        super(2, continuation);
        this.Y = e91;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d91(this.Y, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e91 e91 = this.Y;
            i95 i95 = ((wr1) e91.X).k().j;
            if ((i95 instanceof c95) || (i95 instanceof b95) || (i95 instanceof d95)) {
                do {
                    q0e = e91.t0;
                    value = q0e.getValue();
                    c91 c91 = (c91) value;
                } while (!q0e.c(value, new b91(false)));
                return e5f.a;
            }
            q0e q0e2 = ((l31) e91.o).k;
            xw xwVar = new xw(3, (Object) e91);
            this.X = 1;
            q0e2.d(xwVar, this);
            return tx3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            od2.a0(obj);
            throw new KotlinNothingValueException();
        }
    }
}
