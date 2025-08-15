package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: nac  reason: default package */
public final class nac extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ cbc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nac(khe khe, cbc cbc, Continuation continuation) {
        super(2, continuation);
        this.X = khe;
        this.Y = cbc;
    }

    public final Object invoke(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Number) obj).longValue());
        e5f e5f = e5f.a;
        ((nac) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nac((khe) this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        p70 p70 = (p70) this.X.getValue();
        if (p70 != null) {
            int a = this.Y.w().a();
            ArrayList arrayList = p70.a;
            double log10 = a == 0 ? -45.0d : Math.log10(((double) a) / ((double) 32768)) * 20.0d;
            if (log10 < -45.0d) {
                log10 = -45.0d;
            }
            arrayList.add(Integer.valueOf((int) (((log10 - -45.0d) * ((double) 32768)) / 45.0d)));
            p70.a();
        }
        return e5f.a;
    }
}
