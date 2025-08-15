package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: eze  reason: default package */
public final class eze {
    public static final eze a = new Object();
    public static volatile dze b = pq9.w0;

    public static void a(String str, long j, TimeUnit timeUnit, kpa... kpaArr) {
        String str2;
        switch (p4f.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                str2 = "ns";
                break;
            case 2:
                str2 = "us";
                break;
            case 3:
                str2 = "ms";
                break;
            case 4:
                str2 = "s";
                break;
            case 5:
                str2 = "min";
                break;
            case 6:
                str2 = "h";
                break;
            case 7:
                str2 = "d";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str3 = str2;
        Map a0 = mz7.a0((kpa[]) Arrays.copyOf(kpaArr, kpaArr.length));
        dze dze = b;
        if (!tpa.f(dze, pq9.w0) && !tpa.f(dze, oq9.Z)) {
            hze.a(new ule(6, new ata((SystemClock.elapsedRealtimeNanos() + x6b.a) - x6b.b, str, j, str3, a0)));
        }
    }
}
