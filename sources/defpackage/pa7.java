package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: pa7  reason: default package */
public final class pa7 implements p05 {
    public static final ma7 e = new ma7(0);
    public static final na7 f = new na7(0);
    public static final na7 g = new na7(1);
    public static final oa7 h = new Object();
    public final HashMap a;
    public final HashMap b;
    public final ma7 c = e;
    public boolean d = false;

    public pa7() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, h);
        hashMap.remove(cls3);
    }

    public final p05 a(Class cls, my9 my9) {
        this.a.put(cls, my9);
        this.b.remove(cls);
        return this;
    }
}
