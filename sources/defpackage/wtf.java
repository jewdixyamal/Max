package defpackage;

import android.security.keystore.UserNotAuthenticatedException;
import kotlin.coroutines.Continuation;

/* renamed from: wtf  reason: default package */
public final class wtf extends ffe implements a66 {
    public String X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ouf s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wtf(ouf ouf, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Z = z;
        this.s0 = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wtf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wtf(this.s0, continuation, this.Z);
    }

    public final Object o(Object obj) {
        String g;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            if (!this.Z) {
                nx3 b = ((w9a) this.s0.e()).b();
                vtf vtf = new vtf(this.s0, (Continuation) null);
                this.Y = 1;
                obj = j47.t0(b, vtf, this);
                if (obj == tx3) {
                    return tx3;
                }
            } else {
                w97 w97 = this.s0.l;
                hn0 hn0 = w97 instanceof hn0 ? (hn0) w97 : null;
                String str = hn0 != null ? hn0.d : null;
                this.s0.getClass();
                g = ouf.g(str);
                a8g i2 = this.s0.f.i((String) null);
                ouf ouf = this.s0;
                kld kld = ouf.j;
                ntf ntf = new ntf(i2, (String) ouf.e.getValue(), g);
                this.X = g;
                this.Y = 2;
                return kld.a(ntf, this) == tx3 ? tx3 : e5f;
            }
        } else if (i != 1) {
            if (i == 2) {
                g = this.X;
                try {
                    od2.a0(obj);
                } catch (UserNotAuthenticatedException e) {
                    hm9.l0(this.s0.g, "Can't webapp access request to biometry, try request biometry without crypto", e);
                    ouf ouf2 = this.s0;
                    kld kld2 = ouf2.j;
                    ntf ntf2 = new ntf((a8g) null, (String) ouf2.e.getValue(), g);
                    this.X = null;
                    this.Y = 3;
                    if (kld2.a(ntf2, this) == tx3) {
                        return tx3;
                    }
                }
            } else if (i == 3) {
                od2.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od2.a0(obj);
        }
        puf puf = (puf) obj;
        w97 w972 = this.s0.l;
        hn0 hn02 = w972 instanceof hn0 ? (hn0) w972 : null;
        if (hn02 != null) {
            boolean f = this.s0.f();
            String str2 = puf.d;
            hn02.a(new nn0(f, true, false, !(str2 == null || str2.length() == 0)));
        } else {
            w97 w973 = this.s0.l;
            if (w973 != null) {
                w973.b(new s0());
            }
        }
        this.s0.l = null;
        return e5f;
    }
}
