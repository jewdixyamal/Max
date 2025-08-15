package defpackage;

import java.util.List;

/* renamed from: u29  reason: default package */
public final class u29 extends u2 {
    public static final u29 c = new u2(8);

    public static c64 Z1(List list, boolean z) {
        String n0 = x53.n0(list, ",", (String) null, (String) null, (m56) null, 62);
        return new c64(":chats/forward?messages_ids=" + n0 + "&show_ext_sharing=" + z);
    }

    public static c64 a2(long j, long j2, String str, en4 en4) {
        int ordinal = en4.ordinal();
        StringBuilder k = au1.k(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        ms2.j(j2, "&local_attach_id=", str, k);
        k.append("&cause_ordinal=");
        k.append(ordinal);
        return new c64(k.toString());
    }

    public static c64 b2(long j, osf osf, Long l, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = au1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        k.append(osf.a);
        sb.append(k.toString());
        sb.append("&chat_id=" + l);
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new c64(sb.toString());
    }
}
