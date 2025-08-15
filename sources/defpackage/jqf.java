package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: jqf  reason: default package */
public final /* synthetic */ class jqf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqf b;

    public /* synthetic */ jqf(lqf lqf, int i) {
        this.a = i;
        this.b = lqf;
    }

    public final void run() {
        lqf lqf = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                lqf.getClass();
                q9b.s0.Y.a(lqf.m);
                return;
            case 1:
                ((mqf) lqf.a.getValue()).a();
                ike ike = (ike) lqf.c.getValue();
                ike.getClass();
                hm9.m("ike", "syncAll", new Object[0]);
                ike.e.b(new av2((Object) ike, (Object) Collections.emptyList(), true, 4));
                return;
            default:
                mqf mqf = (mqf) lqf.a.getValue();
                eua eua = (eua) lqf.e.getValue();
                eua.getClass();
                String[] strArr = eua.d;
                int i = 0;
                while (true) {
                    if (i < 2) {
                        String str = strArr[i];
                        imc imc = eua.c;
                        if (((SharedPreferences) ((khe) imc.c).getValue()).getBoolean(str, false) || z7.c(eua.a, str) != 0) {
                            i++;
                        } else {
                            hm9.m("lqf", "forceContactsSync", new Object[0]);
                            String[] strArr2 = eua.d;
                            boolean b2 = eua.b(eua.f);
                            SharedPreferences.Editor edit = ((SharedPreferences) ((khe) imc.c).getValue()).edit();
                            for (int i2 = 0; i2 < 2; i2++) {
                                edit.putBoolean(strArr2[i2], b2);
                            }
                            edit.apply();
                        }
                    } else {
                        z = false;
                    }
                }
                mqf.b(z);
                return;
        }
    }
}
