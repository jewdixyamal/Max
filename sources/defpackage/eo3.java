package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: eo3  reason: default package */
public final class eo3 extends ffe implements a66 {
    public final /* synthetic */ oo3 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo3(oo3 oo3, Continuation continuation) {
        super(2, continuation);
        this.X = oo3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((eo3) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eo3(this.X, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        od2.a0(obj);
        oo3 oo3 = this.X;
        qyc qyc = (qyc) ((y7d) oo3.x0.getValue());
        qyc.getClass();
        int i = qyc.n(PmsKey.f3accountnicknameenabled, false) ? a9a.k : a9a.j;
        do {
            q0e = oo3.E0;
            value = q0e.getValue();
            jqe jqe = (jqe) value;
        } while (!q0e.c(value, new eqe(i)));
        return e5f.a;
    }
}
