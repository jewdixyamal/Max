package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DumpCallback;
import org.webrtc.PeerConnectionFactory;

/* renamed from: cy0  reason: default package */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cy0(da8 da8, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i) {
        this.a = 2;
        this.c = da8;
        this.o = atomicInteger;
        this.X = list;
        this.Y = arrayList;
        this.b = i;
    }

    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                py0 py0 = (py0) this.c;
                String str = (String) this.o;
                int i = this.b;
                Set set = (Set) this.X;
                DumpCallback dumpCallback = (DumpCallback) this.Y;
                py0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = py0.k1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis((long) i), set, dumpCallback);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    py0.V0.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                int i2 = this.b + 1;
                a81 a81 = (a81) ((k56) this.X);
                x5 x5Var = (x5) ((k56) this.Y);
                f81 f81 = (f81) this.c;
                f81.getClass();
                ViewPager2 viewPager2 = (ViewPager2) this.o;
                if (!viewPager2.isInLayout()) {
                    a81.invoke();
                    return;
                } else if (i2 == 5) {
                    x5Var.invoke();
                    return;
                } else {
                    viewPager2.post(new cy0(f81, viewPager2, i2, a81, x5Var, 1));
                    return;
                }
            case 2:
                da8 da8 = (da8) this.c;
                da8.getClass();
                int incrementAndGet = ((AtomicInteger) this.o).incrementAndGet();
                List list = (List) this.X;
                if (incrementAndGet == list.size()) {
                    int i3 = 0;
                    while (true) {
                        List list2 = (List) this.Y;
                        if (i3 < list2.size()) {
                            bm7 bm7 = (bm7) list2.get(i3);
                            if (bm7 != null) {
                                try {
                                    bitmap = (Bitmap) fm9.C(bm7);
                                } catch (CancellationException | ExecutionException e) {
                                    z04.s(e, "Failed to get bitmap");
                                }
                                da8.g.p(gf7.g((tb8) list.get(i3), bitmap), this.b + i3);
                                i3++;
                            }
                            bitmap = null;
                            da8.g.p(gf7.g((tb8) list.get(i3), bitmap), this.b + i3);
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                ri8 ri8 = (ri8) this.Y;
                si8 si8 = (si8) this.c;
                if (!si8.f.i()) {
                    boolean isActive = si8.j.a.a.isActive();
                    y9d y9d = (y9d) this.o;
                    int i4 = this.b;
                    vi8 vi8 = (vi8) this.X;
                    if (!isActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(y9d == null ? Integer.valueOf(i4) : y9d.b);
                        sb.append(", pid=");
                        sb.append(vi8.a.b);
                        z04.c0(sb.toString());
                        return;
                    }
                    oh8 R = si8.R(vi8);
                    m5d m5d = si8.e;
                    if (y9d != null) {
                        if (!m5d.I(R, y9d)) {
                            return;
                        }
                    } else if (!m5d.H(R, i4)) {
                        return;
                    }
                    try {
                        ri8.b(R);
                        return;
                    } catch (RemoteException e2) {
                        z04.d0("Exception in " + R, e2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ cy0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
        this.X = obj3;
        this.Y = obj4;
    }
}
