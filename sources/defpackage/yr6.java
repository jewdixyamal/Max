package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: yr6  reason: default package */
public final class yr6 {
    public static final Pattern i = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern j = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern k = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final d4c a;
    public final a4c b;
    public final int c;
    public final HashMap d;
    public long e;
    public long f;
    public boolean g = false;
    public String h;

    public yr6(d4c d4c, a4c a4c, int i2) {
        this.a = d4c;
        this.b = a4c;
        this.c = i2;
        this.d = new HashMap();
        for (fcg put : fcg.values()) {
            this.d.put(put, 0);
        }
    }

    public final void a(boolean z) {
        if (this.f != 0 && !this.g) {
            this.g = true;
            HashMap hashMap = new HashMap();
            String str = this.h;
            if (str == null) {
                this.h = null;
                int i2 = this.c;
                if (i2 == 0) {
                    this.h = "direct";
                } else if (i2 == 1) {
                    this.h = "server_send";
                } else if (i2 == 2) {
                    this.h = "server_recv";
                }
                str = this.h;
            }
            if (str == null) {
                this.b.log("CandidateLog", "unknown topology, not logging connect");
            }
            StringBuilder o = rh4.o(str, ":");
            o.append(z ? SystemClock.elapsedRealtime() - this.f : -1);
            hashMap.put("param", o.toString());
            this.a.log(d4c.COLLECTOR_VIDEO, "callCandidatesApply", (Map) hashMap);
        }
    }
}
