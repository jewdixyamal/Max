package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: im3  reason: default package */
public final class im3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((im3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new im3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        jm3 jm3 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (!jm3.B.get()) {
                return e5f;
            }
            this.X = 1;
            obj = ((ome) ((qea) ((pc6) jm3.A.getValue()).a.getValue()).a.getValue()).e(new gs9(sla.PROFILE_DELETE_TIME, 7), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((fgc) obj).c;
        jm3.p(jm3, l != null ? l.longValue() : 0);
        return e5f;
    }
}
