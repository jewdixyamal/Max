package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: ma8  reason: default package */
public final /* synthetic */ class ma8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaGalleryWidget b;

    public /* synthetic */ ma8(MediaGalleryWidget mediaGalleryWidget, int i) {
        this.a = i;
        this.b = mediaGalleryWidget;
    }

    public final Object invoke() {
        MediaGalleryWidget mediaGalleryWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaGalleryWidget.Z;
                return new p76(mediaGalleryWidget.o0());
            default:
                bc7[] bc7Arr2 = MediaGalleryWidget.Z;
                z15 z15 = new z15(mediaGalleryWidget.getContext(), (AttributeSet) null);
                z15.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return z15;
        }
    }
}
