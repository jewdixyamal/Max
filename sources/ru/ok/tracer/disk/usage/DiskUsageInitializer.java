package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageInitializer;", "Lw07;", "Lpq9;", "<init>", "()V", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
public final class DiskUsageInitializer implements w07 {
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    public final Object b(Context context) {
        khe khe = hze.a;
        new Handler(Looper.getMainLooper()).post(new i40(new nm(context, 2), 6));
        return pq9.s0;
    }
}
