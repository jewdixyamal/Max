package defpackage;

import java.util.Map;

/* renamed from: m9b  reason: default package */
public final class m9b {
    public static final /* synthetic */ bc7[] d;
    public static final String e;
    public final m7b a;
    public final rm4 b;
    public final rm4 c;

    static {
        Class<m9b> cls = m9b.class;
        d = new bc7[]{new hob(cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), zr6.e(nec.a, cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0)};
        e = cls.getName();
    }

    public m9b(m7b m7b, rm4 rm4, rm4 rm42) {
        this.a = m7b;
        this.b = rm4;
        this.c = rm42;
    }

    public final void a(vp4 vp4, long j) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        String str = e;
        hm9.m(str, "execute: draftsNews=" + vp4 + ", serverTime=" + j + "ms", new Object[0]);
        p7b p7b = (p7b) this.a;
        p7b.a.l("user.draftsLastSync", Long.valueOf(j));
        if (!p7b.b.u()) {
            hm9.m(str, "Drafts sync disabled", new Object[0]);
        } else if (vp4 != null) {
            kp4 kp4 = vp4.a;
            Map map5 = kp4 != null ? kp4.a : null;
            rm4 rm4 = this.b;
            bc7[] bc7Arr = d;
            if (!(map5 == null || map5.isEmpty() || kp4 == null || (map4 = kp4.a) == null)) {
                for (Map.Entry entry : map4.entrySet()) {
                    bc7 bc7 = bc7Arr[0];
                    ((rk4) rm4.get()).a(((Number) entry.getValue()).longValue(), (Long) entry.getKey(), (Long) null);
                }
            }
            kp4 kp42 = vp4.b;
            Map map6 = kp42 != null ? kp42.a : null;
            if (!(map6 == null || map6.isEmpty() || kp42 == null || (map3 = kp42.a) == null)) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    bc7 bc72 = bc7Arr[0];
                    ((rk4) rm4.get()).a(((Number) entry2.getValue()).longValue(), (Long) null, (Long) entry2.getKey());
                }
            }
            Map map7 = kp4 != null ? kp4.b : null;
            rm4 rm42 = this.c;
            if (!(map7 == null || map7.isEmpty() || kp4 == null || (map2 = kp4.b) == null)) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    bc7 bc73 = bc7Arr[1];
                    ((gn4) rm42.get()).a((Long) entry3.getKey(), (Long) null, (n7d) entry3.getValue());
                }
            }
            Map map8 = kp42 != null ? kp42.b : null;
            if (map8 != null && !map8.isEmpty() && kp42 != null && (map = kp42.b) != null) {
                for (Map.Entry entry4 : map.entrySet()) {
                    long longValue = ((Number) entry4.getKey()).longValue();
                    bc7 bc74 = bc7Arr[1];
                    ((gn4) rm42.get()).a((Long) null, Long.valueOf(longValue), (n7d) entry4.getValue());
                }
            }
        }
    }
}
