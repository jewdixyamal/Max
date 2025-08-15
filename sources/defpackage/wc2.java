package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: wc2  reason: default package */
public final /* synthetic */ class wc2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xc2 c;

    public /* synthetic */ wc2(Context context, xc2 xc2, int i) {
        this.a = i;
        this.b = context;
        this.c = xc2;
    }

    public final Object invoke() {
        xc2 xc2 = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView.setId(wea.I);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                appCompatTextView.setTextAlignment(2);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setVisibility(8);
                kqe kqe = os2.a;
                i4f.j.b(appCompatTextView, du4.b);
                appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
                ay7.b(xc2, appCompatTextView, -1);
                return appCompatTextView;
            default:
                nfa nfa = new nfa(context);
                nfa.setId(xoc.h);
                pla.a(nfa, new re(8, nfa, nfa));
                nfa.setSize(jfa.a);
                nfa.setVisibility(0);
                xc2.addView(nfa);
                return nfa;
        }
    }
}
