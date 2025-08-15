package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: gy2  reason: default package */
public final class gy2 extends u2 {
    public static final gy2 c = new u2(8);

    public static Uri Z1(gy2 gy2, long j, String str, Long l, Long l2, List list, String str2, Boolean bool, boolean z, int i) {
        int i2 = i;
        Boolean bool2 = null;
        Long l3 = (i2 & 4) != 0 ? null : l;
        Long l4 = (i2 & 8) != 0 ? null : l2;
        List list2 = (i2 & 16) != 0 ? null : list;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if ((i2 & 128) == 0) {
            bool2 = bool;
        }
        boolean z2 = (i2 & 256) != 0 ? false : z;
        gy2.getClass();
        y7g y7g = new y7g(13);
        y7g.b = ":chats";
        y7g.D(Long.valueOf(j), "id");
        String str4 = str;
        y7g.D(str, "type");
        if (z2) {
            y7g.D(Boolean.TRUE, "no_anim");
        }
        if (l3 != null) {
            y7g.D(Long.valueOf(l3.longValue()), "message_id");
        }
        if (l4 != null) {
            y7g.D(Long.valueOf(l4.longValue()), "load_mark");
        }
        if (list2 != null) {
            ((ArrayList) y7g.c).add("highlights=".concat(x53.n0(list2, ",", (String) null, (String) null, (m56) null, 62)));
        }
        if (str3 != null) {
            y7g.D(str3, ApiProtocol.PARAM_PAYLOAD);
        }
        if (bool2 != null) {
            y7g.D(bool2, "open_search_field");
        }
        return y7g.r();
    }

    public static c64 a2(gy2 gy2, long j) {
        gy2.getClass();
        y7g y7g = new y7g(13);
        y7g.b = ":chats";
        y7g.D(Long.valueOf(j), "id");
        y7g.D("local", "type");
        return new c64(y7g.s());
    }

    public static void b2(gy2 gy2, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        gy2.getClass();
        gy2.P1().c(Z1(gy2, j, str, l3, l4, list2, str3, (Boolean) null, false, 320), (Bundle) null);
    }

    public static c64 c2(gy2 gy2, long j, osf osf, String str, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        gy2.getClass();
        StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
        sb.append(j);
        sb.append("&entry_point=");
        sb.append(osf.a);
        if (i != 0) {
            sb.append("&request_code=");
            sb.append(i);
        }
        if (!(str == null || str.length() == 0)) {
            sb.append("&start_param=");
            sb.append(str);
        }
        return new c64(sb.toString());
    }
}
