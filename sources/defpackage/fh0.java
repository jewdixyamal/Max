package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fh0  reason: default package */
public final class fh0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jh0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fh0(jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fh0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ds3) this.Y.b.getValue()).d();
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
