package defpackage;

import android.util.AttributeSet;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: mw5  reason: default package */
public final /* synthetic */ class mw5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ mw5(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final Object invoke() {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = FoldersPickerScreen.s0;
                foldersPickerScreen.getClass();
                bc7 bc7 = FoldersPickerScreen.s0[0];
                return new yw5(((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue());
            default:
                bc7[] bc7Arr2 = FoldersPickerScreen.s0;
                aba aba = new aba(foldersPickerScreen.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O);
                aba.setTitle(new eqe(qba.p));
                aba.x(aba.getContext().getString(qba.m), new ow5(foldersPickerScreen, 1));
                return aba;
        }
    }
}
