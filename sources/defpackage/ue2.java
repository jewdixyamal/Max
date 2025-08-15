package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: ue2  reason: default package */
public final class ue2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x10 Z;
    public final /* synthetic */ ye2 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ue2(x10 x10, ye2 ye2, Continuation continuation) {
        super(2, continuation);
        this.Z = x10;
        this.s0 = ye2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ue2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ue2 ue2 = new ue2(this.Z, this.s0, continuation);
        ue2.Y = obj;
        return ue2;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        ye2 ye2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            x10 x10 = this.Z;
            if (x10.X) {
                String str2 = x10.a;
                str = null;
                if (!oag.t(str2) && !oag.t(str2)) {
                    str = au1.g(str2, "&fn=legacy_44");
                }
            } else {
                str = x10.a();
            }
            qrc qrc = ye2.o;
            this.Y = sx32;
            this.X = 1;
            Object c = qrc.c(qrc, str, x10.X, this);
            if (c == tx3) {
                return tx3;
            }
            sx3 sx33 = sx32;
            obj = c;
            sx3 = sx33;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj;
        ne2 ne2 = (ne2) ye2.z0.getAndUpdate(new oe2(0));
        boolean z = j1e.z(sx3);
        e5f e5f = e5f.a;
        if (!z) {
            return e5f;
        }
        kld kld = ye2.u0;
        if (uri != null && ne2 != null) {
            kld.g(new jn4(uri, ne2.d));
        } else if (uri == null && ne2 != null) {
            kld.g(new in4(ye2.u(ne2.d, false)));
        }
        return e5f;
    }
}
