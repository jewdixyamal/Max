package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: uie  reason: default package */
public final class uie extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xie Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uie(xie xie, Continuation continuation) {
        super(2, continuation);
        this.Y = xie;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uie) n((Long) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uie uie = new uie(this.Y, continuation);
        uie.X = obj;
        return uie;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Long l = (Long) this.X;
        pje pje = null;
        if (l != null && l.longValue() == -1) {
            this.Y.c().c((String) null);
        } else {
            this.Y.c().c(l.toString());
            ty3 c = this.Y.c();
            String valueOf = String.valueOf(((int) l.longValue()) & 255);
            ((np) c).getClass();
            if (((kye) np.d.getValue()) != null) {
                kye kye = kye.a;
                Map singletonMap = Collections.singletonMap("p", valueOf);
                if (!kye.b) {
                    try {
                        pje pje2 = kye.f;
                        if (pje2 != null) {
                            pje = pje2;
                        }
                        pje.b(singletonMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return e5f.a;
    }
}
