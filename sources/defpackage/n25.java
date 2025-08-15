package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n25  reason: default package */
public final class n25 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o25 Z;
    public final /* synthetic */ String s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n25(o25 o25, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = o25;
        this.s0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n25) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n25 n25 = new n25(this.Z, this.s0, continuation);
        n25.Y = obj;
        return n25;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        o25 o25 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            o25.t0 = true;
            khe khe = j15.a;
            String a = j15.a(this.s0);
            if (!j1e.z(sx32)) {
                o25.t0 = false;
                return e5f;
            }
            t33 t33 = (t33) ((q33) o25.b.getValue());
            boolean f = tpa.f(t33.g.getString("app.pin_" + t33.t(), (String) null), a);
            s35 s35 = o25.X;
            if (!f) {
                pnf.o(s35, p25.b);
                o25.t0 = false;
                return e5f;
            }
            pnf.o(s35, p25.a);
            this.Y = sx32;
            this.X = 1;
            if (j47.x(1000, this) == tx3) {
                return tx3;
            }
            sx3 = sx32;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                o25.t0 = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (j1e.z(sx3)) {
            pnf.o(o25.Y, e5f);
        }
        o25.t0 = false;
        return e5f;
    }
}
