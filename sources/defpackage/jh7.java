package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: jh7  reason: default package */
public final class jh7 implements SensorEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                int type = sensorEvent.sensor.getType();
                td tdVar = (td) this.b;
                boolean z = false;
                if (type != 5) {
                    if (type == 8) {
                        if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                            z = true;
                        }
                        tdVar.b = z;
                        return;
                    }
                    return;
                } else if (!tdVar.b) {
                    ((q0e) tdVar.c).m((Object) null, Float.valueOf(sensorEvent.values[0]));
                    return;
                } else {
                    return;
                }
            default:
                jpb jpb = (jpb) this.b;
                if (jpb.f != null) {
                    boolean z2 = false;
                    if (((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d)) {
                        z2 = true;
                    }
                    if (z2 != jpb.e) {
                        jpb.e = z2;
                        if (z2) {
                            for (ipb a2 : jpb.h) {
                                a2.a();
                            }
                            return;
                        }
                        for (ipb b2 : jpb.h) {
                            b2.b();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
