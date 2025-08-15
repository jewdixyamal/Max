package defpackage;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.Map;

/* renamed from: sq7  reason: default package */
public final class sq7 extends w0e {
    public final /* synthetic */ hab Y;
    public final /* synthetic */ eab Z;
    public final /* synthetic */ wv6 s0;
    public final /* synthetic */ CancellationSignal t0;
    public final /* synthetic */ tq7 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq7(tq7 tq7, fi0 fi0, hab hab, eab eab, hab hab2, eab eab2, wv6 wv6, CancellationSignal cancellationSignal) {
        super(fi0, hab, eab, "LocalThumbnailBitmapSdk29Producer");
        this.u0 = tq7;
        this.Y = hab2;
        this.Z = eab2;
        this.s0 = wv6;
        this.t0 = cancellationSignal;
    }

    public final void b(Object obj) {
        o43.S((o43) obj);
    }

    public final Map c(Object obj) {
        return dx6.a("createdThumbnail", String.valueOf(((o43) obj) != null));
    }

    public final Object d() {
        String str;
        Bitmap bitmap;
        tq7 tq7 = this.u0;
        wv6 wv6 = this.s0;
        jic jic = wv6.i;
        int i = 2048;
        int i2 = jic != null ? jic.a : 2048;
        Uri uri = wv6.b;
        if (jic != null) {
            i = jic.b;
        }
        Size size = new Size(i2, i);
        try {
            tq7.getClass();
            str = e9f.a(tq7.c, uri);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        CancellationSignal cancellationSignal = this.t0;
        if (str != null) {
            String a = ym8.a(str);
            bitmap = a != null ? eae.o0(a, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(str), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(str), size, cancellationSignal);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = tq7.c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmap == null) {
            return null;
        }
        CloseableStaticBitmap of = CloseableStaticBitmap.of(bitmap, (pic) pq9.q(), (pqb) hx6.d, 0);
        oj0 oj0 = (oj0) this.Z;
        oj0.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        of.putExtras(oj0.Y);
        return o43.o0(of);
    }

    public final void e() {
        super.e();
        this.t0.cancel();
    }

    public final void f(Exception exc) {
        super.f(exc);
        hab hab = this.Y;
        eab eab = this.Z;
        hab.e(eab, "LocalThumbnailBitmapSdk29Producer", false);
        ((oj0) eab).h("local", "thumbnail_bitmap");
    }

    public final void g(Object obj) {
        o43 o43 = (o43) obj;
        super.g(o43);
        boolean z = o43 != null;
        hab hab = this.Y;
        eab eab = this.Z;
        hab.e(eab, "LocalThumbnailBitmapSdk29Producer", z);
        ((oj0) eab).h("local", "thumbnail_bitmap");
    }
}
