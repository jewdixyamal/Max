package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: pmb  reason: default package */
public final class pmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pmb(cnb cnb, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pmb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cnb cnb = this.Y;
            vj7 vj7 = (vj7) cnb.w0.getValue();
            vj7.getClass();
            String str = this.Z;
            ac e = vj7.e(Uri.parse(str));
            o69 o69 = new o69(cnb, 7, str);
            this.X = 1;
            if (e.d(o69, this) == tx3) {
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
