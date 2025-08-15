package defpackage;

import android.widget.FrameLayout;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: b3e  reason: default package */
public final /* synthetic */ class b3e implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ b3e(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final Object invoke() {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickerPreviewScreen.A0;
                stickerPreviewScreen.getClass();
                bc7 bc7 = StickerPreviewScreen.A0[1];
                long longValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                p4e p4e = p4e.a;
                p4e.getAccessor().d(o2e.class);
                return new i3e(longValue, (kke) p4e.getAccessor().c(kke.class), p4e.getAccessor().d(y4e.class), p4e.getAccessor().d(a4e.class), p4e.getAccessor().d(md5.class), p4e.getAccessor().d(sc5.class), p4e.getAccessor().d(iy2.class), p4e.getAccessor().d(s8g.class), p4e.getAccessor().d(qe5.class));
            case 1:
                bc7[] bc7Arr2 = StickerPreviewScreen.A0;
                i2e i2e = new i2e(stickerPreviewScreen.getContext());
                i2e.setId(bja.f);
                int G = tu0.G(((float) 160) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(G, G);
                layoutParams.gravity = 17;
                i2e.setLayoutParams(layoutParams);
                return i2e;
            case 2:
                bc7[] bc7Arr3 = StickerPreviewScreen.A0;
                iw7 iw7 = new iw7(stickerPreviewScreen.getContext());
                iw7.setId(bja.e);
                int G2 = tu0.G(((float) 160) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(G2, G2);
                layoutParams2.gravity = 17;
                iw7.setLayoutParams(layoutParams2);
                return iw7;
            default:
                bc7[] bc7Arr4 = StickerPreviewScreen.A0;
                a4g a4g = new a4g(stickerPreviewScreen.getContext());
                a4g.setId(bja.l);
                int G3 = tu0.G(((float) 160) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(G3, G3);
                layoutParams3.gravity = 17;
                a4g.setLayoutParams(layoutParams3);
                return a4g;
        }
    }
}
