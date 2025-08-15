package one.me.inviteactions.invitebyqr;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final q7c A0 = viewBinding(gca.m);
    public final je7 B0 = tu0.r(3, new es3(28, this));
    public final je7 C0 = c57.a.getAccessor().d(l67.class);
    public final je7 D0 = createViewModelLazy(h67.class, new nj4(11, new m57(1)));
    public final w4d E0 = mqd.D();
    public final khe F0 = new khe(new m57(2));
    public final q7c y0 = viewBinding(gca.l);
    public final q7c z0 = viewBinding(gca.o);

    static {
        Class<InviteByQrBottomSheet> cls = InviteByQrBottomSheet.class;
        G0 = new bc7[]{new hob(cls, "name", "getName()Landroidx/appcompat/widget/AppCompatTextView;", 0), z7b.g(nec.a, cls, "shortName", "getShortName()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(cls, "qrCode", "getQrCode()Landroidx/appcompat/widget/AppCompatImageView;", 0), new oi9(cls, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;")};
    }

    public InviteByQrBottomSheet() {
        super((Bundle) null, 1, (z84) null);
    }

    public static final AppCompatTextView A0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.y0.T0(inviteByQrBottomSheet, G0[0]);
    }

    public static final AppCompatTextView B0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.z0.T0(inviteByQrBottomSheet, G0[1]);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        x77 x77 = (x77) this.E0.T0(this, G0[3]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public final void onViewCreated(View view) {
        od2.L(new zn5(((h67) this.D0.getValue()).t0, new d67(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(gca.l);
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 18;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 20;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        appCompatTextView.setLayoutParams(layoutParams);
        i4f.B.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(gca.o);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams2.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams2);
        i4f.p.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9.j(appCompatTextView2).getText().g);
        linearLayout.addView(appCompatTextView2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(gca.m);
        float f3 = (float) 244;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        layoutParams3.topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        linearLayout.addView(appCompatImageView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(gca.n);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(yoc.e);
        tu0.K(oneMeButton, 300, new xx5(6, this));
        linearLayout.addView(oneMeButton);
        v3c.y(new xh0((Object) this, (Continuation) null, 15), linearLayout);
        return linearLayout;
    }
}
