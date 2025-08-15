package defpackage;

import android.os.Bundle;

/* renamed from: z71  reason: default package */
public final class z71 extends u2 {
    public static final z71 c = new u2(8);

    public final void Z1(Long l, String str, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(":call-history-info?is_link_call=true");
        z71 z71 = c;
        if (str != null) {
            z71.getClass();
            sb.append("&call_link=".concat(str));
        }
        if (charSequence != null) {
            z71.getClass();
            sb.append("&call_title=" + charSequence);
        }
        if (l != null) {
            z71.getClass();
            sb.append("&call_chat_id=" + l);
        }
        P1().b(sb.toString(), (Bundle) null);
    }

    public final void a2(long j, long j2) {
        P1().b(zr6.k(au1.k(j, ":chats?id=", "&type=local&message_id="), j2, "&highlight_message=true"), (Bundle) null);
    }
}
