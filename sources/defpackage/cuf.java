package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cuf  reason: default package */
public final class cuf extends ffe implements a66 {
    public boolean X;
    public int Y;
    public final /* synthetic */ ouf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cuf(ouf ouf, Continuation continuation) {
        super(2, continuation);
        this.Z = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cuf(this.Z, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ouf ouf = this.Z;
            boolean f = ouf.f();
            mtf a = ouf.a(ouf);
            long j = ouf.a;
            long j2 = ouf.b;
            this.X = f;
            this.Y = 1;
            obj = a.a(j, j2, this);
            if (obj == tx3) {
                return tx3;
            }
            z = f;
        } else if (i == 1) {
            z = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        puf puf = (puf) obj;
        boolean z2 = false;
        boolean z3 = puf != null && puf.e;
        boolean z4 = puf != null && puf.f;
        String str = puf != null ? puf.d : null;
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        return new nn0(z, z3, z4, !z2);
    }
}
