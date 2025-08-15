package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: a49  reason: default package */
public final class a49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a49(n59 n59, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            n59 n59 = this.Y;
            vj7 vj7 = (vj7) n59.V0.getValue();
            vj7.getClass();
            String str = this.Z;
            ac e = vj7.e(Uri.parse(str));
            zb zbVar = new zb(n59, 29, str);
            this.X = 1;
            if (e.d(zbVar, this) == tx3) {
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
