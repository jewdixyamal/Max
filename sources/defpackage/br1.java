package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: br1  reason: default package */
public final class br1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ir1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br1(ir1 ir1, Continuation continuation) {
        super(2, continuation);
        this.Y = ir1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((br1) n((gg1) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        br1 br1 = new br1(this.Y, continuation);
        br1.X = obj;
        return br1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gg1 gg1 = (gg1) this.X;
        ir1 ir1 = this.Y;
        if (ir1.c().h) {
            ir1.i(gg1, true);
        } else {
            ir1.j(ir1.d().a.getId());
        }
        return e5f.a;
    }
}
