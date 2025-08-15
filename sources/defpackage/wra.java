package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wra  reason: default package */
public final class wra extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ a66 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wra(gh7 gh7, fg7 fg7, a66 a66, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7;
        this.s0 = fg7;
        this.t0 = a66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wra) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wra wra = new wra(this.Z, this.s0, this.t0, continuation);
        wra.Y = obj;
        return wra;
    }

    public final Object o(Object obj) {
        kg7 kg7;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            x77 x77 = (x77) ((sx3) this.Y).getCoroutineContext().get(c32.X);
            if (x77 != null) {
                vra vra = new vra();
                kg7 kg72 = new kg7(this.Z, this.s0, vra.a, x77);
                try {
                    a66 a66 = this.t0;
                    this.Y = kg72;
                    this.X = 1;
                    obj = j47.t0(vra, a66, this);
                    if (obj == tx3) {
                        return tx3;
                    }
                    kg7 = kg72;
                } catch (Throwable th) {
                    th = th;
                    kg7 = kg72;
                    kg7.a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            kg7 = (kg7) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kg7.a();
        return obj;
    }
}
