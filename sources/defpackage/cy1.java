package defpackage;

import android.net.Uri;
import android.view.Surface;
import android.widget.SeekBar;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: cy1  reason: default package */
public final /* synthetic */ class cy1 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [pw1, java.lang.Exception] */
    public final void accept(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                xkf xkf = (xkf) obj;
                int i = CameraxCameraApiView.u0;
                if (xkf instanceof skf) {
                    skf skf = (skf) xkf;
                    if (skf.b == 0) {
                        z = false;
                    }
                    CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                    Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
                    if (!z) {
                        hm9.m(cls.getName(), "onVideoTaken", new Object[0]);
                        cx1 cx1 = cameraxCameraApiView.s0;
                        if (cx1 != null) {
                            File file = skf.a.b.c;
                            urb urb = ((rrb) ((rxd) cx1).b).o;
                            if (urb == null) {
                                urb = null;
                            }
                            pnf.n(urb, ((w9a) urb.s0).b(), (vx3) null, new trb(urb, file, (Continuation) null), 2);
                            return;
                        }
                        return;
                    }
                    hm9.m(cls.getName(), "onCameraError", new Object[0]);
                    cx1 cx12 = cameraxCameraApiView.s0;
                    if (cx12 != null) {
                        ((rxd) cx12).b0(new Exception(skf.c));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gr7 gr7 = (gr7) obj;
                gr7.d = ((fk9) this.b).C0.c;
                gr7.b = false;
                return;
            case 2:
                gr7 gr72 = (gr7) obj;
                gr72.b = ((Boolean) this.b).booleanValue();
                gr72.a = true;
                return;
            case 3:
                ((gr7) obj).e = (hr7) this.b;
                return;
            case 4:
                ((ol9) obj).m1(((SeekBar) this.b).getProgress());
                return;
            case 5:
                el9 el9 = (el9) obj;
                int checkedChipId = ((il9) this.b).s0.getCheckedChipId();
                hr7 hr7 = checkedChipId == xxb.layout_send_location__duration_20m ? hr7.c : checkedChipId == xxb.layout_send_location__duration_1h ? hr7.o : checkedChipId == xxb.layout_send_location__duration_3h ? hr7.X : checkedChipId == xxb.layout_send_location__duration_24h ? hr7.Y : checkedChipId == xxb.layout_send_location__duration_no_limit ? hr7.Z : hr7.X;
                el9.getClass();
                for (fk9 fk9 : (Set) el9.a) {
                    fk9.getClass();
                    fk9.b2(new cy1(3, hr7));
                }
                return;
            case 6:
                ((adc) this.b).J = (Uri) obj;
                return;
            case 7:
                cc0 cc0 = (cc0) obj;
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    int i2 = cc0.b - ((cb0) entry.getKey()).f;
                    if (((cb0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = e1f.i(i2);
                    iee iee = (iee) entry.getValue();
                    iee.getClass();
                    kq0.H(new ft0(iee, i3, -1, 5));
                }
                return;
            case 8:
                bc0 bc0 = (bc0) obj;
                u00 u00 = (u00) this.b;
                if (u00 != null) {
                    u00.f();
                    return;
                }
                return;
            case 9:
                ((lq1) this.b).b((bc0) obj);
                return;
            case 10:
                bc0 bc02 = (bc0) obj;
                zm4 zm4 = (zm4) this.b;
                zm4.getClass();
                bc02.b.hashCode();
                Surface surface = (Surface) zm4.g;
                Surface surface2 = bc02.b;
                if (surface2 == surface) {
                    zm4.g = null;
                    ((lq1) zm4.n).b((d15) zm4.f);
                    zm4.e();
                    return;
                }
                surface2.release();
                return;
            default:
                ejf ejf = (ejf) this.b;
                xkf xkf2 = (xkf) obj;
                if (xkf2 instanceof vkf) {
                    if (ejf.B0 != null) {
                        ejf.M0.o1(ejf, ejf.N0[0], j47.T(ejf.t0, (lx3) null, vx3.b, new cjf(ejf, (Continuation) null), 1));
                        return;
                    }
                    return;
                } else if (xkf2 instanceof skf) {
                    skf skf2 = (skf) xkf2;
                    if (skf2.b == 0) {
                        z = false;
                    }
                    Class<ejf> cls2 = ejf.class;
                    if (!z) {
                        String name = cls2.getName();
                        ir6 ir6 = hm9.m;
                        if (ir6 != null && ir6.c()) {
                            ir6.d(us7.X, name, "onVideoTaken", (Throwable) null);
                        }
                        h7b h7b = ejf.u0;
                        if (h7b != null) {
                            ((AtomicReference) h7b.c).set(si5.a);
                            ((CountDownLatch) h7b.b).countDown();
                        }
                    } else {
                        String name2 = cls2.getName();
                        Throwable th = skf2.c;
                        hm9.p(name2, wg0.i("onCameraError: ", th != null ? th.getLocalizedMessage() : null), skf2.c);
                        h7b h7b2 = ejf.u0;
                        if (h7b2 != null) {
                            ((AtomicReference) h7b2.c).set(ri5.a);
                            ((CountDownLatch) h7b2.b).countDown();
                        }
                    }
                    ejf.u0 = null;
                    return;
                } else {
                    return;
                }
        }
    }
}
