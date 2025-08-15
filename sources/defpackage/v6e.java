package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: v6e  reason: default package */
public final class v6e extends ffe implements a66 {
    public final /* synthetic */ w6e X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v6e(w6e w6e, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.X = w6e;
        this.Y = j;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v6e(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        ued ued;
        Object obj2;
        od2.a0(obj);
        w6e w6e = this.X;
        Iterator it = ((Iterable) w6e.X.getValue()).iterator();
        while (true) {
            ued = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            y0d y0d = (y0d) obj2;
            if ((y0d instanceof w0d) && ((w0d) y0d).a == this.Y) {
                break;
            }
        }
        w0d w0d = obj2 instanceof w0d ? (w0d) obj2 : null;
        e5f e5f = e5f.a;
        if (w0d == null) {
            return e5f;
        }
        int i = gja.k;
        s35 s35 = w6e.Z;
        String str = w0d.X;
        int i2 = this.Z;
        if (i2 == i) {
            pnf.o(s35, new qed(str));
        } else if (i2 == gja.l) {
            pnf.o(s35, new red(str));
        } else if (i2 == gja.i) {
            tpa.o(w6e.b, str);
            if (tpa.s()) {
                ued = new ued(woc.t, new eqe(hja.g));
            }
            if (ued != null) {
                pnf.o(s35, ued);
            }
        } else if (i2 == gja.j) {
            w6e.y0 = Long.valueOf(w0d.a);
            pnf.o(s35, new sed(new eqe(hja.k), new eqe(hja.j), y53.M(new mg3(gja.b, new eqe(hja.h), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
        }
        return e5f;
    }
}
