package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lw9;", "addLinkState", "(Ljava/lang/String;Lw9;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0;
    public final w9 s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;

    static {
        Class<AddLinkBottomSheet> cls = AddLinkBottomSheet.class;
        x0 = new bc7[]{new oi9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, cls, "editText", "getEditText()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public AddLinkBottomSheet(String str, w9 w9Var, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("bottom_sheet:add_link:key", w9Var)));
    }

    public final z5b n0() {
        return new t9(this, 0);
    }

    public final x27 o0() {
        return new x27(0, new yq0(3, 3, false), 1);
    }

    public final void onViewCreated(View view) {
        ((OneMeButton) this.u0.T0(this, x0[2])).setEnabled(x0().getText().length() > 0);
        od2.L(new zn5(tu0.g(((rk7) this.w0.getValue()).c, getViewLifecycleOwner().Q(), fg7.o), new u9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 12;
        float f2 = (float) 8;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), G, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f3 = (float) 22;
        textView.setPaddingRelative(textView.getPaddingStart(), tu0.G(f3 * fk4.d().getDisplayMetrics().density), textView.getPaddingEnd(), tu0.G(fk4.d().getDisplayMetrics().density * f3));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(z7.B(getContext(), mga.p));
        i4f.d.b(textView, du4.b);
        v3c.y(new v9(3, (Continuation) null, 0), textView);
        linearLayout.addView(textView);
        cka cka = new cka(linearLayout.getContext());
        cka.setId(lga.v);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        cka.setPaddingRelative(cka.getPaddingStart(), tu0.G(fk4.d().getDisplayMetrics().density * f2), cka.getPaddingEnd(), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        int G2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        int marginStart = layoutParams2.getMarginStart();
        int i = layoutParams2.topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        layoutParams2.setMarginStart(marginStart);
        layoutParams2.topMargin = i;
        layoutParams2.setMarginEnd(marginEnd);
        layoutParams2.bottomMargin = G2;
        cka.setLayoutParams(layoutParams2);
        String str = this.s0.c;
        if (str == null) {
            rk7 rk7 = (rk7) this.w0.getValue();
            CharSequence B = tpa.B(cka.getContext());
            rk7.getClass();
            if (B == null || !((Pattern) rk7.Y.getValue()).matcher(B).matches()) {
                B = null;
            }
            if (B == null) {
                B = "";
            }
            str = B.toString();
        }
        cka.setText(str);
        cka.setBackgroundColorAttr(Integer.valueOf(wfa.M));
        cka.b(new l(4, this));
        cka.a.requestFocus();
        cka.post(new b(7, (Object) cka));
        linearLayout.addView(cka);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(lga.u);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(mga.o);
        tu0.K(oneMeButton, 300, new c5(6, (Object) this));
        linearLayout.addView(oneMeButton);
        frameLayout.addView(linearLayout, -1, -2);
        yp4 yp4 = new yp4(frameLayout.getContext());
        yp4.setTranslationY((float) rh4.c((float) 6, fk4.d().getDisplayMetrics().density, -G));
        frameLayout.addView(yp4);
    }

    public final cka x0() {
        return (cka) this.t0.T0(this, x0[1]);
    }

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        Parcelable parcelable = (Parcelable) ay7.v(bundle, "bottom_sheet:add_link:key", w9.class);
        if (parcelable != null) {
            this.s0 = (w9) parcelable;
            this.t0 = viewBinding(lga.v);
            this.u0 = viewBinding(lga.u);
            bc7 bc7 = x0[0];
            this.v0 = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, zz7.class, (k56) null);
            this.w0 = createViewModelLazy(rk7.class, new s(3, new x5(4, this)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
