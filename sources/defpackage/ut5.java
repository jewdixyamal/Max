package defpackage;

import android.view.View;
import one.me.folders.edit.FolderEditScreen;

/* renamed from: ut5  reason: default package */
public final /* synthetic */ class ut5 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditScreen b;

    public /* synthetic */ ut5(FolderEditScreen folderEditScreen, int i) {
        this.a = i;
        this.b = folderEditScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        FolderEditScreen folderEditScreen = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = FolderEditScreen.s0;
                folderEditScreen.o0();
                i3a onBackPressedDispatcher = folderEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                bc7[] bc7Arr2 = FolderEditScreen.s0;
                folderEditScreen.n0().u();
                folderEditScreen.o0();
                return e5f;
        }
    }
}
