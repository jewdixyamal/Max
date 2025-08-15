package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: mx  reason: default package */
public final class mx extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ px Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mx(px pxVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mx) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mx mxVar = new mx(this.Y, continuation);
        mxVar.X = obj;
        return mxVar;
    }

    public final Object o(Object obj) {
        boolean z;
        od2.a0(obj);
        Throwable th = (Throwable) this.X;
        boolean z2 = th instanceof TamErrorException;
        px pxVar = this.Y;
        if (!z2 || !f46.U(((TamErrorException) th).a.b)) {
            String str = pxVar.i;
            hm9.p(str, "request failed with " + th + ". Couldn't recover", (Throwable) null);
            z = false;
        } else {
            String str2 = pxVar.i;
            hm9.p(str2, "request failed with " + th + ". Retrying", (Throwable) null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
