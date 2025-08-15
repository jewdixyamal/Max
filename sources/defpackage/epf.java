package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: epf  reason: default package */
public final class epf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c66 Z;
    public final /* synthetic */ View s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public epf(c66 c66, View view, Continuation continuation) {
        super(2, continuation);
        this.Z = c66;
        this.s0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((epf) n((fka) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        epf epf = new epf(this.Z, this.s0, continuation);
        epf.Y = obj;
        return epf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Z.invoke(this.s0, (fka) this.Y, this) == tx3) {
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
