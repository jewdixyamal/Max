package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rw5  reason: default package */
public final class rw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rw5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rw5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rw5 rw5 = new rw5(continuation, this.Y);
        rw5.X = obj;
        return rw5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = FoldersPickerScreen.s0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        if (list == null || !list.isEmpty()) {
            foldersPickerScreen.o.F(list, new dd4(24, foldersPickerScreen));
        } else {
            View view = foldersPickerScreen.getView();
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout != null) {
                bc7 bc7 = FoldersPickerScreen.s0[4];
                ti3 ti3 = new ti3(0, -2);
                ti3.i = 0;
                ti3.e = 0;
                ti3.h = 0;
                ti3.l = 0;
                ay7.a(constraintLayout, (aba) foldersPickerScreen.Z.getValue(), ti3);
            }
            bc7[] bc7Arr2 = FoldersPickerScreen.s0;
            ((RecyclerView) foldersPickerScreen.X.T0(foldersPickerScreen, bc7Arr2[1])).setVisibility(8);
            ((OneMeButton) foldersPickerScreen.Y.T0(foldersPickerScreen, bc7Arr2[3])).setVisibility(8);
        }
        return e5f.a;
    }
}
