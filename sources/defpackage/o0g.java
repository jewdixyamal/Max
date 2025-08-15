package defpackage;

import android.security.keystore.UserNotAuthenticatedException;
import kotlin.coroutines.Continuation;

/* renamed from: o0g  reason: default package */
public final class o0g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ p0g Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0g(boolean z, p0g p0g, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = p0g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o0g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o0g(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y) {
                String str = ((l0g) this.Z.t0.getValue()).a;
                try {
                    pnf.o(this.Z.v0, new j0g(str, this.Z.o.i((String) null)));
                } catch (UserNotAuthenticatedException unused) {
                    hm9.m0(this.Z.X, "Can't prepare crypto object because need auth by biometry", new Object[0]);
                    pnf.o(this.Z.v0, new j0g(str, (a8g) null));
                }
                return e5f;
            }
            p0g p0g = this.Z;
            long j = p0g.b;
            long j2 = p0g.c;
            this.X = 1;
            obj = ((mtf) this.Z.Y.getValue()).a(j, j2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            p0g p0g2 = this.Z;
            bc7[] bc7Arr = p0g.z0;
            p0g2.q();
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        puf puf = (puf) obj;
        puf a = puf != null ? puf.a(puf, false, false, 7) : null;
        if (a == null) {
            p0g p0g3 = this.Z;
            String str2 = p0g3.X;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.s0, str2, ey8.h(p0g3.c, "Can't update webApp state in db with unchecked state, botId = "), (Throwable) null);
            }
            return e5f;
        }
        mtf mtf = (mtf) this.Z.Y.getValue();
        this.X = 2;
        mtf.getClass();
        if (ote.j(mtf.a, new ltf(mtf, a, 1), this) == tx3) {
            return tx3;
        }
        p0g p0g22 = this.Z;
        bc7[] bc7Arr2 = p0g.z0;
        p0g22.q();
        return e5f;
    }
}
