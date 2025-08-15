package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: r95  reason: default package */
public final class r95 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sx3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r95(sx3 sx3, Continuation continuation) {
        super(2, continuation);
        this.Y = sx3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r95) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r95 r95 = new r95(this.Y, continuation);
        r95.X = obj;
        return r95;
    }

    public final Object o(Object obj) {
        boolean z;
        od2.a0(obj);
        Throwable th = (Throwable) this.X;
        if (!(th instanceof TamErrorException) || !f46.U(((TamErrorException) th).a.b)) {
            String name = this.Y.getClass().getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.s0;
                ir6.d(us7, name, "ExternalCallback request failed with " + th + ". Couldn't recover", (Throwable) null);
            }
            z = false;
        } else {
            String name2 = this.Y.getClass().getName();
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                us7 us72 = us7.s0;
                ir62.d(us72, name2, "ExternalCallback request failed with " + th + ". Retrying", (Throwable) null);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
