package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ytf  reason: default package */
public final class ytf extends ffe implements a66 {
    public puf X;
    public int Y;
    public final /* synthetic */ ouf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ytf(ouf ouf, Continuation continuation) {
        super(2, continuation);
        this.Z = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ytf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ytf(this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.Y;
        ouf ouf = this.Z;
        if (i == 0) {
            od2.a0(obj);
            mtf a = ouf.a(ouf);
            this.Y = 1;
            obj = a.a(ouf.a, ouf.b, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            puf puf = this.X;
            od2.a0(obj);
            return puf;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        puf puf2 = (puf) obj;
        puf a2 = puf2 != null ? puf.a(puf2, true, true, 15) : new puf(ouf.a, ouf.b, true);
        mtf a3 = ouf.a(ouf);
        this.X = a2;
        this.Y = 2;
        a3.getClass();
        return ote.j(a3.a, new ltf(a3, a2, 0), this) == tx3 ? tx3 : a2;
    }
}
