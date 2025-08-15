package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.picker.FolderMemberPickerScreen;

/* renamed from: tu5  reason: default package */
public final class tu5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tu5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tu5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tu5 tu5 = new tu5(continuation, this.Y);
        tu5.X = obj;
        return tu5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = !((Set) this.X).isEmpty();
        FolderMemberPickerScreen folderMemberPickerScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.u0().setRightActions(new mka(new c01(3, folderMemberPickerScreen)));
        } else {
            bc7[] bc7Arr2 = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.u0().setRightActions(nka.a);
        }
        return e5f.a;
    }
}
