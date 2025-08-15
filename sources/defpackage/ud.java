package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ud  reason: default package */
public abstract class ud {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<u2a> cls = u2a.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(zo6.class.getName(), "okhttp.Http2");
        linkedHashMap.put(foe.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = mz7.d0(linkedHashMap);
    }
}
