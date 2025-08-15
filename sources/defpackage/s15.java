package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: s15  reason: default package */
public final class s15 extends tdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 0:
                for (tdc a2 : ((z15) this.b).Z1) {
                    a2.a(recyclerView, i);
                }
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                for (tdc b2 : ((z15) obj).Z1) {
                    b2.b(recyclerView, i, i2);
                }
                return;
            case 1:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                zb5 zb5 = (zb5) obj;
                int computeVerticalScrollRange = zb5.D0.computeVerticalScrollRange();
                int i3 = zb5.C0;
                int i4 = computeVerticalScrollRange - i3;
                int i5 = zb5.a;
                zb5.E0 = i4 > 0 && i3 >= i5;
                int computeHorizontalScrollRange = zb5.D0.computeHorizontalScrollRange();
                int i6 = zb5.B0;
                boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
                zb5.F0 = z;
                boolean z2 = zb5.E0;
                if (z2 || z) {
                    if (z2) {
                        float f = (float) i3;
                        zb5.w0 = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                        zb5.v0 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                    }
                    if (zb5.F0) {
                        float f2 = (float) i6;
                        zb5.z0 = (int) ((((f2 / 2.0f) + ((float) computeHorizontalScrollOffset)) * f2) / ((float) computeHorizontalScrollRange));
                        zb5.y0 = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                    }
                    int i7 = zb5.G0;
                    if (i7 == 0 || i7 == 1) {
                        zb5.l(1);
                        return;
                    }
                    return;
                } else if (zb5.G0 != 0) {
                    zb5.l(0);
                    return;
                } else {
                    return;
                }
            case 2:
                if (i != 0 || i2 != 0) {
                    pnf.o(((cc8) ((KeyboardStickersWidget) obj).b.getValue()).X, yb8.a);
                    return;
                }
                return;
            default:
                bc7[] bc7Arr = MediaGalleryWidget.Z;
                s86 n0 = ((MediaGalleryWidget) obj).n0();
                n0.getClass();
                pnf.o(n0.c, new q86(-((float) recyclerView.computeVerticalScrollOffset())));
                return;
        }
    }
}
