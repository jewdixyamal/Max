package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p91  reason: default package */
public final class p91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s91 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p91(s91 s91, Continuation continuation) {
        super(2, continuation);
        this.Y = s91;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p91) n((Long) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p91 p91 = new p91(this.Y, continuation);
        p91.X = obj;
        return p91;
    }

    public final Object o(Object obj) {
        Object value;
        String str;
        od2.a0(obj);
        Long l = (Long) this.X;
        s91 s91 = this.Y;
        q0e q0e = s91.Z;
        do {
            value = q0e.getValue();
            String str2 = (String) value;
            if (l != null) {
                s91.o.getClass();
                str = wg0.i("· ", bn1.e(l));
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        } while (!q0e.c(value, str));
        return e5f.a;
    }
}
