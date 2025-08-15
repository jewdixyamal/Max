package one.me.calls.ui.bottomsheet.opponent;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmAddOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class ConfirmAddOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int A0 = 0;
    public final je7 y0 = createViewModelLazy(ve3.class, new ti2(24, new hn2(27)));
    public final je7 z0 = tu0.r(3, new md1(20, this));

    public ConfirmAddOpponentToCallBottomSheet() {
        super((Bundle) null, 1, (z84) null);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        vxd vxd = ((ve3) this.y0.getValue()).X;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((ve3) this.y0.getValue()).Y, getViewLifecycleOwner().Q(), fg7.o), new te3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [yz2, android.widget.TextView, android.view.View, java.lang.Object, androidx.appcompat.widget.AppCompatCheckBox] */
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(y7a.J0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f = (float) 8;
        marginLayoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(marginLayoutParams);
        i4f.c.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(textView.getPaddingLeft(), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setText(textView.getContext().getString(b8a.M0, new Object[]{((y21) ((l31) ((ve3) this.y0.getValue()).b).k.getValue()).c}));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(y7a.I0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(marginLayoutParams2);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9.p(textView2).c.getText().g);
        textView2.setGravity(17);
        textView2.setText(b8a.L0);
        linearLayout.addView(textView2);
        ? appCompatCheckBox = new AppCompatCheckBox(linearLayout.getContext(), (AttributeSet) null);
        appCompatCheckBox.setId(y7a.F0);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.bottomMargin = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
        marginLayoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        marginLayoutParams3.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        appCompatCheckBox.setLayoutParams(marginLayoutParams3);
        appCompatCheckBox.setText(b8a.I0);
        i4f.j.b(appCompatCheckBox, du4.b);
        appCompatCheckBox.setTextColor(pq9.p(appCompatCheckBox).c.getText().e);
        je7 je7 = this.z0;
        a14.g((StateListDrawable) je7.getValue(), pq9.p(appCompatCheckBox).c);
        appCompatCheckBox.setButtonDrawable((Drawable) (StateListDrawable) je7.getValue());
        appCompatCheckBox.setPaddingBetweenCheckbox(tu0.G(f * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(appCompatCheckBox);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(y7a.H0);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams4.bottomMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(marginLayoutParams4);
        z6a z6a = z6a.c;
        oneMeButton.setAppearance(z6a);
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        oneMeButton.setText(b8a.K0);
        tu0.K(oneMeButton, 300, new tb((Object) this, 18, (Object) appCompatCheckBox));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setId(y7a.G0);
        oneMeButton2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        oneMeButton2.setAppearance(z6a);
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setCustomTheme(pq9.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.J0);
        tu0.K(oneMeButton2, 300, new c5(20, (Object) this));
        linearLayout.addView(oneMeButton2);
        return linearLayout;
    }
}
