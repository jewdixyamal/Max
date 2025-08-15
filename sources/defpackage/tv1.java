package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: tv1  reason: default package */
public final class tv1 {
    public final ArrayList a;
    public final ArrayList b;
    public final wd6 c;
    public final dle d;
    public final a4c e;
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final Object g = new Object();
    public volatile String h = null;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public tv1(gy9 gy9, CameraVideoCapturer cameraVideoCapturer, dle dle, ArrayList arrayList, ArrayList arrayList2, boolean z, a4c a4c) {
        ArrayList arrayList3 = new ArrayList();
        this.a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.b = arrayList4;
        this.e = a4c;
        a4c a4c2 = ((gk3) gy9).a;
        this.c = new wd6(23, (Object) new jra(cameraVideoCapturer, new qx1(a4c2), a4c2));
        this.d = dle;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        this.i = z;
    }

    public final void a() {
        boolean z;
        ArrayList<CameraEnumerationAndroid.CaptureFormat> arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        boolean z2 = jb9.a;
        if (!arrayList.isEmpty()) {
            ky6 ky6 = new ky6(17);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : arrayList) {
                int i2 = captureFormat.width;
                if (i2 >= 500) {
                    int i3 = captureFormat.height;
                    if (i2 * i3 <= 921600) {
                        float f2 = ((float) i2) / ((float) i3);
                        if (Math.abs(f2 - 1.7777778f) < 0.1f) {
                            arrayList2.add(captureFormat);
                        } else if (((double) f2) > 1.1d && !z) {
                            arrayList3.add(captureFormat);
                        }
                    }
                }
            }
            Collections.sort(arrayList2, ky6);
            Collections.sort(arrayList3, ky6);
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : arrayList3.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList3.get(0) : (CameraEnumerationAndroid.CaptureFormat) arrayList.get(arrayList.size() - 1);
            int round = Math.round(((float) captureFormat2.framerate.max) / 1000.0f);
            int i4 = (round <= 0 || round > 60) ? 30 : round;
            a4c a4c = this.e;
            StringBuilder sb = new StringBuilder("capture format selected, size: ");
            sb.append(captureFormat2.width);
            sb.append("x");
            ms2.k(sb, captureFormat2.height, ", frame rate: ", round, ", actual frame rate: ");
            sb.append(i4);
            a4c.log("CameraCapturerAdapter", sb.toString());
            int i5 = captureFormat2.width;
            int i6 = captureFormat2.height;
            int round2 = i4 < 1000 ? i4 : Math.round(((float) i4) / 1000.0f);
            if (round2 != i4) {
                String h2 = rh4.h("Unexpected frame rate requested: ", i4, round2, ", truncated to ");
                this.e.reportException("CameraCapturerAdapter", h2, new IllegalArgumentException(h2));
            }
            a4c a4c2 = this.e;
            StringBuilder j2 = wg0.j("changeFormat, ", i5, "x", i6, "@");
            j2.append(round2);
            a4c2.log("CameraCapturerAdapter", j2.toString());
            if (!(this.n == i5 && this.m == i6 && this.l == round2)) {
                this.l = round2;
                this.m = i6;
                this.n = i5;
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    kq7 kq7 = (kq7) it.next();
                    if (this != kq7.r) {
                        kq7.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
                    }
                    rkf rkf = kq7.y;
                    ((a4c) rkf.c).log("VideoRecord", rh4.h("Camera capture dimensions were changed to ", i5, i6, "x"));
                    rkf.v0.width = i5;
                    rkf.v0.height = i6;
                    rkf.u();
                }
                if (this.k) {
                    this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
                    ((CameraVideoCapturer) this.c.b).changeCaptureFormat(i5, i6, round2);
                }
            }
            this.e.log("CameraCapturerAdapter", "start");
            if (this.k) {
                this.e.log("CameraCapturerAdapter", "Camera is already started");
                return;
            }
            if (this.n == 0 || this.m == 0 || this.l == 0) {
                a4c a4c3 = this.e;
                a4c3.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
            }
            try {
                ((CameraVideoCapturer) this.c.b).startCapture(this.n, this.m, this.l);
                this.k = true;
            } catch (RuntimeException e2) {
                this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e2);
                Thread.currentThread().interrupt();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void b() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            ((CameraVideoCapturer) this.c.b).stopCapture();
            this.k = false;
        } catch (InterruptedException e2) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e2);
            Thread.currentThread().interrupt();
        }
    }
}
