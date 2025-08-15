package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: al4  reason: default package */
public final /* synthetic */ class al4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl4 b;
    public final /* synthetic */ cl4 c;

    public /* synthetic */ al4(bl4 bl4, cl4 cl4, int i) {
        this.a = i;
        this.b = bl4;
        this.c = cl4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                cl4 cl4 = this.c;
                m5b m5b = cl4.b;
                y7g c2 = m5b.c(cl4.e);
                sh0 d = m5b.d();
                o55 o55 = cl4.c;
                return new du0((lg5) this.b.a.getValue(), c2, d, o55.h(), o55.e(), cl4.d);
            case 1:
                cl4 cl42 = this.c;
                m5b m5b2 = cl42.b;
                y7g c3 = m5b2.c(cl42.e);
                sh0 d2 = m5b2.d();
                o55 o552 = cl42.c;
                return new du0((lg5) this.b.c.getValue(), c3, d2, o552.h(), o552.e(), cl42.d);
            default:
                Map map = (Map) this.b.e.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    cl4 cl43 = this.c;
                    m5b m5b3 = cl43.b;
                    y7g c4 = m5b3.c(cl43.e);
                    sh0 d3 = m5b3.d();
                    o55 o553 = cl43.c;
                    linkedHashMap.put(key, new du0((lg5) entry.getValue(), c4, d3, o553.h(), o553.e(), cl43.d));
                }
                return new HashMap(linkedHashMap);
        }
    }
}
