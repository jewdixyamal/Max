package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: la3  reason: default package */
public final class la3 extends vrd {
    public static final la3 b = new vrd();

    public final j64 c() {
        return new j64(new hn2(16), new hn2(17));
    }

    public final k64 d(Bundle bundle) {
        return new ka3(i24.D("chat_id", bundle), 0);
    }

    public final void e(urd urd) {
        i64.a(urd, ":complaint", new String[]{"chat_id"}, (Set) null, 0, 14);
    }
}
