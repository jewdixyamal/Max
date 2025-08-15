package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wt5  reason: default package */
public final class wt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wt5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wt5) n((zt5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wt5 wt5 = new wt5(this.Y, continuation);
        wt5.X = obj;
        return wt5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zt5 zt5 = (zt5) this.X;
        boolean z = zt5 instanceof xt5;
        ska ska = nka.a;
        FolderEditScreen folderEditScreen = this.Y;
        if (z) {
            FolderEditScreen.m0(folderEditScreen).setTitle(qba.k);
            bc7[] bc7Arr = FolderEditScreen.s0;
            bc7 bc7 = bc7Arr[3];
            q7c q7c = folderEditScreen.Z;
            ((OneMeButton) q7c.T0(folderEditScreen, bc7)).setVisibility(0);
            ((OneMeButton) q7c.T0(folderEditScreen, bc7Arr[3])).setEnabled(((xt5) zt5).b);
            FolderEditScreen.m0(folderEditScreen).setRightActions(ska);
        } else if (zt5 instanceof yt5) {
            FolderEditScreen.m0(folderEditScreen).setTitle(qba.l);
            ((OneMeButton) folderEditScreen.Z.T0(folderEditScreen, FolderEditScreen.s0[3])).setVisibility(8);
            cla m0 = FolderEditScreen.m0(folderEditScreen);
            if (((yt5) zt5).c) {
                ska = new mka(new ut5(folderEditScreen, 1));
            }
            m0.setRightActions(ska);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
