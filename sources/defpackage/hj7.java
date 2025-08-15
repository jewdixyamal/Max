package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: hj7  reason: default package */
public final class hj7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vj7 Z;
    public final /* synthetic */ Uri s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj7(vj7 vj7, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = vj7;
        this.s0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hj7) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hj7 hj7 = new hj7(this.Z, this.s0, continuation);
        hj7.Y = obj;
        return hj7;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (vj7.a(this.Z, (on5) this.Y, this.s0, this) == tx3) {
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
