package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ufe  reason: default package */
public final class ufe extends ffe implements e66 {
    public int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ cge Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ufe(cge cge, Continuation continuation) {
        super(4, continuation);
        this.Z = cge;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        on5 on5 = (on5) obj;
        ((Number) obj3).longValue();
        ufe ufe = new ufe(this.Z, (Continuation) obj4);
        ufe.Y = (Throwable) obj2;
        return ufe.o(e5f.a);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = this.Y;
            this.X = 1;
            obj = cge.c(this.Z, th, this);
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
