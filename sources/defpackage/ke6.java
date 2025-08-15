package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;

/* renamed from: ke6  reason: default package */
public final /* synthetic */ class ke6 implements l3a, o3a {
    public final /* synthetic */ re6 a;

    public /* synthetic */ ke6(re6 re6) {
        this.a = re6;
    }

    public void l(Task task) {
        boolean h = task.h();
        re6 re6 = this.a;
        if (!h || task.f() == null) {
            ((lr7) re6.b).U0();
            return;
        }
        Location location = (Location) task.f();
        ((lr7) re6.b).p1(new er7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    public void onFailure(Exception exc) {
        ((lr7) this.a.b).U0();
    }
}
