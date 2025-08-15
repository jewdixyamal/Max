package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* renamed from: pq  reason: default package */
public final /* synthetic */ class pq implements f18 {
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen a;

    public /* synthetic */ pq(AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        this.a = appearanceSettingsMultiThemeScreen;
    }

    public final void a(int i, boolean z) {
        Object obj;
        Object value;
        er erVar;
        bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
        if (z) {
            kr m0 = this.a.m0();
            q0e q0e = m0.z0;
            er erVar2 = (er) q0e.getValue();
            if (erVar2 != null) {
                Iterator it = erVar2.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((int) ((fq) obj).getItemId()) == i) {
                        break;
                    }
                }
                fq fqVar = (fq) obj;
                if (fqVar != null) {
                    int ordinal = fqVar.a.ordinal();
                    qp4 qp4 = m0.y0;
                    jp jpVar = m0.c;
                    if (ordinal == 0) {
                        jpVar.y("app.night.mode.system");
                        qp4.k(fq9.b);
                    } else if (ordinal == 1) {
                        jpVar.y("app.night.mode");
                        qp4.k(cq9.b);
                    } else if (ordinal == 2) {
                        jpVar.y("app.night.mode.enabled");
                        qp4.k(dq9.b);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value = q0e.getValue();
                        er erVar3 = (er) value;
                        if (erVar3 != null) {
                            List<fq> list = erVar3.b;
                            ArrayList arrayList = new ArrayList(z53.S(list, 10));
                            for (fq fqVar2 : list) {
                                int itemId = (int) fqVar2.getItemId();
                                jqe jqe = fqVar2.c;
                                bq bqVar = fqVar2.a;
                                arrayList.add(itemId == i ? new fq(bqVar, Boolean.TRUE, jqe) : new fq(bqVar, Boolean.FALSE, jqe));
                            }
                            erVar = new er(m0.t(erVar3.a), arrayList, m0.s());
                        } else {
                            erVar = null;
                        }
                    } while (!q0e.c(value, erVar));
                }
            }
        }
    }
}
