package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* renamed from: doa  reason: default package */
public final class doa extends nj0 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public doa() {
    }

    public final ww0 b() {
        switch (this.c) {
            case 0:
                return new tpd(String.valueOf(((Uri) this.d).hashCode()));
            default:
                if (((tpd) this.d) == null) {
                    this.d = new tpd("RoundAsCirclePostprocessor#AntiAliased");
                }
                return (tpd) this.d;
        }
    }

    public final void c(Bitmap bitmap) {
        switch (this.c) {
            case 0:
                Bitmap o = c37.o((Uri) this.d);
                if (o != null) {
                    Canvas canvas = new Canvas(bitmap);
                    float width = ((float) bitmap.getWidth()) / ((float) o.getWidth());
                    canvas.scale(width, width);
                    canvas.drawBitmap(o, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            default:
                NativeRoundingFilter.toCircleFast(bitmap, true);
                return;
        }
    }

    public doa(Uri uri) {
        this.d = uri;
    }

    public /* synthetic */ doa(boolean z) {
    }
}
