package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wl3  reason: default package */
public final class wl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl3(jm3 jm3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wl3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        jm3 jm3 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ggc ggc = jm3.y;
            this.X = 1;
            gs9 gs9 = new gs9(sla.PROFILE_DELETE, 6);
            gs9.d("delete", this.Z);
            obj = ((ome) ((qea) ggc.a.getValue()).a.getValue()).e(gs9, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((egc) obj).c;
        jm3.p(jm3, l != null ? l.longValue() : 0);
        return e5f.a;
    }
}
