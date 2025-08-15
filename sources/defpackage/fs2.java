package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fs2  reason: default package */
public final class fs2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ks2 Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ je7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fs2(ks2 ks2, je7 je7, je7 je72, Continuation continuation) {
        super(2, continuation);
        this.Y = ks2;
        this.Z = je7;
        this.s0 = je72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fs2) n((zy3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fs2 fs2 = new fs2(this.Y, this.Z, this.s0, continuation);
        fs2.X = obj;
        return fs2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zy3 zy3 = (zy3) this.X;
        boolean z = zy3 instanceof xy3;
        e5f e5f = e5f.a;
        ks2 ks2 = this.Y;
        if (z) {
            if (((xy3) zy3).a != ks2.C0.get()) {
                return e5f;
            }
            pnf.o(ks2.B0, cs2.a);
        } else if (zy3 instanceof yy3) {
            yy3 yy3 = (yy3) zy3;
            if (yy3.a != ks2.C0.get()) {
                return e5f;
            }
            vxd n = pnf.n(ks2, ((w9a) ((kke) this.Z.getValue())).b(), (vx3) null, new es2(ks2, zy3, (Continuation) null), 2);
            ks2.E0.o1(ks2, ks2.I0[1], n);
            se5 se5 = (se5) ((qe5) this.s0.getValue());
            se5.getClass();
            boolean n2 = se5.n(PmsKey.f34editchanneltypescreenenabled, false);
            long j = yy3.b;
            s35 s35 = ks2.A0;
            if (n2) {
                pnf.o(s35, new qr2(j));
            } else {
                pnf.o(s35, new pr2(j));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
