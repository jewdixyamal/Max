package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qu1  reason: default package */
public final class qu1 implements tu1 {
    public final /* synthetic */ su1 a;

    public qu1(su1 su1) {
        this.a = su1;
    }

    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((tu1) it.next()).a(totalCaptureResult));
        }
        nl7 b = kq0.b(arrayList);
        mu1 mu1 = new mu1(2);
        return kq0.K(b, new re6(15, (Object) mu1), ju0.k());
    }

    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((tu1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((tu1) it.next()).c();
        }
    }
}
