package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: y4a  reason: default package */
public final class y4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zaa Y;
    public final /* synthetic */ OneMeApplication Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y4a(zaa zaa, OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = zaa;
        this.Z = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y4a(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            this.Y.a(this.Z, this);
            return tx3;
        } else if (i == 1) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
