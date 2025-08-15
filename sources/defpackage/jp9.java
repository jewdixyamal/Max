package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: jp9  reason: default package */
public final class jp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jp9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jp9 jp9 = new jp9(continuation, this.Y);
        jp9.X = obj;
        return jp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k4d k4d = (k4d) this.X;
        j4d j4d = k4d.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (j4d != null) {
            bc7[] bc7Arr = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.p0().setAvatarUrl(k4d.a.a());
        } else {
            bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.p0().setCloseBadgeVisibility(false);
            i2b i2b = i2b.a;
            l2b l2b = k4d.b;
            if (tpa.f(l2b, i2b)) {
                neuroAvatarsScreen.p0().setAvatarUrl((String) null);
                s5a.j(neuroAvatarsScreen.p0(), (Drawable) neuroAvatarsScreen.L0.getValue(), (m5a) null, 30);
            } else if (l2b instanceof h2b) {
                h2b h2b = (h2b) l2b;
                s5a.i(neuroAvatarsScreen.p0(), (String) null, new Long(h2b.b), h2b.a);
            } else if (l2b instanceof k2b) {
                neuroAvatarsScreen.p0().setAvatarUrl(((k2b) l2b).a);
            } else if (l2b instanceof j2b) {
                neuroAvatarsScreen.p0().setAvatarUrl(((j2b) l2b).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
