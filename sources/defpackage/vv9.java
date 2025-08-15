package defpackage;

import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: vv9  reason: default package */
public final /* synthetic */ class vv9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationTamService b;

    public /* synthetic */ vv9(NotificationTamService notificationTamService, int i) {
        this.a = i;
        this.b = notificationTamService;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                jyc jyc = this.b.a;
                if (jyc == null) {
                    jyc = null;
                }
                return jyc.q();
            case 1:
                NotificationTamService notificationTamService = this.b;
                jyc jyc2 = notificationTamService.a;
                jyc jyc3 = null;
                if (jyc2 == null) {
                    jyc2 = null;
                }
                nx3 b2 = ((w9a) jyc2.s()).b();
                jyc jyc4 = notificationTamService.a;
                if (jyc4 != null) {
                    jyc3 = jyc4;
                }
                return j1e.a(b2.plus(new qj(jyc3.i())).plus(f46.a()));
            case 2:
                jyc jyc5 = this.b.a;
                if (jyc5 == null) {
                    jyc5 = null;
                }
                return (cea) jyc5.l().f.getValue();
            case 3:
                jyc jyc6 = this.b.a;
                if (jyc6 == null) {
                    jyc6 = null;
                }
                return jyc6.f();
            case 4:
                jyc jyc7 = this.b.a;
                if (jyc7 == null) {
                    jyc7 = null;
                }
                return ((k24) ((c34) jyc7.getAccessor().c(c34.class))).b;
            case 5:
                jyc jyc8 = this.b.a;
                if (jyc8 == null) {
                    jyc8 = null;
                }
                return (p7c) jyc8.getAccessor().c(p7c.class);
            case 6:
                jyc jyc9 = this.b.a;
                if (jyc9 == null) {
                    jyc9 = null;
                }
                return (qx9) jyc9.l().h.getValue();
            default:
                jyc jyc10 = this.b.a;
                if (jyc10 == null) {
                    jyc10 = null;
                }
                return (rw9) jyc10.l().g.getValue();
        }
    }
}
