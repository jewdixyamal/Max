package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: l96  reason: default package */
public final class l96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z96 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l96(z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Y = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l96) n((kpa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l96 l96 = new l96(this.Y, continuation);
        l96.X = obj;
        return l96;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kpa kpa = (kpa) this.X;
        List list = (List) kpa.b;
        int size = list.size();
        hm9.m("z96", "got album and items, items size = " + size, new Object[0]);
        z96 z96 = this.Y;
        z96.z0.m((Object) null, Boolean.FALSE);
        z96.B0.setValue((b86) kpa.a);
        z96.w0.m((Object) null, list);
        return e5f.a;
    }
}
