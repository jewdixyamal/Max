package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zk4  reason: default package */
public final /* synthetic */ class zk4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl4 b;

    public /* synthetic */ zk4(cl4 cl4, int i) {
        this.a = i;
        this.b = cl4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new bl4(this.b);
            case 1:
                cl4 cl4 = this.b;
                return cl4.a.h(cl4.f);
            case 2:
                cl4 cl42 = this.b;
                return cl42.a.h(cl42.g);
            default:
                cl4 cl43 = this.b;
                Map map = cl43.h;
                if (map == null) {
                    return oz4.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), cl43.a.h((uk4) entry.getValue()));
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ zk4(cl4 cl4, bl4 bl4) {
        this.a = 3;
        this.b = cl4;
    }
}
