package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nuf  reason: default package */
public final class nuf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nuf(ouf ouf, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = ouf;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nuf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ouf ouf = this.Y;
            mtf a = ouf.a(ouf);
            this.X = 1;
            a.getClass();
            obj = ote.j(a.a, new my8(a, this.Z, ouf.a, ouf.b), this);
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
