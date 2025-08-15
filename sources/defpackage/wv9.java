package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: wv9  reason: default package */
public final class wv9 extends ffe implements a66 {
    public final /* synthetic */ NotificationTamService X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ boolean t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ String v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wv9(NotificationTamService notificationTamService, long j, long j2, long j3, boolean z, long j4, String str, Continuation continuation) {
        super(2, continuation);
        this.X = notificationTamService;
        this.Y = j;
        this.Z = j2;
        this.s0 = j3;
        this.t0 = z;
        this.u0 = j4;
        this.v0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wv9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wv9(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        NotificationTamService notificationTamService = this.X;
        p7c p7c = (p7c) notificationTamService.Z.getValue();
        p7c.getClass();
        long j = this.Y;
        p7c.e(p7c, j, this.Z, this.s0, false, false, this.t0, 88);
        ((cea) p7c.b.getValue()).a(j);
        rx9 e = ((qx9) notificationTamService.s0.getValue()).e();
        e.getClass();
        StringBuilder sb = new StringBuilder("onNotificationMarkAsRead: pushId=");
        long j2 = this.u0;
        sb.append(j2);
        sb.append(", eventKey=");
        String str = this.v0;
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = rx9.d;
        hm9.m(str2, sb2, new Object[0]);
        if (str != null) {
            try {
                e.b().b("Action", br7.f(new kpa("trid", Long.valueOf(j2)), new kpa("eKey", str), new kpa("p_op", "m_as_read")));
            } catch (Exception e2) {
                hm9.p(str2, "onNotificationMarkAsRead: failed", e2);
                ((cba) e.c()).c(new Exception("failed to log mark as read", e2), true);
            }
        }
        return e5f.a;
    }
}
