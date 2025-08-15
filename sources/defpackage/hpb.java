package defpackage;

import android.hardware.SensorManager;

/* renamed from: hpb  reason: default package */
public final /* synthetic */ class hpb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jpb b;

    public /* synthetic */ hpb(jpb jpb, int i) {
        this.a = i;
        this.b = jpb;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
            default:
                return new jh7(1, this.b);
        }
    }
}
