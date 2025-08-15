package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fc0  reason: default package */
public final class fc0 {
    public int a;
    public final Executor b;
    public final ey1 c;
    public final Rect d;
    public final Matrix e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;

    public fc0(Executor executor, ey1 ey1, Rect rect, Matrix matrix, int i2, int i3, int i4, List list) {
        this.a = ((CaptureFailedRetryQuirk) wi4.a.e(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor != null) {
            this.b = executor;
            this.c = ey1;
            this.d = rect;
            if (matrix != null) {
                this.e = matrix;
                this.f = i2;
                this.g = i3;
                this.h = i4;
                if (list != null) {
                    this.i = list;
                    return;
                }
                throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
            }
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        throw new NullPointerException("Null appExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0 = (fc0) obj;
        if (this.b.equals(fc0.b)) {
            ey1 ey1 = fc0.c;
            ey1 ey12 = this.c;
            if (ey12 != null ? ey12.equals(ey1) : ey1 == null) {
                if (this.d.equals(fc0.d) && this.e.equals(fc0.e) && this.f == fc0.f && this.g == fc0.g && this.h == fc0.h && this.i.equals(fc0.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        ey1 ey1 = this.c;
        return this.i.hashCode() ^ ((((((((((((hashCode ^ (ey1 == null ? 0 : ey1.hashCode())) * 583896283) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.b);
        sb.append(", inMemoryCallback=");
        sb.append(this.c);
        sb.append(", onDiskCallback=null, outputFileOptions=null, cropRect=");
        sb.append(this.d);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", rotationDegrees=");
        sb.append(this.f);
        sb.append(", jpegQuality=");
        sb.append(this.g);
        sb.append(", captureMode=");
        sb.append(this.h);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return au1.i(sb, this.i, "}");
    }
}
