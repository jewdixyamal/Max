package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: kl6  reason: default package */
public final /* synthetic */ class kl6 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ kl6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(fm9.p(((vk6) obj).k(), this.b));
            default:
                hx8 hx8 = (hx8) obj;
                List list = this.b;
                boolean z = true;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            hx8 hx82 = (hx8) it.next();
                            if (tpa.f(hx82.a.b, hx8.a.b) && hx82.b >= hx8.b) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
