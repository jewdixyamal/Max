package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: zx6  reason: default package */
public final /* synthetic */ class zx6 implements l3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay6 b;

    public /* synthetic */ zx6(ay6 ay6, int i) {
        this.a = i;
        this.b = ay6;
    }

    public void d() {
        if (this.b.d != null) {
            buc.y();
        }
    }

    public void l(Task task) {
        xx6 i;
        ay6 ay6 = this.b;
        switch (this.a) {
            case 0:
                if (task.h()) {
                    ay6.c = (hkc) task.f();
                    return;
                }
                return;
            default:
                if (ay6.d != null && (i = y8a.a.i()) != null) {
                    List list = xx6.p;
                    i.c(1, (Integer) null);
                    return;
                }
                return;
        }
    }

    public void onFailure(Exception exc) {
        if (this.b.d != null) {
            buc.y();
        }
    }
}
