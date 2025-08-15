package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ly6  reason: default package */
public final class ly6 extends ffe implements a66 {
    public final /* synthetic */ ArrayList X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly6(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.X = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ly6) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ly6(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(0));
        }
        return e5f.a;
    }
}
