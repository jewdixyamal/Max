package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wb1  reason: default package */
public final /* synthetic */ class wb1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ wb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final Object invoke() {
        fnc fnc = fnc.a;
        pq9 pq9 = qp4.u0;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
                return new rg1(new khe(new wb1(callJoinLinkPreviewWidget, 4)), new l5g(callJoinLinkPreviewWidget, 0));
            case 1:
                bc7[] bc7Arr2 = CallJoinLinkPreviewWidget.B0;
                OneMeButton oneMeButton = new OneMeButton(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                oneMeButton.setId(View.generateViewId());
                oneMeButton.setText(b8a.b0);
                oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.o);
                tu0.K(oneMeButton, 300, new yb1(callJoinLinkPreviewWidget, 1));
                return oneMeButton;
            case 2:
                bc7[] bc7Arr3 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.Z);
            case 3:
                bc7[] bc7Arr4 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.a0);
            case 4:
                bc7[] bc7Arr5 = CallJoinLinkPreviewWidget.B0;
                return callJoinLinkPreviewWidget.getRouter();
            case 5:
                bc7[] bc7Arr6 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.C0);
            case 6:
                bc7[] bc7Arr7 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.E0);
            case 7:
                bc7[] bc7Arr8 = CallJoinLinkPreviewWidget.B0;
                TextView textView = new TextView(callJoinLinkPreviewWidget.getContext());
                textView.setId(y7a.b0);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setText(b8a.c0);
                i4f.j.b(textView, du4.b);
                textView.setTextColor(pq9.p(textView).c.getText().e);
                return textView;
            case 8:
                bc7[] bc7Arr9 = CallJoinLinkPreviewWidget.B0;
                knc knc = new knc(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                knc.setId(y7a.Z);
                knc.setContentDescription(knc.getContext().getString(b8a.F));
                knc.y(x7a.F, pq9.p(knc).c.getIcon().f);
                tu0.K(knc, 300, new yb1(callJoinLinkPreviewWidget, 0));
                float f = (float) 40;
                knc.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                knc.setButtonPadding(tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density));
                knc.setMode(fnc);
                return knc;
            case 9:
                bc7[] bc7Arr10 = CallJoinLinkPreviewWidget.B0;
                yia yia = new yia(callJoinLinkPreviewWidget.getContext());
                yia.setId(y7a.a0);
                yia.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return yia;
            case 10:
                bc7[] bc7Arr11 = CallJoinLinkPreviewWidget.B0;
                knc knc2 = new knc(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                knc2.setId(y7a.c0);
                knc2.setAccessibility(Integer.valueOf(b8a.a0));
                knc2.setTextColor(pq9.p(knc2).c.getText().e);
                knc2.setListener(new xb1(callJoinLinkPreviewWidget, 0));
                knc2.setMode(fnc);
                knc2.y(x7a.Y, pq9.p(knc2).c.getIcon().f);
                float f2 = (float) 54;
                knc2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                knc2.setButtonPadding(tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
                return knc2;
            default:
                bc7[] bc7Arr12 = CallJoinLinkPreviewWidget.B0;
                knc knc3 = new knc(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                knc3.setId(y7a.f0);
                knc3.y(x7a.B0, pq9.p(knc3).c.getIcon().f);
                knc3.setAccessibility(Integer.valueOf(b8a.d0));
                knc3.setTextColor(pq9.p(knc3).c.getText().e);
                knc3.setMode(fnc);
                knc3.setListener(new xb1(callJoinLinkPreviewWidget, 1));
                float f3 = (float) 54;
                knc3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                knc3.setButtonPadding(tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
                return knc3;
        }
    }
}
