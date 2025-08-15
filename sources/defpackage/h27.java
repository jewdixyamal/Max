package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: h27  reason: default package */
public final class h27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q27 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h27(q27 q27, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = q27;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h27) n((tt7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h27 h27 = new h27(this.Y, this.Z, continuation);
        h27.X = obj;
        return h27;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        tt7 tt7 = (tt7) this.X;
        q27 q27 = this.Y;
        int i = ((eaa) q27.w0.getValue()).b;
        String m0 = eae.m0(6, "*");
        String str = (String) q27.y0.getValue();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = (char) str.charAt(i2);
            if (Character.isDigit((char) charAt)) {
                sb.append(charAt);
            }
        }
        String str2 = "'+" + i + m0 + w9e.Z0(4, sb.toString()) + "'";
        boolean z = tt7 instanceof ot7;
        je7 je7 = this.Z;
        if (z) {
            ((ty3) je7.getValue()).a((String) null, new wt7(wg0.i("Phone: ", str2), ((ot7) tt7).b));
        } else if (tt7 instanceof pt7) {
            ((ty3) je7.getValue()).a((String) null, new wt7(str2, 0));
        } else if (tt7 instanceof qt7) {
            ((ty3) je7.getValue()).a((String) null, new wt7(str2, 1));
        } else if (tt7 != null && !(tt7 instanceof st7)) {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
