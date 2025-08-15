package ru.ok.tracer.crash.report;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/crash/report/CrashReportInitializer;", "Lw07;", "Lpye;", "<init>", "()V", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1})
public final class CrashReportInitializer implements w07 {
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, lbd] */
    /* JADX WARNING: type inference failed for: r12v11, types: [java.lang.Object, ty2] */
    /* JADX WARNING: type inference failed for: r12v13, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v15, types: [sp3, java.lang.Object] */
    public final Object b(Context context) {
        kye kye = kye.a;
        Object obj = kye.c().get(m6d.a);
        sy3 sy3 = obj instanceof sy3 ? (sy3) obj : null;
        sy3 sy32 = sy3 == null ? new sy3(new Object()) : sy3;
        if (sy32.a) {
            aze.b(context);
        }
        kbd kbd = kye.e;
        kbd kbd2 = kbd != null ? kbd : null;
        pje pje = kye.f;
        pje pje2 = pje != null ? pje : null;
        sy4 sy4 = new sy4(1, (Object) context);
        zs7 zs7 = new zs7(context);
        o84 o84 = new o84(9);
        ? obj2 = new Object();
        ik ikVar = new ik(context, sy32.c);
        ? obj3 = new Object();
        obj3.a = sy4;
        obj3.b = kbd2;
        obj3.c = pje2;
        obj3.o = zs7;
        obj3.X = obj2;
        obj3.Y = o84;
        obj3.Z = new AtomicInteger();
        pye.b = obj3;
        hze.b(new oye(sy32, context, kbd2, pje2, zs7, sy4, ikVar, obj2, o84));
        s36.y(new Object());
        return pye.a;
    }
}
