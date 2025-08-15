package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: ckb  reason: default package */
public final class ckb extends u2 {
    public static final ckb c = new u2(8);

    public static c64 b2(long j, long j2) {
        return new c64(zr6.k(au1.k(j, ":profile/edit/admin_permission?chat_id=", "&contact_id="), j2, "&permissions_type=change_admin"));
    }

    public final void Z1(long j) {
        f64 P1 = P1();
        P1.b(":profile/add-members?chat_id=" + j, (Bundle) null);
    }

    public final void a2(long j) {
        P1().b(ey8.i(j, ":chats?id=", "&type=local"), (Bundle) null);
    }

    public final void c2(long j) {
        f64 P1 = P1();
        P1.b(":profile/invite?id=" + j, (Bundle) null);
    }

    public final void d2(long j, String str) {
        f64 P1 = P1();
        P1.b(":profile/members?id=" + j + "&type=" + str, (Bundle) null);
    }

    public final void e2(long j) {
        f64 P1 = P1();
        y7g y7g = new y7g(13);
        y7g.b = ":profile";
        y7g.D(Long.valueOf(j), "id");
        y7g.D("contact", "type");
        P1.c(y7g.r(), (Bundle) null);
    }

    public final void f2() {
        Activity d;
        if (!P1().d() && (d = ((haa) P1().a()).f().C().d()) != null) {
            d.finish();
        }
    }
}
