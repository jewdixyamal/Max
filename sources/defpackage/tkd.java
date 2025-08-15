package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: tkd  reason: default package */
public final class tkd extends vrd {
    public static final tkd b = new vrd();

    public final j64 c() {
        j64 j64 = j64.c;
        return j64.c;
    }

    public final k64 d(Bundle bundle) {
        long D = i24.D("msg_id", bundle);
        long D2 = i24.D("attach_id", bundle);
        String F = i24.F("local_attach_id", bundle);
        int C = i24.C("cause_ordinal", bundle);
        String string = bundle.getString("snack_bot_margin");
        return new skd(D, D2, F, C, string != null ? Integer.valueOf(Integer.parseInt(string)) : null, i24.u("force_dark", bundle));
    }

    public final void e(urd urd) {
        i64.a(urd, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, (Set) null, 0, 14);
    }
}
