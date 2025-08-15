package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: oa  reason: default package */
public final class oa {
    public static final oa d = new oa(oz4.a, wz4.a, 0);
    public final Map a;
    public final Set b;
    public final long c;

    public oa(Map map, Set set, long j) {
        this.a = map;
        this.b = set;
        this.c = j;
    }

    public static oa a(oa oaVar, LinkedHashMap linkedHashMap, xs xsVar, long j, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = oaVar.a;
        }
        Set set = xsVar;
        if ((i & 2) != 0) {
            set = oaVar.b;
        }
        if ((i & 4) != 0) {
            j = oaVar.c;
        }
        oaVar.getClass();
        return new oa(map, set, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return tpa.f(this.a, oaVar.a) && tpa.f(this.b, oaVar.b) && this.c == oaVar.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminWaitingRoomUsers(usersInWaitingRoom=");
        sb.append(this.a);
        sb.append(", lastNewUsersIds=");
        sb.append(this.b);
        sb.append(", lastUpdate=");
        return zr6.k(sb, this.c, ")");
    }
}
