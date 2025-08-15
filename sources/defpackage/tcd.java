package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tcd  reason: default package */
public final class tcd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tcd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tcd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        add add = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mb6 mb6 = add.c;
            this.X = 1;
            obj = mb6.d(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        add.B0.setValue((did) obj);
        return e5f.a;
    }
}
