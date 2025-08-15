package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: dpf  reason: default package */
public final class dpf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c66 Y;
    public final /* synthetic */ View Z;
    public final /* synthetic */ View s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dpf(c66 c66, View view, View view2, Continuation continuation) {
        super(2, continuation);
        this.Y = c66;
        this.Z = view;
        this.s0 = view2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dpf) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dpf(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fka i2 = qp4.u0.b(this.s0.getContext()).i();
            this.X = 1;
            if (this.Y.invoke(this.Z, i2, this) == tx3) {
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
