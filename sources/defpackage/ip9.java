package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: ip9  reason: default package */
public final class ip9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ip9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ip9 ip9 = new ip9(continuation, this.Y);
        ip9.X = obj;
        return ip9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ed0 ed0 = (ed0) this.X;
        boolean f = tpa.f(ed0, bd0.a);
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (f) {
            bc7[] bc7Arr = NeuroAvatarsScreen.M0;
            ((eua) neuroAvatarsScreen.z0.getValue()).g(new l5g(neuroAvatarsScreen, 1));
        } else if (ed0 instanceof cd0) {
            try {
                neuroAvatarsScreen.startActivityForResult(((cd0) ed0).a, 555);
                an9.g((an9) neuroAvatarsScreen.A0.getValue(), wuc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                hm9.p(neuroAvatarsScreen.getClass().getName(), "failed open camera", (Throwable) null);
                neuroAvatarsScreen.r0().b.a();
            }
        } else if (ed0 instanceof dd0) {
            neuroAvatarsScreen.startActivityForResult(((dd0) ed0).a, 666);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
