package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* renamed from: s68  reason: default package */
public final class s68 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final vi8 d;
    public final b78 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ cj8 g;

    public s68(cj8 cj8, String str, int i, int i2, c78 c78) {
        this.g = cj8;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new vi8(str, i, i2);
        this.e = c78;
    }

    public final void binderDied() {
        this.g.Z.post(new q57(8, this));
    }
}
