package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hf3  reason: default package */
public final class hf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of3 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf3(of3 of3, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = of3;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hf3) n((ttd) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hf3 hf3 = new hf3(this.Y, this.Z, continuation);
        hf3.X = obj;
        return hf3;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        ttd ttd = (ttd) this.X;
        if (ttd instanceof rtd) {
            try {
                String str = this.Y.X;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = (char) str.charAt(i);
                    if (Character.isDigit((char) charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                int length2 = sb2.length() - 3;
                if (length2 < 3) {
                    length2 = 3;
                }
                obj2 = "+" + w9e.M0(sb2, 3, length2, eae.m0(length2 - 3, "*")).toString();
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
            Object obj3 = this.Y.X;
            if (obj2 instanceof njc) {
                obj2 = obj3;
            }
            String str2 = (String) obj2;
            rtd rtd = (rtd) ttd;
            tt7 tt7 = rtd.a;
            if (tt7 instanceof ot7) {
                ((ty3) this.Z.getValue()).a((String) null, new wt7(k7d.j("Code: '", this.Y.C0, "', Phone: '", str2, "'"), rtd.a.b));
            } else if (tt7 instanceof pt7) {
                ((ty3) this.Z.getValue()).a((String) null, new wt7(str2, 0));
            } else if (tt7 instanceof qt7) {
                ((ty3) this.Z.getValue()).a((String) null, new wt7(str2, 1));
            } else if (!(tt7 instanceof st7)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.Y.C0 = null;
        return e5f.a;
    }
}
