package defpackage;

import android.os.Bundle;

/* renamed from: loa  reason: default package */
public final class loa implements eh7, isc {
    public gh7 a;
    public td b;
    public boolean c;
    public Bundle o;

    public static final void a(loa loa, uu3 uu3, uu3 uu32, zu3 zu3, av3 av3) {
        if (uu3 == uu32 && !av3.b && zu3.d() && uu32.getView() != null) {
            gh7 gh7 = loa.a;
            td tdVar = null;
            if ((gh7 == null ? null : gh7).d == fg7.X) {
                if (gh7 == null) {
                    gh7 = null;
                }
                gh7.d(eg7.ON_PAUSE);
                Bundle bundle = new Bundle();
                loa.o = bundle;
                td tdVar2 = loa.b;
                if (tdVar2 != null) {
                    tdVar = tdVar2;
                }
                tdVar.u(bundle);
                loa.c = true;
            }
        }
    }

    public final gh7 Q() {
        gh7 gh7 = this.a;
        if (gh7 == null) {
            return null;
        }
        return gh7;
    }

    public final mm y() {
        td tdVar = this.b;
        if (tdVar == null) {
            tdVar = null;
        }
        return (mm) tdVar.o;
    }
}
