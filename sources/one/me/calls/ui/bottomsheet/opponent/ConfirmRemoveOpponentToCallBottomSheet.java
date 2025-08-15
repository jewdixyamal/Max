package one.me.calls.ui.bottomsheet.opponent;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmRemoveOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lgg1;", "opponentId", "", "bottomSnackbarMargin", "(Lgg1;I)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class ConfirmRemoveOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int B0 = 0;
    public final je7 A0;
    public final je7 y0;
    public final je7 z0;

    public ConfirmRemoveOpponentToCallBottomSheet(Bundle bundle) {
        super((Bundle) null, 1, (z84) null);
        this.y0 = createViewModelLazy(cg3.class, new ti2(27, new yf3(bundle, 0, this)));
        this.z0 = tu0.r(3, new zf3(0));
        this.A0 = tu0.r(3, new eh2(bundle, 1));
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((cg3) this.y0.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new ag3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(y7a.N0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.c.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(0, tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), 0, 0);
        textView.setText(b8a.Q0);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(y7a.M0);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9.p(textView2).c.getText().g);
        textView2.setGravity(17);
        Context context = textView2.getContext();
        int i = b8a.P0;
        cg3 cg3 = (cg3) this.y0.getValue();
        fqa fqa = (fqa) ((pqa) ((w7c) cg3.c.e()).a.getValue()).c.get(cg3.b);
        String name = fqa != null ? fqa.b.getName() : null;
        if (name == null) {
            name = "";
        }
        textView2.setText(context.getString(i, new Object[]{name}));
        constraintLayout.addView(textView2);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(y7a.L0);
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        z6a z6a = z6a.c;
        oneMeButton.setAppearance(z6a);
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        oneMeButton.setText(b8a.O0);
        tu0.K(oneMeButton, 300, new xf3(this, 0));
        constraintLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setId(y7a.K0);
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        oneMeButton2.setAppearance(z6a);
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setCustomTheme(pq9.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.N0);
        tu0.K(oneMeButton2, 300, new xf3(this, 1));
        constraintLayout.addView(oneMeButton2);
        dj3 q = fp3.q(constraintLayout);
        int id = textView.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 7, 0, 7);
        q.d(id, 6, 0, 6);
        q.d(id, 4, textView2.getId(), 3);
        new l2a(q, 4, id, 4).e(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        q.g(id).d.W = 2;
        int id2 = textView2.getId();
        q.d(id2, 3, textView.getId(), 4);
        q.d(id2, 7, 0, 7);
        q.d(id2, 6, 0, 6);
        q.d(id2, 4, oneMeButton2.getId(), 3);
        new l2a(q, 4, id2, 4).e(tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density));
        int id3 = oneMeButton.getId();
        q.d(id3, 3, textView2.getId(), 4);
        q.d(id3, 7, oneMeButton2.getId(), 6);
        float f = (float) 4;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 4, 0, 3);
        int id4 = oneMeButton2.getId();
        q.d(id4, 3, oneMeButton.getId(), 3);
        q.d(id4, 7, 0, 7);
        q.d(id4, 6, oneMeButton.getId(), 7);
        new l2a(q, 6, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.d(id4, 4, oneMeButton.getId(), 4);
        q.a(constraintLayout);
        return constraintLayout;
    }

    public ConfirmRemoveOpponentToCallBottomSheet(gg1 gg1, int i) {
        this(dy7.g(new kpa("opponent_id", gg1), new kpa("bottom_snackbar_margin", Integer.valueOf(i))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet(gg1 gg1, int i, int i2, z84 z84) {
        this(gg1, (i2 & 2) != 0 ? 0 : i);
    }
}
