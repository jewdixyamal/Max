package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.nano.Protos;

/* renamed from: l40  reason: default package */
public final /* synthetic */ class l40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l40(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        List<xf4> list;
        ScheduledFuture scheduledFuture;
        n05 n05;
        ax1 c2;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                n40 n40 = (n40) ((m40) this.c).c;
                n40.getClass();
                int i3 = this.b;
                if (i3 == -3 || i3 == -2) {
                    if (i3 != -2) {
                        g30 g30 = (g30) n40.i;
                        if (!(g30 != null && g30.a == 1)) {
                            n40.c(3);
                            return;
                        }
                    }
                    n75 n75 = (n75) n40.h;
                    if (n75 != null) {
                        t75 t75 = n75.a;
                        boolean u = t75.u();
                        if (u) {
                            i2 = 2;
                        }
                        t75.p2(0, i2, u);
                    }
                    n40.c(2);
                    return;
                } else if (i3 == -1) {
                    n75 n752 = (n75) n40.h;
                    if (n752 != null) {
                        t75 t752 = n752.a;
                        boolean u2 = t752.u();
                        if (!u2) {
                            i = 1;
                        }
                        t752.p2(-1, i, u2);
                    }
                    n40.a();
                    return;
                } else if (i3 == 1) {
                    n40.c(1);
                    n75 n753 = (n75) n40.h;
                    if (n753 != null) {
                        t75 t753 = n753.a;
                        t753.p2(1, 1, t753.u());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                n40 n402 = (n40) ((m40) this.c).c;
                n402.getClass();
                int i4 = this.b;
                if (i4 == -3 || i4 == -2) {
                    if (i4 != -2) {
                        h30 h30 = (h30) n402.i;
                        if (!(h30 != null && h30.a == 1)) {
                            n402.c(4);
                            return;
                        }
                    }
                    o75 o75 = (o75) n402.h;
                    if (o75 != null) {
                        u75 u75 = o75.a;
                        u75.s2(0, 1, u75.u());
                    }
                    n402.c(3);
                    return;
                } else if (i4 == -1) {
                    o75 o752 = (o75) n402.h;
                    if (o752 != null) {
                        u75 u752 = o752.a;
                        u752.s2(-1, 2, u752.u());
                    }
                    n402.a();
                    n402.c(1);
                    return;
                } else if (i4 != 1) {
                    ey8.k(i4, "Unknown focus change type: ");
                    return;
                } else {
                    n402.c(2);
                    o75 o753 = (o75) n402.h;
                    if (o753 != null) {
                        u75 u753 = o753.a;
                        u753.s2(1, 1, u753.u());
                        return;
                    }
                    return;
                }
            case 2:
                qt0 qt0 = (qt0) this.c;
                int i5 = qt0.l;
                int i6 = this.b;
                if (i5 != i6) {
                    int i7 = qt0.h;
                    qt0.l = (i6 / i7) * i7;
                    return;
                }
                return;
            case 3:
                hl1 hl1 = CallServiceImpl.s0;
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                if (!((wr1) ((kr1) callServiceImpl.b.getValue())).p()) {
                    b8d.a(callServiceImpl, 1);
                    callServiceImpl.stopSelfResult(this.b);
                    return;
                }
                return;
            case 4:
                ((iv1) this.c).a(this.b);
                return;
            case 5:
                ((lw1) this.c).b = this.b;
                return;
            case 6:
                int i8 = this.b;
                Iterator it = ((LinkedHashSet) this.c).iterator();
                while (it.hasNext()) {
                    jhe jhe = (jhe) ((ihe) it.next());
                    if (i8 == 5) {
                        synchronized (jhe.o) {
                            try {
                                if (jhe.l() && (list = jhe.p) != null) {
                                    for (xf4 a2 : list) {
                                        a2.a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        jhe.getClass();
                    }
                }
                return;
            case 7:
                t54 t54 = (t54) this.c;
                t54.getClass();
                VpxDecoderWrapper.DecoderKind decoderKind = VpxDecoderWrapper.DecoderKind.values()[au1.s(this.b)];
                VpxDecoderWrapper vpxDecoderWrapper = t54.a;
                vpxDecoderWrapper.init(decoderKind);
                vpxDecoderWrapper.setFrameHandler(t54);
                vpxDecoderWrapper.setErrorCallback(t54);
                vpxDecoderWrapper.setDesiredFps(10);
                return;
            case 8:
                b15 b15 = (b15) this.c;
                boolean z = b15.j;
                d15 d15 = b15.k;
                if (z) {
                    String str = d15.a;
                    return;
                }
                switch (au1.s(d15.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        d15.k.offer(Integer.valueOf(this.b));
                        d15.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15.D)));
                }
            case 9:
                ((z15) this.c).P0(this.b + 1);
                return;
            case 10:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                return;
            case 11:
                ((w98) this.c).j.remove(Integer.valueOf(this.b));
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((sv8) this.c).h(this.b);
                return;
            case 13:
                adc adc = (adc) this.c;
                int i9 = adc.g0;
                int i10 = this.b;
                adc.g0 = i10;
                if (i9 == i10) {
                    return;
                }
                if (i10 == 3) {
                    if (adc.B == null) {
                        wj4 wj4 = adc.e0;
                        if (wj4 != null) {
                            if (!wj4.b) {
                                wj4.b = true;
                                ScheduledFuture scheduledFuture2 = (ScheduledFuture) wj4.f;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    wj4.f = null;
                                }
                            }
                            adc.e0 = null;
                        }
                        adc.v(false);
                        return;
                    }
                    adc.Z = true;
                    nb0 nb0 = adc.q;
                    if (nb0 != null && !nb0.w0) {
                        adc.s(nb0, 4, (IOException) null);
                        return;
                    }
                    return;
                } else if (i10 == 2 && (scheduledFuture = adc.Y) != null && scheduledFuture.cancel(false) && (n05 = adc.F) != null) {
                    adc.r(n05);
                    return;
                } else {
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((tu0) this.c).w(this.b);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                cnc cnc = (cnc) this.c;
                if (cnc.c.get()) {
                    lw1 lw1 = (lw1) cnc.a.b;
                    pt6 pt6 = lw1.e;
                    int i11 = this.b;
                    if (pt6.B(i11) && (c2 = pt6.c()) != null) {
                        pt6.p.a = pt6.h(c2, false);
                    }
                    fu6 fu6 = lw1.d;
                    int k = fu6.k();
                    if (fu6.B(i11) && fu6.t != null) {
                        fu6.t = f46.O(Math.abs(kp.C(i11) - kp.C(k)), fu6.t);
                    }
                    rdf rdf = lw1.f;
                    if (rdf.B(i11)) {
                        rdf.P();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.A(this.b, view, false);
                    return;
                }
                return;
            default:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
        }
    }
}
