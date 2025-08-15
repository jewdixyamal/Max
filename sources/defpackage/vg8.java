package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: vg8  reason: default package */
public final class vg8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final List c;

    public vg8(ArrayList arrayList, boolean z) {
        this.a = 0;
        this.c = arrayList == null ? Collections.emptyList() : arrayList;
        this.b = z;
    }

    public static vg8 b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new zf8(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new vg8(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        qt1 qt1 = new qt1(2);
        List list = this.c;
        oq1 oq1 = (oq1) qt1.b;
        list.add(oq1);
        oq1.b.d(new v05((Object) this, (Object) qt1, (Object) oq1, 27), ju0.k());
        return new ju1(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{qt1, captureCallback}));
    }

    public bm7 c() {
        List list = this.c;
        if (list.isEmpty()) {
            return dw6.c;
        }
        nl7 J = kq0.J(new ArrayList(list));
        mu1 mu1 = new mu1(15);
        return kq0.w(kq0.K(J, new re6(15, (Object) mu1), ju0.k()));
    }

    public void d() {
        LinkedList linkedList = new LinkedList(this.c);
        while (!linkedList.isEmpty()) {
            bm7 bm7 = (bm7) linkedList.poll();
            Objects.requireNonNull(bm7);
            bm7.cancel(true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        zf8 zf8 = (zf8) list.get(i);
                        if (zf8 != null && zf8.d()) {
                            i++;
                        }
                    }
                }
                return au1.j(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public vg8(boolean z) {
        this.a = 1;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }
}
