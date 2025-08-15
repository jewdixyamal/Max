package one.me.calls.ui.bottomsheet.record;

import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] A0;
    public final je7 y0;
    public final je7 z0;

    static {
        hob hob = new hob(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0);
        nec.a.getClass();
        A0 = new bc7[]{hob};
    }

    public StartRecordBottomSheet(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        mr0.G(this);
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    public final void u0() {
        mr0.G(this);
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(y7a.x1);
        i4f.c.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        textView.setGravity(17);
        float f = (float) 24;
        textView.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
        textView.setText(b8a.J1);
        EditText editText = new EditText(linearLayout.getContext());
        editText.setId(y7a.u1);
        i4f.l.b(editText, du4.b);
        editText.setHintTextColor(pq9.p(editText).c.getText().g);
        editText.setTextColor(pq9.p(editText).c.getText().e);
        float f2 = (float) 16;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        editText.setPadding(G, G, G, G);
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        editText.setInputType(524288);
        m31 m31 = ((la1) ((xzd) this.z0.getValue()).b.C0.a.getValue()).f;
        editText.setHint(m31 != null ? m31.b : null);
        editText.setClipToOutline(true);
        editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        editText.setOutlineProvider(new ix3((float) tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        editText.setBackgroundColor(pq9.p(editText).c.b().a.h);
        lk3 lk3 = new lk3(linearLayout.getContext(), (AttributeSet) null);
        lk3.setId(y7a.v1);
        lk3.setPadding(0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0, tu0.G(f * fk4.d().getDisplayMetrics().density));
        lk3.setName(b8a.F1);
        lk3.setMessage(lk3.getContext().getString(b8a.E1));
        lk3.setCustomTheme(pq9.p(lk3).c);
        lk3.O(0, "", e9f.c(woc.T1).toString());
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(y7a.w1);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        oneMeButton.setText(b8a.I1);
        tu0.K(oneMeButton, 300, new v7d(this, 7, editText));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(lk3, -1, -2);
        linearLayout.addView(oneMeButton, -1, -2);
        return linearLayout;
    }

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7 = A0[0];
        this.y0 = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, (k56) null);
        this.z0 = createViewModelLazy(xzd.class, new nhd(6, new rzd(1, this)));
    }
}
