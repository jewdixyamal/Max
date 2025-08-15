package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: vce  reason: default package */
public final class vce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j92 Y;
    public final /* synthetic */ yce Z;
    public final /* synthetic */ Context s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vce(j92 j92, yce yce, Context context, Continuation continuation) {
        super(2, continuation);
        this.Y = j92;
        this.Z = yce;
        this.s0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vce(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [cjg, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2;
        Object obj3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        j92 j92 = this.Y;
        yce yce = this.Z;
        if (i == 0) {
            od2.a0(obj);
            if (j92 == null) {
                return e5f;
            }
            t03 t03 = new t03(yce.b, 11);
            this.X = 1;
            obj2 = od2.A(t03, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pk pkVar = (pk) yce.Z.getValue();
        av0 av0 = (av0) yce.s0.getValue();
        p82 p82 = (p82) yce.u0.getValue();
        dq0 dq0 = (dq0) yce.v0.getValue();
        ztc a = ((jle) ((hle) yce.w0.getValue())).a();
        je7 je7 = yce.X;
        je7 je72 = yce.A0;
        je7 je73 = yce.x0;
        e5f e5f2 = e5f;
        je7 je74 = yce.y0;
        ede ede = new ede(pkVar, av0, p82, dq0, (e52) obj2, a, (b0d) je7.getValue(), (ida) je72.getValue(), (m7b) je73.getValue(), (u7b) je74.getValue(), (hbd) yce.z0.getValue());
        je7 je75 = yce.Y;
        j92 j922 = this.Y;
        moa moa = new moa(j92, (kke) je75.getValue(), ede, new ns3(j922, (el3) yce.t0.getValue(), (kke) je75.getValue(), (b0d) je7.getValue(), (ida) je72.getValue(), (m7b) je73.getValue(), (u7b) je74.getValue()));
        Context context = this.s0;
        je7 je76 = iyc.h;
        ? obj4 = new Object();
        obj4.a = context;
        obj4.b = j92;
        obj4.c = je76;
        yce.P0 = j92;
        yce.O0 = moa;
        yce.Q0 = obj4;
        return e5f2;
    }
}
