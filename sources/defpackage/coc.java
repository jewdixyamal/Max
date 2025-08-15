package defpackage;

/* renamed from: coc  reason: default package */
public final class coc {
    public final uu3 a;
    public String b;
    public zu3 c;
    public zu3 d;
    public boolean e;
    public int f;

    public coc(uu3 uu3, String str, zu3 zu3, zu3 zu32, boolean z, int i) {
        this.a = uu3;
        this.b = str;
        this.c = zu3;
        this.d = zu32;
        this.e = z;
        this.f = i;
    }

    public final void a(zu3 zu3) {
        if (!this.e) {
            this.d = zu3;
            return;
        }
        throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final zu3 b() {
        zu3 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(zu3 zu3) {
        if (!this.e) {
            this.c = zu3;
            return;
        }
        throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final void d(String str) {
        if (!this.e) {
            this.b = str;
            return;
        }
        throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }
}
