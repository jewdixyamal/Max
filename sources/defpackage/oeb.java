package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: oeb  reason: default package */
public final /* synthetic */ class oeb implements k64 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ oeb(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final Object a() {
        rdb rdb;
        rdb.b.getClass();
        Iterator it = rdb.Y.iterator();
        do {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                rdb = (rdb) u1Var.next();
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } while (!tpa.f(rdb.a, this.c));
        return new ProfileEditAdminPermissionsWidget(this.a, this.b, rdb);
    }
}
