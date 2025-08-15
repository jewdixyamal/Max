package defpackage;

import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: mp9  reason: default package */
public final class mp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mp9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mp9 mp9 = new mp9(continuation, this.Y);
        mp9.X = obj;
        return mp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ro9 ro9 = (ro9) this.X;
        Integer num = ro9.b;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (num != null && num.intValue() >= 0) {
            bc7[] bc7Arr = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.n0().E0();
            neuroAvatarsScreen.J0.c = true;
            dp9 dp9 = new dp9(neuroAvatarsScreen.getContext(), 0);
            dp9.a = num.intValue();
            a layoutManager = neuroAvatarsScreen.n0().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.J0(dp9);
            }
        }
        int i = ro9.a;
        if (i >= 0) {
            bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
            if (neuroAvatarsScreen.q0().getSelectedTabPosition() != i) {
                neuroAvatarsScreen.q0().stopNestedScroll();
                eje h = neuroAvatarsScreen.q0().h(i);
                if (h != null) {
                    TabLayout tabLayout = h.f;
                    if (tabLayout != null) {
                        tabLayout.o(h, true);
                    } else {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                }
            }
        }
        return e5f.a;
    }
}
