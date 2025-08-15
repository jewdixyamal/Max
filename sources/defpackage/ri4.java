package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: ri4  reason: default package */
public abstract class ri4 {
    public static volatile vi4 f;
    public final Context a;
    public final m7b b;
    public final je7 c;
    public PowerManager d;
    public final fic e = new fic(new es3(7, this));

    public ri4(Context context, m7b m7b, je7 je7) {
        this.a = context;
        this.b = m7b;
        WeakReference weakReference = new WeakReference(this);
        z7d z7d = ((p7b) m7b).b;
        z7d.l.add(new qi4(this, 0, weakReference));
        this.c = je7;
    }

    public final String a() {
        p7b p7b = (p7b) this.b;
        String str = null;
        String string = p7b.a.g.getString("device.id", (String) null);
        if (oag.t(string)) {
            hm9.m("ri4", "New device id generated", new Object[0]);
            try {
                string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            } catch (Exception e2) {
                hm9.p("ri4", "Can't get hardware device id", e2);
                string = null;
            }
            if (oag.t(string)) {
                xie xie = (xie) ((ti4) this).i.getValue();
                xie.getClass();
                try {
                    str = xie.f();
                } catch (Exception e3) {
                    hm9.p(xie.a, "error while get instance id", e3);
                }
                string = !oag.t(str) ? str : UUID.randomUUID().toString();
            }
            p7b.a.m("device.id", string);
        }
        return string;
    }

    public final vi4 b() {
        if (f == null) {
            f = lz7.q(this.a);
        }
        return f;
    }

    public abstract boolean c();

    public final boolean d() {
        return ((lqf) ((zp) this.c.getValue())).c();
    }

    public abstract void e();

    public abstract void f(String str);

    public abstract void g(String str);

    public abstract t9f h();
}
