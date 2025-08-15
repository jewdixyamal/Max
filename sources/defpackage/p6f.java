package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p6f  reason: default package */
public final class p6f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ q6f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6f(boolean z, q6f q6f, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = q6f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p6f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p6f(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        q6f q6f = this.Z;
        if (i == 0) {
            od2.a0(obj);
            ? obj3 = new Object();
            boolean z = this.Y;
            obj3.u = Boolean.valueOf(z);
            if (z) {
                obj3.o = 3;
                obj3.p = 3;
                obj3.v = 3;
                se5 se5 = (se5) ((qe5) q6f.e.getValue());
                se5.getClass();
                if (se5.n(PmsKey.f126unsafefilesalert, false)) {
                    obj3.w = Boolean.TRUE;
                }
            }
            tq2 tq2 = new tq2((String) null, 0, new le3(new gaf(obj3)), false);
            this.X = 1;
            obj = ((k4a) ((pk) q6f.a.getValue())).J(tq2, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gaf gaf = ((fe3) obj).o;
        if (gaf != null) {
            ((jp) ((hp) q6f.b.getValue())).z(gaf);
            if (tpa.f(gaf.u, Boolean.FALSE)) {
                t33 t33 = (t33) ((q33) q6f.c.getValue());
                t33.m("app.pin_" + t33.t(), (String) null);
            }
            ie3 ie3 = (ie3) q6f.g.getValue();
            ie3.getClass();
            j47.T(ie3.b, (lx3) null, (vx3) null, new he3(ie3, (Continuation) null), 3);
            return e5f.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
