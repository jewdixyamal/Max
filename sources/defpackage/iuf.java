package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iuf  reason: default package */
public final class iuf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iuf(ouf ouf, Continuation continuation) {
        super(2, continuation);
        this.Y = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iuf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ouf ouf = this.Y;
            mtf a = ouf.a(ouf);
            long j = ouf.a;
            long j2 = ouf.b;
            this.X = 1;
            obj = a.a(j, j2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
