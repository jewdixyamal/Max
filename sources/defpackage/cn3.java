package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: cn3  reason: default package */
public final class cn3 {
    public final je7 a;

    public cn3(je7 je7) {
        this.a = je7;
    }

    public final void a(Context context, Uri uri) {
        qyc qyc = (qyc) ((y7d) this.a.getValue());
        String string = qyc.g.getString("invite-long", (String) null);
        if (string == null) {
            string = String.format(context.getString(dpc.C), Arrays.copyOf(new Object[]{qyc.p()}, 1));
        }
        tpa.o(context, string.toString());
        String str = o37.a;
        o37.d(context, string, uri);
    }
}
