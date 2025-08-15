package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: xc1  reason: default package */
public final class xc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xc1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xc1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xc1 xc1 = new xc1(continuation, this.Y);
        xc1.X = obj;
        return xc1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rc1 rc1 = (rc1) this.X;
        b46 b46 = CallLinkInfoScreen.B0;
        CallLinkInfoScreen callLinkInfoScreen = this.Y;
        callLinkInfoScreen.getClass();
        bc7[] bc7Arr = CallLinkInfoScreen.C0;
        ((TextView) callLinkInfoScreen.u0.T0(callLinkInfoScreen, bc7Arr[3])).setText(rc1.e.b(callLinkInfoScreen.getContext()));
        callLinkInfoScreen.z0.E(rc1.f);
        cla cla = (cla) callLinkInfoScreen.t0.T0(callLinkInfoScreen, bc7Arr[2]);
        CharSequence b = rc1.e.b(callLinkInfoScreen.getContext());
        if (b == null) {
            b = "";
        }
        cla.setTitle(b);
        s5a s5a = (s5a) callLinkInfoScreen.x0.T0(callLinkInfoScreen, bc7Arr[6]);
        int i = s5a.K0;
        uc0 uc0 = rc1.b;
        s5a.g(uc0, true);
        s5a.setAvatarUrl(rc1.a);
        if (uc0 == null) {
            s5a.setCustomPlaceholder((rd0) callLinkInfoScreen.o.getValue());
            s5a.setCustomOverlay((od0) null);
        } else {
            s5a.setCustomPlaceholder((rd0) null);
            s5a.setCustomOverlay((od0) callLinkInfoScreen.X.getValue());
        }
        TextView textView = (TextView) callLinkInfoScreen.v0.T0(callLinkInfoScreen, bc7Arr[4]);
        qc1 qc1 = rc1.d;
        if (qc1 instanceof pc1) {
            aof aof = callLinkInfoScreen.y0;
            if (aof != null) {
                textView.removeTextChangedListener(aof);
                textView.removeOnAttachStateChangeListener(aof);
                h2a h2a = textView instanceof h2a ? (h2a) textView : null;
                if (h2a != null) {
                    h2a.setObserverSpanListener((aof) null);
                }
            }
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setMaxLines(1);
            textView.setOnLongClickListener(new zl0(1, callLinkInfoScreen));
        } else {
            if (callLinkInfoScreen.y0 == null) {
                callLinkInfoScreen.y0 = np8.n(textView);
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize((TextUtils.TruncateAt) null);
            textView.setOnLongClickListener(new z20(2));
        }
        tu0.K(textView, 300, new tb((Object) rc1, 3, (Object) callLinkInfoScreen));
        textView.setText(qc1.getText().b(textView.getContext()));
        OneMeButton oneMeButton = (OneMeButton) callLinkInfoScreen.w0.T0(callLinkInfoScreen, bc7Arr[5]);
        mc1 mc1 = rc1.g;
        oneMeButton.setVisibility(mc1 != null ? 0 : 8);
        if (mc1 != null) {
            oneMeButton.setMode(mc1.a());
            oneMeButton.setText(mc1.getTitle().b(oneMeButton.getContext()));
            tu0.K(oneMeButton, 300, new tb((Object) callLinkInfoScreen, 4, (Object) mc1));
        }
        return e5f.a;
    }
}
