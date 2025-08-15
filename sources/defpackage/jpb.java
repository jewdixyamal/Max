package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.LinkedHashSet;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: jpb  reason: default package */
public final class jpb {
    public final khe a;
    public final khe b = new khe(new hpb(this, 0));
    public final khe c;
    public final khe d;
    public boolean e;
    public PowerManager.WakeLock f;
    public wmc g;
    public final LinkedHashSet h;

    public jpb(je7 je7) {
        this.a = new khe(new z30(20, je7));
        this.c = new khe(new z30(21, je7));
        this.d = new khe(new hpb(this, 1));
        this.h = new LinkedHashSet();
    }

    public final void a() {
        Sensor sensor = (Sensor) this.b.getValue();
        if (sensor != null) {
            try {
                this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
                ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
            } catch (Exception e2) {
                hm9.r("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void b() {
        if (((Sensor) this.b.getValue()) != null) {
            PowerManager.WakeLock wakeLock = this.f;
            try {
                ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release(1);
                }
            } catch (Exception e2) {
                hm9.r("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void c() {
        Object value;
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release(1);
                    wmc wmc = this.g;
                    if (wmc != null) {
                        ir1 ir1 = (ir1) wmc.a;
                        ti9 ti9 = (ti9) ir1.p.getValue();
                        do {
                            value = ti9.getValue();
                            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
                        } while (!ti9.c(value, ((a11) ir1.b).b()));
                    }
                }
            } catch (Exception e2) {
                hm9.r("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }
}
