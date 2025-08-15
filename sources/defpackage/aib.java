package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aib  reason: default package */
public final class aib extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jib Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aib(jib jib, Continuation continuation) {
        super(2, continuation);
        this.Y = jib;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((aib) n((chb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aib aib = new aib(this.Y, continuation);
        aib.X = obj;
        return aib;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        chb chb = (chb) this.X;
        if (chb instanceof ahb) {
            Long l = ((ahb) chb).a;
            jib jib = this.Y;
            long j = jib.w0.get();
            if (l != null && l.longValue() == j) {
                pnf.o(jib.C0, new ohb(woc.z, new eqe(yea.Y0)));
            }
        }
        return e5f.a;
    }
}
