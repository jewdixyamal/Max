package defpackage;

import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: r33  reason: default package */
public final /* synthetic */ class r33 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ r33(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                if (str.startsWith("app.pin") && (obj2 instanceof String)) {
                    this.b.put(str, (String) obj2);
                    return;
                }
                return;
            default:
                pp3 pp3 = (pp3) obj2;
                pp3.getClass();
                ky7 ky7 = new ky7();
                ky7.put("firstName", pp3.a);
                String str2 = pp3.b;
                if (!(str2 == null || str2.length() == 0)) {
                    ky7.put("lastName", str2);
                }
                this.b.put(str, ky7.b());
                return;
        }
    }
}
