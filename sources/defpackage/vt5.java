package defpackage;

import android.os.Bundle;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;

/* renamed from: vt5  reason: default package */
public final class vt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vt5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vt5) n((qt5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vt5 vt5 = new vt5(this.Y, continuation);
        vt5.X = obj;
        return vt5;
    }

    public final Object o(Object obj) {
        xx6 xx6;
        od2.a0(obj);
        qt5 qt5 = (qt5) this.X;
        boolean z = qt5 instanceof nt5;
        e5f e5f = e5f.a;
        FolderEditScreen folderEditScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = FolderEditScreen.s0;
            folderEditScreen.o0();
            folderEditScreen.getRouter().C();
            if (((nt5) qt5).a && (xx6 = (xx6) xv5.a.getAccessor().e()) != null) {
                xx6.f(Collections.singleton(new wx6(ux6.CREATE_FOLDER, 1)), wuc.SETTINGS_FOLDERS);
            }
        } else if (qt5 instanceof pt5) {
            String str = ((coc) x53.p0(folderEditScreen.getRouter().e())).b;
            if (str == null) {
                return e5f;
            }
            folderEditScreen.o0();
            bv5.c.P1().b(rh4.k(":settings/folder/members-picker?tag=", str, "&members_ids=", x53.n0(((pt5) qt5).a, ",", (String) null, (String) null, (m56) null, 62)), (Bundle) null);
        } else if (qt5 instanceof ot5) {
            bc7[] bc7Arr2 = FolderEditScreen.s0;
            nd7.S(String.valueOf(((zt5) folderEditScreen.n0().u0.a.getValue()).a()), folderEditScreen);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
