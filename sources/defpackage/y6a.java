package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: y6a  reason: default package */
public final /* synthetic */ class y6a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ OneMeButton c;

    public /* synthetic */ y6a(Context context, OneMeButton oneMeButton, int i) {
        this.a = i;
        this.b = context;
        this.c = oneMeButton;
    }

    public final Object invoke() {
        OneMeButton oneMeButton = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = OneMeButton.B0;
                nfa nfa = new nfa(context);
                nfa.setId(xoc.h);
                nfa.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                pla.a(nfa, new q57(16, nfa, oneMeButton));
                br7.b(oneMeButton, nfa, Integer.valueOf(oneMeButton.getChildCount()));
                return nfa;
            default:
                bc7[] bc7Arr2 = OneMeButton.B0;
                caa caa = new caa(context);
                int i = xoc.f;
                caa.setId(i);
                oneMeButton.addView(caa, oneMeButton.b(i));
                return caa;
        }
    }
}
