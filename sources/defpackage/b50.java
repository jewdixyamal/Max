package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b50  reason: default package */
public final class b50 extends ffe implements a66 {
    public final /* synthetic */ c50 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b50(c50 c50, Continuation continuation) {
        super(2, continuation);
        this.X = c50;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b50) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b50(this.X, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        od2.a0(obj);
        c50 c50 = this.X;
        bc7[] bc7Arr = c50.h;
        long l = ((uh9) c50.g()).l();
        Long l2 = this.X.e;
        e5f e5f = e5f.a;
        if (l2 == null || l != l2.longValue()) {
            q0e q0e = this.X.f;
            do {
                value = q0e.getValue();
                ((zl7) value).getClass();
            } while (!q0e.c(value, new zl7((Float) null, false)));
            return e5f;
        } else if (this.X.g().b()) {
            q0e q0e2 = this.X.f;
            do {
                value3 = q0e2.getValue();
                zl7 zl7 = (zl7) value3;
            } while (!q0e2.c(value3, new zl7((Float) null, false)));
            return e5f;
        } else {
            c50 c502 = this.X;
            q0e q0e3 = c502.f;
            do {
                value2 = q0e3.getValue();
                zl7 zl72 = (zl7) value2;
                z = ((uh9) c502.g()).x;
                f = zl72.a;
                zl72.getClass();
            } while (!q0e3.c(value2, new zl7(f, z)));
            return e5f;
        }
    }
}
