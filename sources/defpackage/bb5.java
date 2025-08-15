package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: bb5  reason: default package */
public final class bb5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cb5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bb5(cb5 cb5, Continuation continuation) {
        super(2, continuation);
        this.Y = cb5;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((bb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bb5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = cb5.i;
            cb5 cb5 = this.Y;
            w7c w7c = cb5.b().X;
            xw xwVar = new xw(6, (Object) cb5);
            this.X = 1;
            if (w7c.a.d(xwVar, this) == tx3) {
                return tx3;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            od2.a0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
