package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: l39  reason: default package */
public final class l39 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l39(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.Z = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l39) n((yu8) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l39 l39 = new l39(this.Z, continuation);
        l39.Y = obj;
        return l39;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            yu8 yu8 = (yu8) this.Y;
            String str = this.Z.A0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, str, "Got MessageEvent=" + yu8, (Throwable) null);
            }
            if (yu8 instanceof su8) {
                n59 n59 = this.Z;
                su8 su8 = (su8) yu8;
                this.X = 1;
                n59.getClass();
                if (su8.b) {
                    String str2 = n59.A0;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        ir62.d(us7.X, str2, zr6.h(su8.a.size(), "handleMessageAddEvent: delayed scroll for outgoing message, addedSize:"), (Throwable) null);
                    }
                    l89 B = n59.B();
                    Collection collection = su8.a;
                    B.getClass();
                    if (!collection.isEmpty()) {
                        B.l.updateAndGet(new v79(((Number) x53.o0(collection)).longValue(), 1));
                    }
                }
                if (e5f == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
