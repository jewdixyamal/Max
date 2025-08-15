package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: ql2  reason: default package */
public final class ql2 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final rl2 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public ql2(long j2, String str, long j3, String str2, rl2 rl2, List list, List list2, Bitmap bitmap, int i2, boolean z, boolean z2, long j4, long j5, String str3, long j6) {
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = str2;
        this.e = rl2;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = j4;
        this.m = j5;
        this.n = str3;
        this.o = j6;
    }

    public static ql2 a(ql2 ql2, List list, List list2, boolean z, int i2) {
        ql2 ql22 = ql2;
        int i3 = i2;
        long j2 = ql22.a;
        String str = ql22.b;
        long j3 = ql22.c;
        String str2 = ql22.d;
        rl2 rl2 = ql22.e;
        List list3 = (i3 & 32) != 0 ? ql22.f : list;
        List list4 = (i3 & 64) != 0 ? ql22.g : list2;
        Bitmap bitmap = ql22.h;
        int i4 = (i3 & 256) != 0 ? ql22.i : 0;
        boolean z2 = (i3 & 512) != 0 ? ql22.j : z;
        boolean z3 = ql22.k;
        long j4 = ql22.l;
        long j5 = ql22.m;
        String str3 = ql22.n;
        long j6 = j5;
        long j7 = ql22.o;
        ql2.getClass();
        return new ql2(j2, str, j3, str2, rl2, list3, list4, bitmap, i4, z2, z3, j4, j6, str3, j7);
    }

    public final boolean b() {
        rw8 rw8 = (rw8) x53.q0(this.f);
        return rw8 != null && rw8.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql2)) {
            return false;
        }
        ql2 ql2 = (ql2) obj;
        return this.a == ql2.a && tpa.f(this.b, ql2.b) && this.c == ql2.c && tpa.f(this.d, ql2.d) && this.e == ql2.e && tpa.f(this.f, ql2.f) && tpa.f(this.g, ql2.g) && tpa.f(this.h, ql2.h) && this.i == ql2.i && this.j == ql2.j && this.k == ql2.k && this.l == ql2.l && this.m == ql2.m && tpa.f(this.n, ql2.n) && this.o == ql2.o;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int g2 = k7d.g(this.g, k7d.g(this.f, (this.e.hashCode() + rh4.d(h4f.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        Bitmap bitmap = this.h;
        int m2 = h4f.m(h4f.m(ms2.d(ms2.d(k7d.e(this.i, (g2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Long.hashCode(this.o) + ((m2 + i2) * 31);
    }

    public final String toString() {
        return "ChatNotification(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + "', chatNotificationType=" + this.e + ", displayMessages=" + x53.n0(this.f, ",", "[", "]", new we1(19), 24) + ", droppedMessages=" + this.g.size() + ", totalUnreadMessagesCount=" + this.i + ", needNotify=" + this.j + ", showNotificationText=" + this.k + ", lastMessageId=" + this.l + ", lastMessageDate=" + this.m + ", pushType=" + this.n + ", createdTime=" + this.o + ", isScheduled=" + b() + ")";
    }
}
