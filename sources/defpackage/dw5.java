package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: dw5  reason: default package */
public final class dw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dw5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dw5 dw5 = new dw5(continuation, this.Y);
        dw5.X = obj;
        return dw5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = FoldersListScreen.Z;
        FoldersListScreen foldersListScreen = this.Y;
        foldersListScreen.getClass();
        ((aw5) ((RecyclerView) foldersListScreen.Y.T0(foldersListScreen, FoldersListScreen.Z[0])).getAdapter()).F((List) this.X, new re(21, foldersListScreen));
        return e5f.a;
    }
}
