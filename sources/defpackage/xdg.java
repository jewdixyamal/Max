package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* renamed from: xdg  reason: default package */
public final class xdg extends sdg implements ge6, he6 {
    public static final ddg k = beg.a;
    public final Context d;
    public final Handler e;
    public final ddg f = k;
    public final Set g;
    public final kad h;
    public iod i;
    public od j;

    public xdg(Context context, Handler handler, kad kad) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = handler;
        this.h = kad;
        this.g = (Set) kad.b;
    }

    public final void R(int i2) {
        od odVar = this.j;
        kdg kdg = (kdg) ((ie6) odVar.Y).u0.get((zk) odVar.c);
        if (kdg == null) {
            return;
        }
        if (kdg.k) {
            kdg.n(new ph3(17));
        } else {
            kdg.R(i2);
        }
    }

    public final void k(ph3 ph3) {
        this.j.i(ph3);
    }

    public final void onConnected() {
        this.i.x(this);
    }
}
