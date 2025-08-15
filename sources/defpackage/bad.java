package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: bad  reason: default package */
public final class bad extends aad {
    /* JADX WARNING: type inference failed for: r0v4, types: [bad, aad] */
    public static bad d(o9f o9f, Size size) {
        if (((dv1) o9f.f(o9f.i0, (Object) null)) != null) {
            ? aad = new aad();
            fad fad = (fad) o9f.f(o9f.g0, (Object) null);
            ce3 ce3 = wma.c;
            int i = fad.a().g.c;
            if (fad != null) {
                i = fad.g.c;
                for (CameraDevice.StateCallback stateCallback : fad.c) {
                    ArrayList arrayList = aad.c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : fad.d) {
                    ArrayList arrayList2 = aad.d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                aad.b.a(fad.g.e);
                ce3 = fad.g.b;
            }
            u40 u40 = aad.b;
            u40.getClass();
            u40.f = mi9.c(ce3);
            if (o9f instanceof i8b) {
                Rational rational = j8b.a;
                if (((PreviewPixelHDRnetQuirk) zi4.a.e(PreviewPixelHDRnetQuirk.class)) != null && !j8b.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    mi9 b = mi9.b();
                    b.j(cv1.v0(CaptureRequest.TONEMAP_MODE), 2);
                    aad.b.c(new re6(8, (Object) wma.a(b)));
                }
            }
            aad.b.c = ((Integer) o9f.f(cv1.Z, Integer.valueOf(i))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) o9f.f(cv1.t0, new CameraDevice.StateCallback());
            ArrayList arrayList3 = aad.c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) o9f.f(cv1.u0, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = aad.d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            jz1 jz1 = new jz1((CameraCaptureSession.CaptureCallback) o9f.f(cv1.v0, new CameraCaptureSession.CaptureCallback()));
            aad.b.b(jz1);
            ArrayList arrayList5 = aad.e;
            if (!arrayList5.contains(jz1)) {
                arrayList5.add(jz1);
            }
            int O = o9f.O();
            if (O != 0) {
                u40 u402 = aad.b;
                u402.getClass();
                if (O != 0) {
                    ((mi9) u402.f).j(o9f.q0, Integer.valueOf(O));
                }
            }
            int X = o9f.X();
            if (X != 0) {
                u40 u403 = aad.b;
                u403.getClass();
                if (X != 0) {
                    ((mi9) u403.f).j(o9f.p0, Integer.valueOf(X));
                }
            }
            mi9 b2 = mi9.b();
            aa0 aa0 = cv1.w0;
            b2.j(aa0, (String) o9f.f(aa0, (Object) null));
            aa0 aa02 = cv1.s0;
            Long l = (Long) o9f.f(aa02, -1L);
            l.getClass();
            b2.j(aa02, l);
            aad.b.c(b2);
            aad.b.c(wd6.w(o9f).u());
            return aad;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) o9f.f(cne.d0, o9f.toString())));
    }

    public final void a(ce3 ce3) {
        this.b.c(ce3);
    }

    public final void b(xf4 xf4, eu4 eu4, int i) {
        xe5 a = rb0.a(xf4);
        a.c = null;
        if (eu4 != null) {
            a.Y = eu4;
            a.o = Integer.valueOf(i);
            this.a.add(a.a());
            ((HashSet) this.b.e).add(xf4);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final fad c() {
        return new fad(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), this.f, this.g, this.h, this.i);
    }
}
