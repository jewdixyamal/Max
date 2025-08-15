package defpackage;

import android.os.IBinder;
import java.util.Objects;

/* renamed from: p98  reason: default package */
public final /* synthetic */ class p98 implements IBinder.DeathRecipient {
    public final /* synthetic */ w98 a;

    public /* synthetic */ p98(w98 w98) {
        this.a = w98;
    }

    public final void binderDied() {
        a98 a98 = this.a.a;
        Objects.requireNonNull(a98);
        a98.G(new nn6(9, a98));
    }
}
