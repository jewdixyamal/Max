package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bmb  reason: default package */
public final class bmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x99 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bmb(x99 x99, Continuation continuation) {
        super(2, continuation);
        this.Y = x99;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bmb) n((uj3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bmb bmb = new bmb(this.Y, continuation);
        bmb.X = obj;
        return bmb;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        uj3 uj3 = (uj3) this.X;
        String str = uj3 != null ? uj3.a.c.c : null;
        CharSequence m = uj3 != null ? uj3.m() : null;
        long n = uj3 != null ? uj3.n() : 0;
        boolean z = false;
        if (!(!(str == null || str.length() == 0))) {
            if (m == null || ((String) m).length() == 0) {
                z = true;
            }
            if (!(!z)) {
                obj2 = i2b.a;
            } else if (m != null) {
                obj2 = new h2b(m, n);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (str != null) {
            obj2 = new k2b(str);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((q0e) this.Y.X).m((Object) null, obj2);
        return e5f.a;
    }
}
