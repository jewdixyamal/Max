package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ycd  reason: default package */
public final class ycd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ycd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ycd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ycd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        add add = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((jz2) ((iy2) add.w0.getValue())).g(this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s35 s35 = add.z0;
        cgd.c.getClass();
        pnf.o(s35, new c64(":saved-messages"));
        return e5f.a;
    }
}
