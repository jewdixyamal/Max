package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.coroutines.Continuation;
import ru.ok.TamBottomSheetDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: bke  reason: default package */
public final class bke extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ TamBottomSheetDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bke(TamBottomSheetDialogFragment tamBottomSheetDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = tamBottomSheetDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bke) n((sme) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bke bke = new bke(this.Y, continuation);
        bke.X = obj;
        return bke;
    }

    public final Object o(Object obj) {
        Window window;
        od2.a0(obj);
        sme sme = (sme) this.X;
        TamBottomSheetDialogFragment tamBottomSheetDialogFragment = this.Y;
        Dialog dialog = tamBottomSheetDialogFragment.w1;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(sme.c ? systemUiVisibility & -17 : systemUiVisibility | 16);
            window.setNavigationBarColor(sme.H);
        }
        View view = tamBottomSheetDialogFragment.U0;
        ViewGroup viewGroup = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundTintList(ColorStateList.valueOf(sme.m));
        }
        ((ScheduledSendPickerDialogFragment) tamBottomSheetDialogFragment).z(sme);
        return e5f.a;
    }
}
