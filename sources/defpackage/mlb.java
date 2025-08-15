package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: mlb  reason: default package */
public final /* synthetic */ class mlb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qlb b;

    public /* synthetic */ mlb(qlb qlb, int i) {
        this.a = i;
        this.b = qlb;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cnb r0 = ((ProfileScreen) this.b.X).r0();
                j47.T(r0.a, ((w9a) r0.u()).a(), (vx3) null, new smb(r0, (Continuation) null), 2);
                return;
            case 1:
                cnb r02 = ((ProfileScreen) this.b.X).r0();
                Long i = r02.O0.i();
                if (i != null) {
                    pnf.o(r02.A0, new lkb(i.longValue()));
                    return;
                }
                return;
            case 2:
                cnb r03 = ((ProfileScreen) this.b.X).r0();
                Long i2 = r03.O0.i();
                if (i2 != null) {
                    pnf.o(r03.A0, new hkb(i2.longValue(), ek2.ADMIN));
                    return;
                }
                return;
            case 3:
                cnb r04 = ((ProfileScreen) this.b.X).r0();
                vxd T = j47.T(r04.a, ((w9a) r04.u()).b(), (vx3) null, new lmb(r04, (Continuation) null), 2);
                r04.C0.o1(r04, cnb.S0[1], T);
                return;
            case 4:
                cnb r05 = ((ProfileScreen) this.b.X).r0();
                pnf.o(r05.z0, new ylb((List) ((zcb) r05.F0.getValue()).l.getValue()));
                return;
            default:
                cnb r06 = ((ProfileScreen) this.b.X).r0();
                Long i3 = r06.O0.i();
                if (i3 != null) {
                    pnf.o(r06.A0, new hkb(i3.longValue(), ek2.MEMBER));
                    return;
                }
                return;
        }
    }
}
