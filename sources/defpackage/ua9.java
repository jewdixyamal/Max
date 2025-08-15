package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: ua9  reason: default package */
public final class ua9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wa9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ua9(wa9 wa9, Continuation continuation) {
        super(2, continuation);
        this.Y = wa9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ua9) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ua9 ua9 = new ua9(this.Y, continuation);
        ua9.X = obj;
        return ua9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        eca eca = this.Y.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null) {
            eca.getClass();
            if (ir6.c()) {
                ir6.d(us7.X, "OneMeInitialDataStorage", zr6.h(list.size(), "updateMiniChats by count: "), (Throwable) null);
            }
        }
        ((AtomicReference) ((na9) eca.b.getValue()).c).set(list);
        ((na9) eca.b.getValue()).G();
        return e5f.a;
    }
}
