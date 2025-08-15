package defpackage;

import android.net.Uri;

/* renamed from: vw7  reason: default package */
public final class vw7 extends u2 {
    public static final vw7 c = new u2(8);

    public static c64 Z1(long j, Long l, Long l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        sb.append("&load_mark=" + l);
        return new c64(sb.toString());
    }

    public static c64 a2(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        if (str != null) {
            sb.append("&folder_id=".concat(str));
        }
        return new c64(sb.toString());
    }

    public static Uri b2(long j, String str) {
        b46 b46 = osf.c;
        y7g y7g = new y7g(13);
        y7g.b = ":webapp:root";
        y7g.D(Long.valueOf(j), "bot_id");
        y7g.D("url", "entry_point");
        if (str != null) {
            y7g.D(str, "start_param");
        }
        return y7g.r();
    }

    public static c64 c2(long j, osf osf, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = au1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        k.append(osf.a);
        sb.append(k.toString());
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new c64(sb.toString());
    }
}
