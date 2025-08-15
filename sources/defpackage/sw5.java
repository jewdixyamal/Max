package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: sw5  reason: default package */
public final class sw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sw5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sw5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sw5 sw5 = new sw5(continuation, this.Y);
        sw5.X = obj;
        return sw5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Set set = (Set) this.X;
        bc7[] bc7Arr = FoldersPickerScreen.s0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        ((RecyclerView) foldersPickerScreen.X.T0(foldersPickerScreen, FoldersPickerScreen.s0[1])).invalidate();
        return e5f.a;
    }
}
