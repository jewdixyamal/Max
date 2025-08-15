package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: er2  reason: default package */
public final class er2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on5 on5 = (on5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                er2 er2 = new er2(3, continuation, 0);
                er2.Y = th;
                e5f e5f = e5f.a;
                er2.o(e5f);
                return e5f;
            case 1:
                er2 er22 = new er2(3, continuation, 1);
                er22.Y = th;
                e5f e5f2 = e5f.a;
                er22.o(e5f2);
                return e5f2;
            case 2:
                er2 er23 = new er2(3, continuation, 2);
                er23.Y = th;
                e5f e5f3 = e5f.a;
                er23.o(e5f3);
                return e5f3;
            case 3:
                er2 er24 = new er2(3, continuation, 3);
                er24.Y = th;
                e5f e5f4 = e5f.a;
                er24.o(e5f4);
                return e5f4;
            default:
                er2 er25 = new er2(3, continuation, 4);
                er25.Y = th;
                e5f e5f5 = e5f.a;
                er25.o(e5f5);
                return e5f5;
        }
    }

    public final Object o(Object obj) {
        e5f e5f = e5f.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                hm9.p("jr2", "catch error in chatUpdateFlow", this.Y);
                return e5f;
            case 1:
                od2.a0(obj);
                hm9.p("ChatVM/MissedContactsController", "fail", this.Y);
                return e5f;
            case 2:
                od2.a0(obj);
                hm9.p("MiniChatsUpdated", "fail", this.Y);
                return e5f;
            case 3:
                od2.a0(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    ((cba) y8a.a.g()).c(th, false);
                }
                return e5f;
            default:
                od2.a0(obj);
                hm9.l0("ViewThemeUtils", "fail to change theme for spans", this.Y);
                return e5f;
        }
    }
}
