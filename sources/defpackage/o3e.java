package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: o3e  reason: default package */
public final /* synthetic */ class o3e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ o3e(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    public final void onClick(View view) {
        znc router;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickerSetBottomSheet.A0;
                uu3 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.C();
                    return;
                }
                return;
            default:
                bc7[] bc7Arr2 = StickerSetBottomSheet.A0;
                i3e i3e = (i3e) stickerSetBottomSheet.s0.getValue();
                w3e w3e = (w3e) i3e.C0.a.getValue();
                if (w3e != null) {
                    vxd S = j47.S(i3e.a, ((w9a) i3e.c).b(), vx3.b, new h3e(w3e, i3e, (Continuation) null));
                    i3e.G0.o1(i3e, i3e.H0[3], S);
                    return;
                }
                return;
        }
    }
}
