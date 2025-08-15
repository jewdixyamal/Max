package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rl3  reason: default package */
public final class rl3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rl3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rl3) n((xu4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rl3 rl3 = new rl3(this.Y, continuation);
        rl3.X = obj;
        return rl3;
    }

    public final Object o(Object obj) {
        Object value;
        xu4 xu4;
        q0e q0e;
        Object value2;
        q0e q0e2;
        Object value3;
        od2.a0(obj);
        xu4 xu42 = (xu4) this.X;
        jm3 jm3 = this.Y;
        q0e q0e3 = jm3.j;
        do {
            value = q0e3.getValue();
            xu4 = (xu4) value;
        } while (!q0e3.c(value, xu4 != null ? xu4.c(xu4, (String) null, (a73) null, (String) null, (a73) null, (String) null, xu42.i, (faf) null, false, (Long) null, 7935) : null));
        boolean z = jm3.B.get();
        String str = xu42.a;
        xu4 xu43 = (xu4) jm3.i.getValue();
        meb meb = new meb(str, xu42.b, xu42.c, xu42.d, xu43 != null && xu43.a((jv4) jm3.j.getValue()), z, z ? 2 : 1);
        List a = jm3.f().a(jm3);
        do {
            q0e = jm3.b;
            value2 = q0e.getValue();
            meb meb2 = (meb) value2;
        } while (!q0e.c(value2, meb));
        do {
            q0e2 = jm3.c;
            value3 = q0e2.getValue();
            List list = (List) value3;
        } while (!q0e2.c(value3, a));
        return e5f.a;
    }
}
