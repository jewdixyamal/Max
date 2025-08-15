package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: sz5  reason: default package */
public final class sz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz5(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
        this.Z = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sz5) n((uy8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sz5 sz5 = new sz5(this.Y, (ViewGroup) this.Z, continuation);
        sz5.X = obj;
        return sz5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        uy8 uy8 = (uy8) this.X;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        znc znc = forwardPickerScreen.E0;
        if (znc != null) {
            int s = au1.s(uy8.a);
            View view = this.Z;
            if (s == 0) {
                hc8 hc8 = forwardPickerScreen.G0;
                if (hc8 != null) {
                    bc7[] bc7Arr = hc8.m;
                    hc8.e(true);
                }
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                br7.d(view, ForwardPickerScreen.J0, (m56) null);
            } else if (s == 1) {
                if (!znc.n()) {
                    znc.R(i24.e(new MediaKeyboardWidget(forwardPickerScreen.b, 0, true, 2, (z84) null), (zu3) null, (zu3) null));
                }
                WeakHashMap weakHashMap = zmf.a;
                omf.u(view, (y2a) null);
                hc8 hc82 = forwardPickerScreen.G0;
                if (hc82 != null) {
                    hc82.f();
                }
                forwardPickerScreen.y0().setLeftIcon(woc.e1);
            } else if (s == 2) {
                qm0 qm0 = ((ForwardPickerScreen) forwardPickerScreen.F0.b).A0;
                if (qm0.a()) {
                    ((sv8) qm0.getValue()).e(true);
                }
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                od2.L(new zn5(od2.Z(new t03(vc7.f, 12), 1), new vz5((ViewGroup) view, (Continuation) null), 5), forwardPickerScreen.getViewLifecycleScope());
            }
        }
        return e5f.a;
    }
}
