package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: sab  reason: default package */
public final class sab extends ol implements lme, hua {
    public final String X;
    public final String Y;
    public final long Z;
    public final String o;
    public final a20 s0;
    public final String t0;
    public final String u0;
    public final int v0;

    public sab(long j, String str, String str2, String str3, long j2, a20 a20, String str4, String str5, int i) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = j2;
        this.s0 = a20;
        this.t0 = str4;
        this.u0 = str5;
        this.v0 = i;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        wcb wcb = (wcb) gle;
        Long l = null;
        ((p7b) r()).a.m("user.deviceAvatarPath", (String) null);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((blb) plVar.W.getValue()).b(wcb.c);
        av0 l2 = l();
        wm3 wm3 = wcb.c.a;
        long j = this.a;
        l2.c(new bhb(j, wm3));
        wm3 wm32 = wcb.c.a;
        if (wm32 != null) {
            l = Long.valueOf(wm32.Y);
        }
        if (this.Z != 0 && l != null) {
            l().c(new vab(j, l.longValue()));
        }
    }

    public final byte[] f() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.Z;
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            profile.firstName = str;
        }
        String str2 = this.X;
        if (!(str2 == null || str2.length() == 0)) {
            profile.lastName = str2;
        }
        String str3 = this.Y;
        if (!(str3 == null || str3.length() == 0)) {
            profile.photoToken = str3;
        }
        String str4 = this.t0;
        if (!(str4 == null || str4.length() == 0)) {
            profile.description = str4;
        }
        String str5 = this.u0;
        if (!(str5 == null || str5.length() == 0)) {
            profile.link = str5;
        }
        int i = this.v0;
        if (au1.e(i).length() != 0) {
            profile.avatarType = au1.e(i);
        }
        a20 a20 = this.s0;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            profile.crop = rect;
        }
        return qw8.toByteArray(profile);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
        l().c(new oi0(pke));
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_PROFILE;
    }

    public final dle i() {
        String str = this.u0;
        return new gs9(this.v0, this.Z, this.s0, this.o, this.X, this.Y, this.t0, str);
    }
}
