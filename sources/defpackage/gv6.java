package defpackage;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.a;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gv6  reason: default package */
public final class gv6 extends a implements Closeable, iqf {
    public final hc9 a;
    public final d b;
    public final xu3 c;

    public gv6(hc9 hc9, d dVar, xu3 xu3) {
        this.a = hc9;
        this.b = dVar;
        this.c = xu3;
    }

    public final void a(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        xu3 xu3 = this.c;
        hc9 hc9 = this.a;
        d dVar = this.b;
        if (z) {
            hc9.now();
            dVar.getClass();
            nqf nqf = nqf.b;
            dVar.getClass();
            dVar.getClass();
            if (xu3.a && (copyOnWriteArrayList2 = (CopyOnWriteArrayList) xu3.h) != null && !copyOnWriteArrayList2.isEmpty()) {
                c b2 = dVar.b2();
                Iterator it = ((CopyOnWriteArrayList) xu3.h).iterator();
                while (it.hasNext()) {
                    ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, nqf);
                }
                return;
            }
            return;
        }
        hc9.now();
        dVar.getClass();
        nqf nqf2 = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (xu3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b22 = dVar.b2();
            Iterator it2 = ((CopyOnWriteArrayList) xu3.h).iterator();
            while (it2.hasNext()) {
                ((ImagePerfDataListener) it2.next()).onImageVisibilityUpdated(b22, nqf2);
            }
        }
    }

    public final void close() {
        this.b.Z1();
    }

    public final void onDraw() {
    }

    public final void onEmptyEvent(Object obj) {
        vu6 vu6 = vu6.X;
        d dVar = this.b;
        dVar.getClass();
        this.c.p(dVar, vu6);
    }

    public final void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.getClass();
        vu6 vu6 = vu6.o;
        xu3 xu3 = this.c;
        xu3.p(dVar, vu6);
        nqf nqf = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (xu3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) xu3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, nqf);
            }
        }
    }

    public final void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (ru6) obj;
        this.c.p(dVar, vu6.c);
    }

    public final void onIntermediateImageSet(String str, Object obj) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (ru6) obj;
        this.c.p(dVar, vu6.b);
    }

    public final void onRelease(String str, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        vu6 vu6 = vu6.Y;
        xu3 xu3 = this.c;
        xu3.p(dVar, vu6);
        nqf nqf = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (xu3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) xu3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, nqf);
            }
        }
    }

    public final void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.a2();
        dVar.getClass();
        dVar.c = str;
        dVar.X = obj;
        dVar.getClass();
        vu6 vu6 = vu6.a;
        xu3 xu3 = this.c;
        xu3.p(dVar, vu6);
        nqf nqf = nqf.b;
        dVar.getClass();
        dVar.getClass();
        if (xu3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) xu3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, nqf);
            }
        }
    }
}
