package defpackage;

import java.util.List;

/* renamed from: ggc  reason: default package */
public final class ggc {
    public final je7 a;

    public ggc(je7 je7) {
        this.a = je7;
    }

    public q33 a() {
        return (q33) this.a.getValue();
    }

    public void b(boolean z) {
        hm9.m("SavedBackgroundThemeMigration", "Start theme background migration for theme: isDark=" + z + ".", new Object[0]);
        String l = tfg.l(a(), z);
        List list = z ? ze0.c : ze0.b;
        t33 t33 = (t33) a();
        if (z ? t33.g.getBoolean("app.chat.background.was.set.as.solid.color.dark", false) : t33.g.getBoolean("app.chat.background.was.set.as.solid.color.light", false)) {
            tfg.A((String) null, z, a());
        } else if (l == null || !list.contains(l)) {
            tfg.A((String) x53.i0(list), z, a());
        } else {
            tfg.A(l, z, a());
        }
    }

    public ggc(je7 je7, je7 je72) {
        this.a = je7;
    }
}
