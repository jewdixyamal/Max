package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* renamed from: zd  reason: default package */
public final class zd implements cag {
    public float X = 1.0f;
    public final boolean Y;
    public final xv1 a;
    public final Range b;
    public float c = 1.0f;
    public lq1 o;

    public zd(xv1 xv1) {
        boolean z = false;
        this.Y = false;
        this.a = xv1;
        this.b = (Range) xv1.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) xv1.b.a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (iArr[i] == 1) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.Y = z;
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.o != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.X == f.floatValue()) {
                    this.o.b((Object) null);
                    this.o = null;
                }
            }
        }
    }

    public final void b(re6 re6) {
        re6.r0(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (this.Y && Build.VERSION.SDK_INT >= 34) {
            re6.r0(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    public final float c() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    public final float d() {
        return ((Float) this.b.getLower()).floatValue();
    }

    public final Rect e() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public final void f(float f, lq1 lq1) {
        this.c = f;
        lq1 lq12 = this.o;
        if (lq12 != null) {
            lq12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.X = this.c;
        this.o = lq1;
    }

    public final void g() {
        this.c = 1.0f;
        lq1 lq1 = this.o;
        if (lq1 != null) {
            lq1.d(new Exception("Camera is not active."));
            this.o = null;
        }
    }
}
