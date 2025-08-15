package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: b92  reason: default package */
public final class b92 {
    public static final b92 h;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, a92] */
    static {
        List asList = Arrays.asList(new y82[]{y82.a, y82.b, y82.c});
        ? obj = new Object();
        obj.a = 0;
        obj.c = 0;
        obj.d = 0;
        obj.b = asList;
        obj.f = 0;
        obj.g = 0;
        h = new b92(obj);
    }

    public b92(a92 a92) {
        this.a = a92.a;
        List list = a92.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.c = a92.c;
        this.d = a92.d;
        this.e = a92.e;
        this.f = a92.f;
        this.g = a92.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, a92] */
    public final a92 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = new ArrayList(this.b);
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        if (list == null) {
            str = "[]";
        } else {
            g27 g27 = new g27(8);
            StringBuilder sb2 = new StringBuilder();
            x53.l0(list, sb2, ",", "[", "]", -1, "...", g27);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return z7b.i(sb, this.g, '}');
    }
}
