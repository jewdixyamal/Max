package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: b6d  reason: default package */
public final class b6d implements SensorEventListener {
    public static final /* synthetic */ int d = 0;
    public final SensorManager a;
    public final Sensor b;
    public final Set c = Collections.synchronizedSet(new LinkedHashSet());

    public b6d(Context context) {
        Collections.synchronizedSet(new LinkedHashSet());
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(8);
        sensorManager.getDefaultSensor(5);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.c) {
            try {
                if (sensorEvent.sensor.getType() == 8) {
                    boolean z = false;
                    if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                        z = true;
                    }
                    for (f40 f40 : this.c) {
                        if (z) {
                            f40.getClass();
                            hm9.m("f40", "onDeviceNextToEar", new Object[0]);
                            uh9 uh9 = f40.c;
                            if (uh9.x) {
                                if (!f40.l()) {
                                    ((PowerManager.WakeLock) f40.t0.getValue()).acquire();
                                }
                                if (uh9.x) {
                                    uh9.m();
                                    kj6 kj6 = ub8.a;
                                }
                            }
                        } else {
                            f40.n();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
