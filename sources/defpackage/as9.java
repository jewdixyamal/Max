package defpackage;

/* renamed from: as9  reason: default package */
public final class as9 {
    public static final /* synthetic */ bc7[] d;
    public static final String e;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;

    static {
        Class<as9> cls = as9.class;
        hob hob = new hob(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0);
        oec oec = nec.a;
        d = new bc7[]{hob, zr6.e(oec, cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), zr6.f(cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0, oec)};
        e = cls.getName();
    }

    public as9(rm4 rm4, rm4 rm42, rm4 rm43) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
    }

    public final m7b a() {
        bc7 bc7 = d[0];
        return (m7b) this.a.get();
    }
}
