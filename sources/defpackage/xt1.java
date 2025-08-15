package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xt1  reason: default package */
public final class xt1 extends CameraDevice.StateCallback {
    public final /* synthetic */ lq1 a;
    public final /* synthetic */ fu1 b;

    public xt1(fu1 fu1, lq1 lq1) {
        this.b = fu1;
        this.a = lq1;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        CameraDevice cameraDevice2 = cameraDevice;
        fu1 fu1 = this.b;
        fu1.toString();
        sz1 sz1 = new sz1(fu1.P0, new bj6(Collections.emptyList()), false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        fw6 fw6 = new fw6(surface);
        kq0.w(fw6.e).d(new wt1(surface, 0, surfaceTexture), ju0.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        mi9 b2 = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 a2 = ui9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        eu4 eu4 = eu4.d;
        xe5 a3 = rb0.a(fw6);
        a3.Y = eu4;
        linkedHashSet.add(a3.a());
        fu1.toString();
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        wma a4 = wma.a(b2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (Iterator it = map.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap.put(str, map.get(str));
        }
        fad fad = new fad(arrayList5, arrayList6, arrayList7, arrayList8, new kz1(arrayList9, a4, 1, false, arrayList10, false, new nje(arrayMap), (pv1) null), (dad) null, (InputConfiguration) null, 0, (rb0) null);
        z23 z23 = fu1.J0;
        b76 a5 = b76.a(f8.g(new f76(sz1.l(fad, cameraDevice2, new jhe((bj6) z23.e, (bj6) z23.f, (q40) z23.d, (Executor) z23.b, (ScheduledExecutorService) z23.a, (Handler) z23.c)), 0)));
        f9 f9Var = new f9(sz1, 12, fw6);
        a5.getClass();
        q6d q6d = fu1.c;
        k12 K = kq0.K(a5, f9Var, q6d);
        Objects.requireNonNull(cameraDevice);
        K.d(new b(29, (Object) cameraDevice2), q6d);
    }
}
