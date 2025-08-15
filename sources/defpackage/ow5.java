package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: ow5  reason: default package */
public final /* synthetic */ class ow5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ ow5(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final void onClick(View view) {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = FoldersPickerScreen.s0;
                yw5 m0 = foldersPickerScreen.m0();
                m0.getClass();
                lx3 plus = xq9.a.plus(((w9a) m0.X).b());
                xw5 xw5 = new xw5(m0, (Continuation) null);
                j47.S(m0.a, plus, vx3.c, xw5);
                foldersPickerScreen.getRouter().C();
                return;
            default:
                bc7[] bc7Arr2 = FoldersPickerScreen.s0;
                bv5 bv5 = bv5.c;
                foldersPickerScreen.getClass();
                bc7 bc7 = FoldersPickerScreen.s0[0];
                long longValue = ((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue();
                bv5.P1().d();
                f64 P1 = bv5.P1();
                P1.b(":settings/folder/create?chat_id=" + longValue, (Bundle) null);
                return;
        }
    }
}
