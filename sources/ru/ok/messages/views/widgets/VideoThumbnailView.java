package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import ru.ok.messages.media.mediabar.SimpleTransitionDraweeView;

public class VideoThumbnailView extends SimpleTransitionDraweeView {
    public int A0;
    public k20 x0;
    public final wjc y0 = new wjc();
    public int z0;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private void setPlaceHolderDrawable(Drawable drawable) {
        ma6 ma6 = new ma6(getResources());
        ssc ssc = ssc.l;
        ma6.l = ssc;
        ma6.d = drawable;
        ma6.e = ssc;
        setHierarchy(ma6.a());
    }

    private void setPlaceHolderFromVideo(k20 k20) {
        Uri N = j47.N(k20.d);
        if (N != null) {
            setPlaceHolderUri(N);
        }
    }

    private void setPlaceHolderUri(Uri uri) {
        ma6 ma6 = new ma6(getResources());
        ma6.l = ssc.l;
        ma6.b = 0;
        setHierarchy(ma6.a());
        e2b a = s36.a.get();
        a.g = this.y0;
        a.l = getController();
        setController(a.a());
        wv6 a2 = wv6.a(uri);
        wjc wjc = this.y0;
        iv6 o = s36.o();
        o.getClass();
        wjc.a(new hv6(o, a2, (Object) null));
    }

    public final void n(k20 k20, Drawable drawable) {
        this.x0 = k20;
        if (k20 == null && drawable == null) {
            setController((mq4) null);
        } else if (drawable == null) {
            setPlaceHolderFromVideo(k20);
        } else {
            setPlaceHolderDrawable(drawable);
        }
    }

    public final void o(k20 k20, Uri uri) {
        this.x0 = k20;
        if (k20 == null && uri == null) {
            setController((mq4) null);
        } else if (uri == null) {
            setPlaceHolderFromVideo(k20);
        } else {
            setPlaceHolderUri(uri);
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.x0 == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.z0;
        if (i3 <= 0) {
            i3 = this.x0.e;
        }
        int i4 = this.A0;
        if (i4 <= 0) {
            i4 = this.x0.f;
        }
        int[] G = j47.G(size, size2, i3, i4);
        setMeasuredDimension(G[0], G[1]);
    }
}
