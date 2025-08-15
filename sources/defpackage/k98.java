package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: k98  reason: default package */
public final /* synthetic */ class k98 implements pj3, u98, mm7, km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;

    public /* synthetic */ k98(w98 w98, int i) {
        this.a = i;
        this.b = w98;
    }

    public void accept(Object obj) {
        y88 y88 = (y88) obj;
        switch (this.a) {
            case 0:
                ffc ffc = this.b.p;
                y88.g();
                return;
            case LangUtils.HASH_SEED /*17*/:
                a98 a98 = this.b.a;
                y88.e();
                return;
            default:
                ffc ffc2 = this.b.p;
                y88.g();
                return;
        }
    }

    public void c(qr6 qr6, int i) {
        switch (this.a) {
            case 1:
                qr6.C(this.b.c, i);
                return;
            case 2:
                qr6.S(this.b.c, i);
                return;
            case 3:
                qr6.V(this.b.c, i);
                return;
            case 4:
                qr6.v0(this.b.c, i);
                return;
            case 5:
                qr6.r0(this.b.c, i);
                return;
            case 7:
                qr6.G(this.b.c, i);
                return;
            case 8:
                qr6.O(this.b.c, i);
                return;
            case 9:
                qr6.e(this.b.c, i);
                return;
            case 10:
                qr6.z(this.b.c, i);
                return;
            case 11:
                qr6.p(this.b.c, i);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                qr6.x0(this.b.c, i);
                return;
            case 13:
                qr6.Y(this.b.c, i);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                qr6.w(this.b.c, i);
                return;
            default:
                qr6.a0(this.b.c, i);
                return;
        }
    }

    public void d(Object obj, tm5 tm5) {
        w98 w98 = this.b;
        w98.getClass();
        ((n3b) obj).Y(w98.a, new l3b(tm5));
    }

    public void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 16:
                n3b.q0(this.b.t);
                return;
            default:
                n3b.q0(this.b.t);
                return;
        }
    }

    public /* synthetic */ k98(w98 w98, z9d z9d) {
        this.a = 17;
        this.b = w98;
    }
}
