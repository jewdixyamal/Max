package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: ak9  reason: default package */
public final /* synthetic */ class ak9 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk9 b;

    public /* synthetic */ ak9(bk9 bk9, int i) {
        this.a = i;
        this.b = bk9;
    }

    public final void accept(Object obj) {
        b56 r1;
        switch (this.a) {
            case 0:
                bk9 bk9 = this.b;
                fef fef = (fef) obj;
                ((bq7) bk9.c).s(fef, bk9);
                hkf a2 = bk9.t0.a();
                a2.j = ((ok0) fef).a;
                a2.n = fef;
                hkf hkf = new hkf(a2);
                bk9.t0 = hkf;
                pl9 pl9 = (pl9) ((kk9) bk9.b);
                pl9.d(hkf);
                pl9.b(bk9);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                FrgLocalVideo frgLocalVideo = this.b.Z;
                if (frgLocalVideo != null) {
                    frgLocalVideo.Y(th);
                    return;
                }
                return;
            case 2:
                Long l = (Long) obj;
                bk9 bk92 = this.b;
                y38 y38 = bk92.x0;
                if (y38 != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) y38;
                    if (actLocalMedias.f1.Q0.isFocused() && actLocalMedias.g1.b.X) {
                        return;
                    }
                }
                hkf a3 = bk92.t0.a();
                a3.a = false;
                hkf hkf2 = new hkf(a3);
                bk92.t0 = hkf2;
                ((pl9) ((kk9) bk92.b)).d(hkf2);
                FrgLocalVideo frgLocalVideo2 = bk92.Z;
                if (frgLocalVideo2 != null && (r1 = frgLocalVideo2.r1()) != null) {
                    r1.c(false, true, false);
                    return;
                }
                return;
            default:
                Long l2 = (Long) obj;
                bk9 bk93 = this.b;
                hkf a4 = bk93.t0.a();
                bq7 bq7 = (bq7) bk93.c;
                a4.k = bq7.f();
                a4.l = bq7.d();
                hkf hkf3 = new hkf(a4);
                bk93.t0 = hkf3;
                ((pl9) ((kk9) bk93.b)).d(hkf3);
                return;
        }
    }
}
