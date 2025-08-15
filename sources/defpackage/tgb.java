package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tgb  reason: default package */
public final class tgb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tgb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tgb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        vgb vgb = this.Y;
        if (i == 0) {
            od2.a0(obj);
            gv4 gv4 = vgb.b;
            this.X = 1;
            obj = gv4.l(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            pnf.o(vgb.w0, g43.b);
        }
        return e5f.a;
    }
}
