package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: cqa  reason: default package */
public final /* synthetic */ class cqa implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PartialMediaAccessWidget b;

    public /* synthetic */ cqa(PartialMediaAccessWidget partialMediaAccessWidget, int i) {
        this.a = i;
        this.b = partialMediaAccessWidget;
    }

    public final Object invoke() {
        PartialMediaAccessWidget partialMediaAccessWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PartialMediaAccessWidget.o;
                LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), -2, 1.0f));
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(u8a.y);
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
                i4f.j.b(appCompatTextView, du4.b);
                v3c.y(new mb5(3, (Continuation) null, 2), appCompatTextView);
                linearLayout.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(u8a.x);
                i4f.n.b(appCompatTextView2, du4.b);
                v3c.y(new mb5(3, (Continuation) null, 3), appCompatTextView2);
                linearLayout.addView(appCompatTextView2);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                return linearLayout;
            default:
                bc7[] bc7Arr2 = PartialMediaAccessWidget.o;
                LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                linearLayout2.setVerticalGravity(16);
                bc7 bc7 = PartialMediaAccessWidget.o[0];
                linearLayout2.addView((LinearLayout) partialMediaAccessWidget.b.getValue());
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(u8a.w);
                oneMeButton.setSize(c7a.a);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.c);
                tu0.K(oneMeButton, 300, new xx5(23, partialMediaAccessWidget));
                linearLayout2.addView(oneMeButton);
                float f = (float) 12;
                float f2 = (float) 4;
                linearLayout2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                v3c.y(new o(3, (Continuation) null, 9), linearLayout2);
                return linearLayout2;
        }
    }
}
