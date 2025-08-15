package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: svd  reason: default package */
public final class svd extends GLSurfaceView {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final SensorManager b;
    public final Sensor c;
    public final dna o;
    public final Handler s0 = new Handler(Looper.getMainLooper());
    public final xsc t0;
    public SurfaceTexture u0;
    public Surface v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public svd(Context context) {
        super(context, (AttributeSet) null);
        Sensor sensor = null;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        sensor = maf.a >= 18 ? sensorManager.getDefaultSensor(15) : sensor;
        this.c = sensor == null ? sensorManager.getDefaultSensor(11) : sensor;
        xsc xsc = new xsc();
        this.t0 = xsc;
        rvd rvd = new rvd(this, xsc);
        gye gye = new gye(context, rvd);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.o = new dna(windowManager.getDefaultDisplay(), gye, rvd);
        this.w0 = true;
        setEGLContextClientVersion(2);
        setRenderer(rvd);
        setOnTouchListener(gye);
    }

    public final void a() {
        boolean z = this.w0 && this.x0;
        Sensor sensor = this.c;
        if (sensor != null && z != this.y0) {
            dna dna = this.o;
            SensorManager sensorManager = this.b;
            if (z) {
                sensorManager.registerListener(dna, sensor, 0);
            } else {
                sensorManager.unregisterListener(dna);
            }
            this.y0 = z;
        }
    }

    public gx1 getCameraMotionListener() {
        return this.t0;
    }

    public tff getVideoFrameMetadataListener() {
        return this.t0;
    }

    public Surface getVideoSurface() {
        return this.v0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.post(new u3c(20, this));
    }

    public final void onPause() {
        this.x0 = false;
        a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.x0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.t0.v0 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.w0 = z;
        a();
    }
}
