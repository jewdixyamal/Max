package defpackage;

import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: kag  reason: default package */
public final /* synthetic */ class kag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ZoomableDraweeView b;

    public /* synthetic */ kag(ZoomableDraweeView zoomableDraweeView, int i) {
        this.a = i;
        this.b = zoomableDraweeView;
    }

    public final void run() {
        ZoomableDraweeView zoomableDraweeView = this.b;
        switch (this.a) {
            case 0:
                int i = ZoomableDraweeView.F0;
                zoomableDraweeView.requestLayout();
                zoomableDraweeView.invalidate();
                return;
            default:
                int i2 = ZoomableDraweeView.F0;
                ta5.d(ZoomableDraweeView.class, Integer.valueOf(zoomableDraweeView.hashCode()), "onRelease: view %x");
                uf4 uf4 = (uf4) zoomableDraweeView.E0;
                uf4.c = false;
                uf4.reset();
                return;
        }
    }
}
