package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: z6e  reason: default package */
public final /* synthetic */ class z6e implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersShowcaseScreen b;

    public /* synthetic */ z6e(StickersShowcaseScreen stickersShowcaseScreen, int i) {
        this.a = i;
        this.b = stickersShowcaseScreen;
    }

    public final Object invoke() {
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickersShowcaseScreen.v0;
                stickersShowcaseScreen.getClass();
                bc7 bc7 = StickersShowcaseScreen.v0[0];
                long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                x6e x6e = x6e.a;
                Class<kke> cls = kke.class;
                return new i7e(longValue, (b6e) x6e.getAccessor().d(b6e.class).getValue(), (kke) x6e.getAccessor().c(cls), new g6e(x6e.getAccessor().d(a4e.class), x6e.getAccessor().d(y4e.class), (kke) x6e.getAccessor().c(cls)), x6e.getAccessor().d(sc5.class), x6e.getAccessor().d(s8g.class), x6e.getAccessor().d(qe5.class));
            case 1:
                bc7[] bc7Arr2 = StickersShowcaseScreen.v0;
                nfa nfa = new nfa(stickersShowcaseScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                nfa.setLayoutParams(layoutParams);
                nfa.setAppearance(ffa.a);
                nfa.setSize(ifa.a);
                return nfa;
            default:
                bc7[] bc7Arr3 = StickersShowcaseScreen.v0;
                aba aba = new aba(stickersShowcaseScreen.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.d));
                aba.setSubtitle(new eqe(yoc.c));
                return aba;
        }
    }
}
