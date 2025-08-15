package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u40  reason: default package */
public final class u40 {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public u40(yb9 yb9, zw6 zw6) {
        this.d = new ArrayList();
        yb9.getClass();
        this.e = new k74(false, true);
        this.g = j60.e;
        this.h = m60.a;
        this.f = new h60(zw6);
    }

    public static boolean f(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        qz7 qz7 = new qz7((Object) nje.b, 9, (Object) totalCaptureResult);
        Set set = vv3.a;
        boolean z2 = qz7.N() == 2 || qz7.N() == 1 || vv3.a.contains(qz7.A());
        boolean z3 = qz7.M() == 2;
        boolean z4 = !z ? z3 || vv3.c.contains(qz7.v()) : z3 || vv3.d.contains(qz7.v());
        boolean z5 = qz7.O() == 2 || vv3.b.contains(qz7.r());
        Objects.toString(qz7.v());
        Objects.toString(qz7.A());
        Objects.toString(qz7.r());
        return z2 && z4 && z5;
    }

    public static boolean g(int i, TotalCaptureResult totalCaptureResult) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        return num != null && num.intValue() == 4;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((iv1) it.next());
        }
    }

    public void b(iv1 iv1) {
        ArrayList arrayList = (ArrayList) this.d;
        if (!arrayList.contains(iv1)) {
            arrayList.add(iv1);
        }
    }

    public void c(ce3 ce3) {
        for (aa0 aa0 : ce3.g()) {
            mi9 mi9 = (mi9) this.f;
            mi9.getClass();
            try {
                mi9.h(aa0);
            } catch (IllegalArgumentException unused) {
            }
            ((mi9) this.f).d(aa0, ce3.q(aa0), ce3.h(aa0));
        }
    }

    public kz1 d() {
        ArrayList arrayList = new ArrayList((HashSet) this.e);
        wma a2 = wma.a((mi9) this.f);
        int i = this.c;
        boolean z = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        boolean z2 = this.b;
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        ui9 ui9 = (ui9) this.g;
        for (String str : ui9.a.keySet()) {
            arrayMap.put(str, ui9.a.get(str));
        }
        return new kz1(arrayList, a2, i, z, arrayList2, z2, new nje(arrayMap), (pv1) this.h);
    }

    public su1 e(int i, int i2, int i3) {
        bj6 bj6 = (bj6) this.f;
        oq0 oq0 = new oq0(bj6, 4);
        su1 su1 = new su1(this.c, (Executor) this.g, (ScheduledExecutorService) this.h, (st1) this.d, this.b, oq0);
        ArrayList arrayList = su1.h;
        st1 st1 = (st1) this.d;
        if (i == 0) {
            arrayList.add(new ou1(st1));
        }
        if (i2 == 3) {
            arrayList.add(new xu1(st1, (Executor) this.g, (ScheduledExecutorService) this.h, new w4d(bj6)));
        } else if (this.a) {
            boolean z = ((ae3) this.e).b;
            if (z || this.c == 3 || i3 == 1) {
                arrayList.add(new zu1((st1) this.d, i2, (Executor) this.g, (ScheduledExecutorService) this.h, !z && ((AtomicInteger) st1.o.c).get() <= 0));
            } else {
                arrayList.add(new nu1(st1, i2, oq0));
            }
        }
        Objects.toString(arrayList);
        return su1;
    }

    public boolean h() {
        return !((ByteBuffer) this.h).hasRemaining() && this.c >= ((ArrayList) this.d).size() && ((k74) this.e).e();
    }

    public w40 i(lv4 lv4, qy5 qy5) {
        fm9.f(qy5.D != -1);
        try {
            w40 w40 = new w40((j60) this.g, lv4, qy5);
            if (Objects.equals((j60) this.g, j60.e)) {
                j60 j60 = w40.a;
                this.g = j60;
                ((h60) this.f).a(j60);
                ((h60) this.f).b();
            }
            ((ArrayList) this.d).add(new t40(w40));
            LinkedHashMap linkedHashMap = d54.a;
            synchronized (d54.class) {
            }
            return w40;
        } catch (AudioProcessor$UnhandledAudioFormatException e2) {
            throw ExportException.b(e2, "Error while registering input " + ((ArrayList) this.d).size());
        }
    }

    public u40(st1 st1, xv1 xv1, bj6 bj6, q6d q6d, zh6 zh6) {
        boolean z = true;
        this.c = 1;
        this.d = st1;
        Integer num = (Integer) xv1.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.b = (num == null || num.intValue() != 2) ? false : z;
        this.g = q6d;
        this.h = zh6;
        this.f = bj6;
        this.e = new ae3(bj6, 8);
        this.a = kq0.s(new ync(23, xv1));
    }

    public u40() {
        this.e = new HashSet();
        this.f = mi9.b();
        this.c = -1;
        this.a = false;
        this.d = new ArrayList();
        this.b = false;
        this.g = ui9.a();
    }

    public u40(kz1 kz1) {
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = mi9.b();
        this.c = -1;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = false;
        this.g = ui9.a();
        hashSet.addAll(kz1.a);
        this.f = mi9.c(kz1.b);
        this.c = kz1.c;
        arrayList.addAll(kz1.e);
        this.b = kz1.f;
        ArrayMap arrayMap = new ArrayMap();
        nje nje = kz1.g;
        for (String str : nje.a.keySet()) {
            arrayMap.put(str, nje.a.get(str));
        }
        this.g = new nje(arrayMap);
        this.a = kz1.d;
    }
}
