package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tdb  reason: default package */
public final class tdb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ feb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tdb(feb feb, Continuation continuation) {
        super(2, continuation);
        this.Z = feb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tdb) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tdb tdb = new tdb(this.Z, continuation);
        tdb.Y = obj;
        return tdb;
    }

    public final Object o(Object obj) {
        ti9 ti9;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kpa kpa = (kpa) this.Y;
            e52 e52 = (e52) kpa.a;
            uj3 uj3 = (uj3) kpa.b;
            feb feb = this.Z;
            if (!feb.A0) {
                q0e q0e = feb.y0;
                this.Y = q0e;
                this.X = 1;
                obj = feb.q(feb, e52, uj3, false);
                if (obj == tx3) {
                    return tx3;
                }
                ti9 = q0e;
            }
            return e5f.a;
        } else if (i == 1) {
            ti9 = (ti9) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ti9.setValue(obj);
        return e5f.a;
    }
}
