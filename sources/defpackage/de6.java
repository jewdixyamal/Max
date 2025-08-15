package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* renamed from: de6  reason: default package */
public abstract class de6 {
    public final zk X;
    public final Looper Y;
    public final int Z;
    public final Context a;
    public final String b;
    public final qz7 c;
    public final nk o;
    public final mdg s0;
    public final rq9 t0;
    public final ie6 u0;

    public de6(Context context, qz7 qz7, GoogleSignInOptions googleSignInOptions, rq9 rq9) {
        this(context, qz7, (nk) googleSignInOptions, new ce6(rq9, Looper.getMainLooper()));
    }

    public final c8d a() {
        c8d c8d = new c8d(6);
        c8d.b = null;
        Set emptySet = Collections.emptySet();
        if (((xs) c8d.c) == null) {
            c8d.c = new xs(0);
        }
        ((xs) c8d.c).addAll(emptySet);
        Context context = this.a;
        c8d.o = context.getClass().getName();
        c8d.a = context.getPackageName();
        return c8d;
    }

    public final ukg b(hm7 hm7, int i) {
        fp3.o(hm7, "Listener key cannot be null.");
        ie6 ie6 = this.u0;
        ie6.getClass();
        qne qne = new qne();
        ie6.e(qne, i, this);
        udg udg = new udg(new ieg(hm7, qne), ie6.t0.get(), this);
        fc9 fc9 = ie6.x0;
        fc9.sendMessage(fc9.obtainMessage(13, udg));
        return qne.a;
    }

    public final ukg c(int i, pw6 pw6) {
        qne qne = new qne();
        ie6 ie6 = this.u0;
        ie6.getClass();
        ie6.e(qne, pw6.b, this);
        udg udg = new udg(new jeg(i, pw6, qne, this.t0), ie6.t0.get(), this);
        fc9 fc9 = ie6.x0;
        fc9.sendMessage(fc9.obtainMessage(4, udg));
        return qne.a;
    }

    public de6(Context context, qz7 qz7, nk nkVar, ce6 ce6) {
        fp3.o(context, "Null context is not permitted.");
        fp3.o(qz7, "Api must not be null.");
        fp3.o(ce6, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        fp3.o(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String q = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = q;
        this.c = qz7;
        this.o = nkVar;
        this.Y = ce6.b;
        this.X = new zk(qz7, nkVar, q);
        this.s0 = new mdg(this);
        ie6 f = ie6.f(applicationContext);
        this.u0 = f;
        this.Z = f.s0.getAndIncrement();
        this.t0 = ce6.a;
        fc9 fc9 = f.x0;
        fc9.sendMessage(fc9.obtainMessage(7, this));
    }
}
