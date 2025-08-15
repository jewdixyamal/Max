package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: a3e  reason: default package */
public final /* synthetic */ class a3e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ a3e(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final void onClick(View view) {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickerPreviewScreen.A0;
                stickerPreviewScreen.getRouter().C();
                return;
            case 1:
                bc7[] bc7Arr2 = StickerPreviewScreen.A0;
                stickerPreviewScreen.getRouter().C();
                q4e q4e = q4e.c;
                bc7 bc7 = StickerPreviewScreen.A0[2];
                long longValue = ((Number) stickerPreviewScreen.b.a(stickerPreviewScreen)).longValue();
                f64 P1 = q4e.P1();
                P1.b(":chats/forward?messages_ids=" + longValue, (Bundle) null);
                return;
            case 2:
                bc7[] bc7Arr3 = StickerPreviewScreen.A0;
                i3e n0 = stickerPreviewScreen.n0();
                z2e z2e = (z2e) n0.y0.a.getValue();
                long j = n0.b;
                if (j > 0 && z2e != null && !z2e.equals(z2e.z0)) {
                    ((s8g) n0.t0.getValue()).a(new v8d(new u8d(j, z2e.a, 1)));
                    pnf.o(n0.v0, g43.b);
                }
                xx6 xx6 = (xx6) p4e.a.getAccessor().e();
                if (xx6 != null) {
                    xx6.f(bcd.a0(new wx6(ux6.SEND_5_MESSAGES, 1), new wx6(ux6.SEND_3_STICKERS, 1)), wuc.CHAT);
                    return;
                }
                return;
            default:
                bc7[] bc7Arr4 = StickerPreviewScreen.A0;
                i3e n02 = stickerPreviewScreen.n0();
                z2e z2e2 = (z2e) n02.y0.a.getValue();
                if (z2e2 != null && !z2e2.equals(z2e.z0)) {
                    vxd S = j47.S(n02.a, ((w9a) n02.c).b(), vx3.b, new g3e(z2e2, n02, (Continuation) null));
                    n02.F0.o1(n02, i3e.H0[2], S);
                    return;
                }
                return;
        }
    }
}
