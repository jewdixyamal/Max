package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: uj9  reason: default package */
public final /* synthetic */ class uj9 implements l66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj9 b;

    public /* synthetic */ uj9(zj9 zj9, int i) {
        this.a = i;
        this.b = zj9;
    }

    public final Object apply(Object obj) {
        oq7 oq7 = (oq7) obj;
        switch (this.a) {
            case 0:
                awa awa = this.b.u0;
                oq7.m = (awa == null || awa.o == null) ? false : true;
                return oq7;
            case 1:
                zj9 zj9 = this.b;
                boolean z = zj9.B0;
                oq7.e = z;
                boolean z2 = false;
                oq7.g = false;
                oq7.h = false;
                oq7.a = z;
                FrgLocalMedia k0 = ((ActLocalMedias) zj9.c).k0();
                if (k0 != null) {
                    z2 = k0 instanceof FrgLocalVideo;
                }
                oq7.f = z2;
                return oq7;
            case 2:
                boolean z3 = this.b.B0;
                oq7.g = z3;
                oq7.h = z3;
                oq7.e = false;
                return oq7;
            case 3:
                zj9 zj92 = this.b;
                up7 up7 = zj92.X;
                p4d p4d = zj92.w0;
                int g = p4d.g(up7);
                oq7.j = g > 0 || p4d.c().size() < 100;
                oq7.k = g;
                return oq7;
            default:
                awa awa2 = this.b.u0;
                oq7.l = (awa2 == null || awa2.b == null) ? false : true;
                return oq7;
        }
    }
}
