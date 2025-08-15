package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: nw1  reason: default package */
public final class nw1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public nw1(q40 q40) {
        this.a = 1;
        this.b = q40;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList h;
        synchronized (((q40) this.b).b) {
            h = ((q40) this.b).h();
            ((LinkedHashSet) ((q40) this.b).X).clear();
            ((LinkedHashSet) ((q40) this.b).c).clear();
            ((LinkedHashSet) ((q40) this.b).o).clear();
        }
        Iterator it = h.iterator();
        while (it.hasNext()) {
            jhe jhe = (jhe) ((ihe) it.next());
            synchronized (jhe.a) {
                try {
                    List<xf4> list = jhe.j;
                    if (list != null) {
                        for (xf4 b2 : list) {
                            b2.b();
                        }
                        jhe.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jhe.t.d();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((q40) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).X);
            linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).c);
        }
        ((Executor) ((q40) this.b).a).execute(new cu1(9, linkedHashSet));
    }

    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((q40) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).X);
                    linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).c);
                }
                ((Executor) ((q40) this.b).a).execute(new l40(i, 6, linkedHashSet));
                a();
                return;
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public nw1(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof ow1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
