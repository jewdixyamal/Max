package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;

/* renamed from: uu5  reason: default package */
public final class uu5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uu5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uu5) n((qu5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uu5 uu5 = new uu5(continuation, this.Y);
        uu5.X = obj;
        return uu5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qu5 qu5 = (qu5) this.X;
        if (qu5 instanceof qu5) {
            bc7[] bc7Arr = FolderMemberPickerScreen.y0;
            FolderMemberPickerScreen folderMemberPickerScreen = this.Y;
            folderMemberPickerScreen.getClass();
            bc7[] bc7Arr2 = FolderMemberPickerScreen.y0;
            bc7 bc7 = bc7Arr2[1];
            fs fsVar = folderMemberPickerScreen.x0;
            if (!w9e.C0((String) fsVar.a(folderMemberPickerScreen))) {
                znc router = folderMemberPickerScreen.getRouter();
                bc7 bc72 = bc7Arr2[1];
                uu3 g = router.g((String) fsVar.a(folderMemberPickerScreen));
                dv5 dv5 = g instanceof dv5 ? (dv5) g : null;
                if (dv5 != null) {
                    Set set = qu5.a;
                    nu5 n0 = ((FolderEditScreen) dv5).n0();
                    n0.C0.o1(n0, nu5.D0[1], j47.S(n0.a, ((w9a) n0.o).b(), vx3.b, new gu5(n0, set, (Continuation) null)));
                }
            }
            folderMemberPickerScreen.getRouter().C();
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
