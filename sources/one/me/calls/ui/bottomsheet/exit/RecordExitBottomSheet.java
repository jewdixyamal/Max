package one.me.calls.ui.bottomsheet.exit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lccc;", "openType", "", "enableRecordInCall", "(Lccc;Ljava/lang/Boolean;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final qm0 A0;
    public final qm0 B0;
    public final qm0 C0;
    public final qm0 D0;
    public final qm0 E0;
    public final qm0 F0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<RecordExitBottomSheet> cls = RecordExitBottomSheet.class;
        hob hob = new hob(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oec = nec.a;
        G0 = new bc7[]{hob, zr6.e(oec, cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), zr6.f(cls, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, oec), zr6.f(cls, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0, oec)};
    }

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = tu0.r(3, new bcc(this, 0));
        this.z0 = createViewModelLazy(kcc.class, new jp8(24, new eh2(bundle, 10)));
        this.A0 = binding(new bcc(this, 1));
        this.B0 = binding(new bcc(this, 2));
        this.C0 = binding(new bcc(this, 3));
        this.D0 = binding(new bcc(this, 4));
        this.E0 = binding(new bcc(this, 5));
        this.F0 = binding(new bcc(this, 6));
    }

    public final yz2 A0() {
        bc7 bc7 = G0[5];
        return (yz2) this.F0.getValue();
    }

    public final OneMeButton B0() {
        bc7 bc7 = G0[2];
        return (OneMeButton) this.C0.getValue();
    }

    public final OneMeButton C0() {
        bc7 bc7 = G0[3];
        return (OneMeButton) this.D0.getValue();
    }

    public final ufd D0() {
        bc7 bc7 = G0[4];
        return (ufd) this.E0.getValue();
    }

    public final TextView E0() {
        bc7 bc7 = G0[1];
        return (TextView) this.B0.getValue();
    }

    public final TextView F0() {
        bc7 bc7 = G0[0];
        return (TextView) this.A0.getValue();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.z0;
        s35 s35 = ((kcc) je7.getValue()).u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new dcc((Continuation) null, this), 5), getViewLifecycleScope());
        if (((kcc) je7.getValue()).b == ccc.b) {
            od2.L(new zn5(tu0.g(((kcc) je7.getValue()).t0, getViewLifecycleOwner().Q(), fg7), new ecc((Continuation) null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(new t03(((kcc) je7.getValue()).s0, 11), getViewLifecycleOwner().Q(), fg7), new fcc((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.addView(F0(), -1, -2);
        constraintLayout.addView(E0(), -1, -2);
        constraintLayout.addView(D0(), -1, -2);
        constraintLayout.addView(B0(), 0, -2);
        constraintLayout.addView(C0(), 0, -2);
        constraintLayout.addView(A0(), 0, -2);
        dj3 q = fp3.q(constraintLayout);
        int id = F0().getId();
        q.d(id, 3, 0, 3);
        au1.p((float) 16, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 7, 0, 7);
        q.d(id, 6, 0, 6);
        q.d(id, 4, E0().getId(), 3);
        q.g(id).d.W = 2;
        int id2 = E0().getId();
        q.d(id2, 3, F0().getId(), 4);
        float f = (float) 4;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 7, 0, 7);
        q.d(id2, 6, 0, 6);
        q.d(id2, 4, D0().getId(), 3);
        int id3 = D0().getId();
        q.d(id3, 3, E0().getId(), 4);
        au1.p((float) 22, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 7, 0, 7);
        q.d(id3, 6, 0, 6);
        q.d(id3, 4, A0().getId(), 3);
        int id4 = A0().getId();
        q.d(id4, 3, D0().getId(), 4);
        float f2 = (float) 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id4, 4));
        q.d(id4, 6, 0, 6);
        new l2a(q, 6, id4, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id4, 4, B0().getId(), 3);
        int id5 = B0().getId();
        q.d(id5, 3, A0().getId(), 4);
        new l2a(q, 3, id5, 4).e(tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
        q.d(id5, 7, C0().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id5, 4));
        q.d(id5, 6, 0, 6);
        q.d(id5, 4, 0, 3);
        int id6 = C0().getId();
        q.d(id6, 3, B0().getId(), 3);
        q.d(id6, 7, 0, 7);
        q.d(id6, 6, B0().getId(), 7);
        new l2a(q, 6, id6, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.d(id6, 4, B0().getId(), 4);
        q.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordExitBottomSheet(ccc ccc, Boolean bool, int i, z84 z84) {
        this(ccc, (i & 2) != 0 ? null : bool);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecordExitBottomSheet(defpackage.ccc r3, java.lang.Boolean r4) {
        /*
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "open_type"
            java.lang.String r3 = r3.name()
            r0.putString(r1, r3)
            if (r4 == 0) goto L_0x0019
            java.lang.String r3 = "admin_record_settings"
            boolean r4 = r4.booleanValue()
            r0.putBoolean(r3, r4)
        L_0x0019:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.<init>(ccc, java.lang.Boolean):void");
    }
}
