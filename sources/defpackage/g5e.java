package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: g5e  reason: default package */
public final /* synthetic */ class g5e implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSearchScreen b;

    public /* synthetic */ g5e(StickersSearchScreen stickersSearchScreen, int i) {
        this.a = i;
        this.b = stickersSearchScreen;
    }

    public final Object invoke() {
        StickersSearchScreen stickersSearchScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickersSearchScreen.u0;
                stickersSearchScreen.getClass();
                bc7 bc7 = StickersSearchScreen.u0[0];
                long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                e5e e5e = e5e.a;
                return new q5e(longValue, e5e.getAccessor().d(y4e.class), new bod(e5e.getAccessor().d(o2e.class), e5e.getAccessor().d(b6e.class)), e5e.getAccessor().d(s8g.class), e5e.getAccessor().d(qe5.class), (kke) e5e.getAccessor().c(kke.class));
            case 1:
                bc7[] bc7Arr2 = StickersSearchScreen.u0;
                nfa nfa = new nfa(stickersSearchScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                nfa.setLayoutParams(layoutParams);
                nfa.setAppearance(ffa.a);
                nfa.setSize(hfa.a);
                return nfa;
            default:
                bc7[] bc7Arr3 = StickersSearchScreen.u0;
                aba aba = new aba(stickersSearchScreen.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.d));
                aba.setSubtitle(new eqe(yoc.c));
                return aba;
        }
    }
}
