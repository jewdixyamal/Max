package defpackage;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: vu1  reason: default package */
public final /* synthetic */ class vu1 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu1 b;

    public /* synthetic */ vu1(xu1 xu1, int i) {
        this.a = i;
        this.b = xu1;
    }

    public bm7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                xs5 xs5 = this.b.a.h;
                return st1.t(xs5.a.e, 5) != 5 ? dw6.c : f8.g(new fe4(xs5, true, 1));
            case 2:
                xu1 xu1 = this.b;
                xu1.getClass();
                return f8.g(new vu1(xu1, 0));
            case 3:
                xs5 xs52 = this.b.a.h;
                xs52.getClass();
                return f8.g(new q64(28, (Object) xs52));
            default:
                un0 un0 = new un0(12);
                xu1 xu12 = this.b;
                ScheduledExecutorService scheduledExecutorService = xu12.c;
                long millis = TimeUnit.NANOSECONDS.toMillis(xu1.f);
                uu1 uu1 = new uu1(un0);
                st1 st1 = xu12.a;
                st1.p(uu1);
                wt1 wt1 = new wt1(st1, 4, uu1);
                oq1 oq1 = uu1.b;
                oq1.b.d(wt1, st1.c);
                return f8.g(new vg4(oq1, scheduledExecutorService, millis));
        }
    }

    public String q(lq1 lq1) {
        xu1 xu1 = this.b;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) xu1.e.b;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(st1.t(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        if (!z) {
            lq1.b((Object) null);
            return "EnableTorchInternal";
        }
        xu1.a.r(true);
        lq1.b((Object) null);
        return "EnableTorchInternal";
    }
}
