package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zac  reason: default package */
public final class zac extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zac(cbc cbc, Continuation continuation) {
        super(2, continuation);
        this.Y = cbc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zac(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        cbc cbc = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (cbc.v0.getValue() instanceof sac) {
                return e5f;
            }
            long currentTimeMillis = System.currentTimeMillis();
            cbc.u().b(new Long(currentTimeMillis));
            this.X = 1;
            obj = cbc.s(cbc, currentTimeMillis, this);
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
        if (((Boolean) obj).booleanValue()) {
            jac jac = cbc.c;
            jac.getClass();
            pnf.o(jac.b, new eac(cbc.b, true));
        } else {
            this.X = 2;
            if (cbc.q(cbc, this) == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
