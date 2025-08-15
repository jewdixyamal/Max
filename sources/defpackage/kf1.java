package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kf1  reason: default package */
public final class kf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ je7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf1(of1 of1, boolean z, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
        this.Z = z;
        this.s0 = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kf1) n((aa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kf1 kf1 = new kf1(this.Y, this.Z, this.s0, continuation);
        kf1.X = obj;
        return kf1;
    }

    public final Object o(Object obj) {
        Object value;
        wf1 wf1;
        kl7 r;
        boolean z;
        List list;
        od2.a0(obj);
        aa aaVar = (aa) this.X;
        of1 of1 = this.Y;
        q0e q0e = of1.z0;
        do {
            value = q0e.getValue();
            wf1 = (wf1) value;
            r = of1.r(aaVar.a, this.Z);
            z = aaVar.a;
            if (z) {
                aa aaVar2 = (aa) ((yz0) ((ez0) of1.t0.getValue())).F0.getValue();
                boolean z2 = aaVar2.b;
                kl7 l = j1e.l();
                if (z2) {
                    l.add(new l7a(y7a.b, Integer.valueOf(b8a.a), (Integer) null, Integer.valueOf(x7a.f), (Integer) null, 52));
                }
                if (aaVar2.c) {
                    l.add(new l7a(y7a.d, Integer.valueOf(b8a.c), (Integer) null, Integer.valueOf(x7a.i), (Integer) null, 52));
                }
                l.add(new l7a(y7a.c, Integer.valueOf(b8a.b), (Integer) null, Integer.valueOf(x7a.L), (Integer) null, 52));
                list = j1e.d(l);
            } else {
                list = nz4.a;
            }
            if (!((se5) ((qe5) this.s0.getValue())).q()) {
                z = false;
            }
        } while (!q0e.c(value, wf1.a(wf1, (List) null, r, list, true, (CharSequence) null, z, 17)));
        return e5f.a;
    }
}
