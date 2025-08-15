package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: wce  reason: default package */
public final class wce extends ffe implements a66 {
    public jce X;
    public int Y;
    public final /* synthetic */ yce Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ j92 u0;
    public final /* synthetic */ moa v0;
    public final /* synthetic */ cjg w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wce(yce yce, String str, int i, j92 j92, moa moa, cjg cjg, Continuation continuation) {
        super(2, continuation);
        this.Z = yce;
        this.s0 = str;
        this.t0 = i;
        this.u0 = j92;
        this.v0 = moa;
        this.w0 = cjg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wce(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        jce jce;
        q0e q0e;
        Object value;
        e52 e52;
        Object value2;
        Object value3;
        Object value4;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        yce yce = this.Z;
        if (i == 0) {
            od2.a0(obj);
            String str = yce.B0.a;
            String str2 = this.s0;
            if (!tpa.f(str, str2)) {
                yce.B0 = gde.g;
            }
            j0e j0e = yce.b;
            e52 e522 = (e52) j0e.getValue();
            boolean z = false;
            if (e522 != null && e522.H()) {
                z = true;
            }
            jce c = ece.c(str2, this.t0, this.u0);
            jce jce2 = jce.X;
            q0e q0e2 = yce.C0;
            if (c == jce2) {
                do {
                    value4 = q0e2.getValue();
                    kce kce = (kce) value4;
                } while (!q0e2.c(value4, (Object) null));
                return e5f;
            } else if (z && (c == jce.a || c == jce.b)) {
                do {
                    value3 = q0e2.getValue();
                    kce kce2 = (kce) value3;
                } while (!q0e2.c(value3, (Object) null));
                return e5f;
            } else if (c != jce.c || ((e52 = (e52) j0e.getValue()) != null && e52.n0())) {
                gde gde = yce.B0;
                this.X = c;
                this.Y = 1;
                moa moa = this.v0;
                obj2 = j47.t0(((w9a) ((kke) moa.b)).a(), new hce(gde, this.s0, this.t0, moa, (Continuation) null), this);
                if (obj2 == tx3) {
                    return tx3;
                }
                jce = c;
            } else {
                do {
                    value2 = q0e2.getValue();
                    kce kce3 = (kce) value2;
                } while (!q0e2.c(value2, (Object) null));
                return e5f;
            }
        } else if (i == 1) {
            jce = this.X;
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gde gde2 = (gde) obj2;
        yce.B0 = gde2;
        ArrayList d = this.w0.d(gde2.d);
        do {
            q0e = yce.C0;
            value = q0e.getValue();
            kce kce4 = (kce) value;
        } while (!q0e.c(value, new kce(jce, d)));
        return e5f;
    }
}
