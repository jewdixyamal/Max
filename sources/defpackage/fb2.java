package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: fb2  reason: default package */
public final class fb2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fb2(zb2 zb2, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fb2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            zb2 zb2 = this.Y;
            alc e = zb2.e();
            String str2 = this.Z;
            ArrayList e2 = e.e(str2);
            boolean f = tpa.f(str2, "all.chat.folder");
            this.X = 1;
            obj = zb2.b(zb2, e2, f, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
