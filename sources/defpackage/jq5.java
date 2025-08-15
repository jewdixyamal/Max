package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jq5  reason: default package */
public final class jq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ ta3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq5(mn5 mn5, ua3 ua3, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5;
        this.s0 = ua3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jq5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jq5 jq5 = new jq5(this.Z, (ua3) this.s0, continuation);
        jq5.Y = obj;
        return jq5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        ta3 ta3 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            Object obj2 = new Object();
            mn5 mn5 = this.Z;
            y40 y40 = new y40(obj2, (Object) sx3, (Object) ta3, 6);
            this.X = 1;
            if (mn5.d(y40, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                ua3 ua3 = (ua3) ta3;
                ua3.getClass();
                ua3.makeCompleting$kotlinx_coroutines_core(new lb3(th, false));
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
