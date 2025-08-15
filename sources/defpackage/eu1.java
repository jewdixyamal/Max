package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: eu1  reason: default package */
public final class eu1 extends CameraDevice.StateCallback {
    public final Executor a;
    public final ScheduledExecutorService b;
    public du1 c;
    public ScheduledFuture d;
    public final bu1 e;
    public final /* synthetic */ fu1 f;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bu1] */
    public eu1(fu1 fu1, q6d q6d, zh6 zh6, long j) {
        this.f = fu1;
        this.a = q6d;
        this.b = zh6;
        ? obj = new Object();
        obj.c = this;
        obj.b = -1;
        obj.a = j;
        this.e = obj;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        Objects.toString(this.c);
        this.f.toString();
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        boolean z = true;
        c54.p((String) null, this.c == null);
        if (this.d != null) {
            z = false;
        }
        c54.p((String) null, z);
        bu1 bu1 = this.e;
        bu1.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (bu1.b == -1) {
            bu1.b = uptimeMillis;
        }
        int i = ((uptimeMillis - bu1.b) > ((long) bu1.b()) ? 1 : ((uptimeMillis - bu1.b) == ((long) bu1.b()) ? 0 : -1));
        fu1 fu1 = this.f;
        if (i >= 0) {
            bu1.b = -1;
            bu1.b();
            fu1.E(4, (v90) null, false);
            return;
        }
        this.c = new du1(this, this.a);
        bu1.a();
        Objects.toString(this.c);
        boolean z2 = fu1.N0;
        fu1.toString();
        this.d = this.b.schedule(this.c, (long) bu1.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.v0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r2 = this;
            fu1 r2 = r2.f
            boolean r0 = r2.N0
            if (r0 == 0) goto L_0x000f
            int r2 = r2.v0
            r0 = 1
            if (r2 == r0) goto L_0x0010
            r1 = 2
            if (r2 != r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu1.c():boolean");
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f.toString();
        boolean z = this.f.u0 == null;
        c54.p("Unexpected onClose callback on camera device: " + cameraDevice, z);
        int s = au1.s(this.f.S0);
        if (s == 1 || s == 4) {
            c54.p((String) null, this.f.x0.isEmpty());
            this.f.s();
        } else if (s == 5 || s == 6) {
            fu1 fu1 = this.f;
            int i = fu1.v0;
            if (i != 0) {
                "Camera closed due to error: ".concat(fu1.v(i));
                fu1.toString();
                b();
                return;
            }
            fu1.J(false);
        } else {
            throw new IllegalStateException("Camera closed while in state: ".concat(wg0.r(this.f.S0)));
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.toString();
        onError(cameraDevice, 1);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        fu1 fu1 = this.f;
        fu1.u0 = cameraDevice;
        fu1.v0 = i;
        imc imc = fu1.R0;
        ((fu1) imc.c).toString();
        imc.K();
        int s = au1.s(this.f.S0);
        if (s != 1) {
            switch (s) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    wg0.o(this.f.S0);
                    int i2 = 6;
                    boolean z = false;
                    c54.p("Attempt to handle open error from non open state: ".concat(wg0.r(this.f.S0)), this.f.S0 == 8 || this.f.S0 == 9 || this.f.S0 == 10 || this.f.S0 == 7 || this.f.S0 == 6);
                    int i3 = 3;
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        fu1 fu12 = this.f;
                        if (fu12.v0 != 0) {
                            z = true;
                        }
                        c54.p("Can only reopen camera device after error if the camera device is actually in an error state.", z);
                        if (i == 1) {
                            i3 = 2;
                        } else if (i == 2) {
                            i3 = 1;
                        }
                        fu12.E(7, new v90((Throwable) null, i3), true);
                        fu12.r();
                        return;
                    }
                    cameraDevice.getId();
                    if (i == 3) {
                        i2 = 5;
                    }
                    this.f.E(5, new v90((Throwable) null, i2), true);
                    this.f.r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(wg0.r(this.f.S0)));
            }
        }
        cameraDevice.getId();
        wg0.o(this.f.S0);
        this.f.r();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f.toString();
        fu1 fu1 = this.f;
        fu1.u0 = cameraDevice;
        fu1.v0 = 0;
        this.e.b = -1;
        int s = au1.s(fu1.S0);
        if (s == 1 || s == 4) {
            c54.p((String) null, this.f.x0.isEmpty());
            this.f.u0.close();
            this.f.u0 = null;
        } else if (s == 5 || s == 6 || s == 7) {
            this.f.F(9);
            ux1 ux1 = this.f.B0;
            String id = cameraDevice.getId();
            fu1 fu12 = this.f;
            if (ux1.e(id, fu12.A0.B(fu12.u0.getId()))) {
                this.f.B();
            }
        } else {
            throw new IllegalStateException("onOpened() should not be possible from state: ".concat(wg0.r(this.f.S0)));
        }
    }
}
