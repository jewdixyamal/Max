package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vfe  reason: default package */
public final class vfe extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cge Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfe(cge cge, Continuation continuation) {
        super(2, continuation);
        this.Y = cge;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vfe) n((v6f) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vfe vfe = new vfe(this.Y, continuation);
        vfe.X = obj;
        return vfe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        v6f v6f = (v6f) this.X;
        String str = this.Y.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "uploadFile: " + v6f, (Throwable) null);
        }
        return e5f.a;
    }
}
