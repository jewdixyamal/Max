package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kuf  reason: default package */
public final class kuf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;
    public final /* synthetic */ ln0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kuf(ouf ouf, ln0 ln0, Continuation continuation) {
        super(2, continuation);
        this.Y = ouf;
        this.Z = ln0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kuf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        ouf ouf = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf a = ouf.a(ouf);
            this.X = 1;
            obj = a.a(ouf.a, ouf.b, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        puf puf = (puf) obj;
        String str = puf != null ? puf.d : null;
        if (str == null || str.length() == 0) {
            this.Z.b(new Throwable());
            return e5f;
        }
        if (puf != null) {
            puf a2 = puf.a(puf, false, false, 55);
            mtf a3 = ouf.a(ouf);
            this.X = 2;
            a3.getClass();
            if (ote.j(a3.a, new ltf(a3, a2, 1), this) == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
