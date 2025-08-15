package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: w9b  reason: default package */
public final class w9b {
    public final Executor a;
    public ib0 b;
    public c32 c;
    public fd7 d;
    public kj6 e;
    public nd2 f;
    public o84 g;
    public sp3 h;
    public huc i;
    public final bj6 j;
    public final boolean k;

    public w9b(Executor executor) {
        bj6 bj6 = wi4.a;
        if (wi4.a.e(LowMemoryQuirk.class) != null) {
            this.a = new q6d(executor);
        } else {
            this.a = executor;
        }
        this.j = bj6;
        this.k = bj6.d(IncorrectJpegMetadataQuirk.class);
    }

    public final eb0 a(eb0 eb0, int i2) {
        c54.p((String) null, f46.V(eb0.c));
        this.f.getClass();
        byte[] bArr = (byte[]) eb0.a;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            Rect rect = eb0.e;
            Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
            p55 p55 = eb0.b;
            Objects.requireNonNull(p55);
            Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
            RectF rectF = e1f.a;
            Matrix matrix = new Matrix(eb0.g);
            matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
            Size size = new Size(decodeRegion.getWidth(), decodeRegion.getHeight());
            pv1 pv1 = eb0.h;
            if (pv1 != null) {
                this.e.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeRegion.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Objects.requireNonNull(p55);
                return new eb0(byteArray, p55, (Build.VERSION.SDK_INT < 34 || !on0.d(decodeRegion)) ? 256 : 4101, size, rect2, eb0.f, matrix, pv1);
            }
            throw new NullPointerException("Null cameraCaptureResult");
        } catch (IOException e2) {
            throw new Exception("Failed to decode JPEG.", e2);
        }
    }

    public final ov6 b(jb0 jb0) {
        x9b x9b = jb0.a;
        eb0 eb0 = (eb0) this.c.apply(jb0);
        if ((eb0.c == 35 || this.k) && this.b.d == 256) {
            eb0 eb02 = (eb0) this.d.z(new qa0(eb0, x9b.d));
            this.h.getClass();
            Size size = eb02.d;
            hqc hqc = new hqc(s36.k(size.getWidth(), size.getHeight(), 256, 2));
            ov6 a2 = ImageProcessingUtil.a(hqc, (byte[]) eb02.a);
            hqc.a();
            Objects.requireNonNull(a2);
            p55 p55 = eb02.b;
            Objects.requireNonNull(p55);
            i06 i06 = (i06) a2;
            Size size2 = new Size(i06.getWidth(), i06.getHeight());
            i06.k0();
            eb0 = new eb0(a2, p55, i06.k0(), size2, eb02.e, eb02.f, eb02.g, eb02.h);
        }
        this.g.getClass();
        ov6 ov6 = (ov6) eb0.a;
        ecd ecd = new ecd(ov6, eb0.d, new ra0(ov6.getImageInfo().c(), ov6.getImageInfo().getTimestamp(), eb0.f, eb0.g));
        ecd.d(eb0.e);
        return ecd;
    }
}
