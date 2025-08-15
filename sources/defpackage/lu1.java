package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: lu1  reason: default package */
public class lu1 {
    public static final lu1 a = new Object();

    public void a(o9f o9f, u40 u40) {
        o9f o9f2 = o9f;
        u40 u402 = u40;
        kz1 kz1 = (kz1) o9f2.f(o9f.h0, (Object) null);
        ce3 ce3 = wma.c;
        aa0 aa0 = kz1.i;
        HashSet hashSet = new HashSet();
        mi9 b = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 a2 = ui9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wma a3 = wma.a(b);
        ArrayList arrayList3 = new ArrayList(arrayList);
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        nje nje2 = new nje(arrayMap);
        int i = -1;
        new kz1(arrayList2, a3, -1, false, arrayList3, false, nje2, (pv1) null);
        if (kz1 != null) {
            u402.a(kz1.e);
            i = kz1.c;
            ce3 = kz1.b;
        }
        u402.f = mi9.c(ce3);
        u402.c = ((Integer) o9f2.f(cv1.Z, Integer.valueOf(i))).intValue();
        u402.b(new jz1((CameraCaptureSession.CaptureCallback) o9f2.f(cv1.v0, new CameraCaptureSession.CaptureCallback())));
        u402.c(wd6.w(o9f).u());
    }
}
