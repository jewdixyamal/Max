package defpackage;

import java.util.LinkedHashMap;

/* renamed from: xnf  reason: default package */
public final class xnf {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        for (qnf b : linkedHashMap.values()) {
            b.b();
        }
        linkedHashMap.clear();
    }
}
