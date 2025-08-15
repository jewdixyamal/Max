package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.StatsReport;

/* renamed from: rm1  reason: default package */
public final /* synthetic */ class rm1 implements y1e {
    public final /* synthetic */ a8g a;
    public final /* synthetic */ long b;

    public /* synthetic */ rm1(a8g a8g, long j) {
        this.a = a8g;
        this.b = j;
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, ar0[] ar0Arr, Map map, yn1 yn1) {
        a8g a8g = this.a;
        x3c x3c = new x3c((a4c) a8g.o, statsReportArr);
        HashMap hashMap = new HashMap();
        qz7 qz7 = (qz7) a8g.a;
        hashMap.put("vcid", ((d4c) qz7.b).conversationId);
        String str = (String) x3c.o;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("local_connection_type", str);
        String str3 = (String) x3c.c;
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("remote_connection_type", str3);
        String str4 = (String) x3c.X;
        if (str4 == null) {
            str4 = str2;
        }
        hashMap.put("local_address", str4);
        String str5 = (String) x3c.Y;
        if (str5 != null) {
            str2 = str5;
        }
        hashMap.put("remote_address", str2);
        hashMap.put("network_type", jb9.b((ConnectivityManager) a8g.b, (TelephonyManager) a8g.c));
        hashMap.put("stat_time_delta", String.valueOf(this.b));
        ((d4c) qz7.b).log(d4c.COLLECTOR_WEBRTC, "callStatConnect", (Map) hashMap);
    }
}
