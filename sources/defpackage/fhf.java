package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fhf  reason: default package */
public final class fhf extends ffe implements a66 {
    public final /* synthetic */ Float X;
    public final /* synthetic */ jhf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fhf(Float f, jhf jhf, Continuation continuation) {
        super(2, continuation);
        this.X = f;
        this.Y = jhf;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fhf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fhf(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jhf jhf = this.Y;
        Float f = this.X;
        if (f == null) {
            dkf dkf = jhf.d().X;
            if (dkf != null) {
                dkf.play();
            }
        } else {
            nif d = jhf.d();
            float floatValue = f.floatValue();
            ijf ijf = (ijf) x53.i0(d.Z.a.b());
            gef gef = ijf != null ? ijf.o : null;
            if (gef == null) {
                hm9.m0(d.a, "We cannot seek a videoContent because is null", new Object[0]);
            } else {
                long c = (long) ((floatValue / 100.0f) * ((float) gef.c()));
                dkf dkf2 = d.X;
                if (dkf2 != null) {
                    dkf2.J0(c);
                }
            }
        }
        return e5f.a;
    }
}
