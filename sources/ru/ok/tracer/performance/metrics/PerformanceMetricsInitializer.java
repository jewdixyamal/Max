package ru.ok.tracer.performance.metrics;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/performance/metrics/PerformanceMetricsInitializer;", "Lw07;", "Leze;", "<init>", "()V", "tracer-performance-metrics_release"}, k = 1, mv = {1, 7, 1})
public final class PerformanceMetricsInitializer implements w07 {
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    public final Object b(Context context) {
        eze eze = eze.a;
        kye kye = kye.a;
        Object obj = kye.c().get(tfg.b);
        hta hta = obj instanceof hta ? (hta) obj : null;
        if (hta == null) {
            hta = new hta(new sh0(14, (byte) 0));
        }
        if (hta.a) {
            eze.b = new bze();
            hze.a(new nm(context, 6));
        }
        return eze.a;
    }
}
