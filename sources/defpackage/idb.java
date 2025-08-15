package defpackage;

import java.util.Set;

/* renamed from: idb  reason: default package */
public final class idb extends i64 {
    public static final idb b;
    public static final e64 c;
    public static final e64 d;
    public static final e64 e;
    public static final e64 f;
    public static final e64 g;
    public static final e64 h;
    public static final e64 i;
    public static final e64 j;

    /* JADX WARNING: type inference failed for: r6v0, types: [i64, idb] */
    static {
        ? i64 = new i64();
        b = i64;
        c = i64.a(i64, ":profile/avatars", new String[]{"id", "type"}, (Set) null, 0, 14);
        d = i64.a(i64, ":profile", new String[]{"id", "type"}, (Set) null, 0, 14);
        e = i64.a(i64, ":profile/attaches", new String[]{"id"}, (Set) null, 0, 14);
        f = i64.a(i64, ":profile/members", new String[]{"id", "type"}, (Set) null, 0, 14);
        g = i64.a(i64, ":profile/invite", new String[]{"id"}, (Set) null, 0, 14);
        h = i64.a(i64, ":profile/add-admins", new String[]{"chat_id"}, (Set) null, 0, 14);
        i = i64.a(i64, ":profile/add-members", new String[]{"chat_id"}, (Set) null, 0, 14);
        j = i64.a(i64, ":profile/change-owner", new String[]{"chat_id"}, (Set) null, 0, 14);
    }
}
