package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: gkd  reason: default package */
public final class gkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gkd(ShareDataPickerScreen shareDataPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
        this.Z = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gkd) n((uy8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gkd gkd = new gkd(this.Y, (ViewGroup) this.Z, continuation);
        gkd.X = obj;
        return gkd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        uy8 uy8 = (uy8) this.X;
        ShareDataPickerScreen shareDataPickerScreen = this.Y;
        znc znc = shareDataPickerScreen.A0;
        if (znc != null) {
            int s = au1.s(uy8.a);
            View view = this.Z;
            if (s == 0) {
                hc8 hc8 = shareDataPickerScreen.C0;
                if (hc8 != null) {
                    bc7[] bc7Arr = hc8.m;
                    hc8.e(true);
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.a1);
                br7.d(view, ShareDataPickerScreen.E0, (m56) null);
            } else if (s == 1) {
                if (!znc.n()) {
                    znc.R(i24.e(new MediaKeyboardWidget(shareDataPickerScreen.b, 0, true, 2, (z84) null), (zu3) null, (zu3) null));
                }
                WeakHashMap weakHashMap = zmf.a;
                omf.u(view, (y2a) null);
                hc8 hc82 = shareDataPickerScreen.C0;
                if (hc82 != null) {
                    hc82.f();
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.e1);
            } else if (s == 2) {
                qm0 qm0 = ((ShareDataPickerScreen) shareDataPickerScreen.B0.b).x0;
                if (qm0.a()) {
                    ((sv8) qm0.getValue()).e(true);
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.a1);
                od2.L(new zn5(od2.Z(new ovc(vc7.f, 3), 1), new ikd((ViewGroup) view, (Continuation) null), 5), shareDataPickerScreen.getViewLifecycleScope());
            }
        }
        return e5f.a;
    }
}
