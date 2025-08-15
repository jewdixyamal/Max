package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: qfe  reason: default package */
public final class qfe extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfe(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.Z = obj;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.X;
        on5 on5 = (on5) obj;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                qfe qfe = new qfe((cge) this.Z, continuation, 0);
                qfe.Y = th;
                return qfe.o(e5f.a);
            default:
                qfe qfe2 = new qfe((ige) this.Z, continuation, 1);
                qfe2.Y = th;
                return qfe2.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        boolean z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                if (this.Y instanceof HttpUrlExpiredException) {
                    String str = ((cge) this.Z).b;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.Z, str, "Got error about expired URL, retry upload", (Throwable) null);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                Throwable th = this.Y;
                ((ige) this.Z).getClass();
                return Boolean.valueOf((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
        }
    }
}
