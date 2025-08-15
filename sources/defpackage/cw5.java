package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: cw5  reason: default package */
public final class cw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cw5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cw5 cw5 = new cw5(continuation, this.Y);
        cw5.X = obj;
        return cw5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            bv5.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
