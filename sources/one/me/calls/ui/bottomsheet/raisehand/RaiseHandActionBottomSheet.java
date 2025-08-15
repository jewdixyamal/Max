package one.me.calls.ui.bottomsheet.raisehand;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/raisehand/RaiseHandActionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lgg1;", "opponentId", "(Ljava/lang/String;Lgg1;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class RaiseHandActionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] B0;
    public final q7c A0;
    public final je7 y0;
    public final q7c z0;

    static {
        Class<RaiseHandActionBottomSheet> cls = RaiseHandActionBottomSheet.class;
        hob hob = new hob(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oec = nec.a;
        B0 = new bc7[]{hob, zr6.e(oec, cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), zr6.f(cls, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec)};
    }

    public RaiseHandActionBottomSheet(String str, gg1 gg1, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("opponent_id", gg1)));
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((i4c) this.y0.getValue()).o, new h4c(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(y7a.j1);
        i4f.c.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        textView.setGravity(17);
        float f = (float) 24;
        textView.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, 0);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(y7a.i1);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9.p(textView2).c.getText().g);
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(y7a.g1);
        z6a z6a = z6a.c;
        oneMeButton.setAppearance(z6a);
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        oneMeButton.setMode(b7a.b);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        oneMeButton.setText(b8a.r1);
        tu0.K(oneMeButton, 300, new g4c(this, 0));
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setId(y7a.h1);
        oneMeButton2.setAppearance(z6a);
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a.a);
        oneMeButton2.setCustomTheme(pq9.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.s1);
        tu0.K(oneMeButton2, 300, new g4c(this, 1));
        constraintLayout.addView(textView, -1, -2);
        constraintLayout.addView(textView2, -1, -2);
        constraintLayout.addView(oneMeButton2, 0, -2);
        constraintLayout.addView(oneMeButton, 0, -2);
        dj3 q = fp3.q(constraintLayout);
        int id = textView.getId();
        q.d(id, 3, 0, 3);
        au1.p((float) 16, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 7, 0, 7);
        q.d(id, 6, 0, 6);
        q.d(id, 4, textView2.getId(), 3);
        q.g(id).d.W = 2;
        int id2 = textView2.getId();
        q.d(id2, 3, textView.getId(), 4);
        float f2 = (float) 4;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 7, 0, 7);
        q.d(id2, 6, 0, 6);
        q.d(id2, 4, oneMeButton2.getId(), 3);
        int id3 = oneMeButton2.getId();
        q.d(id3, 3, textView2.getId(), 4);
        new l2a(q, 3, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.d(id3, 7, oneMeButton.getId(), 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 4, 0, 3);
        int id4 = oneMeButton.getId();
        q.d(id4, 3, oneMeButton2.getId(), 3);
        q.d(id4, 7, 0, 7);
        q.d(id4, 6, oneMeButton2.getId(), 7);
        new l2a(q, 6, id4, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id4, 4, oneMeButton2.getId(), 4);
        q.a(constraintLayout);
        return constraintLayout;
    }

    public RaiseHandActionBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = createViewModelLazy(i4c.class, new jp8(22, new eh2(bundle, 9)));
        this.z0 = viewBinding(y7a.j1);
        this.A0 = viewBinding(y7a.i1);
        viewBinding(y7a.h1);
        viewBinding(y7a.g1);
    }
}
