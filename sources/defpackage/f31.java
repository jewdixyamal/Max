package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: f31  reason: default package */
public final class f31 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ l31 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f31(l31 l31, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = l31;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on5 on5 = (on5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                f31 f31 = new f31(this.Z, continuation, 0);
                f31.Y = th;
                e5f e5f = e5f.a;
                f31.o(e5f);
                return e5f;
            default:
                f31 f312 = new f31(this.Z, continuation, 1);
                f312.Y = th;
                e5f e5f2 = e5f.a;
                f312.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    hm9.p(this.Z.getClass().getName(), "fail no get chat", th);
                }
                return e5f.a;
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                if (!(th2 instanceof CancellationException)) {
                    hm9.p(this.Z.getClass().getName(), "fail to handle call link", th2);
                }
                return e5f.a;
        }
    }
}
