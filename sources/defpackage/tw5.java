package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: tw5  reason: default package */
public final class tw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tw5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tw5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tw5 tw5 = new tw5(continuation, this.Y);
        tw5.X = obj;
        return tw5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = FoldersPickerScreen.s0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        ((OneMeButton) foldersPickerScreen.Y.T0(foldersPickerScreen, FoldersPickerScreen.s0[3])).setEnabled(booleanValue);
        return e5f.a;
    }
}
