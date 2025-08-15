package defpackage;

import androidx.work.WorkRequest;
import java.util.Set;

/* renamed from: q8g  reason: default package */
public final class q8g {
    public final String a;
    public final String b;
    public final h65 c;
    public final h8g d;
    public final Set e;
    public final long f;
    public final int g;

    public q8g(String str, String str2, h65 h65, h8g h8g, Set set, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = h65;
        this.d = h8g;
        this.e = set;
        this.f = j;
        this.g = i;
    }

    public q8g(String str, h65 h65, WorkRequest workRequest) {
        this(workRequest.getId().toString(), str, h65, workRequest.getWorkSpec(), workRequest.getTags(), System.currentTimeMillis(), 0);
    }
}
