package defpackage;

import java.io.File;
import java.util.Arrays;

/* renamed from: mke  reason: default package */
public final /* synthetic */ class mke implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oke b;
    public final /* synthetic */ wd6 c;

    public /* synthetic */ mke(oke oke, wd6 wd6, int i) {
        this.a = i;
        this.b = oke;
        this.c = wd6;
    }

    public final void accept(Object obj) {
        wd6 wd6 = this.c;
        oke oke = this.b;
        switch (this.a) {
            case 0:
                nke nke = (nke) obj;
                oke.getClass();
                boolean z = nke.b;
                File file = nke.a;
                if (z) {
                    hm9.m("oke", "Has tam emoji font file", new Object[0]);
                    oke.d(file, wd6);
                    return;
                }
                hm9.m("oke", "Hasn't tam emoji font file", new Object[0]);
                hm9.m("oke", "Download font", new Object[0]);
                if (!cqc.c(oke.t0)) {
                    hm9.m("oke", "Font already downloading", new Object[0]);
                    return;
                }
                je7 je7 = oke.Z;
                ((gh3) je7.getValue()).c(oke);
                if (((gh3) je7.getValue()).b() != zh3.c) {
                    if (wd6 != null) {
                        wd6.y();
                    }
                    hm9.k0("oke", (Exception) null, "Can't download now. Waiting for Wi-Fi", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                iz9 iz9 = new iz9(new bd5(oke, file, 2), 0);
                fme fme = (fme) oke.a.getValue();
                fme.getClass();
                j1a o = new e0a(iz9, new dme(fme, 5, 2), 6).o(5, ft.g);
                hle hle = (hle) oke.X.getValue();
                hle.getClass();
                s1a r = o.r(((jle) hle).a());
                sd7 sd7 = new sd7(new u00((Object) oke, (Object) file, (Object) wd6, 28), new mke(oke, wd6, 2), ft.d);
                r.a(sd7);
                oke.t0 = sd7;
                return;
            case 1:
                ((cba) ((o45) oke.Y.getValue())).c(new Exception("Can't read emoji font", (Throwable) obj), true);
                if (wd6 != null) {
                    wd6.y();
                }
                oke.u0 = null;
                return;
            default:
                ((cba) ((o45) oke.Y.getValue())).c(new Exception("Can't download emoji font", (Throwable) obj), true);
                if (wd6 != null) {
                    wd6.y();
                }
                ((gh3) oke.Z.getValue()).e(oke);
                oke.u0 = null;
                return;
        }
    }
}
