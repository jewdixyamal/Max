package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ih0  reason: default package */
public final class ih0 extends ffe implements a66 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ jh0 u0;
    public final /* synthetic */ vg0 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ih0(jh0 jh0, vg0 vg0, Continuation continuation) {
        super(2, continuation);
        this.u0 = jh0;
        this.v0 = vg0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ih0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ih0 ih0 = new ih0(this.u0, this.v0, continuation);
        ih0.t0 = obj;
        return ih0;
    }

    public final Object o(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        tx3 tx3 = tx3.a;
        int i = this.s0;
        jh0 jh0 = this.u0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.t0;
            boolean z5 = !((eua) jh0.a.getValue()).b(eua.f);
            je7 je7 = jh0.a;
            eua eua = (eua) je7.getValue();
            if (Build.VERSION.SDK_INT >= 33) {
                z4 = eua.b(eua.k);
            } else {
                eua.getClass();
                z4 = true;
            }
            boolean z6 = !z4;
            boolean z7 = !((eua) je7.getValue()).b(eua.h);
            je7 je72 = jh0.d;
            this.X = z5;
            this.Y = z6;
            this.Z = z7;
            this.s0 = 1;
            obj = new de0(new yf4[]{j47.h(sx3, ((w9a) ((kke) je72.getValue())).b(), new fh0(jh0, (Continuation) null), 2), j47.h(sx3, ((w9a) ((kke) je72.getValue())).b(), new gh0(jh0, (Continuation) null), 2), j47.h(sx3, ((w9a) ((kke) je72.getValue())).a(), new hh0(this.v0, (Continuation) null), 2)}).a(this);
            if (obj == tx3) {
                return tx3;
            }
            z = z5;
            z3 = z7;
            z2 = z6;
        } else if (i == 1) {
            z3 = this.Z;
            z2 = this.Y;
            z = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        boolean booleanValue3 = ((Boolean) list.get(2)).booleanValue();
        jh0.e = z;
        jh0.g = z2;
        jh0.f = z3;
        return e5f.a;
    }
}
