package ru.ok.tracer;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Lw07;", "Lkye;", "<init>", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1})
public final class TracerInitializer implements w07 {
    public final List a() {
        return Collections.singletonList(LoggerInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [qi8, java.lang.Object] */
    public final Object b(Context context) {
        kye kye = kye.a;
        if (!kye.g.getAndSet(true)) {
            kye.d = context;
            if (context instanceof ri6) {
                try {
                    List d = kye.d((ri6) context);
                    int Z = mz7.Z(z53.S(d, 10));
                    if (Z < 16) {
                        Z = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
                    for (Object next : d) {
                        linkedHashMap.put(((nye) next).a(), next);
                    }
                    kye.j = linkedHashMap;
                } catch (Exception unused) {
                }
            }
            kye kye2 = kye.a;
            Object obj = kye.c().get(ote.b);
            kbd kbd = null;
            gx3 gx3 = obj instanceof gx3 ? (gx3) obj : null;
            if (gx3 == null) {
                gx3 = new gx3(new ph4(14));
            }
            PackageInfo u = ote.u(context.getPackageManager(), context.getPackageName());
            String str = u.packageName;
            String str2 = u.versionName;
            long longVersionCode = u.getLongVersionCode();
            String L = j47.L(context, "tracer_mapping_uuid");
            if (L != null) {
                if (L.equals("00000000-0000-0000-0000-000000000000")) {
                    L = null;
                }
                String L2 = j47.L(context, "tracer_environment");
                ? obj2 = new Object();
                obj2.b = str;
                obj2.a = str2;
                obj2.o = longVersionCode;
                obj2.c = L;
                obj2.X = L2;
                kye.c = obj2;
                dp3.b = new l7b((k56) new jye(context, 0));
                kye.e = new kbd(context);
                kye.f = new pje(context);
                Map map = gx3.a;
                if (true ^ map.isEmpty()) {
                    pje pje = kye.f;
                    if (pje == null) {
                        pje = null;
                    }
                    pje.b(map);
                }
                Application application = (Application) context.getApplicationContext();
                kbd kbd2 = kye.e;
                if (kbd2 != null) {
                    kbd = kbd2;
                }
                application.registerActivityLifecycleCallbacks(new lye(kbd));
                return kye2;
            }
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        throw new IllegalStateException("Tracer already initialized!");
    }
}
