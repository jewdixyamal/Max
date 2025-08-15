package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: tmb  reason: default package */
public final class tmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ RectF s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tmb(cnb cnb, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
        this.Z = str;
        this.s0 = rectF;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tmb(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pab pab = this.Y.O0;
            this.X = 1;
            if (pab.c(this.Z, this.s0, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
