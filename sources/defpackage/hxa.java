package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: hxa  reason: default package */
public final /* synthetic */ class hxa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ hxa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final void onClick(View view) {
        vxd vxd = null;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickSubscribersScreen.z0;
                xwa xwa = (xwa) pickSubscribersScreen.v0().c;
                sx3 sx3 = xwa.k;
                if (sx3 != null) {
                    j47.T(sx3, (lx3) null, (vx3) null, new wwa(xwa, (Continuation) null), 3);
                    return;
                }
                return;
            default:
                bc7[] bc7Arr2 = PickSubscribersScreen.z0;
                pickSubscribersScreen.x0().setProgressEnabled(true);
                xwa xwa2 = (xwa) pickSubscribersScreen.v0().c;
                bc7 bc7 = PickSubscribersScreen.z0[0];
                long[] jArr = (long[]) pickSubscribersScreen.t0.a(pickSubscribersScreen);
                e52 e52 = (e52) ((jz2) ((iy2) xwa2.d.getValue())).m(xwa2.a).a.getValue();
                if (e52 != null) {
                    ((gh3) xwa2.f.getValue()).f();
                    sx3 sx32 = xwa2.k;
                    if (sx32 != null) {
                        vxd = j47.T(sx32, ((w9a) ((kke) xwa2.c.getValue())).b(), (vx3) null, new uwa(xwa2, e52, jArr, (Continuation) null), 2);
                    }
                    xwa2.j.o1(xwa2, xwa.l[0], vxd);
                    return;
                }
                return;
        }
    }
}
