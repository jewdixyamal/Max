package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wb2  reason: default package */
public final class wb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb2(zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wb2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        zb2 zb2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            zb2 = this.Z;
            alc e = zb2.e();
            this.X = zb2;
            this.Y = 1;
            obj = e.d(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            zb2 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = null;
        this.Y = 2;
        if (zb2.j(zb2, (List) obj, false, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
